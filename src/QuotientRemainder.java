import java.util.Scanner;

public class QuotientRemainder {
    public static void main(String[] args) {


        Scanner sc=new Scanner(System.in);
        System.out.println("enter divident");
        int divident = sc.nextInt(); //we have created variables dividend
        System.out.println("enter divisor");
        int divisor = sc.nextInt();//we have created  variables dividend

        int quotient = divident / divisor; // we have used the / operator We have divided dividend (25) by divisor (4). Since both dividend and divisor are integers, the result will also be integer.

        int remainder = divident % divisor; //find the remainder we use the % operator. Here, the dividend is divided by the divisor and the remainder is returned by the % operator.



        System.out.println("Quotient = " + quotient);//30 / 5 results 6, output will be 6

        System.out.println("Remainder = " + remainder);//30 % 5  results 0
    }
    }
