import java.util.*;

public class grid {
    //dimension maps
    private HashMap<Integer, Object> length;
    private HashMap<Integer, Object> width;
    private HashMap<Integer, Object> depth;

    //value corresponding to the setup (types) map
    private int classValue;

    //class value of the current grid
    private Class<?> classType;

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
    public grid(int selection){
        classValue = selection;

        //sets the class type to the selected type
        classType = types.get(selection);

        //initializes the dimensions
        length = new HashMap<>();
        width = new HashMap<>();
        depth = new HashMap<>();

        //adds the dimensions to the main dimension ArrayList
        dimensions = new ArrayList<>();
        dimensions.add(0, length);
        dimensions.add(1, width);
        dimensions.add(2, depth);

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
    public void setDimensions(ArrayList<Object[]> inputs){

        for (int i = 0; i< dimensions.size(); i++){                         //loops for the # of dimensions

            for (int k = 0; k<inputs.get(i).length; k++){                   //loops for the size of the specific dimension's input array
                dimensions.get(i).put(k, classType.cast(inputs.get(i)[k]));  //casts and adds each input dimensions value to the dimension's map
            }

        }

    }

    /**
     * Displays the grid in the terminal
     */
    public void printGrid(){
        System.out.print("   ");

        for (int i = 0; i< dimensions.get(0).size(); i++){
            System.out.print(dimensions.get(0).get(i)+"  ");
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


