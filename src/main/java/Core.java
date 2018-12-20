import java.util.List;
import java.util.Scanner;

public class Core {
    public static String coreMethod(String filePathInput, String filePathOutPut) {

        Scanner in = new Scanner(System.in);
        ReadWriteFile readWriteFile = new ReadWriteFile();

        String stroka = readWriteFile.read(filePathInput);
        String result = new String();
        ReversePolishAlgorithm reversePolishAlgorithm = new ReversePolishAlgorithm();
        List<String> expression = reversePolishAlgorithm.parse(stroka);
        boolean flag = reversePolishAlgorithm.flag;
        if (flag) {
            for (String x : expression) result += x + " ";
            System.out.println();

        }
        readWriteFile.write(filePathOutPut, result);


        return readWriteFile.read(filePathOutPut);
    }
}
