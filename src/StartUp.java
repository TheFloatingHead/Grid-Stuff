import java.util.ArrayList;
import java.util.Arrays;

public class StartUp {
    public static void main(String[] args) {
        grid g1 = new grid();
        ArrayList<ArrayList<Object>> dimensions = new ArrayList<>();

        ArrayList<Object> length = new ArrayList<>(Arrays.asList("B1", "C1", "D1", "E1")),
                width = new ArrayList<>(Arrays.asList("a1","b1","c1","d1","e1")),
                depth = new ArrayList<>();
        dimensions.add(0, length);
        dimensions.add(1, width);
        dimensions.add(2, depth);

        g1.setDimensions(dimensions);
        g1.printGrid();

    }
}