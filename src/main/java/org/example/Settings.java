package org.example;

import java.io.Serial;
import java.io.Serializable;
import java.util.List;

public class Settings implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    private List<String> params;

    public Settings() {
    }

    public Settings(List<String> params) {
        this.params = params;
    }

    public List<String> getParams() {
        return params;
    }

    public void setParams(List<String> params) {
        this.params = params;
    }
}
