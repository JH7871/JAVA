import java.util.*;
class fun
{
public static void main(String[] args)
{
Scanner sc=new Scanner (System.in);
System.out.println("enter the fun:");
int  n=sc.nextInt();
int i=1;
int s=0;
do
{
 s=s+i;
 i=i+1;
}
while(i<=n);
System.out.println("sum of numbers using do while:"+s);
}
}