package PlayGround;

import org.testng.annotations.Test;
import parameters.DataProviderClass;
//if we want to use the data provider in another package.
public class ExecuteTests {
    @Test(dataProvider ="MultipleValues", dataProviderClass = DataProviderClass.class)
    public void run(String name, String state, int zipcode) {
        System.out.println("[Multiple column value] Name is: "  + name);
        System.out.println("[Multiple column value] State is: "  + state);
        System.out.println("[Multiple column value] Zipcode is: "  + zipcode);
    }
}
