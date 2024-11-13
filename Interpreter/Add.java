package Interpreter;

import java.util.HashMap;

class Add implements Expression {
    private Expression leftExpression;
    private Expression rightExpression;

    public Add(Expression left, Expression right) {
        this.leftExpression = left;
        this.rightExpression = right;
    }

    @Override
    public int interpret(HashMap<String, Integer> context) {
        return leftExpression.interpret(context) + rightExpression.interpret(context);
    }
}
