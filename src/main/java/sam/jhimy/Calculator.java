package sam.jhimy;

public class Calculator {
    public int value;
    Calculator(){
        value=0;
    }
    public int value(){
        return this.value;
    }
    public int add(int augend, int addend) {
        this.value=augend+addend;
        return this.value;
    }
    public int subtraction(int minuend, int subtrahend) {
        this.value=minuend-subtrahend;
        return this.value;
    }

    public int multiplication(int multiplicand, int multiplicator) {
        this.value = multiplicand*multiplicator;
        return this.value;
    }

    public int division(int dividend, int divisor) {
        this.value = dividend/divisor;
        return this.value;
    }
}
