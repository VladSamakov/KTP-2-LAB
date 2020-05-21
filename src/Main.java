import java.util.Scanner;

public class Main {
    public static void main(String args[]) {

        // Ввод координат
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите координаты точек треугольника в трехмерном пространстве:");

        System.out.println("Координаты первой точки:");
        point3D first = new point3D(scanner.nextDouble(), scanner.nextDouble(), scanner.nextDouble());
        System.out.println("Введите координаты второй точки:");
        point3D second = new point3D(scanner.nextDouble(), scanner.nextDouble(), scanner.nextDouble());
        System.out.println("Введите координаты третьей точки:");
        point3D third = new point3D(scanner.nextDouble(), scanner.nextDouble(), scanner.nextDouble());

        System.out.print("Площадь: ");
        System.out.println(area(first, second, third));
    }

    public static double area(point3D first, point3D second, point3D third ) {

        // проверка отсутсвия совпадений координат точек
        double distance12 = first.distanceTo(second);
        double distance23 = second.distanceTo(third);
        double distance13 = first.distanceTo(third);

        if (distance12 == 0 || distance23 == 0 || distance13 == 0) {
            System.out.println("Треугольник с данными точками не существует.");
            return 0;
        }

        // вычисление площади
        double halfPerimeter = (distance12 + distance23 + distance13) / 2;

        double result = Math.sqrt(halfPerimeter * (halfPerimeter - distance12) * (halfPerimeter - distance23) *
                (halfPerimeter - distance13));

        return result;
    }
}
