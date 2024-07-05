/**
 * Код для тестирования класса SimpleDotCom
 * включает два теста для "удачного" и "неудачного" хода пользователя
 *
 * Книга рассказывает об Экстремальном программировании (ЕХ). При таком
 * подходе, перед написанием реализации функциональности класса,
 * пишут тесты к этому классу.


public class SimpleDotComTest {
    public static void main(String[] args){
        SimpleDotCom dot = new SimpleDotCom();

        //создаём местоположение "сайта"
        int [] locations = {1, 2, 3};
        dot.setLocationSells(locations);

        //сделаем "неудачный" ход от имени пользователя
        int guess = 5;
        String result = dot.checkYourself(guess);
        String testResult = "Не пройден";
        if (result.equals("Мимо!")){
            testResult = "Пройден";
        }
        System.out.println("Тест №1 " + testResult);

        //сделаем "удачный" ход от имени пользователя
        guess = 2;
        result = dot.checkYourself(guess);
        testResult = "Не пройден";
        if (result.equals("Попал!")){
            testResult = "Пройден";
        }
        System.out.println("Тест №2 " + testResult);

        //сделаем "некорректный" ход от имени пользователя
    }
}
 */