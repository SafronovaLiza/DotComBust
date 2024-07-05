import java.io.*;

public class GameHelper {
    public String getUserInput(String prompt){
        String inpetLine = null;
        System.out.println(prompt + " ");
        try{
            BufferedReader is = new BufferedReader(
                  new InputStreamReader(System.in));
            inpetLine = is.readLine();
            if (inpetLine.length() == 0) return null;
        } catch (IOException e){
            System.out.println("IOException: " + e);
        }
        return inpetLine;
    }
}
