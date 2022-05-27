package hometask.task6;

public class DeMorganComparison {
    public static void main(String[] args) {

        //преобразуйте исходное выражение A | B, в эквивалентное выражение
        //используя теорему Де Моргана

        //нужно инвертировать оба операнда, заменить (AND на OR) или (OR на AND)
        //и инвертировать все выражение полностью.

        boolean a = true;
        boolean b = false;

        //оригинал
        boolean c = a | b;
        System.out.println(c);

        //преобразованное
        boolean d = !(!a & !b);
        System.out.println(d);


    }

}
