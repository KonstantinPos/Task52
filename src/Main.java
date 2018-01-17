public class Main {
    public static void main(String[] args) {
        int arr[] = new int[20];
        int a = 15;
        int b = 10;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = mas(a, b);
            System.out.print(arr[i] + " ");
        }
    }

    static int mas(int q, int w) {
        int e = (int) (Math.random() * (w - q)) + q;
        return e;
    }
}