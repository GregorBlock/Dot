/** Derived from http://www.graphviz.org/doc/info/lang.html.
    Comments pulled from spec.
 */
grammar DOT;

@header{    
package de.compilerbau.dot;
}

s			:	statement* ;

statement	:	block
			|	graph
			|	uncover
			|	only
			|	assignment
			|	declaration
			| 	arraydecl
			|	whileStat
			|	forStat
			|	ifElseStat
			| 	expression ';'
			;
			
block		:	OBRACE statement* CBRACE ;

declaration	:	type IDENTIFIER ( ASSIGN expression )? SCOL ;

arraydecl	:	type '[]' IDENTIFIER ASSIGN value_list SCOL	;

value_list  :   ('{' (INT | DOUBLE | STRING ','?)+ '}')+ 					#arrayList
			;

assignment	:	IDENTIFIER ASSIGN expression SCOL ;

whileStat	:	WHILE parStat statement ;

forStat		:	FOR OPAR forControl CPAR statement ;

forControl	:	IDENTIFIER '->' INT 'to' INT ;

ifElseStat	:	IF parStat statement (ELSE statement)? ;

parStat		:	OPAR expression CPAR ;
			
expression	:   primary										#primaryExpr
			|   expression '[' expression ']'				#arrayExpr
			|	expression LTEQ expression					#ltEqExpr
			|	expression op=(MULT|DIV) expression      	#mulDivExpr
			|   expression op=(PLUS|MINUS) expression      	#addSubExpr
			|   IDENTIFIER op=(INC | DEC)					#incDecExpr
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
			|	INT 										#intAtom
			| 	DOUBLE										#doubleAtom
			|	STRING										#stringAtom
			;
			
type		:	INTTYPE	
			|	DOUBLETYPE		
			|	STRINGTYPE
			;
	
/*******************************************************************
 * DOT with extensions
 ******************************************************************/ 
	
uncover		: 	UNCOVER file_list  OBRACE graph+ CBRACE ;
only		:	ONLY file_list  OBRACE graph CBRACE ;
file_list	: 	OPAR file+ CPAR ; 
file		: 	NUMBER (MINUS file)* ; 

graph       :   STRICT? (GRAPH | DIGRAPH) id? OBRACE stmt_list CBRACE ;
stmt_list   :   ( stmt SCOL? )* ; 
stmt        :   node_stmt
            |   edge_stmt
            |   attr_stmt
            |   id ASSIGN id
            |   subgraph 
            ;
			
attr_stmt   :   (GRAPH | NODE | EDGE) attr_list ;
attr_list   :   ('[' a_list? ']')+ ;
a_list      :   (id ('=' id)? ','?)+ ;
edge_stmt   :   (node_id | subgraph) edgeRHS attr_list? ;
edgeRHS     :   ( edgeop (node_id | subgraph) )+ ;
edgeop      :   '->' | DEC ;
node_stmt   :   node_id attr_list? ;
node_id     :   id port? ;
port        :   ':' id (':' id)? ;
subgraph    :   (SUBGRAPH id?)? OBRACE stmt_list CBRACE ; 
id          :   IDENTIFIER
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
IF 			: 	'if' ;
ELSE 		: 	'else' ;
WHILE 		: 	'while' ;
FOR			:	'for' ;

INTTYPE		:	'int' ;
DOUBLETYPE	:	'double' ;
STRINGTYPE	:	'String' ;
  
STRICT      :   [Ss][Tt][Rr][Ii][Cc][Tt] ;
GRAPH       :   [Gg][Rr][Aa][Pp][Hh] ;
DIGRAPH     :   [Dd][Ii][Gg][Rr][Aa][Pp][Hh] ;
NODE        :   [Nn][Oo][Dd][Ee] ;
EDGE        :   [Ee][Dd][Gg][Ee] ;
SUBGRAPH    :   [Ss][Uu][Bb][Gg][Rr][Aa][Pp][Hh] ;
UNCOVER		:	[Uu][Nn][Cc][Oo][Vv][Ee][Rr] ;
ONLY		:	[Oo][Nn][Ll][Yy] ; 

IDENTIFIER	: 	[a-zA-Z_] [a-zA-Z_0-9]* ;
INT			: 	MINUS? DIGIT+ ;
DOUBLE		:	MINUS? DIGIT+ '.' DIGIT* 
			| 	MINUS? '.' DIGIT+
			;
			
 /** "a numeral [-]?(.[0-9]+ | [0-9]+(.[0-9]*)? )" */
NUMBER      :   '-'? ('.' DIGIT+ | DIGIT+ ('.' DIGIT*)? ) ;
fragment
DIGIT       :   [0-9] ;

/** "any double-quoted string ("...") possibly containing escaped quotes" */
STRING      :   '"' ('\\"'|.)*? '"' ;

/** "Any string of alphabetic ([a-zA-Z\200-\377]) characters, underscores
 *  ('_') or digits ([0-9]), not beginning with a digit"
 */
//ID          :   LETTER (LETTER|DIGIT)*;
fragment
LETTER      :   [a-zA-Z\u0080-\u00FF_] ;

/** "HTML strings, angle brackets must occur in matched pairs, and
 *  unescaped newlines are allowed."
 HTML_STRING :   LT (TAG|~[<>])* GT ;
fragment
TAG         :   LT .*? GT ;
 */



COMMENT     :   '/*' .*? '*/'       -> channel(HIDDEN) ; 
LINE_COMMENT:   '//' .*? '\r'? '\n' -> channel(HIDDEN) ;
WS			:   [ \t\n\r]+ -> skip ;