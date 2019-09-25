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

    static Point enlarge(Point a, double v )  {
        return new Point (a.x*v, a.y*v,a.z*v);
    }

    static double length (Point a) {
        return a.length();
    }
    static Point opposite (Point a) {
        return new Point(-a.x,-a.y,-a.z);
    }
    static Point inverse (Point a) {
        return new Point(1/a.x,1/a.y,1/a.z);
    }
}
