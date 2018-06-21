import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Collection;
import java.util.Scanner;

class FileOP {
    private final static File file = new File("data.txt");

    static void read(Collection<Student> arr) throws FileNotFoundException {
        try (Scanner read = new Scanner(file)) {
            while (read.hasNext()) {
                String stuInfo = read.nextLine();
                arr.add(new Student(stuInfo));
            }
        }
    }

    static void write(Collection<Student> arr) throws FileNotFoundException {
        try (PrintWriter out = new PrintWriter(file)) {
            arr.forEach(out::println);
        }
    }
}