 import java.io.*;
 class special_char
 {
      public static void main(String args[])
  {
      Scanner in=new Scanner(System.in);
      System.out.println("enter the character");
      char ch=in.next().charAt(0);
      
      if((ch>='a' && ch<='z') || (ch>='A' && ch<='Z'))
  {
      System.out.println("This is Alphabet");
  }
      else if(ch>='1' && ch<='9')
  {
      System.out.println("This is number");
  }
      else
   {
      System.out.println("This is a special character");
    }
  }
 }