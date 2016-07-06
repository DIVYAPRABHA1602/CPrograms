#include<stdio.h>
#include<conio.h>
void main()
{
int i,a,count=0;
clrscr();
{
printf("\n enter number");
scanf("%d",&a");
for(i=1;i<=a;i++)
{
if(a%i==0)
{
count++;}
if(count==2)
{
printf("\n number is prime");
}
else
{
printf("\n number is not prime");
}
getch();
}
