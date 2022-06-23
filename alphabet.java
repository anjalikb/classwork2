import java.util.*;
class alphabet
{
  public static void main(String args[])
 {
  Scanner sc=new Scanner(System.in);
  System.out.println("enter the charater");
  char ch=sc.next().charAt(0);
  
   if((ch>='a')&&(ch<='z') || (ch>='A')&&(ch<='Z'))
 {
   System.out.println("the character is albhabet");
 }
   else
   {
     System.out.println("the character is not alphabet");
   }
}
}
  
  
