package org.example;

public class FirstClass implements FirstInterface{
    private double[] arrayOne = new double[0];
    private int number = 12;
    public FirstClass(double[] arrayOne)
    {
        this.arrayOne= arrayOne;
    }

    @Override
    public double prodNumberAll() {
        double prodValue = 1;
        for (int a = 0; a < arrayOne.length; a++) {
            prodValue *= arrayOne[a];
        }
        return prodValue;
    }

    @Override
    public void tostring() {

    }

    @Override
    public void equals() {

    }

    @Override
    public void HashCode() {

    }
}
