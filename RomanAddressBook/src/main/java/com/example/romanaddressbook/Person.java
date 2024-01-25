package com.example.romanaddressbook;

import javafx.beans.property.SimpleStringProperty;

public class Person {
    private SimpleStringProperty PIP = new SimpleStringProperty("");
    private SimpleStringProperty PHONE = new SimpleStringProperty("");

    public Person(String pip, String phone) {
        this.PIP = new SimpleStringProperty(pip);
        this.PHONE = new SimpleStringProperty(phone);
    }

    public String getPIP() {
        return PIP.get();
    }

    public SimpleStringProperty pipProperty() {
        return PIP;
    }

    public void setPip(String pip) {
        this.PIP.set(pip);
    }

    public String getPhone() {
        return PHONE.get();
    }

    public SimpleStringProperty phoneProperty() {
        return PHONE;
    }

    public void setPhone(String phone) {
        this.PHONE.set(phone);
    }

    @Override
    public String toString() {
        return "Person{" +
                "pip=" + PIP +
                ", phone=" + PHONE +
                '}';
    }



}
