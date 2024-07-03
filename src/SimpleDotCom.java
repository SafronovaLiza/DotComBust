public class SimpleDotCom {
    private int[] locationCells; //расположение сайта
    private int numOfHints; //количество попаданий

    void setLocationSells(int[] locations){
        locationCells = locations;
    }

    String checkYourself(String stringGuess){
        //Проверяем, попал ли пользователь
        //Метод принимает попытку пользователя (1, 2 и тд), проверяет есть ли на выбранной ячейке сайт
        // и возвращает ответ "мимо", "попал", "убил" в зависимости от успешности попытки

        int guess = Integer.parseInt(stringGuess);
        String result = "Мимо";

        for (int cell : locationCells){
            if (guess == cell){
                numOfHints++;
                if (numOfHints == locationCells.length)
                    result = "Потопил";
                else
                    result = "Попал";
                return result;
            }
        }
        return result;
    }
}
