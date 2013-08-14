/** Derived from http://www.graphviz.org/doc/info/lang.html.
    Comments pulled from spec.
 */
grammar DOT;

@header{    
package de.compilerbau.dot;
}

<<<<<<< HEAD
s			: 	statement+ ; 
uncover		: 	UNCOVER file_list  '{' graph+ '}' ;
only		:	ONLY file_list  '{' graph '}' ;
file_list	: 	'(' file+ ')' ; 
file		: 	NUMBER ('-' file)* ; 
=======
s			:	statement* ;
>>>>>>> refs/remotes/origin/master

statement	:	block
			|	graph
			|	uncover
			|	only
			|	assignment
			|	declaration
			|	whileStat
			|	doStat
			|	forStat
			|	ifElseStat
			;
			
block		:	OBRACE statement* CBRACE ;

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
			
type		:	INTTYPE	
			|	FLOATTYPE		
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
<<<<<<< HEAD
            |   id '=' id
            |   subgraph  
=======
            |   id ASSIGN id
            |   subgraph 
>>>>>>> refs/remotes/origin/master
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

<<<<<<< HEAD
localVariableDeclarationStatement
    :    localVariableDeclaration ';'
    ;
	
localVariableDeclaration
    :	type variableDeclarators
    ;
	
variableDeclarators
    :   variableDeclarator (',' variableDeclarator)*
    ;	
variableDeclarator
    :   variableDeclaratorId ('=' variableInitializer)?		# assignExpr
    ;
=======
SCOL 		: 	';' ;
ASSIGN 		: 	'=' ;
OPAR 		: 	'(' ;
CPAR 		: 	')' ;
OBRACE 		: 	'{' ;
CBRACE 		: 	'}' ;
>>>>>>> refs/remotes/origin/master

<<<<<<< HEAD
variableDeclaratorId
    :   id ('[' ']')*
    ;

variableInitializer
    :   arrayInitializer
    |   expression
    ;

arrayInitializer
    :   '{' (variableInitializer (',' variableInitializer)* (',')? )? '}'
    ;
	
forControl
    :  forInit? ';' expression? ';' forUpdate?
    ;

forInit
    :   localVariableDeclaration
    |   expressionList
    ;

forUpdate
    :   expressionList
    ;
	
statement
    : 	block
	|	localVariableDeclarationStatement
	| 	expression
    |   ifStatement
    |   forStatement
    |   whileStatement
    |   doStatement
	|	uncover
	|	only
	| 	graph
    ;
	
ifStatement
	:	'if' '(' expression ')' statement ('else' statement)? ;
	
forStatement
	:	'for' '(' forControl ')' statement ;
	
whileStatement
	:	'while' '(' expression ')' statement ;
	
doStatement
	:	'do' statement 'while' '(' expression ')' ';' ;
		
expressionList
    :   expression (',' expression)*
    ;
	
block
    :   '{' statement* '}'
    ;	
		
type
    :   'boolean'
    |   'char'
    |   'byte'
    |   'short'
    |   'int'
    |   'long'
    |   'float'
    |   'double'
	|   'String'
    ;
	
expression		
    :   primary										#primaryExpr
	|	ID 			 								#idExpr
	|   NUMBER										#numberExpr
    |   expression '[' expression ']'				#arrayExpr
	|	expression op=('*'|'/') expression      	#mulDivExpr
    |   expression op=('+'|'-') expression      	#addSubExpr
    |   expression op=('++'|'--')					#incDecExpr
	|	expression '<' '=' expression				#ltEqExpr
	|	expression '>' '=' expression				#gtEqExpr
	|	expression '>' expression					#gtExpr
	|	expression '<' expression					#ltExpr
	|	expression '==' expression					#eqExpr
	|	expression '!=' expression					#neqExpr
    |   expression '&&' expression					#andExpr
    |   expression '||' expression					#orExpr	
    ;
	
primary
    :   '(' expression ')'  										
    ;

// "The keywords node, edge, graph, digraph, subgraph, and strict are
// case-independent"
=======
TRUE 		: 	'true' ;
FALSE 		: 	'false' ;
IF 			: 	'if' ;
ELSE 		: 	'else' ;
WHILE 		: 	'while' ;
DO			:	'do' ;
FOR			:	'for' ;
INTTYPE		:	'int' ;
FlOATTYPE	:	'float' ;
STRINGTYPE	:	'String' ;
  
>>>>>>> refs/remotes/origin/master
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
FLOAT		:	MINUS? DIGIT+ '.' DIGIT* 
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

<<<<<<< HEAD
COMMENT     :   '/*' .*? '*/'       -> skip ;
LINE_COMMENT:   '//' .*? '\r'? '\n' -> skip ;

PP :   '++' ;
MM :   '--' ;
MUL :   '*' ; 
DIV :   '/' ;
ADD :   '+' ;
SUB :   '-' ;

/** "a '#' character is considered a line output from a C preprocessor (e.g.,
 *  # 34 to indicate line 34 ) and discarded"
=======
/** "HTML strings, angle brackets must occur in matched pairs, and
 *  unescaped newlines are allowed."
>>>>>>> refs/remotes/origin/master
 */
<<<<<<< HEAD
 
PREPROC     :   '#' .*? '\n' -> skip ;
=======
HTML_STRING :   LT (TAG|~[<>])* GT ;
fragment
TAG         :   LT .*? GT ;
>>>>>>> refs/remotes/origin/master


COMMENT     :   '/*' .*? '*/'       -> channel(HIDDEN) ;
LINE_COMMENT:   '//' .*? '\r'? '\n' -> channel(HIDDEN) ;
WS			:   [ \t\n\r]+ -> channel(HIDDEN) ;
