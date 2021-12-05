package practice;

public class HomeWork {

    public int[] arrayFirstElement(int[] a, int[] b){
        int[] newArray = {a[0], b[0]};

        return newArray;


    }

    public int[] arrayMiddle(int[] a) {
        int[] middleArray = new int [2];
        int halfArray = a.length/2;
        middleArray[0] = a[halfArray-1];
        middleArray[1] = a[halfArray];
        return middleArray;

    }

    public int summation(int[] a) {
        int sum = 0;
        for (int i = 0; i<a.length; i++)
            sum = sum + a[i];
        return  sum;
    }

    }


