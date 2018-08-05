import java.util.Scanner;

public class Student {
    private int score;
    private String name;


    Student(String stuInfo) throws Exception {
        Scanner reader = new Scanner(stuInfo);
        name = reader.next();
        score = reader.nextInt();
        if (score > 100 || score < 0) {
            throw new Exception("输入的分数信息错误");
        }
    }

    int getScore() {
        return score;
    }

    @Override
    public String toString() {
        return name + " " + score;
    }
}