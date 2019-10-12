package ru.ssau.tk.forev.OOPpractice.Operation;

abstract class Operation {
    abstract double apply(double number);

    double applyTriple (double number) {
        return apply(apply(apply(number)));
    }
}
