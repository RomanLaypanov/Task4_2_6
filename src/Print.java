import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.Array;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class Print {
    public static String print(InputStream inputStream, OutputStream outputStream) throws IOException {
        byte[] bytes = inputStream.readAllBytes(); // inputStream считывает все байты в массиы

        int length = 0;

        for (byte b : bytes) { // через цикл узнаю количесвто четных чисел в bytes
            if ((b & 1) == 0) {
                length++;
            }
        }

        byte[] sort = new byte[length]; // создаю массив sort
        int index = 0;

        for (byte b : bytes) { // сортирую четные числа из bytes в sort
            if ((b & 1) == 0) {
                sort[index] = b;
                index++;
            }
        }



        String str = Arrays.toString(sort);
        outputStream.write(str.getBytes()); // записываю sort в outputStream

        return str;
    }
}
