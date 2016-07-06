#include<stdio.h>
#include<conio.h>
void main()
{
int i,n,mul;
printf("\n enter the num ");
scanf("%d",&n);
mul=1;
for(i=0;i<=10;i++)
{
mul=i*n;
}
printf("multiplication table %d * %d = %d",i,n,mul);
}
