package Chapter_01;


/*
    (Algebra: solve 2 * 2 linear equations)
    You can use Cramer’s rule to solve the following 2 * 2 system of linear equation:
    ax + by = e
    cx + dy = f
    x = (ed - bf)/(ad - bc)
    y = (af - ec)/(ad - bc)
    Write a program that solves the following equation and displays the value for x and y:
    3.4x + 50.2y = 44.5
    2.1x + 0.55y = 5.9
 */

public class Exercise_13 {

    public static void main(String[] args) {

        double a = 3.4;
        double b = 50.2;
        double c = 2.1;
        double d = 0.55;
        double e = 44.5;
        double f = 5.9;
        double x = ((e * d) - (b * f)) / ((a * d) - (b * c));
        double y = ((a * f) - (e * c)) / ((a * d) - (b * c));

        System.out.println("x = " + x);
        System.out.println("y = " + y);

        System.out.println((3.4 * x) + (50.2 * y));
        System.out.println((2.1 * x) + (0.55 * y));
    }
}