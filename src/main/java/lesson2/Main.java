package lesson2;

public class Main {
    private static final int X = 4;
    private static final int Y = 4;

    public static void main(String[] args) throws MyArraySizeException {
        String correctMatrix[][] = {
                {"1", "2", "3", "4"}, {"1", "3", "2", "4"},
                {"4", "1", "3", "2"}, {"2", "1", "3", "4"}
        };
        String wrongSizeMatrix[][] = {
                {"11", "12", "13", "3"}, {"14", "15", "5", "17"},
                {"18", "19", "20", "21", "233"}
        };
        String wrongValueMatrix[][] = {
                {"11", "12", "13", "3"}, {"14", "15", "5", "17"},
                {"18", "19", "sddd", "21"}, {"18", "19", "20", "21"}
        };
        try {
            System.out.println("correct matrix result: " + checkMatrix(correctMatrix));
            //System.out.println("wrong size matrix result: " + checkMatrix(wrongSizeMatrix));
            System.out.println("wrong value matrix result: " + checkMatrix(wrongValueMatrix));
        } catch (MyArrayDataException e) {
            System.out.println(e.getInfo());
        } catch (MyArraySizeException e) {
            System.out.println(e.getInfo());
        }
    }

    private static int checkMatrix(String[][] matrix) throws MyArrayDataException, MyArraySizeException {
        int currentY= Y;
        int currentX = matrix.length;
        for (String[] aMatrix : matrix) {
            if (aMatrix.length != Y) {
                currentY = aMatrix.length;
                break;
            }
        }
        if (currentX != X || currentY != Y) {
            throw new MyArraySizeException(currentX, currentY, X, Y);
        }
        int x = 0;
        for (int i = 0; i < X; i++) {
            for (int j = 0; j < Y; j++) {
                try {
                    x = x + new Integer(String.valueOf(matrix[i][j]));
                } catch (NumberFormatException ex) {
                    throw new MyArrayDataException(matrix[i][j], i, j);
                }
            }
        }
        return x;
    }

}
