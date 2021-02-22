package model;

import lombok.Data;

@Data
public class PersonalInformation {
    private String firstName;
    private String lastName;
    private String email;
    private String Password;
    private String dayDateOfBirth;
    private String monthDateOfBirth;
    private String yearDateOfBirth;
    private String inputNewsletter;
}
