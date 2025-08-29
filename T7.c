#include<stdio.h>
#include<math.h>

void main()
{
    float c,f,cel;

    printf("Enter values:-\n");
    scanf("%f%f",&c,&f);
    
    c=(f-32)/1.8;
    cel=c;
    
    printf("Celcius=%0.2f",c);



}