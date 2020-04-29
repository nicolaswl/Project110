package edu.ucsd.cs110.temperature;
public class Fahrenheit extends Temperature
{
    public Fahrenheit(float t)
    {
        super(t);
    }

    @Override
    public Temperature toCelsius() {
        float F = super.getValue();
        float C = ((F - 32) * 5)/9;
        return new Celsius(C);
    }

    @Override
    public Temperature toFahrenheit() {
        return new Fahrenheit(super.getValue());
    }

    public String toString()
    {
        return super.getValue() + " F";
    }
}