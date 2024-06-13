grammar GramaticaLatino;

s
    :statement s*
    ;

statement
    :idrelated
    |builtin
    |condicionales
    |declfunciones
    |returnstat
    ;

builtin
    :'romper'
    |'imprimir' '(' exp ')'
    |'escribir' '(' exp ')'
    |'poner' '(' exp ')'
    |'imprimirf' '(' contimprimirf? ')'
    |'limpiar' '(' ')'
    |'acadena' '(' exp ')'
    ;

contimprimirf
    : exp auxcontimprimirf*
    ;

auxcontimprimirf
    : ',' exp
    ;

condicionales
    :'si' exp statement+ osi* sino? 'fin'
    |'elegir' exp contelegir 'fin'
    |'desde' '(' ID asig ';' exp ';' statement ')' statement+ 'fin'
    |'mientras' exp statement+ 'fin'
    |'para' ID 'en' 'rango' '(' VALOR_REAL dospara? ')' statement+ 'fin'
    |'repetir' statement+ 'hasta' exp
    ;

osi
    : 'osi' exp statement+
    ;

sino
    : 'sino' statement+
    ;

contelegir
    :'caso' casoexp ':' eleccioncaso
    |'defecto' ':' statement+
    |'otro' ':' statement+
    ;

eleccioncaso
    :statement+ contelegir?
    |'caso' casoexp ':' eleccioncaso
    ;

casoexp
    :CADENA_DE_CARACTERES
    |VALOR_REAL
    ;

dospara
    :',' VALOR_REAL trespara?
    ;

trespara
    :',' VALOR_REAL
    ;

declfunciones
    :('funcion'|'fun') ID '(' contdeclfunciones ')' statement+ 'fin'
    ;

returnstat
    :('retornar'|'ret'|'retorno') exp
    ;

idrelated
    :ID (asig|incdec|func|dicc)
    ;
dicc
    :'.' ID auxid*
    ;

incdec
    :'++'|'--'
    ;

func
    :'(' contdeclfunciones ')'
    ;

contdeclfunciones
    :(exp (',' exp)*)?
    ;

asig
    :auxidasig* OPASIG cual auxcual*
    ;

auxcual
    :',' cual
    ;

auxidasig
    :'[' exp ']'
    |'.' ID
    |',' ID
    ;

cual
    :exp
    |'leer' '(' ')'
    ;

lista
    :'[' exp auxlista* ']'
    ;

auxlista
    : ',' exp
    ;

dic
    :'{' exp ':' exp auxdic* '}'
    ;

auxdic
    : ',' exp ':' exp
    ;

exp
    : exp OPREL exp
    | exp '+' exp
    | exp '-' exp
    | e
    ;

e
    :CADENA_DE_CARACTERES
    |ID auxid*
    |ID '(' contdeclfunciones ')'
    |'fun' '(' contdeclfunciones ')' statement+ 'fin'
    |VALOR_REAL
    |'-' VALOR_REAL
    |'+' VALOR_REAL
    |'verdadero'
    |'cierto'
    |'falso'
    |'nulo'
    |lista
    |dic
    |builtinexp
    |'!' e
    | '(' exp ')'
    ;

builtinexp
    :'acadena' '(' exp ')'
    |'alogico' '(' exp ')'
    |'anumero' '(' exp ')'
    |'tipo' '(' exp ')';

auxid
    :'[' exp ']'
    |'(' exp? ')'
    |'.' ID
    ;

/*ELEMENTOS LÉXICOS*/

OPASIG
    :'='
    |'+='
    |'-='
    |'*='
    |'/='
    |'%='
    ;

OPREL
    :'||'
    |'&&'
    |'=='
    |'!='
    |'>'
    |'<'
    |'>='
    |'<='
    |'~='
    |'*'
    |'/'
    |'%'
    |'^'
    |'..'
    ;

ID:[a-zA-Z_][0-9_a-zA-Z]* ;
//CADENA_DE_CARACTERES: '"' .*? '"' | '\'' .*? '\'' ;
CADENA_DE_CARACTERES
    : '"' (ESC_SEQ | ~["\\])* '"'
    | '\'' (ESC_SEQ | ~['\\])* '\''
    ;

fragment ESC_SEQ
    : '\\' ['"\\bfnrta0-9/]
    ;
VALOR_REAL:[0-9]+|[0-9]+'.'[0-9]+;
ESP : [ \t\r\n]+ -> skip ;
//Sacado de la gramática de C++ de ANTLR
BlockComment: '/*' .*? '*/' -> skip;
LineComment: ('//'|'#') ~ [\r\n]* -> skip;