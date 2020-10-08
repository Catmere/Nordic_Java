import java.util.Random;
import java.util.Scanner;

public class DigitGuess {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        boolean flag = false;
        for (int i = 0; i < 5; i++) {
            int tmp = Math.abs(random.nextInt() % 5) + 1;
            System.out.println("Я загадал число от 1 до 5. Угадай!");
            int input = scanner.nextInt();
            if (input == tmp) {
                System.out.println("Ты угадал!");
                flag = true;
                break;
            } else {
                System.out.println("Не угадал! Я загадал число " + tmp + ". У тебя осталось " + (5 - i - 1) + " попыток.");
            }
        }
        if (flag) {
            System.out.println("Тебе повезло в этот раз!");
        } else {
            System.out.println("В этот раз не повезло. Попробуй еще!");
        }
    }
}
