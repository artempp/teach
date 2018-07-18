package lesson5;

public class MathClass extends Thread {

    private float arr[];

    public MathClass(float arr[]){
        this.arr = arr;
    }

    public void run(){
        mathArray(this.arr);
    }

    private void mathArray(float[] arr){
        for (int i = 0; i <  arr.length; i++) {
            arr[i] = (float)(arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
    }
}
