package java_opp_baitap.oop_bai2.person;

public class Information {

    public static void main(String[] args) {
        Person person1 = new Person();
        person1.getInfo();
        Person person2 = new Person("Nguyễn Văn B", 20, "Nam", "Nam Định", "0987654321");
        person2.getInfo();
        Person person3 = new Person("Nguyễn Thị D", 18, "Nữ", "Nghệ An", "0123456789");
        person3.getInfo();
        person2.getInfoShare();
    }
}
