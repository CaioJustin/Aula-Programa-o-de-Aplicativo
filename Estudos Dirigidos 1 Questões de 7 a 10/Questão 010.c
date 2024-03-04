#include <stdio.h>
#include <stdlib.h>



int main(){

char nome[100];
float media=0;
float nota[5];
int i;
float soma=0;

printf("\nDigite o nome do aluno:");
scanf("%s",&nome);

fflush(stdin);

for (i = 0; i < 5; i++)
{
    printf("\nDigite a %d nota do aluno:",i+1);
    scanf("%f",&nota[i]);

    soma+=nota[i];
}

media=soma/i;


if (media >=7)
{
    printf("\nO Aluno esta Aprovado");
}else if (media >=4 )
{
    printf("\nO Aluno esta Reprovado com Direito a  recuperacao");
}else if (media < 4)
{
    printf("\nO Aluno esta Reprovado sem direito a recuperacao");
}



    return 0;
}