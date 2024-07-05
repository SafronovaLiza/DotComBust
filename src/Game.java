import java.util.ArrayList;

public class Game {
    private GameHelper helper = new GameHelper();
    private ArrayList<DotCom> dotComList = new ArrayList<>();
    private int numOfGuesses = 0;

    void setUpGame(){    //начало игра, создаем сайты, "подготавливаем" игрока
        DotCom d1 = new DotCom();
        d1.setName("dzen.ru");
        DotCom d2 = new DotCom();
        d1.setName("vk.com");
        DotCom d3 = new DotCom();
        d1.setName("habr.com");
        dotComList.add(d1);
        dotComList.add(d2);
        dotComList.add(d3);

        for (DotCom dotComs : dotComList){
            ArrayList<String> locations = GameHelper.placeDotComs(3);
            dotComs.setLocationCells(locations);
        }

        System.out.println("Добро пожаловать в игру \"Потопи сайт\"");
        System.out.println("На поле 7х7 расположены 3 сайта: ya.ru, vk.com, github.com. Утопите их! \nВперед!!!");
    }

    void startPlaying(){
        while (!dotComList.isEmpty()){
            String guess = helper.getUserInput("Сделайте ход.");
            checkUserGuesses(guess);
        }
        finishGame();
    }

    void checkUserGuesses(String guess){
        numOfGuesses++;
        String result = "Мимо!";

        for (DotCom test : dotComList){
            result = test.checkYourself(guess);
            if (result.equals("Попал!")) {
                break;
            }
            if (result.equals("Потопил!")){
                dotComList.remove(test);
                break;
            }
        }
        System.out.println(result);
    }

    void finishGame(){
        System.out.println("Наши \"любимые\" сайты потоплены. ");
        if (numOfGuesses <= 18){
            System.out.println("Вам потребовалось "+ numOfGuesses + " ударов. Впечатляет!");
        }
        else {
            System.out.println("Вам потребовалось "+ numOfGuesses + "ударов. Эм... Ну... Молодец!");
        }
    }

    public static void main(String[] args){
        Game game = new Game();
        game.setUpGame();
        game.startPlaying();
    }
}
