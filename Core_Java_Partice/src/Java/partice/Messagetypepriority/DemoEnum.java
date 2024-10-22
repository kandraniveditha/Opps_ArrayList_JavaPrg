package Java.partice.Messagetypepriority;

import java.util.Scanner;

public class DemoEnum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Please, enter message type to check its priority (A, B, C, D): ");
            String userInput = sc.next().toUpperCase();  // Convert to uppercase to match enum values

            if (isValidMessageType(userInput)) {
                // Convert user input to MessageType and get its priority
                MessageType messageType = MessageType.valueOf(userInput);
                System.out.println("The priority of message type " + messageType + " is: " + messageType.getPriority() + " (Level " + messageType.getPriority().getLevel() + ")");
                break;  // Exit after showing the valid message type and its priority
            } else {
                System.out.println("Please, enter a valid message type. Only 'A', 'B', 'C' or 'D' are allowed.");
            }
        }
        sc.close();
    }

    // Method to check if the input is a valid message type
    private static boolean isValidMessageType(String userInput) {
        try {
            // Try to convert the input string to a MessageType enum
            MessageType.valueOf(userInput);
            return true;
        } catch (IllegalArgumentException e) {
            return false;  // Return false if the input is not valid
        }
    }
}
