package com.example.javaprojtectest2.week4.day5.fileParser;

public class Hospital {
    private String name;
    private Address address;
    private String websiteAddress;

    public Hospital(String name, String websiteAddress, Address address) {
        this.name = name;
        this.address = address;
        this.websiteAddress = websiteAddress;
    }

    public String getName() {
        return name;
    }

    public Address getAddress() {
        return address;
    }

    public String getWebsiteAddress() {
        return websiteAddress;
    }

    @Override
    public String toString() {
        return "Hospital{" +
                "name='" + name + '\'' +
                ", address=" + address +
                ", websiteAddress='" + websiteAddress + '\'' +
                '}';
    }
}
