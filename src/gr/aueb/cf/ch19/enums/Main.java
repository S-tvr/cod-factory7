package gr.aueb.cf.ch19.enums;

public class Main {

    public static void main(String[] args) {
        UserRole roleStudent = UserRole.STUDENT;
        String strRole = roleStudent.name();            // role in enums is like toString
        System.out.println(strRole);

        UserRole role = UserRole.valueOf(strRole);
    }
}
