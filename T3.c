#include<stdio.h>

int main()
{
    int a,b, add , multiple;
    float divide;
    
    printf("Enter two values:-\n");
    scanf("%d%d", &a,&b);
    add = a+b;
    multiple = a*b;
    divide = a/(float)b;

    printf("Sum =%d\n",add);
    printf("Multiply=%d\n",multiple);
    printf("Divide=%.2f\n",divide);

    return 0;

}