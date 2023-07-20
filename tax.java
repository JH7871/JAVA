import java.util.*;
class tax
{
public static void main(String[] args)
{
Scanner s=new Scanner(System.in);
System.out.println("enter the annual income:");
int income=s.nextInt();
double tax=0;
if(income<50000)
{
tax=0;
System.out.println("the tax is:"+tax);
}
else if(income>50000 && income<=1000000)
{
tax=income*0.1;
System.out.println("the tax is:"+tax);
}
else if(income>100000 && income<=2000000)
{
tax=income*0.15;
System.out.println("the tax is:"+tax);
}

else if(income>200000 && income<30000000)
{
tax=income*0.2;
System.out.println("the tax is:"+tax);
}
else if(income>=3000000)
{
tax=income*0.3;
System.out.println("the tax is:"+tax);
}
else
{
System.out.println("enter correct amount");
}
}
}

