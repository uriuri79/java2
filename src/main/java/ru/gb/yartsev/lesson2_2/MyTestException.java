package ru.gb.yartsev.lesson2_2;

public class MyTestException {
    private String[][] myArray;
    private int sum = 0;

    public MyTestException(String[][] myArray) {
        this.myArray = myArray;
    }

    public void testException() throws MyArraySizeException, MyArrayDataException {
        if (myArray.length != 4) throw new MyArraySizeException("Количество строк не соответствует заданию");
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i].length != 4) {
                throw new MyArraySizeException("Количество элементов в строке " + i + " не соответствует заданию");
            }
            for (int j = 0; j < myArray[i].length; j++) {
              sum += myNumber(myArray[i][j], i, j);
            }
        }
        System.out.println("Сумма всех элементов массива равна " + sum);
    }

    private int myNumber(String str, int i, int j) throws MyArrayDataException {
        try {
            int myNumber = Integer.parseInt(str);
            return myNumber;
        } catch (NumberFormatException e) {
            throw new MyArrayDataException("Элемент массива [" + i +"][" + j + "] не является числом");
        }
    }
}
