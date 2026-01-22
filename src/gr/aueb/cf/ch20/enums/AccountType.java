package gr.aueb.cf.ch20.enums;

public enum AccountType {
    DEPOSIT("DEP"),        // ordinal 0
    SAVINGS("SAV"),        // ordinal 1
    CURRENT("CUR");        // ordinal 2

    private final String code;

    AccountType(String code) {
        this.code = code;
    }

    public String getCodeName() {
        return code;
    }
}
