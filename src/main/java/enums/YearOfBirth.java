package enums;

public enum YearOfBirth {
    Y2021("2021"),
    Y2020("2020"),
    Y2015("2015"),
    Y2010("2010"),
    Y2005("2005"),
    Y2000("2000"),
    Y1995("1995"),
    Y1990("1990"),
    Y1985("1985"),
    Y1980("1980"),
    Y1975("1975"),
    Y1970("1970"),
    Y1965("1965"),
    Y1960("1960"),
    Y1955("1955"),
    Y1950("1950");

    private String value;

    YearOfBirth(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

}
