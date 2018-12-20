import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CoreTest  {
    private static Core core;

    public static String FILE_PATH_INPUT_TEST1="src/main/resources/testfile.txt";
    public static String FILE_PATH_INPUT_TEST2="src/main/resources/testfile2.txt";
    public static String FILE_PATH_INPUT_TEST3="src/main/resources/testfile3.txt";
    public static String FILE_PATH_OUTPUT="src/main/resources/result.txt";

    @Test
    public void testOne() {
       String result= core.coreMethod(FILE_PATH_INPUT_TEST1,FILE_PATH_OUTPUT);
        assertEquals("5 a * b 4 - c / + ", result);

    }
    @Test
    public void testTwo() {
        String result= core.coreMethod(FILE_PATH_INPUT_TEST2,FILE_PATH_OUTPUT);
        assertEquals("8 2 5 * + 1 3 2 * + 4 - / ", result);

    }
    @Test
    public void testThree() {
        String result= core.coreMethod(FILE_PATH_INPUT_TEST3,FILE_PATH_OUTPUT);
        assertEquals("4 5 + x * y 2 / 15 + - ", result);

    }

}