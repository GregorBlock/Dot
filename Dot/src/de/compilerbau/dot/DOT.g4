/** Derived from http://www.graphviz.org/doc/info/lang.html.
    Comments pulled from spec.
 */
grammar DOT;

@header{    
package de.compilerbau.dot;
}

s			:	statement* ;

statement	:	block
			|	assignment
			|	declaration
			|	whileStat
			|	doStat
			|	forStat
			|	ifElseStat
			|	graph
			|	uncover
			|	only
			;
			
block		:	OBRACE statement CBRACE ;

declaration	:	type IDENTIFIER ( ASSIGN expression)? SCOL ;

assignment	:	IDENTIFIER ASSIGN expression SCOL ;

whileStat	:	WHILE parStat statement ;

doStat		:	DO OBRACE statement CBRACE WHILE parStat SCOL ;

forStat		:	FOR OPAR forControl CPAR statement ;

forControl	:	IDENTIFIER '->' INT 'to' INT ;

ifElseStat	:	IF parStat statement (ELSE statement)? ;

parStat		:	OPAR expression CPAR ;
			
expression	:   primary										#primaryExpr
			|   expression '[' expression ']'				#arrayExpr
			|   expression (INC | DEC)						#incDecExpr
			|	expression LTEQ expression					#ltEqExpr
			|	expression GTEQ expression					#gtEqExpr
			|	expression GT expression					#gtExpr
			|	expression LT expression					#ltExpr
			|	expression EQ expression					#eqExpr
			|	expression NEQ expression					#neqExpr
			|   expression AND expression					#andExpr
			|   expression OR expression					#orExpr
			|   expression ASSIGN<assoc=right> expression	#assignExpr
			;
	
primary		:	parStat										#parExpr
			|	IDENTIFIER									#idAtom
			|	(INT | FLOAT)								#numberAtom
			|	STRING										#stringAtom
			;
			
type		:	INT	
			|	FLOAT		
			|	STRING
			;
	
/*******************************************************************
 * DOT with extensions
 ******************************************************************/ 
	
uncover		: 	UNCOVER file_list  OBRACE graph+ CBRACE ;
only		:	ONLY file_list  OBRACE graph CBRACE ;
file_list	: 	OPAR file+ CPAR ; 
file		: 	NUMBER ('-' file)* ; 

graph       :   STRICT? (GRAPH | DIGRAPH) id? OBRACE stmt_list CBRACE ;
stmt_list   :   ( stmt ';'? )* ; 
stmt        :   node_stmt
            |   edge_stmt
            |   attr_stmt
            |   id '=' id
            |   subgraph 
            ;
			
attr_stmt   :   (GRAPH | NODE | EDGE) attr_list ;
attr_list   :   ('[' a_list? ']')+ ;
a_list      :   (id ('=' id)? ','?)+ ;
edge_stmt   :   (node_id | subgraph) edgeRHS attr_list? ;
edgeRHS     :   ( edgeop (node_id | subgraph) )+ ;
edgeop      :   '->' | '--' ;
node_stmt   :   node_id attr_list? ;
node_id     :   id port? ;
port        :   ':' id (':' id)? ;
subgraph    :   (SUBGRAPH id?)? OBRACE stmt_list CBRACE ; 
id          :   ID
            |   STRING
            |   NUMBER
            ;
			
/*******************************************************************
 *	TOKENS
 ******************************************************************/ 
 
INC			:	'++' ;
DEC			:	'--' ; 
 
OR 			: 	'||' ;
AND 		: 	'&&' ;
EQ 			: 	'==' ;
NEQ 		: 	'!=' ;
GT 			: 	'>' ;
LT 			: 	'<' ;
GTEQ 		: 	'>=' ;
LTEQ 		: 	'<=' ;
PLUS 		: 	'+' ;
MINUS 		: 	'-' ;
MULT 		: 	'*' ;
DIV 		: 	'/' ;
MOD 		: 	'%' ;
POW 		: 	'^' ;
NOT 		: 	'!' ;

SCOL 		: 	';' ;
ASSIGN 		: 	'=' ;
OPAR 		: 	'(' ;
CPAR 		: 	')' ;
OBRACE 		: 	'{' ;
CBRACE 		: 	'}' ;

TRUE 		: 	'true' ;
FALSE 		: 	'false' ;
NIL 		: 	'nil' ;
IF 			: 	'if' ;
ELSE 		: 	'else' ;
WHILE 		: 	'while' ;
DO			:	'do' ;
FOR			:	'for' ;
 
IDENTIFIER	: 	[a-zA-Z_] [a-zA-Z_0-9]* ;

INT			: 	MINUS? DIGIT+ ;
FLOAT		:	MINUS? DIGIT+ '.' DIGIT* 
			| 	MINUS? '.' DIGIT+
			;
//STRING		: 	'"' (~["\r\n] | '""')* '"' ;

WS			:   [ \t\n\r]+ -> channel(HIDDEN) ;
 
 
 /** GrAPH TOKENS *************************************************/
 
STRICT      :   [Ss][Tt][Rr][Ii][Cc][Tt] ;
GRAPH       :   [Gg][Rr][Aa][Pp][Hh] ;
DIGRAPH     :   [Dd][Ii][Gg][Rr][Aa][Pp][Hh] ;
NODE        :   [Nn][Oo][Dd][Ee] ;
EDGE        :   [Ee][Dd][Gg][Ee] ;
SUBGRAPH    :   [Ss][Uu][Bb][Gg][Rr][Aa][Pp][Hh] ;
UNCOVER		:	[Uu][Nn][Cc][Oo][Vv][Ee][Rr] ;
ONLY		:	[Oo][Nn][Ll][Yy] ; 

 /** "a numeral [-]?(.[0-9]+ | [0-9]+(.[0-9]*)? )" */
NUMBER      :   '-'? ('.' DIGIT+ | DIGIT+ ('.' DIGIT*)? ) ;
fragment
DIGIT       :   [0-9] ;

/** "any double-quoted string ("...") possibly containing escaped quotes" */
STRING      :   '"' ('\\"'|.)*? '"' ;

/** "Any string of alphabetic ([a-zA-Z\200-\377]) characters, underscores
 *  ('_') or digits ([0-9]), not beginning with a digit"
 */
ID          :   LETTER (LETTER|DIGIT)*;
fragment
LETTER      :   [a-zA-Z\u0080-\u00FF_] ;

/** "HTML strings, angle brackets must occur in matched pairs, and
 *  unescaped newlines are allowed."
 */
HTML_STRING :   LT (TAG|~[<>])* GT ;
fragment
TAG         :   LT .*? GT ;


COMMENT     :   '/*' .*? '*/'       -> channel(HIDDEN) ;
LINE_COMMENT:   '//' .*? '\r'? '\n' -> channel(HIDDEN) ;
