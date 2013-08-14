/** Derived from http://www.graphviz.org/doc/info/lang.html.
    Comments pulled from spec.
 */
grammar DOT;

@header{    
package de.compilerbau.dot;
}

s			: 	statement* ; 
uncover		: 	UNCOVER file_list  '{' graph+ '}' ;
only		:	ONLY file_list  '{' graph '}' ;
file_list	: 	'(' file+ ')' ; 
file		: 	NUMBER ('-' file)* ; 

graph       :   STRICT? (GRAPH | DIGRAPH) id? '{' stmt_list '}' ;
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
subgraph    :   (SUBGRAPH id?)? '{' stmt_list '}' ; 
id          :   ID
            |   STRING
            |   NUMBER
            ;

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
    :   variableDeclaratorId ('=' variableInitializer)?
    ;

variableDeclaratorId
    :   ID ('[' ']')*
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
    |   ifStatement
    |   forStatement
    |   whileStatement
    |   doStatement
	|	uncover
	|	only
	| 	graph
    ;
	
ifStatement
	:	'if' parExpression statement ('else' statement)? ;
	
forStatement
	:	'for' '(' forControl ')' statement ;
	
whileStatement
	:	'while' parExpression statement ;
	
doStatement
	:	'do' statement 'while' parExpression ';' ;
	
parExpression
    :   '(' expression ')'
    ;
	
expressionList
    :   expression (',' expression)*
    ;
	
block
    :   '{' blockStatement* '}'
    ;	

blockStatement
    :   localVariableDeclarationStatement
    |   statement
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
    |   expression '[' expression ']'				#arrayExpr
    |   expression ('++' | '--')					#incDecExpr
	|	expression '<' '=' expression				#ltEqExpr
	|	expression '>' '=' expression				#gtEqExpr
	|	expression '>' expression					#gtExpr
	|	expression '<' expression					#ltExpr
	|	expression '==' expression					#eqExpr
	|	expression '!=' expression					#neqExpr
    |   expression '&&' expression					#andExpr
    |   expression '||' expression					#orExpr
    |   expression '='<assoc=right> expression		#assignExpr
    ;
	
primary
    :   '(' expression ')'  	
    |   ID
    |   NUMBER
    ;

// "The keywords node, edge, graph, digraph, subgraph, and strict are
// case-independent"
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



COMMENT     :   '/*' .*? '*/'       -> skip ;
LINE_COMMENT:   '//' .*? '\r'? '\n' -> skip ;

/** "a '#' character is considered a line output from a C preprocessor (e.g.,
 *  # 34 to indicate line 34 ) and discarded"
 */
PREPROC     :   '#' .*? '\n' -> skip ;

WS          :   [ \t\n\r]+ -> skip ;
