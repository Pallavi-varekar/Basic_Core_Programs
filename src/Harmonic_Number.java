import java.util.Scanner;

public class Harmonic_Number {
    public static void main(String[] args) {
        int num;
        double sum = 0;
        System.out.println("enter a number");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        if(num!=0)//number is not equal to zero
        {
            while(num > 0)
            {
                sum =sum+(double)1/num;//1,1/2,1/3,.......1/n
                num--;
            }
            System.out.println("Total of Harmonic Series is "+sum);
        }
        else
            System.out.println("Invalid input");
    }


    }




