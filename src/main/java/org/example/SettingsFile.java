package org.example;


import java.io.*;

public class SettingsFile {

    public final static String PATH_TO_SETTINGS_FILE = ".\\setting.ini";

    public static Settings readFile() throws InvalidSettingException {
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(PATH_TO_SETTINGS_FILE))) {
            return (Settings) inputStream.readObject();
        } catch (IOException e) {
            throw new InvalidSettingException();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public static void writeFile(Settings settings) {
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(PATH_TO_SETTINGS_FILE))) {
            outputStream.writeObject(settings);
        } catch (Exception e) {
            System.out.println("Что-то пошло не так при записи файла настроек");
        }
    }
}
