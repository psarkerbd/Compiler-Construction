%option noyywrap

letter [a-z]
digit [0-9]
dot [.]
gmail [gmail]
yahoo [yahoo]

%%
({letter}|{letter}*|{digit}|{digit}*){dot}({letter}|{letter}+|{digit}|{digit}+|{digit}+|{letter}+)*@({gmail}+|{yahoo}+)({dot}com) printf("valid mail\n");
({letter}+|{digit}+)*{dot}({letter}|{letter}|{digit}|{digit}+|{letter}+)*@({gmail}+|{yahoo}+)({dot}com) printf("valid mail\n");
({letter}|{letter}+|{digit}|{digit}+)({letter}*|{digit}*)*@({gmail}+|{yahoo}+)({dot}com) printf("valid mail\n");
({letter}+|{digit}+) printf("not a valid mail\n");
%%

int main()
{
	yylex();
	return ;
}