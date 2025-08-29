#include<stdio.h>

int main()
{
    float length,width,rectangle;

    printf("Enter two values\n");
    scanf("%f%f",&length,&width);

    rectangle=length*width;

    printf("Rectangle=%f",rectangle);

    return 0;
}