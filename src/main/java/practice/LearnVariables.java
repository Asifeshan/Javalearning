package practice;

public class LearnVariables {
    public void intVariables(){
        int adamsalary = 1000;
        int tomsalary = 2000;
        int mysalary = 3000;
        System.out.println("my salary is: " + mysalary);
        System.out.println("adam salary is: " + adamsalary);
        System.out.println("tom salary is: " + tomsalary);
    }

    public void floatVariables() {
        float price = 45.6f;
        System.out.println("product price is: " + price);
    }

    public void booleanVariables() {
        boolean red = true;
        boolean green = false;
        System.out.println(" Red light is: "+ red + " green light is: " + green);
    }

    public void charecterVariables() {
        char alphabet = 'A';
        System.out.println("Alphabet is: "+ alphabet);
    }

    public void stringVariables() {
        String name = "robin";
        String city = "philadelphia";
        System.out.println("my name is: " + name + "I live in: " + city);

    }

    public int AddNumbers(int a, int b) {

        int sunny  = a + b;
        return sunny;
    }


    }

