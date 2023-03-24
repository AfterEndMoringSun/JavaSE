public class Person {
//    姓名
    private String name;
//    性别
    private String sex;
//    电话号码
    private double phone;
//    年龄
    private int age;
//    地址
    private String address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public double getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

//    行为
    public void run(){
        System.out.println(getName()+"今天跑步去了");
    }
}
