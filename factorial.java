import java.util.Scanner;
 class Factorial
 {
     public static void main(String args[])
     {
         System.out.println("Enter the Number:");
         Scanner sc= new Scanner(System.in);
         int a=sc.nextInt();
         int fact=1;

         for(int i=1;i<=a;i++)
         {
             fact=fact*i;
         }
         System.out.println("factorial:"+fact);
         

     }
 }