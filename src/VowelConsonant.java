import java.util.Scanner;

public class VowelConsonant {
    public static void main(String[] args) {
        System.out.println("enter any character");
        char ch;
        Scanner sc =new Scanner(System.in);
        ch=sc.next().charAt(0);

        if(ch=='a' || ch=='e'||ch=='i'||ch=='o'||ch=='u'){
            System.out.println("entered character is vowel");
        }
        else{
            System.out.println("entered character is consonant");
        }
    }
}
