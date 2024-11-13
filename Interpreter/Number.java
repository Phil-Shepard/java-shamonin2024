package Interpreter;

import java.util.HashMap;

class Number implements Expression {
    private int number;

    public Number(int number) {
        this.number = number;
    }

    @Override
    public int interpret(HashMap<String, Integer> context) {
        return number;
    }
}
