import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;

public class Print {
    public static void print(InputStream inputStream, OutputStream outputStream) throws IOException {
        byte[] bytes = inputStream.readAllBytes(); // inputStream считывает все байты в массиы
        inputStream.close(); // закрываю inputStream

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

        outputStream.write(sort); // записываю sort в outputStream
        System.out.println(Arrays.toString(sort)); // вывожу каждый элемент sort
        outputStream.close(); // закрываю outputStream
    }
}
