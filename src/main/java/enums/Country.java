package enums;

public enum Country {
    UNITED_STATES("United States");
    private String value;

    Country(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
