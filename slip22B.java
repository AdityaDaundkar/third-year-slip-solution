import java.io.File;
import java.io.IOException;

public class FileOperations {
    public static void main(String[] args) {
        // Create a new file
        createFile("example.txt");

        // Rename a file
        renameFile("example.txt", "renamed_example.txt");

        // Display the path of a file
        displayFilePath("renamed_example.txt");

        // Delete a file
        deleteFile("renamed_example.txt");
    }

    public static void createFile(String fileName) {
        try {
            File file = new File(fileName);
            if (file.createNewFile()) {
                System.out.println("File created: " + file.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.err.println("An error occurred while creating the file: " + e.getMessage());
        }
    }

    public static void renameFile(String oldFileName, String newFileName) {
        File oldFile = new File(oldFileName);
        File newFile = new File(newFileName);

        if (oldFile.exists()) {
            if (oldFile.renameTo(newFile)) {
                System.out.println("File renamed to: " + newFile.getName());
            } else {
                System.out.println("Failed to rename the file.");
            }
        } else {
            System.out.println("File does not exist.");
        }
    }

    public static void displayFilePath(String fileName) {
        File file = new File(fileName);
        if (file.exists()) {
            System.out.println("File path: " + file.getAbsolutePath());
        } else {
            System.out.println("File does not exist.");
        }
    }

    public static void deleteFile(String fileName) {
        File file = new File(fileName);
        if (file.exists()) {
            if (file.delete()) {
                System.out.println("File deleted: " + file.getName());
            } else {
                System.out.println("Failed to delete the file.");
            }
        } else {
            System.out.println("File does not exist.");
        }
    }
}
