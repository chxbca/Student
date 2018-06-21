import java.util.Scanner;

public class Student {
    private static int allScore = 0;
    private static int schoolCount = 0;
    private String name;
    private int score;


    Student(String stuInfo) {
        Scanner reader = new Scanner(stuInfo);
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