#include<stdio.h>
#include<conio.h>
void main()
{
int *s,*t,a,b,c;
printf("\n enter two numbers");
scanf("%d%d",&a,&b);
s=&a;
t=&b;
c=*s+*t;
printf("%d",c);
}
