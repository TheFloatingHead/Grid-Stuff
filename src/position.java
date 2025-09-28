import java.util.*;

public class position {
    private List<Object> coordinates;

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

    private void setArrayN(Object length, Object width, Object depth){

    }

    public void help(){
        int lineNumber = 1;
        int counter = 1;
        System.out.println("***************************\n\tInput Options\n");


    }


}
