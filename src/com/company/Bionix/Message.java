package com.company.Bionix;

import java.util.Objects;

public class Message {
    public String phoneNumber;
    public String massageText;
    public Status status;

    public Message(String phoneNumber, String massageText, Status status) {
        this.phoneNumber = phoneNumber;
        this.massageText = massageText;
        this.status = status;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getMassageText() {
        return massageText;
    }

    public void setMassageText(String massageText) {
        this.massageText = massageText;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public enum Status {
        Incoming,
        Outgoing,
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Message)) return false;
        Message message = (Message) o;
        return Objects.equals(phoneNumber, message.phoneNumber) && Objects.equals(massageText, message.massageText) && status == message.status;
    }

    @Override
    public int hashCode() {
        return Objects.hash(phoneNumber, massageText, status);
    }

    @Override
    public String toString() {
        return
                "   massageText=   " + massageText +
                        ", status=" + status;
    }
}