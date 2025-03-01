import java.util.Scanner;
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
        userService.register(name, email, password);
        System.out.println(userService.read());
        scanner.close();
    }
}
