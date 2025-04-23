import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;

public class Print {
    public static void print(InputStream inputStream, OutputStream outputStream) throws IOException {
        byte[] bytes = inputStream.readAllBytes();
        inputStream.close();

        int length = 0;

        for (byte b : bytes) {
            if ((b & 1) == 0) {
                length++;
            }
        }

        byte[] sort = new byte[length];
        int index = 0;

        for (byte b : bytes) {
            if ((b & 1) == 0) {
                sort[index] = b;
                index++;
            }
        }

        outputStream.write(sort);
        System.out.println(Arrays.toString(sort));
        outputStream.close();
    }
}
