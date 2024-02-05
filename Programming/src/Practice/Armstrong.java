package Practice;

import java.util.Scanner;

public class Armstrong {

    public static void main(String[] args) {
        int num, digit, sum = 0, count = 0, temp, copy;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        num = sc.nextInt();
//        temp = num;
        copy = num;

        // Count the number of digits
        while (num != 0) {
            num = num / 10;
            count++;
        }

        num = copy; // Reset num to the original value

        // Calculate sum of digits raised to the power of count
        while (num != 0) {
            digit = num % 10;
            sum += Math.pow(digit, count);
            num = num / 10;
        }

        if (sum == copy) {
            System.out.println("The number is an Armstrong number");
        } else {
            System.out.println("The number is not an Armstrong number");
        }
    }
}
