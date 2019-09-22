package ru.ssau.tk.forev.OOPpractice.Points;

class Main {
    public static void main(String[] args) {

        Point k = new Point(1, 2, 5);
        Point n = new Point(5,8,10);

        System.out.println(k);
        System.out.println(n);
        System.out.println(Points.multiply(k,n));
    }
}