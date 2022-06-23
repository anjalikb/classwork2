
/* 

(6) Using conditional operators determine:
(1) Whether the character entered through the keyboard is a
lower case alphabet or not.
(2) Whether a character entered through the keyboard is a special
symbol or not. */
import java.util.*;
class ascii2
{
  public static void main(String args[])
 {
  Scanner sc=new Scanner(System.in);
  System.out.println("enter the character = ");
  char ch=sc.next().charAt(0);
  
  if(ch>=65 && ch<=90) 
 {
  System.out.println("This is capital alphabet");
 }

  else if(ch>=97 && ch<=122)
 {
  System.out.println("This is small alphabet");
 }
  
  else if(ch>=58 && ch<=64)
 {
  System.out.println("This is number");
 }
  
  else if ((ch>=48 && ch<=57)|| (ch>=0 && ch<=47) || (ch>=58 && ch<=64) )
 {
   System.out.println("This is special symbol");
 }
}
}
