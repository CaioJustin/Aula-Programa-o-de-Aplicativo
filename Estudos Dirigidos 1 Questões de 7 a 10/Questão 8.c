#include <stdio.h>
#include <stdlib.h>
#include <string.h>


int main(){

float idade;
char nome[100];


printf("\nDigite o seu nome:");
scanf("%s",&nome);


fflush(stdin);

printf("\nDigite a sua idade em anos:");
scanf("%f",&idade);

if (idade >18)

    printf("\nEntrada Liberada");
else if (idade ==18)
    printf("\nVoce possui somente 18 anos");
else
    printf("\nVoce e uma pessoa menor de 18 anos");


    return 0;
}