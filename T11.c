#include<stdio.h>

void main()
{
    float p,r,n,si;

    printf("Enter formula number:");
    scanf("%f%f%f",&p,&r,&n);

    si=p*r*n/100;

    printf("SI=%f",si);

}