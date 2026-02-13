import java.util.Scanner;

public class UserInputs {
    
    public static void main(String[] args) {
        Scanner user_input = new Scanner(System.in);
        
        System.out.print("Enter your name: ");
        
        String user_name = user_input.nextLine();
        
        System.out.println("Your name is: " + user_name);
        
        
    }
    
}
