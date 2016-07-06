#include<stdio.h>
#include<conio.h>
void main()
{
int n,rem,num;
printf("\n enterr number");
scanf("%d",&n);
num=1;
rem=n%10;
num=(num*num*num)+rem*10;
n=n/10;
printf("%d",num);
}
