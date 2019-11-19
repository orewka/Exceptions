package Task1;

class NotMOrNException extends Exception {
    public NotMOrNException(String message) {
        super(message);
    }

    @Override
    public String getMessage() {
        String a = "Отсутствует второе число";
        return a;
    }
}

class OperatorException extends Exception {
    public OperatorException(String message) {
        super(message);
    }

    @Override
    public String getMessage() {
        String a = "Не верный оператор";
        return a;
    }
}

class DivisionByZeroException extends Exception {
    public DivisionByZeroException(String message) {
        super(message);
    }

    @Override
    public String getMessage() {
        String a = "Деление на ноль";
        return a;
    }
}

class MOrNIsNotInt extends Exception {
    public MOrNIsNotInt(String message) {
        super(message);
    }

    @Override
    public String getMessage() {
        String a = "Введены не целые числа";
        return a;
    }
}
