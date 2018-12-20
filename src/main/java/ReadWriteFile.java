import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Logger;

public class ReadWriteFile {
    private static final Logger logger = Logger.getLogger(ReadWriteFile.class.getName());

    public String read(String filename) {
        String content = null;
        File file = new File(filename);
        FileReader reader = null;
        try {
            reader = new FileReader(file);
            char[] chars = new char[(int) file.length()];
            reader.read(chars);
            content = new String(chars);

            reader.close();
        } catch (IOException e) {
            logger.severe("IOException: " + e.toString() );
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
                logger.severe("IOException: " + e.toString() );
            }
        }
        return content.replaceAll("\\.", "");
    }

    public void write(String filename, String text) {
        String content = null;
        File file = new File(filename);
        FileWriter writer = null;
        try {
            writer = new FileWriter(file);

            writer.write(text);


            writer.close();
        } catch (IOException e) {
            logger.severe("IOException: " + e.toString() );
        } finally {
            try {
                if (writer != null) {
                    writer.close();
                }
            } catch (IOException e) {
                logger.severe("IOException: " + e.toString() );
            }
        }

    }
}
