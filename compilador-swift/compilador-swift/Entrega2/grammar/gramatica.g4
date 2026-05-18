
grammar gramatica;

programa
: PROGRAMA ID SEMICOLON vars funcs INICIO cuerpo FIN EOF
;

vars
: (VARS ID COLON tipo SEMICOLON)*
;

tipo
: ENTERO
| FLOTANTE
;

cuerpo
: LBRACE estatuto* RBRACE
;

estatuto
: asigna
| condicion
| ciclo
| llamada SEMICOLON
| imprime
| LBRACKET estatuto RBRACKET
;

asigna
: ID ASSIGN expresion SEMICOLON
;

imprime
: ESCRIBE LPAREN
(expresion | LETRERO)
(COMMA (expresion | LETRERO))*
RPAREN SEMICOLON
;

ciclo
: MIENTRAS LPAREN expresion RPAREN
HAZ cuerpo SEMICOLON
;

condicion
: SI LPAREN expresion RPAREN
cuerpo
(SINO cuerpo)?
SEMICOLON
;

factor
: LPAREN expresion RPAREN
| (PLUS | MINUS)? (ID | cte)
| llamada
;

funcs
: ((NULA | tipo) ID
LPAREN
(
ID COLON tipo
(COMMA ID COLON tipo)*
)?
RPAREN
LBRACE
vars
cuerpo
RBRACE
SEMICOLON
)*
;

expresion
: exp
((GREATER | LESS | NOT_EQUAL | EQUAL_EQUAL) exp)?
;

llamada
: ID LPAREN
(
expresion
(COMMA expresion)*
)?
RPAREN
;

termino
: factor
((MULT | DIV) factor)*
;

exp
: termino
((PLUS | MINUS) termino)*
;

cte
: CTE_INT
| CTE_FLOAT
;

/* ========= TOKENS ========= */

PROGRAMA : 'programa';
VARS : 'vars';
INICIO : 'inicio';
FIN : 'fin';

ENTERO : 'entero';
FLOTANTE : 'flotante';

ESCRIBE : 'escribe';
MIENTRAS : 'mientras';
HAZ : 'haz';

SI : 'si';
SINO : 'sino';

NULA : 'nula';

SEMICOLON : ';';
COLON : ':';
COMMA : ',';

LPAREN : '(';
RPAREN : ')';

LBRACE : '{';
RBRACE : '}';

LBRACKET : '[';
RBRACKET : ']';

PLUS : '+';
MINUS : '-';

MULT : '*';
DIV : '/';

ASSIGN : '=';

GREATER : '>';
LESS : '<';

NOT_EQUAL : '!=';
EQUAL_EQUAL : '==';

ID : [A-Za-z][A-Za-z0-9]*;

CTE_INT : [0-9]+;
CTE_FLOAT : [0-9]+ '.' [0-9]+;

LETRERO : '"' .*? '"';

WS : [ \t\r\n]+ -> skip;

