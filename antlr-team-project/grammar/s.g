grammar s;

// parser

start	:	block* EOF//s* EOF 
	;

if_st	:	IF LOPEN condition LCLOSE block elsepart
	;
	
elsepart:	ELSE block |
	;
	
	
block	:	BOPEN statements BCLOSE | statement SEMI
	;
	

condition
	:	(e relope e)
	;	
	
relope	:	B_AND|B_OR|EQ|GT|GEQ|LT|LEQ|NEQ|COPEN|CCLOSE
	;
	
statements
	:	(statement SEMI)*
	;
statement
	:	 if_st | assignmentStatement
			
	;
assignmentStatement
	:	ID ASSIGN e | type ID ASSIGN e
	;
	
type	:	T_INT|T_FLOAT|T_CHAR|T_STRING	
	;

e	:	(f) (((op)e)*)*
	;
	
f	:	ID|no|LOPEN e LCLOSE
	;
	
no	:	INT|FLOAT
	;
op	:	POWER|REM|PLUS|SUB|MULTIPLY|DIVIDE
	;


s	:	ID|INT|FLOAT|STRING|CHAR|SWITCH|CASE|if_st|ELIF|ELSE|WHILE|DO|FOR|FUNCTION|RETURN|T_INT|
		T_FLOAT|T_CHAR|T_STRING|SEMI|POWER|REM|PLUS|SUB|MULTIPLY|DIVIDE|ASSIGN|SLL|SRL|AND|OR|XOR|
		B_AND|B_OR|LOPEN|LCLOSE|BOPEN|BCLOSE|EQ|GT|GEQ|LT|LEQ|NEQ|COPEN|CCLOSE
	 ;
	 
//lexer


//KeyWords


//branches
SWITCH	:	'switch' 
	;
	
CASE	:	'case'
	;
	
IF	:	'if'
	;
ELIF	:	'elif'
	;
ELSE	:	'else'
	;
//conditions

EQ	:	'=='
	;
GT	:	'>'
	;
GEQ	:	'>='
	;

LT	:	'<'
	;
	
LEQ	:	'<='
	;

NEQ	:	'!='
	;



//loops

WHILE	:	'while'
	;
	
DO	:	'do'
	;
	
FOR	:	'for'
	;

//functions

FUNCTION:	'function'
	;
	
RETURN	:	'return'
	;
	
//Types

T_INT	:	'int'
	;
	
T_FLOAT	:	'float'
	;
	
T_CHAR	:	'char'
	;
	
T_STRING:	'string'
	;
	
// statement END

SEMI	:	';'
	;
	
// Arithmatic operand


POWER	:	'^^'
	;

REM	:	'%'
	;	
	
PLUS	:	'+'
	;
	
SUB	:	'-'
	;

MULTIPLY:	'*'
	;
	
DIVIDE	:	'/'
	;

ASSIGN	:	'='
	;
	
//Bitwise operand
	
SLL	:	'<<'
	;

SRL	:	'>>'
	;

AND	:	'&'
	;

OR	:	'|'
	;

XOR	:	'^'
	;

//Bolean operand

B_AND	:	'&&'
	;
B_OR	:	'||'
	;


//Seperator

LOPEN	:	'('
	;
	
LCLOSE	:	')'
	;
BOPEN	:	'{'
	;
	
BCLOSE	:	'}'
	;
	
COPEN	:	'['
	;
	
CCLOSE	:	']'
	;
	

ID  :	('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')*
    ;

INT :	'0'..'9'+
    ;

FLOAT
    :   ('0'..'9')+ '.' ('0'..'9')* EXPONENT?
    |   '.' ('0'..'9')+ EXPONENT?
    |   ('0'..'9')+ EXPONENT
    ;

COMMENT
    :   '//' ~('\n'|'\r')* '\r'? '\n' {$channel=HIDDEN;}
    |   '/*' ( options {greedy=false;} : . )* '*/' {$channel=HIDDEN;}
    ;

WS  :   ( ' '
        | '\t'
        | '\r'
        | '\n'
        ) {$channel=HIDDEN;}
    ;

STRING
    :  '"' ( ESC_SEQ | ~('\\'|'"') )* '"'
    ;

CHAR:  '\'' ( ESC_SEQ | ~('\''|'\\') ) '\''
    ;

fragment
EXPONENT : ('e'|'E') ('+'|'-')? ('0'..'9')+ ;

fragment
HEX_DIGIT : ('0'..'9'|'a'..'f'|'A'..'F') ;

fragment
ESC_SEQ
    :   '\\' ('b'|'t'|'n'|'f'|'r'|'\"'|'\''|'\\')
    |   UNICODE_ESC
    |   OCTAL_ESC
    ;

fragment
OCTAL_ESC
    :   '\\' ('0'..'3') ('0'..'7') ('0'..'7')
    |   '\\' ('0'..'7') ('0'..'7')
    |   '\\' ('0'..'7')
    ;

fragment
UNICODE_ESC
    :   '\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT
    ;
