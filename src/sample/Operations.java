package sample;

public enum Operations {
    ADD("+"),
    MIN("-"),
    DIV("/"),
    MUL("*"),
    DOT(".");
    private String operationChar;

    Operations(String operationChar) {
        this.operationChar = operationChar;
    }

    private String getOperationChar() {
        return this.operationChar;
    }

    public static Operations getValueBasedOnString(String inputChar) {
        for (Operations operation : Operations.values()) {
            if (operation.getOperationChar().equals(inputChar)) {
                return operation;
            }
        }
        return ADD;
    }
}