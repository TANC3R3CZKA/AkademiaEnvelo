import java.lang.reflect.Method;
import java.util.Arrays;


public class Main {
    public static void main(String[] args) throws Exception {

        int[] numbers = {7, -2, -74, 99, 3, 721, -13, 9, -111, 16};

        System.out.println();
        System.out.println("Array:");

        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();
        System.out.println();

        Arrays.sort(numbers);

        for (int i = 0, j = numbers.length - 1, tmp; i < j; i++, j--) {
            tmp = numbers[i];
            numbers[i] = numbers[j];
            numbers[j] = tmp;
        }

        System.out.println("Descending sorted array:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();
        System.out.println();

        Class<?> c = Class.forName("Search");
        Object o= c.getDeclaredConstructor().newInstance();
        Method m =c.getDeclaredMethod("search", int[].class, int.class);
        m.setAccessible(true);

        m.invoke(o, numbers,15);

    }
}
