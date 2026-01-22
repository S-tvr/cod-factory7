package gr.aueb.cf.ch16.default_static;

public interface IWelcome {
    // δεν μπορουν να γινουν override.
    // οι στατικ ανοικουν στον τυπο, δεν εχουν instances.
    static void staticMethod () {
        System.out.println("Hello from IWelcome static method");
    }

    // δεν κανει break ο κώδικας οταν καποιος φτιαχνε interfaces.
    default void defaultMethod() {
        System.out.println("Hello from IWelcome default method");
    }
}
