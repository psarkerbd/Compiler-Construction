%option noyywrap

alphabet [a-zA-Z]
digit [0-9]

%%
{alphabet} printf("Alphabet\n");
{digit} printf("Digit\n");
{digit}+ printf("Number\n");
{alphabet}+ printf("Word\n");
\n;
%%

int main()
{
	yylex();
	return 0;
}