%option noyywrap

digit [0-9]

%%

{digit} printf("Digit\n");

{digit}+ printf("Number\n");

\n;
%%

int main()
{
	yylex();
	return 0;
}