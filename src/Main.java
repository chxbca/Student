import java.lang.reflect.InvocationTargetException;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException, NoSuchMethodException,
            InstantiationException, IllegalAccessException, InvocationTargetException {
        var stuArr = FileOP.read("data.txt", Student.class);
        StuUI.interFace2(stuArr);
    }
}