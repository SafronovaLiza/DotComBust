/**
 * Логика самой игры
 */

import java.util.Scanner;

import static java.lang.Math.random;

public class SimpleGame {
    public static void main(String[] arg){
        int numOfGuess = 0;
        int startCell = (int)(0 + random() * 5);

        SimpleDotCom dotCom = new SimpleDotCom();
        dotCom.setLocationSells(new int[]{startCell, startCell + 1, startCell + 2});

        System.out.println("На поле 1х7 расположен сайт длиной 3. ");

        Scanner scanner = new Scanner(System.in);

        while (dotCom.getNumOfHints() < 3){
            String guess;
            int intGuess;
            do {
                System.out.println("Назовите число от 1 до 7, чтобы выстрелить");
                guess = scanner.nextLine();
                intGuess = Integer.parseInt(guess) - 1;
            }
            while (intGuess < 0 || intGuess > 6);

            System.out.println(dotCom.checkYourself(intGuess));
            numOfGuess++;
        }
        System.out.println("Ваши попытки: "+ numOfGuess);
    }
}
