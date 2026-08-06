grammar CodexLatinus;

/********** PARSER **********/
programa
    : seccionVariables? seccionFunciones? seccionPrincipal EOF
    ;
seccionVariables
    : VARIABILES_HDR declaracion*
    ;

seccionFunciones
    : MUNERA_HDR funcion*
    ;

seccionPrincipal
    : MAIOR_HDR sentencia* FINIS_PROGRAMA SEMI
    ;

declaracion
    : declaracionVariable
    | declaracionArray
    | declaracionStructDef
    | declaracionStructVar
    ;

declaracionVariable
    : ESTO ID COLON tipoPrimitivo expresion? SEMI
    ;

declaracionArray
    : SERIES ID LBRACK expresion RBRACK COLON tipo (LBRACE listaExpresiones RBRACE)? SEMI
    ;

declaracionStructDef
    : STRUCTURA ID LBRACE listaAtributos RBRACE FINIS_SENTENCIAS SEMI
    ;

listaAtributos
    : atributo (COMMA atributo)*
    ;

atributo
    : ESTO? ID COLON tipo
    ;

declaracionStructVar
    : ESTO ID COLON ID literalEstructura SEMI?
    ;

literalEstructura
    : LBRACE listaAsignAtributos RBRACE
    ;

listaAsignAtributos
    : asignAtributo (COMMA asignAtributo)*
    ;

asignAtributo
    : ID COLON valorAtributo
    ;

valorAtributo
    : expresion                     // nombre: "Perro"
    | literalEstructura             // subestructura anidada literal
    | ID LBRACK expresion RBRACK    // animales: Animal[7]  (declara tamaño del array del atributo)
    ;

tipo
    : tipoPrimitivo
    | ID          
    ;

tipoPrimitivo
    : NUMERUS
    | TEXTUM
    | DECIMALIS
    | LITTERA
    ;

sentencia
    : declaracion
    | asignacion
    | llamadaFuncion SEMI
    | condicional
    | cicloDum
    | cicloFacere
    | cicloPer
    | PERGE SEMI
    | INTERRUMPE SEMI
    | lectura
    | escritura
    ;

asignacion
    : accesoAsignable ASSIGN (expresion | literalEstructura) SEMI
    ;

accesoAsignable
    : ID (LBRACK expresion RBRACK)? (DOT ID (LBRACK expresion RBRACK)?)*
    ;

/* CONDICIONALES  (si / aliter ... finis;) */
condicional
    : SI LPAREN expresion RPAREN bloque
      (ALITER LPAREN expresion RPAREN bloque)*
      (ALITER bloque)?
      FINIS_SENTENCIAS SEMI
    ;

bloque
    : LBRACE sentencia* RBRACE
    ;
/*  CICLOS  */
cicloDum
    : DUM LPAREN expresion RPAREN LBRACE sentencia* RBRACE FINIS_SENTENCIAS SEMI
    ;

cicloFacere
    : FACERE LBRACE sentencia* RBRACE DUM LPAREN expresion RPAREN SEMI
    ;

cicloPer
    : PER LPAREN declaracionVariable expresion SEMI expresion RPAREN LBRACE sentencia* RBRACE
    ;

/* FUNCIONES (RATIO/ACTIVO) */
funcion
    : ACTIO ID LPAREN listaParametros? RPAREN LBRACE
        (VARIABILES_LOCAL_HDR declaracionVariable* RBRACK)?
        sentencia*
      RBRACE FINIS_SENTENCIAS SEMI
    | RATIO tipo ID LPAREN listaParametros? RPAREN LBRACE
        (VARIABILES_LOCAL_HDR declaracionVariable* RBRACK)?
        sentencia*
        REDDERE expresion SEMI
      RBRACE FINIS_SENTENCIAS SEMI
    ;

listaParametros
    : parametro (COMMA parametro)*
    ;

parametro
    : ESTO ID COLON tipo
    ;

