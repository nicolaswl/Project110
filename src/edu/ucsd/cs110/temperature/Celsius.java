package edu.ucsd.cs110.temperature;
public class Celsius extends Temperature
{
    public Celsius(float t)
    {
        super(t);
    }

    @Override
    public Temperature toCelsius() {
        return new Celsius(super.getValue());
    }

    @Override
    public Temperature toFahrenheit() {
        float C = super.getValue();
        float F = ((C*9)/5) + 32;
        return new Fahrenheit(F);
    }

    public String toString()
    {
        return super.getValue() + " C";
    }
}