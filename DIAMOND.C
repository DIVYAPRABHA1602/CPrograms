#include <stdio.h>
int main(void) {
    int i,j,k,x;
for(i=1;i<7;i++)
{
    x=i;
    if(i>4)
    {
        x=7-i;
    }
    if(i==4)
    {
        continue;
    }
for(j=x;j<4;j++)
{
printf(" ");
}
for(k=1;k<=2*x-1;k++)
{
printf("*");
}
printf("\n");
}
	return 0;
}
