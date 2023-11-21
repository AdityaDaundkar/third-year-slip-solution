import java.io.File;

public class CheckHiddenFile {
    public static void main(String[] args) {
        String filePath = "example.txt"; // Replace with the path to your file

        File file = new File(filePath);

        if (file.exists()) {
            if (file.isHidden()) {
                System.out.println("The file is hidden.");
            } else {
                System.out.println("File path: " + file.getAbsolutePath());
            }
        } else {
            System.out.println("File does not exist.");
        }
    }
}
