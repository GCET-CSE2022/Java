import java.util.Scanner;

public class StringHandling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the string
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Initialize counters
        int vowels = 0, consonants = 0, specialCharacters = 0;

        // Convert string to lowercase for easier comparisons
        input = input.toLowerCase();

        // Analyze each character
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            if (ch >= 'a' && ch <= 'z') { // Check if it's an alphabet
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowels++;
                } else {
                    consonants++;
                }
            } else if (!(ch >= '0' && ch <= '9') && ch != ' ') { // Check for special characters
                specialCharacters++;
            }
        }

        // Display results
        System.out.println("Number of vowels: " + vowels);
        System.out.println("Number of consonants: " + consonants);
        System.out.println("Number of special characters: " + specialCharacters);

        scanner.close();
    }
}
