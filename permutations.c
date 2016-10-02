# include<stdio.h>
# include<conio.h>
#include<string.h>
void swap (char *x, char *y)
{
    char temp;
    temp = *x;
    *x = *y;
    *y = temp;
}

void permute(char *a, int i, int n)
{
    int j;
    if (i == n)
    printf("%s\n", a);
    else
    {
        for (j = i; j <= n; j++)
        {
            swap((a+i), (a+j));
            permute(a, i+1, n);
            swap((a+i), (a+j));
        }
    }
}


int main()
{
    char str[80] ;
    int len=0,i;
    puts("Enter a string:\n\n");
    gets(str);
    for (i=0; str[i] != '\0'; i++)
    {
        len++;
    }
    permute(str, 0, len);
    getchar();
    return 0;
}
