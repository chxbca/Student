/**
 * @author chxbca
 */
public class Main {
    public static void main(String[] args) throws Exception {
        StuUserInterface.interFace2(FileOperate.read("data.txt", Student.class));
    }
}