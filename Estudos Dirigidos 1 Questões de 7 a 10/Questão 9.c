#include <stdio.h>
#include <stdio.h>



int main(){

int i;
char nome[50];
float freq;
float media;
float soma=0;
float nota[3];

printf("\nDigite o nome do aluno:");
scanf("%s",&nome);

fflush(stdin);

for ( i = 0; i < 3; i++)
{
    printf("\nDigite a %d nota:",i+1);
    scanf("%f",&nome[i]);

    soma+=nota[i];
}

media=soma/3;

printf("\nDigite a Frequencia do Aluno(Em Porcentagem):");
scanf("%f",&freq);

if (media >=7.0 && freq >0.75)
{
    printf("\nAluno esta Aprovado");
}else{
    printf("\nAluno esta Reprovado");
}



    return 0;
}