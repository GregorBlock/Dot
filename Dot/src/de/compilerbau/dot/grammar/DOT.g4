grammar DOT;

@header{    
package de.compilerbau.dot;
}

s 			:	statement* ;

statement	:	block
			|	graph
			|	uncover
			|	merge
			|	assignment
			|	declaration
			| 	arraydecl
			|	whileStat
			|	forStat
			|	ifElseStat
			|	print
			| 	expression ';'
			;
			
block		:	OBRACE statement* CBRACE ;

declaration	:	type IDENTIFIER ( ASSIGN expression )? SCOL ;

arraydecl	:	type '[]' IDENTIFIER ASSIGN OBRACE values (COMMA values)+ CBRACE SCOL	;

print		:	PRINT OPAR expression CPAR SCOL	;
			
assignment	:	IDENTIFIER ASSIGN expression SCOL ;

whileStat	:	WHILE parStat statement ;

forStat		:	FOR OPAR forControl CPAR statement ;

forControl	:	IDENTIFIER ARROW INT 'to' INT ;

ifElseStat	:	IF parStat statement (ELSE statement)? ;

parStat		:	OPAR expression CPAR ;
			
expression	:   primary										#primaryExpr
			|	expression '[' expression ']'				#arrayExpr
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
			;
	
primary		:	parStat										
			|	values	
			;
			
values		:	IDENTIFIER									#idAtom
			|	INT 										#intAtom
			| 	DOUBLE										#doubleAtom
			|	STRING										#stringAtom
			|	TRUE										#trueAtom
			|	FALSE										#falseAtom
			;
			
type		:	INTTYPE	
			|	DOUBLETYPE		
			|	STRINGTYPE
			;
	
/*******************************************************************
 * DOT with extensions
 ******************************************************************/ 
	
uncover		: 	UNCOVER OPAR IDENTIFIER (COMMA IDENTIFIER)* CPAR SCOL ;
merge		:	MERGE id OPAR IDENTIFIER (COMMA IDENTIFIER)* CPAR SCOL ;  

graph       :   strict=STRICT? g=(GRAPH | DIGRAPH) id? OBRACE stmt_list CBRACE ;
stmt_list   :   ( stmt SCOL? )* ; 
stmt        :   node_stmt
            |   edge_stmt
            |   attr_stmt
            |   id ASSIGN id
            |   subgraph
            ;
			
attr_stmt   :   t = (GRAPH | NODE | EDGE) attr_list ;
attr_list   :   OBRACKET a_list CBRACKET ;
a_list      :   id ASSIGN id (COMMA a_list)* ;
edge_stmt   :   (node_id | subgraph) edgeRHS attr_list? ;
edgeRHS     :   edgeop (node_id | subgraph) (edgeRHS)* ;
edgeop      :   op = ARROW | DEC ;
node_stmt   :   node_id attr_list? ;
node_id     :   id port? ;
port        :   COLON id (COLON id)? ;
subgraph    :   (SUBGRAPH id?)? OBRACE stmt_list CBRACE ; 
id          :   i = ( IDENTIFIER
            |   STRING
            |   DOUBLE
			|	INT )
            ;
			
/*******************************************************************
 *	TOKENS
 ******************************************************************/ 
 
INC			:	'++' ;
DEC			:	'--' ; 

ARROW		: 	'->' ;
 
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

SCOL 		: 	';' ;
COLON		:	':' ;
COMMA		:	',' ;
ASSIGN 		: 	'=' ;
OPAR 		: 	'(' ;
CPAR 		: 	')' ;
OBRACE 		: 	'{' ;
CBRACE 		: 	'}' ;
OBRACKET	:	'[' ;
CBRACKET	:	']' ;

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
MERGE		:	[Mm][Ee][Rr][Gg][Ee] ;	
PRINT		:	[Pp][Rr][Ii][Nn][Tt] ;

IDENTIFIER	: 	[a-zA-Z_] [a-zA-Z_0-9]* ;
INT			: 	MINUS? DIGIT+ ;
DOUBLE		:	MINUS? DIGIT+ '.' DIGIT*
			| 	MINUS? '.' DIGIT+ ;
			
fragment
DIGIT       :   [0-9] ;

STRING      :   '"' ('\\"'|.)*? '"' ;

COMMENT     :   '/*' .*? '*/'       -> channel(HIDDEN) ; 
LINE_COMMENT:   '//' .*? '\r'? '\n' -> channel(HIDDEN) ;
WS			:   [ \t\n\r]+ 			-> channel(HIDDEN) ;