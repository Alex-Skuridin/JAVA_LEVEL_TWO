package ru.alex.java2.dz2;

import java.util.Random;

public class MainClass {


    public static void main(String[] args) {
        Random rnd = new Random();

        String[][] testArray = new String[4][4];
        for (int i = 0; i<testArray.length;i++){
            for (int j=0;j<testArray[i].length;j++){
                testArray[i][j] = Integer.toString(rnd.nextInt(100));
            }
        }

        try{
            int finalNumber = stringArrayTestException(testArray);
            System.out.println(finalNumber);

        } catch (MyArraySizeException e) {
            System.out.println("Неправильный размер массива");
        } catch (MyArrayDataException e) {
            System.out.println("Некорректное значение");
            System.out.println(e.getMessage());
        }


    }

    public static int stringArrayTestException(String[][] testArray) throws MyArraySizeException, MyArrayDataException {
        if (testArray.length != 4 | testArray[0].length != 4 | testArray[1].length != 4 | testArray[2].length != 4 | testArray[3].length != 4) {
            throw new MyArraySizeException();
        }
        String index = "";
        int summa = 0;
        for (int i = 0; i < testArray.length; i++) {
            for (int j = 0; j < testArray[i].length; j++) {
                try {
                    index = " " + i + " " + j;
                    summa += Integer.parseInt(testArray[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException("Array Exception Cell" + index);
                }
            }
        }

        return summa;


    }
}
