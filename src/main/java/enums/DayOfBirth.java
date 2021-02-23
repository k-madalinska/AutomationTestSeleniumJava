package enums;

public enum DayOfBirth {
    ONE("1"),
    TWO("2"),
    THREE("3"),
    FOUR("4"),
    FIVE("5"),
    SIX("6"),
    SEVEN("7"),
    EIGHT("8"),
    NINE("9"),
    TEN("10"),
    FIFTEEN("15"),
    TWENTY("20"),
    TWENTYFIVE("25"),
    THIRTY("30"),
    THIRTYONE("31");
    private String value;

    DayOfBirth(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
