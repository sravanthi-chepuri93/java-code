import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


public class fileTest {


    public static void addTextToFile(File file, String textToAdd) {
        try {
            FileWriter fileWriter = new FileWriter(file, true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(textToAdd);
            bufferedWriter.newLine();
            bufferedWriter.close();
            System.out.println("Text added to the file.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args){
        String filePath ="C:/Users/srava/OneDrive/Desktop/java/sravanthi.txt";
        File f = new File(filePath);
        addTextToFile(f, "Eat");
        addTextToFile(f, "Sleep");
        addTextToFile(f, "Workout");
        addTextToFile(f,"trash takeout");

    }
}
