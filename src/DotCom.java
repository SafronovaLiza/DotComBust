import java.util.ArrayList;

public class DotCom {
    private ArrayList<String> locationCells; //расположение сайта
    //private int numOfHints = 0; //количество попаданий

    void setLocationCells(ArrayList<String> list){
        locationCells = list;
    }

    String checkYourself(String guess){
        //Проверяем, попал ли пользователь
        //Метод принимает попытку пользователя (1, 2 и тд), проверяет есть ли на выбранной ячейке сайт
        // и возвращает ответ "мимо", "попал", "убил" в зависимости от успешности попытки

        String result = "Мимо!";
        int index = locationCells.indexOf(guess); //проверка на наличие "попытки пользователя" в списке (вернет либо индекс либо -1)

        if (index >= 0){ //если индекс положительный, то число пользователя есть в списке
            locationCells.remove(index);

            if (locationCells.isEmpty())
                result = "Потопил!";
            else
                result = "Попал!";
        }

        return result;
    }
}
