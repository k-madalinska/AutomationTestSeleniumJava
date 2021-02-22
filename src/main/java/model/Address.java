package model;

import lombok.Data;

@Data
public class Address {
    private String company;
    private String address;
    private String city;
    private String state;
    private String postCode;
    private String mobilePhone;
    private String additionalInformation;
}
