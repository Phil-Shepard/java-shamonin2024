package Interpreter;

import java.util.HashMap;

// Паттерн Interpreter
interface Expression {
    int interpret(HashMap<String, Integer> context);
}
