package ru.ssau.tk.forev.OOPpractice.Points;

import ru.ssau.tk.forev.OOPpractice.Generator.Resettable;

class NamedPoint extends Point implements Resettable {
    private String name;

    NamedPoint(double x, double y, double z) {
        super(x, y, z);
    }

    NamedPoint(double x, double y, double z, String name) {
        super(x, y, z);
        this.name = name;
    }

     void setName(String name) {
        this.name = name;
    }

     String getName() {
        return name;
    }

    NamedPoint() {
        super(0, 0, 0);
        this.name = "Origin";
    }

    @Override
    public void reset() {
        name = "Absent";
    }
}
