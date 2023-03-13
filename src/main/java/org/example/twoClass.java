package org.example;

public class twoClass implements FirstInterface
{
    private double[] arrayOne = new double[0];
    private int number = 11;
    private String[] wordVal = new String[]{"ПГУТИ"};
    public twoClass(double[] arrayOne)
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
