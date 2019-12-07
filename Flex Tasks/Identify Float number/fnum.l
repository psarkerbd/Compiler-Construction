%option noyywrap

digit [0-9]

%%
{digit} printf("Digit\n");
{digit}+ printf("Integer Number\n");
({digit}|{digit}+).{digit}+ printf("Float point Number\n");
%%

int main()
{
	yylex();
	return 0;
}