import java.util.Scanner;
import java.util.InputMismatchException;

public class Program
{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int inputNumber = getValidInput(scanner);
        scanner.close();
        
        PrimeResult result = isPrime(inputNumber);
        System.out.printf("%b %d%n", result.isPrime, result.iterations);
    }
    
    private static class PrimeResult{
        boolean isPrime;
        int iterations;
        
        PrimeResult(boolean isPrime, int iterations){
            this.isPrime = isPrime;
            this.iterations = iterations;
        }
    }
    
    private static int getValidInput(Scanner scanner){
        while (true){
            try {
                System.out.println("Enter a number: ");
                int number = scanner.nextInt();
                if (number < 2){
                    System.err.println("IllegalArgument");
                    continue;
                }
                return number;
            } catch (InputMismatchException e){
                System.err.println("Error: Please enter a valid integer.");
                scanner.nextLine();
            }
        }
    }
    
    private static PrimeResult isPrime(int number){
        if (number == 2){
            return new PrimeResult(true, 1);
        }
        
        if (number % 2 == 0){
            return new PrimeResult(false, 1);
        }
        
        int iterations = 1;
        for (int divisor = 3; divisor * divisor <= number; divisor += 2){
            iterations++;
            if (number % divisor == 0){
                return new PrimeResult(false, iterations);
            }
        }
        return new PrimeResult(true, iterations);
    }
}
/*

import java.util.*;

public class Program
{
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        boolean validInput = false;
        int number = 0;
        
        while (!validInput){
            try {
                number = scanner.nextInt();
                if (number < 2){
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
        for (int i = 2; i * i <= number; i++){
            if (number % i == 0){
                isPrime = false;
                break;
            }
            steps++;
        }
        System.out.println(isPrime + " " + steps);
        scanner.close();
    }
}
*/
