package org.example;

import java.lang.Math;

public class BmiService {

    public double calculate(double weight, double height) {

        double bmiValue = weight / Math.pow(height / 100, 2);
        double scale = Math.pow(10, 2);
        double bmiResult = Math.round(bmiValue * scale) / scale;
        return bmiResult;
    }
}
