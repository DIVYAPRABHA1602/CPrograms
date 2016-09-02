#include<stdio.h>
void main()
{
int a[n],i,sum=0,avg;
scanf("%d",&n);
for(i=0;i<=n;i++)
{
scanf("%d",&a[i]);
}
for(i=0;i<=n;i++)
{
sum=sum+a[i];
}
avg=sum/n;
printf("%d",avg);
}
