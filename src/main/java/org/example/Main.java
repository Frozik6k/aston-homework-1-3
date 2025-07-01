package org.example;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        Settings settings = new Settings(List.of("Param1", "Param2"));

        SettingsFile.writeFile(settings);

        try {
            settings = SettingsFile.readFile();
        } catch (InvalidSettingException e) {
            System.out.println(e.getMessage());
        }

    }
}