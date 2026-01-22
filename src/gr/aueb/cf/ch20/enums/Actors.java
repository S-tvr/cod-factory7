package gr.aueb.cf.ch20.enums;

public enum Actors {
    STUDENT("ROLE_STUDENT"),
    TEACHER("ROLE_TEACHER");

    private final String role;

    Actors(String role) {
        this.role = role;
    }

    public String toRole() {
        return role;
    }
}
