package com.company;

public class Randomizer {

        public int getRandomRange(int min, int max)
        {

        int range = max - min + 1;

        // generate random numbers within range of min and max

        return (int) (Math.random() * range) + min;
        }

        public String getRandomAuckland()
        {
                int min = 1;
                int max = 5;
                int range = max - min + 1;
                int picker;

                // generate random numbers within range of min and max

                picker = (int) (Math.random() * range) + min;

//                1562347 Thomas Becker Auckland
//                5664789 Steven Hobbs Auckland
//                3658947 Andrew Jackson Auckland
//                6332698 Jonathon Wood Auckland
//                12345678 Mickey Mouse Auckland

                if (picker == 1) {
                        return "Thomas Becker";
                }
                if (picker == 2) {
                        return "Steven Hobbs";
                }
                if (picker == 3) {
                        return "Andrew Jackson";
                }
                if (picker == 4) {
                        return "Jonathon Wood";
                }
                if (picker == 5) {
                        return "Marcel Cantin-Gilmore";
                }
                else return "Randomizer failed";
        }
    }

