import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введте целое число для проверки на кратность");
        int x = in.nextInt();

        if (x % 3 != 0 && x % 5 != 0){
            System.out.println(x);
        }
        else if (x % 3 == 0 && x % 5 != 0){
            System.out.println("Fizz");
        }
        else if (x % 5 == 0 && x % 3 != 0){
            System.out.println("Bazz");
        }
        else if (x % 3 == 0 && x % 5 == 0){
            System.out.println("FizzBazz");
        }
    }

}
