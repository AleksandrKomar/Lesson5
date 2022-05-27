package hometask.task3;

public class LogicOperations {

    public static void main(String[] args) {

        int x = 5, y = 10, z = 15;

        x += y >> x++ * z;
        System.out.println("x = " + x);

        z = ++x & y * 5;
        System.out.println("z = " + z);

        y /= x + 5 | z;
        System.out.println("y = " + y);

        z = x++ & y * 5;
        System.out.println("z = " + z);

        x = y << x++ ^ z;
        System.out.println("x = " + x);

    }
}
