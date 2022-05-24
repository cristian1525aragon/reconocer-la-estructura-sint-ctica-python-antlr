//Definimos la gramática
grammar rules;
//Estructura de definición
def : 'while' SPACE* (CONDITION|C1) SPACE* (OPERATION|O1) SPACE* 'end';
//Operadores lógicos
LOGIC: '==' | '>=' | '<=' | '<' | '>' | '~=';
//Separadores de condiciones
SEPARATOR: '&&' | '||';
//Operadores de funciones
OPERATOR: '+' | '-' | '*' | '/' | '^';
//Números
INT: [0-9]+;
//Decimales
DECIMAL: '-'?INT  '.' INT;
//Nombres de variable
VAR : ALPHA ( ALPHA | UNDERSCORE ALPHA| UNDERSCORE INT | INT)* UNDERSCORE?;
//Elemento de una operación o una condición
ELEMENT: (VAR | DECIMAL | '-'?INT);
//Condición(es)
CONDITION: (ELEMENT SPACE* LOGIC SPACE* ELEMENT | C1) (SPACE* SEPARATOR SPACE* (CONDITION | C1))*;
//Condición(es) dentro de paréntesis
C1: '(' CONDITION ')';
//Grupo de condiciones
//Operación(es)
OPERATION: ELEMENT SPACE* OPERATOR SPACE* ELEMENT (SPACE* OPERATOR SPACE* ELEMENT)*;
//Operación(es) dentro de paréntesis
O1: '(' OPERATION ')';
//Letras y _
ALPHA: [a-zA-Z];
UNDERSCORE: '_';
//Separadores de tokens
WS  : (' '|'\r'|'\n')+ -> skip;
//Espaciado
SPACE: ' ';
//CLI PARA EXPORTAR: java -jar antlr.jar -Dlanguage=Python3 rules.g4 -visitor -o dist
//CUANDO SE EXPORTE SE DEBE BORRAR EL ERROR QUE VIENE EN RULESPARSER
//INSTALAR LIBRERÍA pip install antlr4-python3-runtime