import java.util.ArrayList;

public class DotCom {
    private ArrayList<String> locationCells; //расположение сайта
    //private int numOfHints = 0; //количество попаданий
    private String name = "сайт";

    void setLocationCells(ArrayList<String> list){
        locationCells = list;
    }
    void setName(String n) {name = n;}

    String checkYourself(String guess){
        String result = "Мимо!";
        int index = locationCells.indexOf(guess); //проверка на наличие "попытки пользователя" в списке (вернет либо индекс либо -1)

        if (index >= 0){ //если индекс положительный, то число пользователя есть в списке
            locationCells.remove(index);

            if (locationCells.isEmpty()) {
                result = "Потопил!";
                System.out.println("Да-а-а! Вы потопили " + name + "!");
            }
            else
                result = "Попал!";
        }

        return result;
    }
}
