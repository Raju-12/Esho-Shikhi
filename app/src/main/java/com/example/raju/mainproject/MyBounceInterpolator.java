package com.example.raju.mainproject;

import android.view.animation.Interpolator;

/**
 * Created by Raju on 26-05-18.
 */

class MyBounceInterpolator implements Interpolator {


    private double mAmplitude = 1;
    private double mFrequency = 10;

    MyBounceInterpolator(double amplitude, double frequency) {
        mAmplitude = amplitude;
        mFrequency = frequency;
    }

    public float getInterpolation(float time) {
        return (float) (-1 * Math.pow(Math.E, -time/ mAmplitude) *
                Math.cos(mFrequency * time) + 1);
    }
}
