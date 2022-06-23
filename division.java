import java.util.*;
class division
{
  public static void main(String args[])
 {
  Scanner sc=new Scanner(System.in);
  System.out.println("enter the first no");
  int a=sc.nextInt();
  
     if(a%5==0)
    System.out.println("the no is divisible by 5");
     if(a%11==0)
   {
    System.out.println("the no is divisible by 11");
   }
  
     if(a%5 !=0)
   {
     System.out.println("the no is not divisible by 5");
    }
  
     if(a%11 !=0)
   {
     System.out.println("the no is not divisible by 11");
   }
  }
}