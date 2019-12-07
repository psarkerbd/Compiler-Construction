%option noyywrap

digit [0-9]

%%
({digit}|{digit}+)(01)({digit}*) printf("Contain 01\n");
({digit}|{digit}+) printf("Not contain 01\n");
%%

int main()
{
	yylex();
	return 0;
}