import java.io.File;

public class DeleteTxtFiles {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Usage: java DeleteTxtFiles <file1> <file2> ...");
            return;
        }

        for (String fileName : args) {
            File file = new File(fileName);

            if (file.exists()) {
                if (file.isFile() && file.getName().endsWith(".txt")) {
                    if (file.delete()) {
                        System.out.println("Deleted: " + fileName);
                    } else {
                        System.out.println("Failed to delete: " + fileName);
                    }
                } else {
                    System.out.println("Not a .txt file: " + fileName);
                }
            } else {
                System.out.println("File not found: " + fileName);
            }
        }

        System.out.println("\nRemaining Files:");
        listRemainingFiles();
    }

    public static void listRemainingFiles() {
        File currentDirectory = new File(".");
        File[] files = currentDirectory.listFiles();

        for (File file : files) {
            if (file.isFile()) {
                System.out.println("Name: " + file.getName());
                System.out.println("Location: " + file.getAbsolutePath());
                System.out.println("Size: " + file.length() + " bytes\n");
            }
        }
    }
}
