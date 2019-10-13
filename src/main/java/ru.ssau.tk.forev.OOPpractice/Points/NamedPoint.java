package ru.ssau.tk.forev.OOPpractice.Points;

class NamedPoint extends Point {
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
}
