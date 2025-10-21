package java_opp_baitap.oop_bai2.person;

public class Person {
    private static int i = 1;
    private String name;
    private int age;
    private String gender;
    private String address;
    private String phone;

    public Person() {
        name = "Nguyễn Văn A";
        age = 19;
        gender = "Nam";
        address = "Hà Nội";
        phone = "0818268331";
    }
    public Person(String name, int age, String gender, String address, String phone) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.address = address;
        this.phone = phone;
    }

    void getInfo() {
        System.out.println("Thông tin nhân sự "+i+++":");
        System.out.println("Họ tên: " + name);
        System.out.println("Tuổi: " + age);
        System.out.println("Giới tính: " + gender);
        System.out.println("Địa chỉ: " + address);
        System.out.println("Số điện thoại: " + phone);
        //System.out.println(name+" - "+age+" - "+gender+" - "+address+" - "+phone);
    }
    public void getInfoShare() {
        System.out.println("Thông tin nhân sự "+i+++":");
        System.out.println("Họ tên: " + name);
        System.out.println("Tuổi: " + age);
        System.out.println("Giới tính: " + gender);
        //System.out.println("Địa chỉ: " + address);
        //System.out.println("Số điện thoại: " + phone);
        //System.out.println(name+" - "+age+" - "+gender+" - "+address+" - "+phone);
    }
}
