/*
BSD License

Copyright (c) 2013, Tom Everett
All rights reserved.

Redistribution and use in source and binary forms, with or without
modification, are permitted provided that the following conditions
are met:

1. Redistributions of source code must retain the above copyright
   notice, this list of conditions and the following disclaimer.
2. Redistributions in binary form must reproduce the above copyright
   notice, this list of conditions and the following disclaimer in the
   documentation and/or other materials provided with the distribution.
3. Neither the name of Tom Everett nor the names of its contributors
   may be used to endorse or promote products derived from this software
   without specific prior written permission.

THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS
"AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT
LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR
A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT
HOLDER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL,
SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT
LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE,
DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY
THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
(INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE
OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
*/

grammar yuli;

file_ : functions*;

functions
    : 'func ' VARIABLE LPAREN* arguments = atom* RPAREN* STARTBLOCK inside=operation* ENDBLOCK next = functions* #funinit
    |inside=operation #global
    ;

setargs
    : <asoc=right> left=variable SETVAR right=operation #setvariable
    ;

argumentsinit
    : setargs*
    ;

operation
    :  ifstatements #ifgroup
    | name = variable LPAREN args = argumentsinit? RPAREN #callfun
    | loopstatements #loopgroup
    | setargs #setargument
    | specialfun #specialfunc
    | equation #equ

    ;

specialfun
    : <asoc=right> 'print ' inside=operation #printfun
    ;

ifstatements
    : IFKW '('condition=expression')' STARTBLOCK inside=operation* ENDBLOCK ELSEKW* STARTBLOCK* elseinside=expression* ENDBLOCK* #ifelsestatement
    | IFKW '('condition=expression')' '[' inside=operation* ']' #ifstatement
    ;
loopstatements
    : 'while ' condition=equation '[' inside=operation* ']' #whilestatement
    | 'for ' LPAREN startwhile = atom ':' endwhile = atom ':' condition=operation* RPAREN STARTBLOCK inside=operation* ENDBLOCK #forstatementwithcondition
    | 'while ' LPAREN startwhile = scientific ':' endwhile = atom  RPAREN STARTBLOCK inside=operation* ENDBLOCK #whilestatementwithoutcondition
    | 'while ' LPAREN startwhile = variable ':' endwhile = atom  RPAREN STARTBLOCK inside=operation* ENDBLOCK #whilestatementwithoutconditionindex
    ;

equation
    :result=expression #cal
    | left=expression sign=relop right=expression #compare
   ;

expression
   : <assoc=right> left=expression  POW right=expression #powexpr
   |  left=expression  (TIMES | DIV)  right=expression #timesordivexpr
   |  left=expression  (PLUS | MINUS) right=expression #plusorminusexpr
   |  LPAREN inside=expression RPAREN #parenexpr
   |  (PLUS | MINUS)* atom #atomexpr
   ;

atom
   : scientific
   | variable
   ;

scientific
   : SCIENTIFIC_NUMBER
   ;

variable
   : VARIABLE
   ;

relop
   : EQ
   | GT
   | LT
   ;

STARTBLOCK
    : '['
    ;
ENDBLOCK
    : ']'
    ;

IFKW
   : 'if'
   ;

ELSEKW
    : 'else'
    ;

VARIABLE
   : VALID_ID_START VALID_ID_CHAR*
   ;


fragment VALID_ID_START
   : ('a' .. 'z') | ('A' .. 'Z') | '_'
   ;


fragment VALID_ID_CHAR
   : VALID_ID_START | ('0' .. '9')
   ;

//The NUMBER part gets its potential sign from "(PLUS | MINUS)* atom" in the expression rule
SCIENTIFIC_NUMBER
   : NUMBER (E SIGN? UNSIGNED_INTEGER)?
   ;

fragment NUMBER
   : ('0' .. '9') + ('.' ('0' .. '9') +)?
   ;

fragment UNSIGNED_INTEGER
   : ('0' .. '9')+
   ;


fragment E
   : 'E' | 'e'
   ;


fragment SIGN
   : ('+' | '-')
   ;


LPAREN
   : '('
   ;


RPAREN
   : ')'
   ;


PLUS
   : '+'
   ;


MINUS
   : '-'
   ;


TIMES
   : '*'
   ;


DIV
   : '/'
   ;


GT
   : '>'
   ;


LT
   : '<'
   ;


SETVAR
    : ':'
    ;

EQ
   : '='
   ;


POINT
   : '.'
   ;


POW
   : '^'
   ;


WS
   : [ \r\n\t] + -> skip
   ;
