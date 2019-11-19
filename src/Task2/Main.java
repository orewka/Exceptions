package Task2;

import java.io.FileNotFoundException;
import java.nio.file.AccessDeniedException;
import java.util.jar.JarException;

public class Main {
    static void throwException(Status status) throws JarException, FileNotFoundException, AccessDeniedException {
        if (status.equals(Status.FILE_NOT_FOUND)) throw new FileNotFoundException("Файл отсутствует");
        if (status.equals(Status.ACCESS_DENIED)) throw new AccessDeniedException("Доступ запрещен");
        if (status.equals(Status.JAR_ERROR)) throw new JarException("Ошибка расширения");


    }

    public static void main(String[] args) {
        try {
            throwException(Status.FILE_NOT_FOUND);
            throwException(Status.ACCESS_DENIED);
            throwException(Status.JAR_ERROR);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (AccessDeniedException e) {
            try {
                System.out.println(e.getMessage());;
                throw new AccessDeniedException("Доступ запрещен");
            } catch (AccessDeniedException e1) {
                e1.printStackTrace();
            }
        } catch (JarException e) {
            e.printStackTrace();
        }
    }
}
