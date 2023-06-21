package adapter.ex;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class FileProperties implements FileIO {

    Properties properties = new Properties();


    @Override
    public void readFromFile(String fileName) throws IOException {
        properties.load(new FileReader(fileName));

    }

    @Override
    public void writeToFile(String fileName) throws IOException {
        properties.store(new FileWriter(fileName), "written by FileProperties");

    }

    @Override
    public void setValue(String key, String value) {
        properties.setProperty(key, value);

    }

    @Override
    public void getValue(String key) {
        properties.getProperty(key, "");
    }
}
