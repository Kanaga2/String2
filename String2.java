# String2
import java.io.*;
 import java.util.*;
 public class Main
{
  

  public static void main(String args[])throws IOException
  {
       BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
       System.out.println("Enter a String");
       String input=br.readLine();
      String[] words = input.split(" ");
      int length = words.length;
      StringBuilder finalString = new StringBuilder(input.length());
      for(int i=length-1;i >= 0;i--)
      {
        finalString.append(words[i]);
        finalString.append(" ");
      }
      
      System.out.println("Result String: "+ finalString.toString());
        }
  }
