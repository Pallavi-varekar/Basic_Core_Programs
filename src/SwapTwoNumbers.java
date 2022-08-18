import java.util.Scanner;

public class SwapTwoNumbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter first number");
        int first=sc.nextInt();
        System.out.println("enter 2nd number");
        int second=sc.nextInt();
        System.out.println("numbers before swapping");
        System.out.println(first);
        System.out.println(second);
        int swap1=second;
        int swap2=first;
        System.out.println("numbers after swapping");
        System.out.println(swap1);
        System.out.println(swap2);


    }
}
