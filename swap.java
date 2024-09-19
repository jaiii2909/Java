import java.util.Scanner;

class Swap
{
    public static void main (String ar[])
    {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter 1st no.");
        int a=sc.nextInt();
        System.out.print("Enter 2nd no.");
        int b=sc.nextInt();
        System.out.print("After swappimg:");
        int c;
        c=a;
        a=b;
        b=c;
        System.out.print("1st no. is"+a\n+"2nd no. is"+b);
    }
}