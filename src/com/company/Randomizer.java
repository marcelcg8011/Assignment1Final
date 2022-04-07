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

        public String getRandomPalmerston()
        {
                int min = 1;
                int max = 4;
                int range = max - min + 1;
                int picker;

                // generate random numbers within range of min and max

                picker = (int) (Math.random() * range) + min;

//                1105236 Amy Sheffield PN
//                1235894 Victoria Jensen PN
//                7225669 James Lee PN
//                1328991 Colin Delmont PN

                if (picker == 1) {
                        return "Amy Sheffield";
                }
                if (picker == 2) {
                        return "Victoria Jensen";
                }
                if (picker == 3) {
                        return "James Lee";
                }
                if (picker == 4) {
                        return "Colin Delmont";
                }
                else return "Randomizer failed";
        }

        public String getRandomDistance()
        {
                int min = 1;
                int max = 8;
                int range = max - min + 1;
                int picker;


                picker = (int) (Math.random() * range) + min;

                String name = switch (picker) {
                        case 1 -> "Thomas Becker";
                        case 2 -> "Steven Hobbs";
                        case 3 -> "Andrew Jackson";
                        case 4 -> "Jonathon Wood";
                        case 5 -> "Marcel Cantin-Gilmore";
                        case 6 -> "Victoria Jensen";
                        case 7 -> "James Lee";
                        case 8 -> "Colin Delmont";
                        default -> " ";
                };
                return name;
        }
    }

