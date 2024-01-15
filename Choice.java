import java.util.Scanner;

public class Choice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Select Below Option");
        System.out.println("1. Calculate Armstrong Number");
        System.out.println("2. Calculate Lucky Number");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Enter a number: ");
                int number = sc.nextInt();
                int originalNumber = number;
                int sum = 0;
                while (number > 0) {
                    int rem = number % 10;
                    int cube = rem * rem * rem;
                    sum = sum + cube;
                    number /= 10;
                }
                if (sum == originalNumber) {
                    System.out.print("Armstrong Number");
                } else {
                    System.out.print("Not Armstrong Number");
                }
                break;

            case 2:
                System.out.print("Enter a number: ");
                int number1 = sc.nextInt();
                int sumOfSquares = 0;
                String numstr = Integer.toString(number1);

                for (int j = 1; j < numstr.length(); j += 2) {
                    int digit = Character.getNumericValue(numstr.charAt(j));
                    sumOfSquares += digit * digit;
                }
                if (sumOfSquares % 9 == 0) {
                    System.out.println(number1 + " is a Lucky number!");
                } else {
                    System.out.println(number1 + " is not a Lucky number.");
                }
                break;
        }
        sc.close();
    }
}

// OUTPUT
// Select Below Option
// 1. Calculate Armstrong Number
// 2. Calculate Lucky Number
// 2
// Enter a number: 1345
// 1345 is not a Lucky number.
// Select Below Option
// 1. Calculate Armstrong Number
// 2. Calculate Lucky Number
// 1
// Enter a number: 153
// Armstrong Number