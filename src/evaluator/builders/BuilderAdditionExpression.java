package evaluator.builders;

import evaluator.Addition;
import evaluator.BuilderExpression;
import evaluator.Expression;
import parser.Token;

public class BuilderAdditionExpression extends BuilderExpression {

    public BuilderAdditionExpression() {
        super(Token.symbol("+"));
    }

    @Override
    public Expression getExpression(Expression left, Expression right) {
        return new Addition(left, right);
    }

}