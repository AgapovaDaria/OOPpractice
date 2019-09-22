package ru.ssau.tk.forev.OOPpractice.Points;

class Points {
    private Points() {
    }
     static Point sum (Point a, Point b) {
         return new Point(a.x + b.x, a.y + b.y, a.z + b.z);
     }

    static Point subtract (Point a, Point b) {
        return new Point(a.x - b.x, a.y - b.y, a.z - b.z);
    }

    static Point multiply (Point a, Point b) {
        return new Point(a.x * b.x, a.y * b.y, a.z * b.z);
    }

    static Point divide (Point a,Point b) {
        return new Point(a.x / b.x, a.y / b.y, a.z / b.z);
    }
}
