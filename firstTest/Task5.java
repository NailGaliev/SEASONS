import java.io.FileWriter;
import java.io.IOException;

public class Task5 {

    /**
        Тут тоже что-то пошло не так.
     */
    public static String repeatSeparator(String word, String sep, int count) {
        String answer = "";
        for (int i = 0; i < count; i++) {
            answer = answer + word;
            if (i != (count - 1)) {
                answer += sep;
                System.out.println("('Word', 'X', 3) => " + repeatSeparator("Word", "X", 3));
            }
        }
        return "";
    }

    public static void main(String[] args) {
        repeatSeparator("Word", "X", 3);
    }
}






