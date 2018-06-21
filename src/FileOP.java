import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;

class FileOP {
    static <T> List<T> read(File file, Class<T> clazz) throws FileNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        var list = new ArrayList<T>();
        try (var read = new Scanner(file)) {
            while (read.hasNext()) {
                var info = read.nextLine();
                list.add(clazz.getDeclaredConstructor(String.class).newInstance(info));
            }
        }
        return list;
    }

    static <T> List<T> read(String filePath, Class<T> clazz) throws FileNotFoundException, InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
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