llamadaFuncion
    : ID LPAREN listaExpresiones? RPAREN
    ;

listaExpresiones
    : expresion (COMMA expresion)*
    ;


/*  ENTRADAS Y SALIDAS  */  
lectura
    : LEER (ID)? SEMI
    ;

escritura
    : ESCRIBIR (expresion (ESCRIBIR expresion)*) SEMI
    ;

/* EXPRESIONES */
expresion
    : expresionLogica
    ;

expresionLogica
    : expresionRelacional ((AND | OR) expresionRelacional)*
    ;

expresionRelacional
    : expresionAditiva ((EQ | NEQ | LT | GT | LE | GE) expresionAditiva)*
    ;

expresionAditiva
    : expresionMultiplicativa ((PLUS | MINUS) expresionMultiplicativa)*
    ;

expresionMultiplicativa
    : expresionUnaria ((MULT | DIV) expresionUnaria)*
    ;

expresionUnaria
    : NON expresionUnaria
    | (INC | DEC) primario
    | primario (INC | DEC)?
    ;

primario
    : LPAREN expresion RPAREN
    | llamadaFuncion
    | accesoAsignable
    | NUM_LIT
    | DEC_LIT
    | TEXTO_LIT
    | CHAR_LIT
    | VERUM
    | FALSUS
    ;



/********** LEXER **********/
/*  PALABRAS RESERVADAS */
VARIABILES_HDR       : 'VARIABILES>';
VARIABILES_LOCAL_HDR : 'VARIABILES[';
MUNERA_HDR            : 'MUNERA>';
MAIOR_HDR              : 'MAIOR>';
FINIS_PROGRAMA                : 'FINIS'; //fin de programa

ESTO        : 'esto';
SERIES      : 'series';
STRUCTURA   : 'structura';
FINIS_SENTENCIAS   : 'finis'; //fin de bloque de sentencias    


SI       : 'si';
ALITER   : 'aliter';
DUM      : 'dum'; // ciclo simple
FACERE   : 'facere'; // do while
PER      : 'per'; // ciclo iterador (for)
PERGE    : 'perge'; //continuar
INTERRUMPE : 'interrumpe';
ACTIO    : 'actio'; // funcion sin retorno
RATIO    : 'ratio'; // funcion con retorno
REDDERE  : 'reddere'; // return
NON      : 'non'; //negacion

NUMERUS   : 'numerus';
TEXTUM    : 'textum';
DECIMALIS : 'decimalis';   
LITTERA   : 'littera';
VERUM     : 'verum';
FALSUS    : 'falsus';

// Operadores multi-carácter ANTES que los de un carácter
EQ   : '==';
NEQ  : '!=';
LE   : '<=';
GE   : '>=';
AND  : '&&';
OR   : '||';
INC  : '++'; // suma unidad
DEC  : '--'; // resta unidad
LEER      : '<<';
ESCRIBIR  : '>>';

LT   : '<';
GT   : '>';
PLUS : '+';
MINUS: '-';
MULT : '*';
DIV  : '/';
ASSIGN : '=';

LPAREN : '(';  RPAREN : ')';
LBRACE : '{';  RBRACE : '}';
LBRACK : '[';  RBRACK : ']';
SEMI   : ';';
COLON  : ':';
COMMA  : ',';
DOT    : '.';

/*  IDENTIFICADORES */
ID : [a-zA-Z_][a-zA-Z_0-9]*;

/*  LITERALES   */
NUM_LIT  : [0-9]+;
DEC_LIT  : [0-9]+ '.' [0-9]+;
TEXTO_LIT: '"' (~["\r\n])* '"';
CHAR_LIT : '\'' . '\'';

/*  COMENTARIOS */
COMMENT_LINE  : '//' ~[\r\n]* -> skip;
COMMENT_BLOCK : '##' .*? '##' -> skip;
WS : [ \t\r\n]+ -> skip;

