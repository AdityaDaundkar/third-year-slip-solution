import java.io.File;

public class ListTxtFiles {
    public static void main(String[] args) {
        // Replace this with the directory path you want to search in
        String directoryPath = "path/to/your/directory";

        File directory = new File(directoryPath);

        // Check if the directory exists
        if (directory.exists() && directory.isDirectory()) {
            File[] files = directory.listFiles();

            if (files != null) {
                System.out.println("Text files in the directory:");

                for (File file : files) {
                    if (file.isFile() && file.getName().endsWith(".txt")) {
                        System.out.println(file.getName());
                    }
                }
            } else {
                System.out.println("No files found in the directory.");
            }
        } else {
            System.out.println("Directory does not exist.");
        }
    }
}
