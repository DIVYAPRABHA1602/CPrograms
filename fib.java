import java.io.*;
import java.lang.*;
import java.util.*;
class fib
{
public static void main(String args[])
{
int a,b,fib,i,n;
a=0;
b=1;

System.out.println("\n enter number");
Scanner j=new Scanner(System.in);
n=j.nextInt();
fib=0;
System.out.println(a);
System.out.println(b);
for(i=3;i<=n;i++)
{
fib=a+b;
a=b;
b=fib;
System.out.println(fib);
}
}
}
