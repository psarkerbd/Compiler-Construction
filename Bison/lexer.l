%option noyywrap

%{ 
    #include "parser.tab.h"
%}

digit [0-9]
letter [a-zA-Z]
id (_|{letter})({letter}|{digit})*
number ({digit})+
ws [ \t\n]
delim ({ws})*


%%
{delim} {}
"int"   {return INT; }
"float" {return FLOAT; }
"=" {return ASSIGN; }
";" {return SEMI; }
{number}    {return NUM; }
{id}    {return ID; }



