package Task3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Exception> exceptionList = new ArrayList<>();
        try {
            int[] arr = new int[5];
            arr[7] = 12;

        } catch (Exception e) {
            exceptionList.add(e);
        } finally {
            try {
                int array[] = {1, 2, 3};
                System.out.println(array[4]);
            } catch (Exception e) {
                exceptionList.add(e);
            }
        }
        System.out.println(exceptionList.size());
    }
}
