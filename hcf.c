#include<stdio.h>
#include<conio.h>
long gcd(long,long);
int main()
{
long x,y,hcf,lcm;
get(x,y);
hcf=gcd(x,y);
lcm=(x*y)/hcf;
long gcd(long x,long y)
{
if(x==0)
{return y;}
while(y!=0)
{
if(x>y)
{
x=x-y;
}
else
{
y=y-x;
}
return x;
}
