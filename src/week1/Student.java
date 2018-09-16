package week1;

public class Student {
    private String name;
    private  String id;
    private String group;
    private String email;    // TODO: khai báo các thuộc tính cho Student

    // TODO: khai báo các phương thức getter, setter cho Student

    /**
     * Constructor 1
     */
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    Student() {
        name = "Student";
        id="000";
        group="INT22041";
        email="uet@vnu.edu.vn";// phương thức khởi tạo không có tham số
    }

    /**
     * Constructor 2
     * @param n
     * @param sid
     * @param em
     */
    Student(String n, String sid, String em) {
        name = n;
        id = sid;
        email = em;
        group = "INT22041";// TODO:
    }

    /**
     * Constructor 3
     * @param s
     */
    Student(Student s) {
        name =s.name;
        id = s.id;
        group = s.group;
        email = s.email;// TODO:
    }

    String getInfo() {
        System.out.println("Ten sinh vien: " + name + ". ID: " + id + ". lop: " + group + ". Email: " + email + ".");


        return null; // xóa dòng này sau khi cài đặt
    }
}
