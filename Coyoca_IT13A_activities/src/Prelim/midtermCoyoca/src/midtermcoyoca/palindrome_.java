package midtermCoyoca;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class palindrome_ {
      public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);
        
     
        System.out.print("enter first input: ");
        String nik1 = scanner.nextLine();
        
        System.out.print("enter second input: ");
        String nik2 = scanner.nextLine();
        
        System.out.print("enter third input: ");
        String nik3 = scanner.nextLine();
        
        checkPalindrome(nik1);
        checkPalindrome(nik2);
        checkPalindrome(nik3);
      
    }

   
    public static void checkPalindrome(String word) {
        if (isPalindrome(word)) {
            System.out.println(word + " is a palindrome.");
        } else {
            System.out.println(word + " is not a palindrome.");
        }
    }

    public static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;

        
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false; 
            }
            left++;
            right--;
        }

        return true; 
    }
}

