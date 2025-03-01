import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
interface UserService {
    void register(String name, String email, String password);
    String read();
}
class UserServiceImpl implements UserService {
    private String userName;
    private String userEmail;
    private String userPassword;
    @Override
    public void register(String name, String email, String password) {
        if (!isValidEmail(email)) {
            System.out.println("Invalid Email Format!");
            return;
        }
        if (!isValidPassword(password)) {
            System.out.println("Invalid Password! Password must contain:");
            System.out.println("- At least 8 characters");
            System.out.println("- At least one uppercase letter");
            System.out.println("- At least one lowercase letter");
            System.out.println("- At least one digit");
            System.out.println("- At least one special character (@#$%^&+=)");
            return;
        }
        this.userName = name;
        this.userEmail = email;
        this.userPassword = password;
        System.out.println("User registered successfully.");
    }

    @Override
    public String read() {
        if (userName != null && userEmail != null && userPassword != null) {
            return "User Data:\nName: " + userName + "\nEmail: " + userEmail + "\nPassword: " + userPassword;
        } else {
            return "Invalid Data";
        }
    }
    private boolean isValidEmail(String email) {
        String emailRegex = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}$";
        Pattern pattern = Pattern.compile(emailRegex);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }
    private boolean isValidPassword(String password) {
        String passwordRegex = "^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=.*[@#$%^&+=]).{8,}$";
        Pattern pattern = Pattern.compile(passwordRegex);
        Matcher matcher = pattern.matcher(password);
        return matcher.matches();
    }
}
public class UserServiceDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        UserService userService = new UserServiceImpl();

        System.out.println("Enter Name:");
        String name = scanner.nextLine();

        System.out.println("Enter Email:");
        String email = scanner.nextLine();

        System.out.println("Enter Password:");
        String password = scanner.nextLine();
        scanner.close();

        userService.register(name, email, password);
        System.out.println(userService.read());
    }
}
