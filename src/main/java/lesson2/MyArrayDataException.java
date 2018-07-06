package lesson2;

public class MyArrayDataException extends Throwable {

    private int i = 0;
    private int j = 0;
    private String value = "";

    public MyArrayDataException(String value, int i, int j) {
        this.i = i;
        this.j = j;
        this.value = value;
    }

    public String getInfo() {
        return "The is not correct value: " + "'" + this.value + "'" + " in matrix with coordinate: "
                + "[" + this.i + "]" + "[" + this.j + "]";
    }

}
