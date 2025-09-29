import java.util.*;

public class grid {
    private final HashMap<Integer, Object> length = new HashMap<>();
    private final HashMap<Integer, Object> width = new HashMap<>();
    private final HashMap<Integer, Object> depth = new HashMap<>();

    //value corresponding to the setup (types) map
    private final int classValue;

    //class value of the current grid
    private final Class<?> classType;

    //contains all dimensions
    private ArrayList<HashMap<Integer, Object>> dimensions;

    //setup map of all possible grid class types
    final Map<Integer, Class<?>> types = Map.of(
            0, Integer.class,
            1, Float.class,
            2, String.class
    );

    /**
     * Default constructor for Grid class.
     */
    public grid(){
        this.classType = String.class;
        this.classValue = 2;
        
    }

    /**
     * Constructor for Grid Class.
     *
     * @param selection Integer containing a value corresponding
     *                  to the selected class type of the Grid
     */
    public grid(int selection, ArrayList<ArrayList<Object>> dimensionsIn){
        classValue = selection;

        //sets the class type to the selected type
        classType = types.get(selection);

        //adds the dimensions to the main dimension ArrayList
        dimensions = new ArrayList<>();
        dimensions.add(0, length);
        dimensions.add(1, width);
        dimensions.add(2, depth);

        //sets the dimensions

        setDimensions(dimensionsIn);
    }

    /**
     * Getter for the class type
     *
     * @return Class<?> containing the class type of the grid
     */
    public Class<?> getClassType(){
        return classType;
    }

    /**
     * Getter for the class type value
     *
     * @return Integer containing the value corresponding to
     * the class type of the grid
     */
    public int getClassValue(){
        return classValue;
    }

    /**
     * Sets the dimensions of the grid to the inputted values
     *
     * @param inputs ArrayList of Object lists
     */
    public void setDimensions(ArrayList<ArrayList<Object>> inputs){

        for (int i = 0; i< dimensions.size(); i++){                         //loops for the # of dimensions

            for (int k = 0; k<inputs.get(i).size(); k++){                   //loops for the size of the specific dimension's input array
                dimensions.get(i).put(k, classType.cast(inputs.get(i).get(k)));  //casts and adds each input dimensions value to the dimension's map
            }

        }

    }

    /**
     * Displays the grid in the terminal
     */
    public void printGrid(){
        System.out.print("   ");

        for (int i = 0; i< dimensions.get(0).size(); i++){
            System.out.print(dimensions.getFirst().get(i)+"  ");
        }

        System.out.println();

        for (int i = 0; i< dimensions.get(1).size(); i++){
            System.out.print(dimensions.get(1).get(i));
            for (int k = 0; k<dimensions.get(0).size(); k++){
                System.out.print(" x  ");
            }
            System.out.println();
        }
    }



}


