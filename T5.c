#include<stdio.h>
#include<math.h>

void main()
{
    float side,volume;

    printf("Enter volume of cube:-\n");
    scanf("%f",&side);

    volume = side * side * side ;
    
    printf("Volume of cube is = %0.2f",volume);


}