import java.util.Scanner;

public class Student {
    private int score;
    private String name;
    private static int allScore = 0;
    private static int schoolCount = 0;


    public Student(String stuInfo) throws Exception {
        Scanner reader = new Scanner(stuInfo);
        name = reader.next();
        score = reader.nextInt();
        if (score > 100 || score < 0) {
            throw new Exception("输入的分数信息错误");
        }
        allScore += score;
        schoolCount++;
    }

    int getScore() {
        return score;
    }

    static int getAllScore() {
        return allScore;
    }

    static int getSchoolCount() {
        return schoolCount;
    }

    @Override
    public String toString() {
        return name + " " + score;
    }
}