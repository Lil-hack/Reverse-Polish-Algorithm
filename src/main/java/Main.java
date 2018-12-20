
import java.lang.*;

public class Main {

    public static String FILE_PATH_INPUT = "src/main/resources/testfile.txt";
    public static String FILE_PATH_OUTPUT = "src/main/resources/result.txt";


    public static void main(String[] args) {

        String result = Core.coreMethod(FILE_PATH_INPUT, FILE_PATH_OUTPUT);
        System.out.println(result);


    }


}