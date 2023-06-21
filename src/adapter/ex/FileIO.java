package adapter.ex;

import javax.imageio.IIOException;
import java.io.IOException;

public interface FileIO {
    void readFromFile(String fileName) throws IOException;
    void writeToFile(String fileName) throws IOException;
    void setValue(String key, String value);
    void getValue(String key);
}
