import java.util.*;
class bill
{
public static void main(String[] args)
{
Scanner s=new Scanner(System.in);
System.out.println("enter 1 for domestic and 2 for industrial:");
int op=s.nextInt();
System.out.println("enter the last month bill:");
int last=s.nextInt();
System.out.println("enter the current month bill:");
int current=s.nextInt();
int unit=current-last;
double price=0;
switch (op)
{
case 1:
{
if(unit<100)
{
price=unit+0;
}
else if(unit>=101 && unit<=200)
{
price=unit*1.40;
}
else if(unit>=201 && unit<=300)
{
price=unit*2.60;
}
else if(unit>=301 && unit<=500)
{
price=unit*4.00;
}
else
{
price=unit*7.00;
}
break;
}
case 2:
{
if(unit<100)
{
price=unit*2.00;
}
else if(unit>=101 && unit<=200)
{
price=unit*2.70;
}
else if(unit>=201 && unit<=300)
{
price=unit*3.75;
}
else if(unit>=301 && unit<=500)
{
price=unit*7.00;
}
else
{
price=unit*11.00;
}
break;
}
default:
{
System.out.println("incorrect");
break;
}
}
System.out.println(price);
}
}
