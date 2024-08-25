import java.util.Scanner;  // Import the Scanner class

class Dateable {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("How old are you? ");
        String userAge = myObj.nextLine();  // Read user input
        int userAgeInt = Integer.parseInt(userAge);
        System.out.println("You should date someone who is at least  " + (7+(userAgeInt/2)));  // Output user input
    }
}
