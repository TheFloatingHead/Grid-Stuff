import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        grid g1 = new grid(2);
        ArrayList<Object[]> dimensions = new ArrayList<>();

        Object[] length = {"A1","B1","C1","D1","E1"}, width = {"a1","b1","c1","d1","e1"}, depth = {};
        dimensions.add(0, length);
        dimensions.add(1, width);
        dimensions.add(2, depth);

        g1.setDimensions(dimensions);
        g1.printGrid();

    }
}