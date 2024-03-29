package ru.ssau.tk.forev.OOPpractice.Points;

class Points {

    private static double accuracy = 0.00005;

    private Points() {
    }

    static Point sum(Point a, Point b) {
        return new Point(a.x + b.x, a.y + b.y, a.z + b.z);
    }

    static Point subtract(Point a, Point b) {
        return new Point(a.x - b.x, a.y - b.y, a.z - b.z);
    }

    static Point multiply(Point a, Point b) {
        return new Point(a.x * b.x, a.y * b.y, a.z * b.z);
    }

    static Point divide(Point a, Point b) {
        return new Point(a.x / b.x, a.y / b.y, a.z / b.z);
    }

    static Point enlarge(Point a, double v) {
        return new Point(a.x * v, a.y * v, a.z * v);
    }

    static double length(Point a) {
        return a.length();
    }

    static Point opposite(Point a) {
        return new Point(-a.x, -a.y, -a.z);
    }

    static Point inverse(Point a) {
        return new Point(1 / a.x, 1 / a.y, 1 / a.z);
    }

    static double scalarProduct(Point a, Point b) {
        return (a.x * b.x) + (a.y * b.y) + (a.z * b.z);
    }

    static Point vectorProduct(Point a, Point b) {
        return new Point(a.y * b.z - b.y * a.z, b.x * a.z - a.x * b.z, a.x * b.y - b.x * a.y);
    }

    private static boolean equalsApproximately(double a, double b) {
        return Math.abs(a - b) < accuracy ;
    }
    static boolean equalsApproximately(Point a, Point b) {
        return equalsApproximately(a.x, b.x) && equalsApproximately(a.y, b.y) && equalsApproximately(a.z, b.z);
}
}
