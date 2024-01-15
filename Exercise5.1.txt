import java.util.Scanner;

public class ReverseCalculator {

    public static int reverseWithWhile(int x){
        int ReversedNumber = 0;
        while (x != 0) {
            int number = x % 10;
            ReversedNumber = ReversedNumber*10 + number;
            x /= 10;
        }
        return ReversedNumber;
    }

    public static int reverseWithFor(int x){
        int ReversedNumber= 0;
        for(;x !=0; x/= 10){
            int number = x % 10;
            ReversedNumber = ReversedNumber*10 + number;
        }
        return ReversedNumber;
    }

    public static int reverseWithDoWhile(int x){
        int ReversedNumber = 0;
        do{
           int number = x % 10;
           ReversedNumber = ReversedNumber*10 + number; 
           x/=10;
        } while(x != 0);
        return ReversedNumber;
    }

    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int input = num.nextInt();
        System.out.println("The reverse of the number using while loop is " + reverseWithWhile(input));
        System.out.println("The reverse of the number using for loop is " + reverseWithFor(input));
        System.out.println("The reverse of the number using while loop is " + reverseWithDoWhile(input) );
    }
}

// Output 
// Enter the Number: 
// 123
// The reverse of the number using while loop is 321
// The reverse of the number using for loop is 321
// The reverse of the number using while loop is 321