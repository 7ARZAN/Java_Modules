import java.util.Scanner;

public class Program {
        public static void main(String[] args) {
            int number = 479598;
            int sum = 0;

            for (int i = 0; i < 6; i++){
                sum += number % 10;
                number /= 10;
            }
            System.out.println(sum);
        }
}

// import java.util.Scanner;

// public class Program {
//     public static void main(String[] args){
//         Scanner scanner = new Scanner(System.in);
        
//         long number = scanner.nextLong();
//         int sum = 0;
//         int numberLength = String.valueOf(number).length();
//         for (int i = 0; i < numberLength; i++) {
//             sum += number % 10;
//             number /= 10;
//         }

//         System.out.println(sum);
//         scanner.close();
//     }
// }
