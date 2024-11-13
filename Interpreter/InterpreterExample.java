package Interpreter;

import java.util.HashMap;

// Клиентский код
public class InterpreterExample {
    public static void main(String[] args) {
        HashMap<String, Integer> context = new HashMap<>();
        Expression expr = new Add(new Number(5), new Number(3)); // 5 + 3
        System.out.println("Результат: " + expr.interpret(context)); // Вывод: 8
    }
}
