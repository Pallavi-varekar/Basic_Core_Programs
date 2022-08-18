import java.util.Scanner;

public class Flip_Coin_Percentage {
    public static void main(String[] args) {
        int head = 0;
        int tail = 0;
        int count = 1; //we want to flip the coin more than 1
        double random = 0.0;  //here we have decimal value
        System.out.println("enter the number of flip coin");
        Scanner sc = new Scanner(System.in);
        int flip = sc.nextInt();

        while (count <= flip) {
            random = Math.random();
            System.out.println(count + " " + random);
            if (random > 0.5) {
                head++;
                System.out.println("head");
            } else
            {
                tail++;
                System.out.println("tail");
            }

            count++;

        }
        System.out.println("head" + head);
        System.out.println("tail" + tail);
        double headpercentage = (double) head / flip * 100;
        double tailpercentage = (double) tail / flip * 100;
        System.out.println("percentage of head: " + headpercentage);
        System.out.println("percentage of tail:" + tailpercentage);


    }
}
