import java.util.Scanner;

public class Arithmetic_Exception {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        try {

            System.out.println("Inside try block");
            int data=40/n;
            System.out.println("Output : "+data);
        }
        catch(ArithmeticException e){
            System.out.println("Exception handled");
            System.out.println(e);
        }
        finally {
            System.out.println("Thank You");
        }

    }
}
