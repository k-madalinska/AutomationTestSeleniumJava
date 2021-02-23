package enums;

public enum MonthOfBirth {
    JANUARY("January"),
    FEBRUARY("February"),
    MARCH("March"),
    APRIL("April"),
    MAY("May"),
    JUNE("June"),
    JULY("July"),
    AUGUST("August"),
    SEPTEMBER("September"),
    OCTOBER("October"),
    NOVEMBER("November"),
    DECEMBER("December");

    private String value;

    MonthOfBirth(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
