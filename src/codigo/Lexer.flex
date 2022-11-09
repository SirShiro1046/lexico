package codigo;
import static codigo.Tokens.*;
%%
%class Lexer
%type Tokens
L=[a-zA-Z_]+
D=[0-9]+
coment = "/*"[^"*/"]*"*/".*
CADENA = "\""[^"\""]*"\""
simboloss = [.,?,:,;,]+
asig =[==]+
racional=[!=,>,<,>=,<=]+
simbolos=[/,*]+
espacio=[ ,\t,\r,\n]+

%{
    public String lexeme;
%}
%%
abstract |
assert |
boolean |
break |
byte |
case |
catch |
char |
continue |
default |
do |
double |
else |
enum |
extends |
final |
finally |
float |
for |
implements |
import |
instanceof |
interface |
long |
native |
new |
private |
protected |
return |
short |
strictfp |
super |
switch |
synchronized |
this |
throw |
throws |
transient |
try |
package |
public |
class |
static |
while |
static |
void |
int |
if |
else |
String |
println |
while {lexeme=yytext(); return PALRE;}
"//".* {/*Ignore*/}
"/*".*[\n].* {/*Ignore*/}

"*".*[\n].* {/*Ignore*/}
"*/".*[\n].* {/*Ignore*/}
{espacio} {/*Ignore*/}

- |
{simbolos} |
while {lexeme=yytext(); return OPARI;}
"+" {lexeme=yytext(); return OPARI;}

-- |
while {lexeme=yytext(); return OPIND;}
"++" {lexeme=yytext(); return OPIND;}

{simboloss} |
while {lexeme=yytext(); return OPESP;}
"==" {lexeme=yytext(); return OPREL;}
{racional} {lexeme=yytext(); return OPREL;}
"System.out." {/*Ignore*/}
"UNPA.WinForm." {/*Ignore*/}


"*=" {lexeme=yytext(); return OPASI;}
"/=" {lexeme=yytext(); return OPASI;}
"%=" {lexeme=yytext(); return OPASI;}
"+=" {lexeme=yytext(); return OPASI;}
"-=" {lexeme=yytext(); return OPASI;}

{asig} |
while {lexeme=yytext(); return OPASI;}

"[" {lexeme=yytext(); return OPESP;}
"]" {lexeme=yytext(); return OPESP;}
"," {lexeme=yytext(); return OPESP;}
"(" {lexeme=yytext(); return OPESP;}
")" {lexeme=yytext(); return OPESP;}
"{" {lexeme=yytext(); return OPESP;}
"}" {lexeme=yytext(); return OPESP;}
"String" {lexeme=yytext(); return PALRE;}
{coment} {/*Ignore*/}
{CADENA} {lexeme=yytext(); return MSJ;}

{L}({L}|{D})* {lexeme=yytext(); return ID;}
("(-"{D}+")")|{D}+ {lexeme=yytext(); return NUM;}
 . {return ERROR;}
