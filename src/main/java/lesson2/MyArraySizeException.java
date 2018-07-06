package lesson2;

public class MyArraySizeException extends Throwable {

    private String info;

    public MyArraySizeException(int currentX, int currentY, int x, int y) {
        this.info = "There is not correct array size: " + "[" + currentX +
                "]" + "[" + currentY + "]" + " instead of: " + "[" + x +
                "]" + "[" + y + "]";
    }

    public String getInfo() {
        return info;
    }
}
