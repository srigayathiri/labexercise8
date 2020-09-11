import java.util.*;
public class Main {

 public static void main(String[] args) {
  Scanner obj=new Scanner(System.in);
  System.out.println("enter the string");
  String a=obj.next();
  System.out.println("The given string is  "+a);
  permutationWithRepeation(a);

 }

  private static void permutationWithRepeation(String str1) {
  
  System.out.println("The permuted strings are:");
  showPermutation(str1, "");
 }

  private static void showPermutation(String str1, String NewStringToPrint) {

  if (NewStringToPrint.length() == str1.length()) {
   System.out.println(NewStringToPrint);
   return;
  }
  for (int i = 0; i < str1.length(); i++) {

   showPermutation(str1, NewStringToPrint + str1.charAt(i));
  }
 }
}
