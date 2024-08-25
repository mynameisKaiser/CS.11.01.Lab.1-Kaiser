import java.util.Scanner;  // Import the Scanner class

class Pages {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("How old are you? ");
        String userAge = myObj.nextLine();  // Read user input
        int userAgeInt = Integer.parseInt(userAge);
        System.out.println(userAgeInt+"'s should read at least " +(100-userAgeInt)+" pages before giving up on a book.");  // Output user input
    }
}
