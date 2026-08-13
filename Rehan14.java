import java.util.*;

class User {

    private String username;
    private String password;


    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }
    public String getUsername() {
        return username;
    }
    public void setPassword(String newPassword) {
        if (newPassword.length() >= 6) {
            this.password = newPassword;
            System.out.println("Password updated successfully!!!!!");
        } else {
            System.out.println("Error: Password must be at least 6 characters long!!!!");
        }
    }
}

class Rehan14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("=== ACCOUNT REGISTRATION ===");
        System.out.print("Create Username: ");
        String inputUser = sc.next();
        
        System.out.print("Create Password: ");
        String inputPass = sc.next();

        User user1 = new User(inputUser, inputPass);
        System.out.println("\nWelcome, " + user1.getUsername() + "! Your account is active.");

        System.out.println("\n=== SECURITY UPDATE ===");
        System.out.print("Enter your new password: ");
        String updatedPass = sc.next();

        user1.setPassword(updatedPass);

        sc.close(); 
	}
}
