package Task3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Exception> exceptionList = new ArrayList<>();
        // ArrayIndexOutofBoundsException
        try {
            int[] arr = new int[5];
            arr[7] = 12;
        } catch (Exception e) {
            exceptionList.add(e);
        }
        // ArrayIndexOutofBoundsException
        try {
            int array[] = {1, 2, 3};
            System.out.println(array[4]);
        } catch (Exception e) {
            exceptionList.add(e);
        }
        // ArithmeticException
        try {
            int a = 1 / 0;
        } catch (Exception e) {
            exceptionList.add(e);
        }
        // NegativeArraySizeException
        try {
            int i = 1-2-3;
            int[] a = new int[i];
        } catch (Exception e) {
            exceptionList.add(e);
        }
        // NullPointerException
        try {
            Object o = null;
            o.equals("lela");
        } catch (Exception e) {
            exceptionList.add(e);
        }
        //NumberFormatException
        try {
            String s = "ira23";
            Integer.parseInt(s);
        } catch (Exception e) {
            exceptionList.add(e);
        }
        // ArrayStoreException
        try {
            Object szStr[] = new String[10];
            szStr[0] = new Character('*');
        }catch (Exception e) {
            exceptionList.add(e);
        }
        // ClassCastException
        try {
            Object ch = new Character('*');
            System.out.println((Byte)ch);
        }catch (Exception e) {
            exceptionList.add(e);
        }
        // StringIndexOutOfBoundsException
        try {
            String szShortString = "123";
            char chr = szShortString.charAt(10);
        } catch (Exception e) {
            exceptionList.add(e);
        }
        System.out.println(exceptionList.size(  ));
    }
}

