#include<stdio.h>
#include<conio.h>
#include<string.h>
void main()
{
int i,ch=0,w=1;
char str[100];
printf("\n enter the string");
gets(str);
for(i=0;str[i]!='\0';i++)
{
ch=ch+1;
}
for(i=0;i=ch-1;i++)
{
w=w+1;
}
printf("\n no of characters%d",w);
}
