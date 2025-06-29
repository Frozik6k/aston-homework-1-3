package org.example;

import java.io.IOException;

public class NoSettingException extends IOException {

    private final String message = "Это не файл найстроек";

    @Override
    public String getMessage() {
        return this.message;
    }
}
