package ru.ssau.tk.forev.OOPpractice.Generator;

import ru.ssau.tk.forev.OOPpractice.Generator.IntGenerator;

public class IntGeneratorImpl implements IntGenerator {
    private int count = 0;

    @Override
    public int nextInt() {
        return count++;
    }
}
