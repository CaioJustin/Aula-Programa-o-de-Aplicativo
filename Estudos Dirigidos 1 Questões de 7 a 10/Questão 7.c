#include <stdio.h>

int main(){

char prod[100];
char prod2[100];
int Vd;
int Tr;
int Emin;
int lote;
int Emax;
int ea;


printf("\nDigite o nome do 1 Produto:");
scanf("%s",&prod);

printf("\nDigite o nome do 2 Produto:");
scanf("%s",&prod2);

fflush(stdin);

printf("\nDigite o Estoque atual:");
scanf("%d",&ea);

printf("\nDigite a venda diaria:");
scanf("%d",&Vd);

printf("\nDigite o tempo de Reposição:");
scanf("%d",&Tr);


Emin=Vd*Tr;

printf("\nDigite a Quantidade de itens Solicitados:");
scanf("%d",&lote);


Emax=Emin+lote;

system("cls");

printf("\nO Nome do 1 produto:%s ",prod);
printf("\nO Nome do 2 produto:%s ",prod2);
printf("\nO Estoque Atual:%d ",ea);
printf("\n\nA Venda Media Diaria e :%d",Vd);
printf("\n\nO Estoque Minimo e :%d",Emin);
printf("\n\nO Estoque Maximo e :%d",Emax);



if (ea > Emin)
{
    printf("\nNao Comprar");
}else
    printf("\nComprar");


    return 0;
}