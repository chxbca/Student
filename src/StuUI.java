import java.util.Comparator;
import java.io.IOException;
import java.util.Scanner;
import java.util.List;

class StuUI {
    private static void interFace1() {
        System.out.println("1、计算平均分");
        System.out.println("2、排序并输出成绩");
        System.out.println("3、添加一个学生成绩");
        System.out.println("4、将数据保存到文件中");
        System.out.println("5、退出程序");
        System.out.print("请输入数字选择功能：");
    }

    static void interFace2(List<Student> list) throws IOException {
        Scanner reader = new Scanner(System.in);
        while (true) {
            interFace1();
            switch (reader.nextInt()) {
                case 1:
                    System.out.printf("平均分为%.3f%n", 1.0 * Student.getAllScore() / Student.getSchoolCount());
                    break;
                case 2:
                    list.stream().sorted(Comparator.comparingInt(Student::getScore)).forEach(System.out::println);
                    break;
                case 3:
                    list.add(createStudent());
                    break;
                case 4:
                    FileOP.write(list, "data.txt");
                    break;
                case 5:
                    System.out.println("程序结束");
                    return;
                default:
                    System.out.println("错误的输入");
                    break;
            }
        }
    }

    private static Student createStudent() {
        System.out.println("请按照 姓名 成绩 的方式输入学生成绩");
        Scanner reader = new Scanner(System.in);
        return new Student(reader.nextLine());
    }
}