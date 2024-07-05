/**
 * Логика самой игры
 */

import java.util.ArrayList;

public class SimpleGame {
    public static void main(String[] arg){
        int numOfGuess = 0;
        int startCell = (int)(Math.random() * 5);

        ArrayList<String> cells = new ArrayList<>();
        cells.add(String.valueOf(startCell));
        cells.add(String.valueOf(startCell+1));
        cells.add(String.valueOf(startCell+2));

        DotCom dotCom = new DotCom();
        dotCom.setLocationCells(cells);

        System.out.println("На поле 1х7 расположен сайт длиной 3. ");
        GameHelper helper = new GameHelper();

        String result = "";
        while (!result.equals("Потопил!") ){
            String guess;
            guess = helper.getUserInput("Назовите число от 1 до 7, чтобы выстрелить");

            result = dotCom.checkYourself(guess);
            System.out.println(result);
            numOfGuess++;
        }
        System.out.println("Ваши попытки: "+ numOfGuess);
    }
}
