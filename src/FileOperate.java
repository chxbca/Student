import java.io.File;
import java.io.PrintWriter;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;

/**
 * @author chxbca
 */
class FileOperate {
    private static <T> List<T> read(File file, Class<T> clazz) throws Exception {
        List<T> list = new ArrayList<>();
        Constructor<T> constructor = clazz.getDeclaredConstructor(String.class);
        try (Scanner read = new Scanner(file)) {
            while (read.hasNext()) {
                String info = read.nextLine();
                list.add(constructor.newInstance(info));
            }
        }
        return list;
    }

    static <T> List<T> read(String filePath, Class<T> clazz) throws Exception {
        File file = new File(filePath);
        return read(file, clazz);
    }

    private static void write(Collection<?> list, File file) throws Exception {
        try (PrintWriter out = new PrintWriter(file)) {
            list.forEach(out::println);
        }
    }

    static void write(Collection<?> list, String filePath) throws Exception {
        File file = new File(filePath);
        write(list, file);
    }
}