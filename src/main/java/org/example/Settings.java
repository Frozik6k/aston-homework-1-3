package org.example;

import java.io.Serial;
import java.io.Serializable;

public class Settings implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    private String parametr1;
    private String parametr2;
    private transient String parametr3 = "1";

    public Settings() {
    }

    public Settings(String parametr1, String parametr2) {
        this.parametr1 = parametr1;
        this.parametr2 = parametr2;
    }

    public Settings(String parametr1, String parametr2, String parametr3) {
        this.parametr1 = parametr1;
        this.parametr2 = parametr2;
        this.parametr3 = parametr3;
    }

    public String getParametr1() {
        return parametr1;
    }

    public void setParametr1(String parametr1) {
        this.parametr1 = parametr1;
    }

    public String getParametr2() {
        return parametr2;
    }

    public void setParametr2(String parametr2) {
        this.parametr2 = parametr2;
    }

    public String getParametr3() {
        return parametr3;
    }

    public void setParametr3(String parametr3) {
        this.parametr3 = parametr3;
    }
}
