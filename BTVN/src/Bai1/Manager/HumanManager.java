package Bai1.Manager;

import Bai1.Model.Human;

import java.util.ArrayList;
import java.util.Scanner;

public class HumanManager {
    ArrayList<Human> humans;
    Scanner scanner = new Scanner(System.in);

    public HumanManager() {
        this.humans= new ArrayList<>();
    }

    public void creatHuman() {
        System.out.println("Nhập tên: ");
        String name = scanner.nextLine();
        System.out.println("Nhập vào ngày tháng năm sinh: ");
        String birthDay= scanner.nextLine();
        System.out.println("Nhập cmnd: ");
        String cmnd = scanner.nextLine();
        checkCmnd(cmnd);
        Human human = new Human(name, birthDay, cmnd) ;
        humans.add(human);
        System.out.println(human);
    }

    public String checkCmnd(String cmnd) {
        for (Human human : humans) {
            while (human.getCmnd().equals(cmnd)){
                System.out.println("Trùng cmnd rồi, vui lòng nhập lại!");
                cmnd = scanner.nextLine();
            }
        }
        return cmnd;
    }

    public void deleteHuman(String cmnd) {
        boolean check =false;
        for (Human human : humans) {
            if (human.getCmnd().equals(cmnd)){
                humans.remove(human);
                check = true;
                break;
            }
        }
        if (check) {
            System.out.println("Xoá thành công!");
        } else System.out.println("Xoá ko thành công!");
    }

    public void displayAll() {
        for (Human human : humans){
            System.out.println(human);
        }
    }

    public void displayHuman(String idCard) {
        Human human = null;
        for (Human h : humans) {
            if (h.getCmnd().equals(idCard)) {
                human = h;
                System.out.println(human);
                break;
            }
        }
        if (human != null) {
            System.out.println(human);
        } else {
            System.out.println("Số idCard không tồn tại!");
        }
    }

    public Human getHuman(String idCard) {
        Human human = null;
        for (Human h : humans) {
            if (h.getCmnd().equals(idCard)) {
                human = h;
            }
        }
        return human;
    }
}
