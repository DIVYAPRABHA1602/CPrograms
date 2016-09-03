#include<stdio.h>
void main()
{
int n,i,mul;
scanf("%d",&n);
for(i=0;i<=10;i++)
{
mul=n*i;
printf("%d * %d = %d",i,n,mul);
}
}
