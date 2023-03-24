public class Test {
    public static void main(String[] args) {
        Person person = new Person();
        person.setAddress("河北省廊坊市安次区岳庄村");
        person.setName("刘辰阳");
        person.setPhone(1833366103);
        person.setAge(18);
        person.setSex("男");

        double phone = person.getPhone();
        String address = person.getAddress();
        int age = person.getAge();
        String name = person.getName();
        String sex = person.getSex();
        System.out.println(
                "姓名\t"+name
                +"\t性别\t"+sex
                +"\t年龄\t"+age
                +"\t电话\t"+phone
                +"\t地址\t"+address
        );
        person.run();
    }
}
