public class Main {
    public static void main(String[] args) throws Exception {
        java.util.List<Student> stuArr = FileOP.read("data.txt", Student.class);
        StuUI.interFace2(stuArr);
    }
}