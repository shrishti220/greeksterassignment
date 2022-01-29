import java.sql.SQLOutput;
import java.util.Scanner;
public class greaternumber{
   public static void main(String[]args){
       int a,b,c;
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter first number");
       a=sc.nextInt();
       System.out.println("Enter second number");
       b=sc.nextInt();
       System.out.println("Enter third number");
       c=sc.nextInt();
       if (a>b&&a>c){
           System.out.println("greatest number is : "+a);
       }
       else if  (b>a&&b>c){
           System.out.println("greatest number is: "+b);
       }
       else {
           System.out.println("greatest number is:"+c);
       }
   }
}
