import java.lang.reflect.InvocationTargetException;
import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException, NoSuchMethodException,
            InstantiationException, IllegalAccessException, InvocationTargetException {
        List<Student> stuArr = FileOP.read("data.txt", Student.class);
        StuUI.interFace2(stuArr);
    }
}