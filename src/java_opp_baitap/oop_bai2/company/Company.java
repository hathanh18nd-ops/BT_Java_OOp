package java_opp_baitap.oop_bai2.company;

import java_opp_baitap.oop_bai2.person.Person;

public class Company {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.getInfoShare();
        Person person2 = new Person("Nguyễn Thị D", 18, "Nữ", "Nghệ An", "0123456789");
        person2.getInfoShare();

    }
}
