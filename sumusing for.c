#include<stdio.h>
#include<conio.h>
void main()
{
int num,j,add;
clrscr();
printf("\n enter number:");
scanf("%d",&num);
add=0;
for(j=0;j<=num;j++)
{
  add=add+j;
  printf("sum %d",add)
}
getch();
}
