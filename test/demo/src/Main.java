package test.demo.src;

import java.util.Scanner;

class Address {

    private String city;
    private String province;

    Address() {
        city = "wuhan";
        province = "hubei";
    }

    Address(String province, String city) {
        this.city = city;
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getProvince() {
        return province;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return province + "," + city;
    }

}

class Student {

    private String name;
    private Address add;

    Student() {

    }

    Student(String name, Address address) {
        this.add = new Address();
        this.name = name;
        
    }

    public Address getAdd() {
        return add;
    }

    public String getName() {
        return name;
    }

    public void setAddress(Address address) {
        this.add = address;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return name + ":" + add.toString();
    }

}

public class Main {
    public static void main(String[] args) {
        int selected;
        Scanner scan = new Scanner(System.in);
        selected = scan.nextInt();
        Address address = new Address();
        Student student = new Student("zhangsan", address);
        switch (selected) {
            case 1:
                address.setProvince("HuBei");
                System.out.println(address);
                break;
            case 2:
                address = new Address("HuNan", "ChangSha");
                System.out.println(address);
                break;
            case 3:
                address.setCity("YiChang");
                System.out.println(address);
                break;
            case 4:
                address.setProvince("HuBei");
                System.out.println(student);
                break;
            case 5:
                System.out.println(student);
        }
        scan.close();
    }
}
