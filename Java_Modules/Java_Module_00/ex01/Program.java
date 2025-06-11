import java.util.*;

public class Program {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        boolean validInput = false;
        int index = 0;
        
        while (!validInput){
            try {
                index = scanner.nextInt();
                
                if (index < 2){
                    System.err.println("IllegalArgument");
                    continue;
                }
                validInput = true;
            } catch (InputMismatchException e){
                System.err.println("Please Enter numbers only.");
                scanner.nextLine();
            }
        }
        boolean isPrime = true;
        int steps = 1;        
        for (int i = 2; i * i <= index; i++){
            if (index % i == 0){
                isPrime = false;
                break;
            }
            steps++;
        }
        if (index > 2 && steps == 0)
            steps = 1;
        System.out.println(isPrime + " " + steps);
        scanner.close();
    }
}