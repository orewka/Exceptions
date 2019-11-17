package Task2;

import java.io.FileNotFoundException;
import java.nio.file.AccessDeniedException;
import java.util.jar.JarException;

public class Main {
    static void throwException(Status status) throws JarException, FileNotFoundException, AccessDeniedException {
        if (status.equals(Status.FILE_NOT_FOUND)) throw new FileNotFoundException();
        if (status.equals(Status.ACCESS_DENIED)) throw new AccessDeniedException("Что тут?");
        if (status.equals(Status.JAR_ERROR)) throw new JarException();


    }

    public static void main(String[] args) {
        try {
            throwException(Status.FILE_NOT_FOUND);
            throwException(Status.ACCESS_DENIED);
            throwException(Status.JAR_ERROR);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (AccessDeniedException e) {
            e.getMessage();
          //  throw new ???;
        } catch (JarException e) {
            e.printStackTrace();
        }
    }
}
