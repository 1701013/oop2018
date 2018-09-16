package week1;

public class StudentManagement {
    private Student arrSv[] = new Student[100];
    private int sosv = 0;
    // TODO: khai báo thuộc tính students là array chứa các đối tượng thuộc lớp Student (max. 100)
    private    void list(Student sv) {
        if (sosv > 100) System.out.println("Vuot qua so luong sinh vien cho phep");
        else {
            arrSv[sosv] = sv;
            sosv++;
        }

    }

    private void Showlist() {
        for (int j = 0; j < sosv; j++) {
            System.out.println(arrSv[j].getName() + " ");
        }
    }
    public boolean sameGroup(Student s1, Student s2) {
        // TODO:
        String gr1 = s1.getGroup();
        String gr2 = s2.getGroup();
        return gr1.equals(gr2);// xóa dòng này sau khi cài đặt
    }

    void studentsByGroup() {
        boolean A[] = new boolean[sosv];
        for (int i = 0; i < sosv; i++) {
            A[i] = true;
        }
        for (int i = 0; i < sosv; i++) {
            if (A[i]) {
                System.out.print("Sinh vien thuoc lop " + arrSv[i].getGroup()+": ");
                for (int j = 0; j < sosv; j++) {
                    if (arrSv[j] == arrSv[j]) {
                        System.out.print(arrSv[j].getName()+ ", ");
                        A[j] = false;
                    }

                }
            }
        }
// TODO:
    }

    void removeStudent(String id) {
        for (int i = 0; i < sosv; i++) {
            if (arrSv[i].getId().equals(id)) {
                for (int j = 0; j < sosv; j++) {
                    arrSv[j] = arrSv[j + 1];

                }
            }
            sosv--;
        }// TODO:
    }

    public static void main(String[] args) {
        Student st = new Student();
        StudentManagement Ds = new StudentManagement();
        st.setName("Ngo Thi Hoai Thanh");
        st.setId("17021013");
        st.setGroup("INT22041");
        st.setEmail("17021013@vnu.edu.vn");
        String me = st.getName();
        System.out.println(me);
        st.getInfo();

        Student st2 = new Student("Thanh Quy", "17020997","17020997@vnu.edu.vn");
        Student st3 = new Student("Nguyen Duong", "17021024" ,"17021024@vnu.edu.vn");
        Student st4 = new Student(st);


        st2.getInfo();
        st3.getInfo();
        st4.getInfo();
        System.out.println(Ds.sameGroup(st2, st3));
        System.out.println(Ds.sameGroup(st2, st4));

        Ds.list(st2);
        Ds.list(st3);
        //Ds.list(st4);
        Ds.list(st);
        System.out.println("Danh sach sv trc khi xoa: ");
        Ds.Showlist();

        Ds.removeStudent("17021024");
        System.out.println("Danh sach sv sau khi xoa: ");
        Ds.Showlist();

        Ds.studentsByGroup();

    }// TODO:
    }
}
