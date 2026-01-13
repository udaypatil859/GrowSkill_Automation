public class GradingSystem {
    public static void main(String[] args) {

        // Fixed marks value
        int marks = 82;

        // Determine grade based on marks
        if (marks >= 90 && marks <= 100) {
            System.out.println("Grade: A");
        } else if (marks >= 75 && marks <= 89) {
            System.out.println("Grade: B");
        } else if (marks >= 50 && marks <= 74) {
            System.out.println("Grade: C");
        } else if (marks < 50 && marks >= 0) {
            System.out.println("Grade: Fail");
        } else {
            System.out.println("Invalid marks!");
        }
    }
}
