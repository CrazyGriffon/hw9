package org.example;


import lombok.SneakyThrows;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.Scanner;

public class HomeWork {

    /**
     * <h1>Задание 1.</h1>
     * Решить задачу UPIT из файла contest7_tasks.pdf
     */
    @SneakyThrows
    public void upit(InputStream in, OutputStream out) {
        Scanner scanner = new Scanner(in);
        int n = scanner.nextInt();
        int q = scanner.nextInt();
        Treap treap = new Treap();

        for (int i = 0; i < n; ++i) {
            treap.add(scanner.nextInt());
        }
        for (int i = 0; i < q; ++i) {
            int operation = scanner.nextInt();
            int A, B, C, X;
            switch (operation) {
                case 1:
                    A = scanner.nextInt() - 1;
                    B = scanner.nextInt();
                    X = scanner.nextInt();
                    treap.case1(A, B, X);
                    break;
                case 2:
                    A = scanner.nextInt() - 1;
                    B = scanner.nextInt();
                    X = scanner.nextInt();
                    treap.case2(A, B, X);
                    break;
                case 3:
                    C = scanner.nextInt() - 1;
                    X = scanner.nextInt();
                    treap.add(C, X);
                    break;
                case 4:
                    A = scanner.nextInt() - 1;
                    B = scanner.nextInt();
                    Treap.Node node = treap.getStats(A, B);
                    long sum = node.statistic.sumValue;
                    out.write(String.valueOf(sum).getBytes());
                    out.write("\r\n".getBytes());
            }
        }
    }
}
