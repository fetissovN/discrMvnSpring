package com.nick.model;

import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.Digits;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Data {
    @NotEmpty
    @Digits(integer = 5, fraction = 2, message = "Only digits aloud!")
    private double digitA;
    @Digits(integer = 5, fraction = 2, message = "Only digits aloud!")
    private double digitB;
    @Digits(integer = 5, fraction = 2, message = "Only digits aloud!")
    private double digitC;

    public Data() {
    }

    public double getDigitA() {
        return digitA;
    }

    public void setDigitA(double digitA) {
        this.digitA = digitA;
    }

    public double getDigitB() {
        return digitB;
    }

    public void setDigitB(double digitB) {
        this.digitB = digitB;
    }

    public double getDigitC() {
        return digitC;
    }

    public void setDigitC(double digitC) {
        this.digitC = digitC;
    }

    @Override
    public String toString() {
        return "Data{" +
                "digitA=" + digitA +
                ", digitB=" + digitB +
                ", digitC=" + digitC +
                '}';
    }
}
