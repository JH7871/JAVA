import java.util.*;
class grade
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the marks");
int marks=sc.nextInt();
if (marks >=90)
System.out.println("grade s");
else if (marks >=80)
System.out.println("grade A");
else if (marks >=70)
System.out.println("grade c");
else if (marks >=60)
System.out.println("grade D");
else
System.out.println("FAIL");
}
}