import java.util.Scanner;

public class Laba2 {
    public static void main(String[] args) {
        Point3d[] Points = new Point3d[3];
        for (int i = 0; i <= 2; i++) {
            // Создание массива из трёх точек
            Points[i] = new Point3d();
            int num = i + 1;
            System.out.println("Введите координаты " + num + "-ой точки: ");
            Scanner input = new Scanner(System.in);
            String[] arr = input.nextLine().split(" ");
            Points[i].setX(Double.parseDouble(arr[0]));
            Points[i].setY(Double.parseDouble(arr[1]));
            Points[i].setZ(Double.parseDouble(arr[2]));
        }
        if (Point3d.checkPoints(Points[0], Points[1], Points[2])) { // если точки не равны
            System.out.printf("Площадь треугольника: " + "%.2f",computeArea(Points[0], Points[1], Points[2]));
        }
        else {
            System.out.println("Кажется точки равны, попробуйте ещё раз");
        }
    }
    public static double computeArea(Point3d p1, Point3d p2, Point3d p3) {
        //Возвращает площадь треугольника по формуле Герона
        double a = p1.distanceTo(p2); //Вычисление стороны a
        double b = p2.distanceTo(p3); //Вычисление стороны b
        double c = p3.distanceTo(p1); //Вычисление стороны c
        double polu_per = ((a+b+c)/2); //Вычисление периметра
        return (Math.sqrt(polu_per*(polu_per-a)*(polu_per-b)*(polu_per-c)));
    }
}