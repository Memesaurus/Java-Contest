package Taskone.src;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int array[] = new int[n];

        array[0] = scanner.nextInt();
        int minElement = array[0];
        int maxElement = array[0];

        for (int i = 1; i < n; i++) {
            array[i] = scanner.nextInt();
            if (maxElement <= array[i]) {
                maxElement = array[i];
            } else {
                System.out.println("-1");
                return;
            }
        }

        System.out.println(maxElement - minElement);
    }
}
