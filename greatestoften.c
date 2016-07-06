#include<stdio.h>
#include<conio.h>
void main()
{
int a[10],max;
for(i=0;i<10;i++)
{
scanf("%d",&a[i]);
}
max=a[0];
for(i=1;i<a[10];i++)
{if(max<a[i])
{
a[i]=max;
}
printf("%d",max);
}
}
