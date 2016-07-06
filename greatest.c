#include<stdio.h>
#include<conio.h>
void main()
{
int a,b,c;
printf("\n numbers");
scanf("%d%d%d",&a,&b,&c);
if(a>b&&a>c)
{
printf("\n a is greater");
}else
{
printf("\n b is greater");
}
elseif(c>b&&c>a)
{
printf("\n c is greatest");
}
}
