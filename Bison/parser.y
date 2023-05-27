%{ 
    #include <stdio.h>
    extern int yylex();
    void yyerror(char *s);
%}

%token INT FLOAT NUM ID ASSIGN SEMI
%start stmt

%%

stmt: stmt INT ID ASSIGN NUM SEMI
    |
    ;
%%

void yyerror(char *s) {
    fprintf(stderr, "Error: %s\n", s);
}

int main() {
    yyparse();
    printf("Parser is finished\n");
    return 0;
}