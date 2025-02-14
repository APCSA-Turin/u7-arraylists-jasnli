package A_RAY_LIST_MET_IT_AND_CANDY_WRAPPERS;
import java.util.ArrayList;
import java.util.Arrays;

public class AnotherRunner {
    public static void main(String[] args) {
        // create an array with the known values
        Integer[] intsArray = {1, 2, 3, 4, 5};

        // use the Arrays.asList utility method to convert the array to a list "inline"
        ArrayList<Integer> intList = new ArrayList<Integer>(Arrays.asList(intsArray));
        System.out.println(intList);

        // CAR MAKING

        Car[] carsArray = {new Car("a", 0), new Car("b", 100), new Car("c", 1000)};
        ArrayList<Car> carsList = new ArrayList<Car>(Arrays.asList(carsArray));
        System.out.println(carsList);
    }
}
