package class24;

public class StudentTester {
    public static void main(String[] args) {
        Student[] students={new SyntaxStudent(),new SchoolStudent(),new CollegeStudent()};
        for(Student st:students){
            st.doHomeWork();
            st.practice();
            st.study();
        }

    for(int i=0;i<students.length;i++) {
        students[i].study();
        students[i].practice();
        students[i].doHomeWork();


    }
    }
}
