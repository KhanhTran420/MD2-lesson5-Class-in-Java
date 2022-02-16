import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập tên sinh viên: ");
        String name = scanner.nextLine();
        System.out.println("Nhập lớp: ");
        String classes = scanner.nextLine();
        Student student = new Student();
        student.setName(name);
        student.setClasses(classes);
    }
}
