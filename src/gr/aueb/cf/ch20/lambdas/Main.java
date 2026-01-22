package gr.aueb.cf.ch20.lambdas;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Main {

    private static final List<Teacher> teachers = List.of(
            new Teacher(1, "Bob", "W."),
            new Teacher(2, "Alice", "E."),
            new Teacher(3, "John", "D."));

    public static void main(String[] args) {

        // Predicate and lambda
        List<Teacher> teachers1 = getFilteredTeachers(teachers, teacher -> teacher.getId() == 2);
        teachers1.forEach(System.out::println);

        // Consumer and lambda
        printTeachers(teachers, teacher -> teacher.printInstanceTeacher());
                // OR using method reference  (In class Teacher, use method printInstanceTeacher())
        printTeachers(teachers, Teacher::printInstanceTeacher);

        printTeachers(teachers, teacher -> Teacher.printStaticTeacher(teacher));
                // OR using method reference
        printTeachers(teachers, Teacher::printStaticTeacher);

        printTeachers(teachers, teacher -> System.out.println(teacher) ); // since we have toString ovveriden
        printTeachers(teachers, System.out::println);

    }

    //method which integrates/uses our interface
    public static List<Teacher> getFilteredTeachers(List<Teacher> teachers, ITeacherFilter filter ) {
        List<Teacher> teacherToReturn = new ArrayList<>();

        for (Teacher teacher : teachers) {
            if (filter.filterID(teacher)) {             ///  will be defined in Main with lambdas
                teacherToReturn.add(teacher);
            }
        }
        return teacherToReturn;
    }

//    //method which integrates/uses Predicate<> functional interface
//    public static List<Teacher> getFilteredTeachers(List<Teacher> teachers, Predicate<Teacher> filter ) {
//        List<Teacher> teacherToReturn = new ArrayList<>();
//
//        for (Teacher teacher : teachers) {
//            if (filter.test(teacher)) {           ///  will be defined in Main with lambdas
//                teacherToReturn.add(teacher);
//            }
//        }
//        return teacherToReturn;
//    }

    public static void printTeachers(List<Teacher> teachers, Consumer<Teacher> consumer) {
        for (Teacher teacher : teachers) {
            consumer.accept(teacher);
        }
    }
}
