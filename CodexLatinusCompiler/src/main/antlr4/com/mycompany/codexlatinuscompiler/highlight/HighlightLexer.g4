lexer grammar HighlightLexer;

// El orden importa para desempates de "maximal munch"

// 1. Comentarios
LINE_COMMENT   : '//' ~[\r\n]* ;
BLOCK_COMMENT  : '##' .*? '##' ;

// 2. Cadenas de texto
STRING         : '"' (~["\r\n])* '"' ;
CHAR_LIT       : '\'' . '\'' ;

// 3. Palabras reservadas y tipos
KEYWORD        : 'MAIOR' | 'FINIS' | 'esto' | 'series' | 'structura'
               | 'si' | 'aliter' | 'dum' | 'facere' | 'per' | 'perge'
               | 'interrumpe' | 'actio' | 'ratio' | 'reddere' | 'non' ;

TYPE           : 'numerus' | 'textum' | 'decimalis' | 'littera' ;

BOOL_LIT       : 'verum' | 'falsus' ;

// 4. Números
NUMBER         : [0-9]+ ('.' [0-9]+)? ;

// 5. Operadores
OP             : '++' | '--' | '<<' | '>>' | '==' | '!=' | '<=' | '>='
               | '&&' | '||' | '+' | '-' | '*' | '/' | '=' | '<' | '>' | '!' ;

// 6. Símbolos de puntuación
PUNCT           : '(' | ')' | '{' | '}' | '[' | ']' | ';' | ':' | ',' | '.' ;

// 7. Identificadores (por defecto)
IDENTIFIER     : [a-zA-Z_][a-zA-Z0-9_]* ;

WS             : [ \t\r\n]+ -> skip ;
ANY            : . ;
