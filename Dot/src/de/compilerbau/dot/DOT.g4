/** Derived from http://www.graphviz.org/doc/info/lang.html.
    Comments pulled from spec.
 */
grammar DOT;

@header{    
package de.compilerbau.dot;
}

s			: 	statement ; 

uncover		: 	UNCOVER file_list  '{' graph+ '}' ;
only		: 	ONLY file_list  '{' graph '}' ;
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
            |   HTML_STRING
            |   NUMBER
            ;
			

blockStatement
    :   localVariableDeclaration
    |   statement
    ;
	
localVariableDeclaration
    :   type variableDeclarator (',' variableDeclarator)* ';'
    ;
	
variableDeclarator
    :   variableDeclaratorId ('=' variableInitializer)?
    ;

variableDeclaratorId
    :   Identifier ('[' ']')*
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
    |   'if' parExpression statement ('else' statement)?
    |   'for' '(' forControl ')' statement
    |   'while' parExpression statement
    |   'do' statement 'while' parExpression ';'
	|   uncover 
	| 	only 
	| 	graph
    ;

parExpression
    :   '(' expression ')'
    ;
	
expressionList
    :   expression (',' expression)*
    ;
	
block
    :   '{' blockStatement* '}'
    ;	
		
Identifier
    :   LETTER (LETTER|DIGIT)*
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
    :   primary
    |   expression '.' Identifier
    |   expression '[' expression ']'
    |   expression '(' expressionList? ')'
    |   expression ('++' | '--')
    |   ('+'|'-'|'++'|'--') expression
    |   '(' type ')' expression
    |   expression ('<' '=' | '>' '=' | '>' | '<') expression
    |   expression ('==' | '!=') expression
    |   expression '&&' expression
    |   expression '||' expression
 
    ;
primary
    :   '(' expression ')'  	
    |   Identifier
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

/** "HTML strings, angle brackets must occur in matched pairs, and
 *  unescaped newlines are allowed."
 */
HTML_STRING :   '<' (TAG|~[<>])* '>' ;
fragment
TAG         :   '<' .*? '>' ;

COMMENT     :   '/*' .*? '*/'       -> skip ;
LINE_COMMENT:   '//' .*? '\r'? '\n' -> skip ;

/** "a '#' character is considered a line output from a C preprocessor (e.g.,
 *  # 34 to indicate line 34 ) and discarded"
 */
PREPROC     :   '#' .*? '\n' -> skip ;

WS          :   [ \t\n\r]+ -> skip ;
