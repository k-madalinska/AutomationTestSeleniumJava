package model;

import enums.Country;
import enums.State;
import lombok.Data;

@Data
public class Address {

    private String company;
    private String address;
    private String city;
    private State state;
    private Country country;
    private String postCode;
    private String mobilePhone;
    private String additionalInformation;
}
