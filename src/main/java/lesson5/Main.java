package lesson5;

public class Main {
    private static final int size = 10000000;
    private static final int h = size / 2;

    public static void main(String[] args) throws InterruptedException {
        firstMethod();
        secondMethod();
    }

    private static void firstMethod() {
        float[] arr = new float[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 1f;
        }
        long a = System.currentTimeMillis();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (float) (arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
        long b = System.currentTimeMillis();
        System.out.println("start: " + a + " stop: " + b + " result: " + (b - a));
    }

    private static void secondMethod() throws InterruptedException {
        final float[] arr = new float[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 1f;
        }
        final float[] a1 = new float[h];
        final float[] a2 = new float[h];
        long copyStart = System.currentTimeMillis();
        System.arraycopy(arr, 0, a1, 0, h);
        System.arraycopy(arr, h, a2, 0, h);
        long copyEnd = System.currentTimeMillis();

        long mathStart = System.currentTimeMillis();
        MathClass secondValue = new MathClass(a1);
        MathClass thirdValue = new MathClass(a2);
        secondValue.start();
        thirdValue.start();
        secondValue.join();
        thirdValue.join();
        long mathEnd = System.currentTimeMillis();

        long glueStart = System.currentTimeMillis();
        System.arraycopy(a1, 0, arr, 0, h);
        System.arraycopy(a2, 0, arr, h, h);
        long glueEnd = System.currentTimeMillis();

        System.out.println("copy start: " + copyStart + " copy stop: " + copyEnd + " result: " + (copyEnd - copyStart));
        System.out.println("math start: " + mathStart + " math stop: " + mathEnd + " result: " + (mathEnd - mathStart));
        System.out.println("glue start: " + glueStart + " glue stop: " + glueEnd + " result: " + (glueEnd - glueStart));
    }
}
