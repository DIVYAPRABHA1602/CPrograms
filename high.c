#include<stdio.h>
void main()
{
int a[5],h,l;
for(i=0;i<=5;i++)
{
scanf("%d",&a[i]);
}
l=a[0];
for(i=1;i<=5;i++)
if(a[i]<l)
{
l=a[i];
printf("%d",a[i]);
}
h=a[5];
for(i=5;i<=0;i--)
{
if(a[i]>h)
{
h=a[i];
printf("%d",a[i]);
}
}
