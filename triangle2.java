import java.util.*;
class triangle2
{
  public static void main(String args[])
{
  Scanner sc=new Scanner(System.in);
  System.out.println("enter the value of A");
  int a=sc.nextInt();
  System.out.println("enter the value of B");
  int b=sc.nextInt();
  System.out.println("enter the value of C");
  int c=sc.nextInt();
   
   if( ((c+b)>a) || ((a+c)>b) || ((b+a)>c) )
 
      System.out.println("the all side of triangle is valid");
  else 
  {
    System.out.println("the all side of triangle is not valid");
   } 
}
}