package com.company.Bionix;

import java.util.Objects;

public class Contact {
    public String phoneNumber;
    public String name;

    public Contact(String phoneNumber, String name) {
        this.phoneNumber = phoneNumber;
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object another) {
        if (this == another) return true;
        if (!(another instanceof Contact)) return false;
        Contact contact = (Contact) another;
        return Objects.equals(this.phoneNumber, contact.phoneNumber) && Objects.equals(this.name, contact.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(phoneNumber, name);
    }

    @Override
    public String toString() {
        return "phoneNumber : " + phoneNumber +
                ", name : " + name + "  ";
    }
}