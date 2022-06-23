/* 9 Write a Java program to input marks of five subjects Physics, Chemistry, Biology, Mathematics and Computer. Calculate percentage and grade according to following:
Percentage >= 90% : Grade A
Percentage >= 80% : Grade B
Percentage >= 70% : Grade C
Percentage >= 60% : Grade D
Percentage >= 40% : Grade E
Percentage < 40% : Grade F */

import java.util.*;
class percentage
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the marks:");
int m1=sc.nextInt();
int m2=sc.nextInt();
int m3=sc.nextInt();
int m4=sc.nextInt();
int m5=sc.nextInt();
int total=m1+m2+m3+m4+m5;
int p=100*(total/500);
if(p>=90)
{
System.out.println("Grade A");
}

 else if (p>=80)

{
System.out.println("Grade B");
}

 else if (p>=70)

{
System.out.println("Grade c");
}
 else if (p>=60) 

{
System.out.println("Grade D");
}
 else if (p>=40)

{
System.out.println("Grade E");

}
else if (p<40)
{
System.out.println("Grade F");

}
}
}