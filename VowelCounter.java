import java.util.Scanner;
public class VowelCounter {
    // The vowels in the English alphabet
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // The input string
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        // The count of vowels
        input = input.toLowerCase();
        // The count of vowels
        int vowelCount = 0;
        // The loop to count the vowels
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            // The condition to check if the character is a vowel
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                vowelCount++;
            }
        }
        // Print the count of vowels
        System.out.println("The number of vowels in the string is: " + vowelCount);
    }
}

