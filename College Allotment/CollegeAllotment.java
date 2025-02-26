import java.util.Scanner;
public class CollegeAllotment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Candidate Name: ");
        String candidateName = scanner.nextLine();
        System.out.print("Enter Entrance Test Rank: ");
        int rank = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter CGPA: ");
        double cgpa = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Enter Date of Joining (DD-MM-YYYY): ");
        String dateOfJoining = scanner.nextLine();
        System.out.print("Enter Address: ");
        String address = scanner.nextLine();
        String branch;
        if (cgpa >= 9.0) {
            branch = "Computer Science and Engineering";
        } else if (cgpa >= 8.0) {
            branch = "Electronics and Communication Engineering";
        } else if (cgpa >= 7.0) {
            branch = "Mechanical Engineering";
        } else {
            branch = "Civil Engineering";
        }
        String university;
        if (rank <= 1000) {
            university = "IIT";
        } else if (rank <= 5000) {
            university = "NIT";
        } else if (rank <= 10000) {
            university = "State University";
        } else {
            university = "Private College";
        }
        System.out.println("\nCollege Allotment Order");
        System.out.println("*******************************");
        System.out.println("Candidate Name  : " + candidateName);
        System.out.println("College Name    : " + university);
        System.out.println("Entrance Test Rank : " + rank);
        System.out.println("Branch         : " + branch);
        System.out.println("Date of Joining : " + dateOfJoining);
        System.out.println("Address        : " + address);
        System.out.println("CGPA           : " + cgpa);
        System.out.println("University     : " + university);
        System.out.println("*******************************");

        scanner.close();
    }
}
