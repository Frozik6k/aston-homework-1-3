package org.example;

import java.io.*;

public class SettingsFile {

    public final static String PATHSETTINGSFILE = ".\\setting.ini";

    public static Settings readFile() throws NoSettingException {
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(PATHSETTINGSFILE))) {
            return (Settings) inputStream.readObject();
        } catch (FileNotFoundException exception) {
            System.out.println("Файл настроек отсутствует по заданному пути: " + PATHSETTINGSFILE);
        } catch (IOException e) {
            throw new NoSettingException();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return null;
    }

    public static void writeFile(Settings settings) {
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(PATHSETTINGSFILE))) {
            outputStream.writeObject(settings);
        } catch (Exception e) {
            System.out.println("Что-то пошло не так при записи файла настроек");
        }
    }
}
