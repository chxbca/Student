import java.lang.reflect.InvocationTargetException;
import java.io.FileNotFoundException;
import java.util.Collection;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;
import java.io.File;

class FileOP {
    static <T> List<T> read(File file, Class<T> clazz) throws InvocationTargetException, FileNotFoundException,
            InstantiationException, IllegalAccessException, NoSuchMethodException {
        var list = new ArrayList<T>();
        try (var read = new Scanner(file)) {
            while (read.hasNext()) {
                var info = read.nextLine();
                list.add(clazz.getDeclaredConstructor(String.class).newInstance(info));
            }
        }
        return list;
    }

    static <T> List<T> read(String filePath, Class<T> clazz) throws InvocationTargetException, FileNotFoundException,
            InstantiationException, IllegalAccessException, NoSuchMethodException {
        File file = new File(filePath);
        return read(file, clazz);
    }

    static void write(Collection<?> arr, File file) throws FileNotFoundException {
        try (var out = new PrintWriter(file)) {
            arr.forEach(out::println);
        }
    }

    static void write(Collection<?> arr, String filePath) throws FileNotFoundException {
        var file = new File(filePath);
        write(arr, file);
    }
}