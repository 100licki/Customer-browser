package com.stolicki.customerbrowser.customercatalog;

import lombok.Data;

import javax.persistence.Embeddable;

@Data
@Embeddable
public class Address {
    private String country;
    private String zip;
    private String city;
    private String street;
}
