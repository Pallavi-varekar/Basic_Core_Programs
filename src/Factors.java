import java.util.Scanner;

public class Factors {
    public static void main(String[] args) {
        int num;
        System.out.println("enter the number");
        Scanner sc =new Scanner(System.in);
        num=sc.nextInt();
        for(int i=2;i<=num;i++)
        {
            // using while loop

            while(num%i==0)

            {
                num=num/i;

                System.out.println(num);
            }
        }


            }
        }


