import java.io.*;

public class Main {
    public static void main(String[] args) {

        byte[] array = new byte[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        try (InputStream inputStream = new ByteArrayInputStream(array);
             OutputStream outputStream = new ByteArrayOutputStream()) {
            Print.print(inputStream, outputStream);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}