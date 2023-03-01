package org.example;
abstract class Calculator {

    double num1;
    double num2;
    public void setNum1(double num1) {

        this.num1 = num1;
    }
    public void setNum2(double num2) {
        this.num2 = num2;
    }
    abstract double calculate();
}
class Addition extends Calculator {

    double calculate() {
        return num1 + num2;
    }
}
class Subtraction extends Calculator {
    double calculate() {

        return num1 - num2;
    }
}
class Multiplication extends Calculator {
    double calculate() {

        return num1 * num2;
    }
}
class Division extends Calculator {
    double calculate() {
        return num1 / num2;
    }
}
