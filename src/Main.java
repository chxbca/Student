import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        List<Student> stuArr = new ArrayList<>();
        FileOP.read(stuArr);
        StuUI.interFace2(stuArr);
    }
}