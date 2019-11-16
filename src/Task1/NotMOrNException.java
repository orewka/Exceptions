package Task1;

class NotMOrNException extends Exception {
    public NotMOrNException(String message) {
        super(message);
    }
}

class OperatorException extends Exception {
    public OperatorException(String message) {
        super(message);
    }
}

class DivisionByZeroException extends Exception {
    public DivisionByZeroException(String message) {
        super(message);
    }
}

class MOrNIsNotInt extends Exception {
    public MOrNIsNotInt(String message) {
        super(message);
    }
}
