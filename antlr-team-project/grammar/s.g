grammar s;

start	:	s* EOF;

s	:	ID|INT|FLOAT|STRING|CHAR|SWITCH|CASE|IF|ELIF|ELSE|WHILE|DO|FOR|FUNCTION|RETURN|T_INT|
		T_FLOAT|T_CHAR|T_STRING|SEMI|POWER|REM|PLUS|SUB|MULTIPLY|DIVIDE|ASSIGN|SLL|SRL|AND|OR|XOR|
		B_AND|B_OR|LOPEN|LCLOSE|BOPEN|BCLOSE
	 ;
	 
//KeyWords


//conditions
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


//ELSE

LOPEN	:	'('
	;
	
LCLOSE	:	')'
	;
BOPEN	:	'{'
	;
	
BCLOSE	:	'}'
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
