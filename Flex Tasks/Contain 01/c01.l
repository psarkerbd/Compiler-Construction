%option noyywrap

digit [0-9]

%%
(({digit}*)(01)({digit}*)) printf("contained 01\n");
({digit}|{digit}+) printf("Not contain 01\n");
%%

int main()
{
	yylex();
	return 0;
}
