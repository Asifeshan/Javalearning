package parameters;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderClass {

    @DataProvider(name = "SingleValue")
    public Object[][] storeSingleValue() {
        return new Object[][] {
                {"Rifat"},
                {"Mohammad"},
                {"Ashraf"}
        };
    }
    @DataProvider(name = "MultipleValues")
    public Object[][] storeMultipleValues() {
        return new Object[][] {
                {"Rifat", "Florida", 33018},
                {"Mohammad", "New York", 12456},
                {"Ashraf", "Texas", 45789}
        };
    }

    @DataProvider(name = "RealAprRates")
    public Object[][] storeRealAprRatesData() {
        return new Object[][] {
                {"200000", "15000", "3", "3.130%"}

        };
    }
   // @Test(dataProvider = "SingleValue")
    public void readSingleValue(String name) {
        System.out.println("[Single column value] Name is: "  + name);
    }

    //@Test(dataProvider = "MultipleValues")
    public void readMultipleValues(String name, String state, int zipcode) {
        System.out.println("[Multiple column value] Name is: "  + name);
        System.out.println("[Multiple column value] State is: "  + state);
        System.out.println("[Multiple column value] Zipcode is: "  + zipcode);
    }
}


//When we try to store data in testng dataProvider the method return type will object
// two-dimensional array
// when only me or my team technical people using the code then I can only depend on this data Provider
// If external people is trying the code then we need to depend on sql or sheet.
// we can have as many data provider as we want here.
// So if we want to use the data provider in another package please see the playground Execute class.