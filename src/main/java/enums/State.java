package enums;

public enum State {
    ALABAMA("Alabama"),
    CALIFORNIA("California"),
    FLORIDA("Florida"),
    GIORGIA("Georgia"),
    HAWAII("Hawaii"),
    IDAHO("Idaho"),
    KANSASS("Kansas"),
    NEW_YORK("New York"),
    OREGON("Oregon"),
    TEXAS("Texas"),
    WIRGINIA("Wirginia");

    private String value;

    State(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
