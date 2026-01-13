public class GreatestOfThree {
    public static void main(String[] args) {

        // Declare three numbers
        int num1 = 20;
        int num2 = 40;
        int num3 = 30;

        // Find the greatest number using if-else
        if (num1 > num2 && num1 > num3) {
            System.out.println("The greatest number is: " + num1);
        } else if (num2 > num1 && num2 > num3) {
            System.out.println("The greatest number is: " + num2);
        } else {
            System.out.println("The greatest number is: " + num3);
        }
    }
}
