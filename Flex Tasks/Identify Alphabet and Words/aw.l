%option noyywrap

alphabet [a-z]

%%
{alphabet} printf("Alphabet\n");
({alphabet})+ printf("Word\n");
exit;
\n;
%%

int main()
{
	yylex();
	return 0;
}