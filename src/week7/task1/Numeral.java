package week7.task1;

public class Numeral extends Expression {
    private int value;
    public Numeral() {};
    public Numeral(int _value) {
        value= _value;
    };
    public void setValue(int value) {
        this.value = value;
    }
    public int getValue() {
        return value;
    }
    @Override
    public String tostring() {
        return "so hang la : "+ value;
    }
    @Override
    public int evaluate() {
        return value;
    }

}