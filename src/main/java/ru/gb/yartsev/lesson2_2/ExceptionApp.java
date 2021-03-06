package ru.gb.yartsev.lesson2_2;

public class ExceptionApp {
    public static void main(String[] args) {
        
         String[][] right = {
                {"213", "23", "12", "45"},
                {"23", "545", "78", "21"},
                {"11", "44", "422", "44"},
                {"99", "78", "67", "156"}
        };

        String[][] wrongFirst = {
                {"313", "23", "12", "45"},
                {"23", "745", "78", "54"},
                {"11", "44", "822"},
                {"99", "78", "67", "256"}
        };

        String[][] wrongSecond = {
                {"13", "23", "12", "45"},
                {"23", "45", "78", "21"},
                {"11", "44", "22", "44"}
        };

        String[][] wrongThird = {
                {"13", "23", "12", "45"},
                {"45", "45", "78", "21"},
                {"11", "df", "22", "44"},
                {"99", "78", "hj", "56"}
        };
         
        MyTestException test = new MyTestException(right);
        MyTestException test1 = new MyTestException(wrongFirst);
        MyTestException test2 = new MyTestException(wrongSecond);
        MyTestException test3 = new MyTestException(wrongThird);
        
        try {
            test.testException();
            //test1.testException();
            //test2.testException();
            test3.testException();
        } catch (MyArraySizeException ex) {
            ex.printStackTrace();
        } catch (MyArrayDataException ex) {
            ex.printStackTrace(); 
        }
        
    }
}
