package Practice;

import java.util.Scanner;

public class ReverseOrder {

    public static void main(String[] args) {
        // Reverse order and palindrome
        int num, rev = 0, dig;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        num = sc.nextInt();
        int copy = num;
        
      do{
            dig = num % 10;
            rev = rev * 10 + dig;
            num = num / 10;
        }while(num!=0);
        
        if (rev == copy) {
            System.out.println("Reverse of " + copy + " is: " + rev + ". It is equal to the original number.");
        } else {
            System.out.println("Reverse of " + copy + " is: " + rev + ". It is not equal to the original number.");
        }
    }
}

