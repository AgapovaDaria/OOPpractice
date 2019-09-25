package ru.ssau.tk.forev.OOPpractice.Points;


class Main {
    public static void main(String[] args) {

        Point k = new Point(1, 2, 5);
        Point n = new Point(5,8,10);
        double v = 2.4;
        System.out.println("Координаты первой точки:" + " " + k.x + " " + k.y + " " + k.z);
        System.out.println("Координаты второй точки:" + " " + n.x + " " + n.y + " " + n.z);
        System.out.println("Результат произвдения значений координат:" + " " + Points.multiply(k,n).x + " " + Points.multiply(k,n).y + " " + Points.multiply(k,n).z );
        System.out.println("Результат суммы значений координат:" + " " + Points.sum(k,n).x + " " + Points.sum(k,n).y + " " + Points.sum(k,n).z);
        System.out.println("Результат разности значений координат:" + " " + Points.subtract(k,n).x + " " + Points.subtract(k,n).y + " " + Points.subtract(k,n).z);
        System.out.println("Результат деления значений координат:" + " " + Points.divide(k,n).x + " " + Points.divide(k,n).y + " " + Points.divide(k,n).z);
        System.out.println("Результат увеличения значений координат первой точки в v раз:" + " " + Points.enlarge(k,v).x + " " + Points.enlarge(k,v).y + " " + Points.enlarge(k,v).z);
        System.out.println("Длина первой точки:" + " " + Points.length(k));
        System.out.println("Противоположное значение координат первой точки :" + " " + Points.opposite(k).x + " " + Points.opposite(k).y + " " + Points.opposite(k).z);
        System.out.println("Обратные значения координат второй точки :" + " " + Points.inverse(n).x + " " + Points.inverse(n).y + " " + Points.inverse(n).z);
    }
}