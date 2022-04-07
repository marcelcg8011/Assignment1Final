package com.company;

public class Randomizer {

        public int getRandomRange(int min, int max)
        {

        int range = max - min + 1;

        // generate random numbers within range of min and max

        return (int) (Math.random() * range) + min;
        }
    }

