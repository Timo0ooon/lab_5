package WorkingWithFiles.Reader.ReaderInterface;

import WorkingWithFiles.Reader.Extensions;

import java.io.FileNotFoundException;
import java.io.IOException;

public interface Reader {
    public String read(String file_name, Extensions extension) throws IOException;
}
