package gr.aueb.cf.ch20.enums;

/**
 * Οι σταθερές είναι instance ανώνυμων κλάσεων. Και μαλιστα singletons. (one instance)
 * Ειναι instances υποκλάσεων της actor2. γι αυτο μπορουν και κάνουν override την method.
 */
public enum Actor2 {
    CIVILIAN{
        @Override
        public String toRole() {
            return "ROLE_CIVILIAN";
        }
    },    EMPLOYEE{
        @Override
        public String toRole() {
            return "ROLE_EMPLOYEE";
        }
    },    SUPER_ADMIN{
        @Override
        public String toRole() {
            return "ROLE_SUPER_ADMIN";
        }
    };

    public abstract String toRole();
}
