package com.company;

public class Randomizer {


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

                String name = switch (picker) {
                        case 1 -> "Thomas Becker";
                        case 2 -> "Steven Hobbs";
                        case 3 -> "Andrew Jackson";
                        case 4 -> "Jonathon Wood";
                        case 5 -> "Marcel Cantin-Gilmore";
                        default -> " ";
                };
                return name;
        }

        public String getRandomPalmerston()
        {
                int min = 6;
                int max = 9;
                int range = max - min + 1;
                int picker;


                picker = (int) (Math.random() * range) + min;


                String name = switch (picker) {
                        case 6 -> "Amy Sheffield";
                        case 7 -> "Victoria Jensen";
                        case 8 -> "James Lee";
                        case 9 -> "Colin Delmont";
                        default -> " ";
                };
                return name;
        }

        public String getRandomDistance()
        {
                int min = 1;
                int max = 9;
                int range = max - min + 1;
                int picker;


                picker = (int) (Math.random() * range) + min;

                String name = switch (picker) {
                        case 1 -> "Thomas Becker";
                        case 2 -> "Steven Hobbs";
                        case 3 -> "Andrew Jackson";
                        case 4 -> "Jonathon Wood";
                        case 5 -> "Marcel Cantin-Gilmore";
                        case 6 -> "Amy Sheffield";
                        case 7 -> "Victoria Jensen";
                        case 8 -> "James Lee";
                        case 9 -> "Colin Delmont";
                        default -> " ";
                };
                return name;
        }
    }

