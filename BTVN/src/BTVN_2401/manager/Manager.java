package BTVN_2401.manager;

import BTVN_2401.model.Student;

import java.util.ArrayList;
import java.util.Scanner;

public class Manager {
    private ArrayList<Student> students;
    Scanner scanner = new Scanner(System.in);


    public Manager() {
        this.students = new ArrayList<>();
    }

    public void displayAll() {
        for(Student student : students) {
            System.out.println(student);
        }
    }

    public Student createStudent() {
        System.out.println("Nhập id: ");
        int id = scanner.nextInt();
        checkId(id);
        scanner.nextLine();
        System.out.println("Nhập tên: ");
        String name = scanner.nextLine();
        System.out.println("Nhập quên quán: ");
        String address = scanner.nextLine();
        System.out.println("Nhập lớp: ");
        String classes = scanner.nextLine();
        System.out.println("Nhập điểm: ");
        double point = scanner.nextDouble();
        Student student123 = new Student(id, name, address, classes, point);
        students.add(student123);
        return student123;
    }

    public int checkId(int id) {
        for (Student s : students) {
           while (s.getId() == id) {
               System.out.println("ID đã dc sử dụng!");
               System.out.println("Nhập lại id: ");
               id = scanner.nextInt();
           }
        }
        return id;
    }

    public double checkPoint(double point) {

    }


}
