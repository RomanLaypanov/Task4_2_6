import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Print {
    public static String print(InputStream inputStream, OutputStream outputStream) throws IOException {
        byte[] evenNumbers = inputStream.readAllBytes();

        for (byte b : evenNumbers) {
            if ((b % 2) == 0) {
                String str = String.valueOf(b) + ", ";
                outputStream.write(str.getBytes());
            }
        }

        return outputStream.toString().replaceAll(", $", " ");
    }
}