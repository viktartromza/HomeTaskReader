import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader("D://romeo-and-juliet.txt");
        StringBuilder builder = new StringBuilder();
        int c = -1;
        while ((c = fileReader.read()) != -1) {
            builder.append((char) c);
        }
        fileReader.close();
        String text = builder.toString().replace(',', ' ').replace('.', ' ').replace('=', ' ').replace('?', ' ').replace("\n", " ").replace("\r", " ");
        String[] subStr = text.split(" ");
        int sizeWord = 0;
        int indexMaxWord = 0;
        for (int i = 0; i < subStr.length; i++) {
            if (subStr[i].length() > sizeWord) {
                sizeWord = subStr[i].length();
                indexMaxWord = i;
            }
        }
        FileWriter fileWriter = new FileWriter("D://test.txt");
        fileWriter.write(subStr[indexMaxWord]);
        fileWriter.close();
    }
}
