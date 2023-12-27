
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Give a number: ");
        int input = Integer.parseInt(scanner.nextLine());
        int fact = 1;

        if(input == 0){
            System.out.println("Factorial: " + 1);
        }else{
            for(int i = 1; i<=input; i++){
                fact *= i;
                System.out.println(fact);
            }
        }

        System.out.println("Factorial: " + fact);
    }
}
