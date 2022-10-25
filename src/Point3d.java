public class Point3d extends Point2d {
    private double zCoord;
    public Point3d(double x, double y, double z) {
        // Создание нового объекта с заданными параметрами
        setX(x);
        setY(y);
        zCoord = z;
    }
    public  Point3d() {
        this(0, 0, 0);
    }
    public double getZ() { // получить z
        return zCoord;
    }
    public void setZ(double val) { // установить z
        zCoord = val;
    }
    public static boolean checkPoints(Point3d p1, Point3d p2, Point3d p3) {
        //Проверка на равность точек
        return ((p1.getX() != p2.getX()) || (p1.getY() != p2.getY()) || (p1.getZ() != p2.getZ())) &&
                ((p2.getX() != p3.getX()) || (p2.getY() != p3.getY()) || (p2.getZ() != p3.getZ())) &&
                ((p1.getX() != p3.getX()) || (p1.getY() != p3.getY()) || (p1.getZ() != p3.getZ()));
    }
    public double distanceTo(Point3d other_point) {
        // вычисление расстояния м/у 2мя точками
        double x1 = this.getX() - other_point.getY();
        double y1 = this.getY() - other_point.getY();
        double z1 = this.getZ() - other_point.getZ();
        return Math.sqrt(x1*x1 + y1*y1 + z1*z1);
    }
}