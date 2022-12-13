package design.pattern.interpreter;

import java.util.Map;

public interface PostfixExpression {
    int interpret(Map<Character, Integer> context) ;

    static PostfixExpression plus(PostfixExpression left, PostfixExpression right) {
        return context -> left.interpret(context) + right.interpret(context);
    }

    static PostfixExpression minus(PostfixExpression left, PostfixExpression right) {
        return context -> left.interpret(context) - right.interpret(context);
    }

    static PostfixExpression variable(Character C) {
        return context -> context.get(C);
    }
}
