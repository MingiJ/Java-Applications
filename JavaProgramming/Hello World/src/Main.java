import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        int[] array = new int[length];
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        int t = array[array.length - 1];
        for (int i = 0; i < array.length; i++) {
            int n = array[i];
            array[i] = t;
            t = n;
        }

        for (int i : array) {
            System.out.print(i + " ");
        }
    }
}