import java.util.Scanner;

public class Power_of_2 {
    public static void main(String[] args) {
        int n, result = 1;
        //int p=2;
        System.out.println("enter the value");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        if (0 < n && n < 31)//value of n is greater than zero and less than 31
        {
            for (int i = 1; i <= 2; i++) //for implementation for power 2
                 {
                result = n * result;
            }

            System.out.println(result);

    }
        else

    {
        System.out.println("invalid number");

    }
}}

