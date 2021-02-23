package model;

import enums.DayOfBirth;
import enums.MonthOfBirth;
import enums.YearOfBirth;
import lombok.Data;

@Data

public class PersonalInformation {

    private String firstName;
    private String lastName;
    private String email;
    private String Password;
    private DayOfBirth dayDateOfBirth;
    private MonthOfBirth monthDateOfBirth;
    private YearOfBirth yearDateOfBirth;
    private String inputNewsletter;
}
