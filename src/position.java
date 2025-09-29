import java.util.*;

public class position {
    private final List<Object> coordinates;

    private grid grid;



    public position(){
        coordinates = new ArrayList<>();

    }

    public position(Object[] list){
        coordinates = new ArrayList<>();
        for (Object item: list){
            coordinates.add(grid.getClassType().cast(item));
        }

    }

    public void help(){
        int lineNumber = 1;
        int counter = 1;
        System.out.println("***************************\n\tInput Options\n");


    }


}
