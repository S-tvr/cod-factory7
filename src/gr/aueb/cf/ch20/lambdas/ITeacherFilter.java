package gr.aueb.cf.ch20.lambdas;

@FunctionalInterface
public interface ITeacherFilter {

    boolean filterID(Teacher teacher);

}
