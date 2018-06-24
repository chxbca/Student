import java.util.Scanner;

public class Student {
    private int score;
    private String name;
    private static int allScore = 0;
    private static int schoolCount = 0;


    public Student(String stuInfo) {
        var reader = new Scanner(stuInfo);
        name = reader.next();
        score = reader.nextInt();
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