package sample;

import javafx.scene.control.Label;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Zeidel {
    public static float[][] zeidep(float[][] B, float[] c, int n, float[] x0, float exp) {
        float[] y = new float[n];
        float[] x = new float[n];
        float[][] rez = new float[100][n];
        for (int i = 0; i < x0.length; i++) {
            y[i] = x0[i];
            x[i] = 0;
        }
        boolean check = true;
        int k = 0;
        double t = 1;
        float sum = 0;
        while (t > exp && k < 100) {

            for (int i = 0; i < n; i++) {

                sum = 0;

                for (int j = 0; j < n; j++) {
                    sum = (sum + (B[i][j]) * x[j]);
                }
                x0[i] = y[i] + sum;
                if (Math.abs(x[i] - x0[i]) > t) {
                    t = Math.abs(x[i] - x0[i]);

                }

            }
            for (int i = 0; i < n; i++) {
                rez[k][i] = x0[i];
                x[i] = x0[i];
            }
            k = k + 1;

        }
        float[][] final_rez = new float[k][n];
        System.arraycopy(rez, 0, final_rez, 0, k);
        return final_rez;
    }


    public static String start(float[][] A, float[] b, int n, float exp) {
        String txt = "";
        float[][] B = new float[n][n];// матрица в виде для итераций(превращение матрицы по маткаду,проблемы -> смотри маткад)
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                if (i == j) {
                    B[i][j] = 0;
                } else {
                    B[i][j] = ((-1) * A[i][j]) / A[i][i];
                }
            }
        }
        System.out.print("\n");

        Double[] s = new Double[n];
        double sum = 0.0;
        float[] x0 = new float[n];// массив начальных приближений(также по маткаду)
        //цикл проверки условия сходимости Зейделя
        for (int i = 0; i < n; i++) {
            x0[i] = b[i] / A[i][i];// решили задавать массив приближений нулями, по умолчанию, для ввода массива приближений вносить изменения здесь(во время интеграции)
            for (int j = 0; j < n; j++) {
                sum += Math.abs(B[i][j]);
            }

            s[i] = sum;
            sum = 0;
        }

        Arrays.sort(s, Collections.reverseOrder());
        System.out.println(s[0]);
        if (s[0] > 1) {
           return "The convergence condition isn`t satisfied";
        } else {
            int k = 10;

            float[][] y = zeidep(B, b, n, x0, exp);
            for (int i = 0; i < y.length; i++) {
                for (int j = 0; j < n; j++) {
                    //System.out.println(y[i][j] + " ");
                    txt += y[i][j] + "\n";
                }
                //System.out.println("\n");
                if (y[i][0] == y[i + 1][0]) {
                    break;
                }
            }
        }
        return  txt;
    }

}
