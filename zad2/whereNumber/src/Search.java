
public class Search {

    private boolean search(int[] numbers, int x) {

        boolean found = false;

        int i;
        for (i = 0; i < numbers.length; i++) {
            if (x == numbers[i]) {
                found = true;
                break;
            }
        }
        if (found)
        {
            System.out.println("TRUE");
        }else {
            System.out.println("FALSE");
        }
        return found;

    }
}
