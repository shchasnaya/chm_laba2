package sample;

//import org.omg.CORBA.Environment;

import com.sun.deploy.Environment;

import java.io.PrintWriter;
import java.util.Locale;
import java.util.Scanner;

public class SimpleIteration {
    public static String iteration(float[][] matrix, float eps, int size)
    {
        String txt= "";
        float[] previousVariableValues = new float[size];
        for (int i = 0; i < size; i++) {
            previousVariableValues[i] = 0f;
        }
        // Будем выполнять итерационный процесс до тех пор,
        // пока не будет достигнута необходимая точность
        while (true) {
            // Введем вектор значений неизвестных на текущем шаге
            float[] currentVariableValues = new float[size];
            // Посчитаем значения неизвестных на текущей итерации
            // в соответствии с теоретическими формулами
            for (int i = 0; i < size; i++) {
                // Инициализируем i-ую неизвестную значением
                // свободного члена i-ой строки матрицы
                currentVariableValues[i] = matrix[i][size];
                // Вычитаем сумму по всем отличным от i-ой неизвестным
                for (int j = 0; j < size; j++) {
                    if (i != j) {
                        currentVariableValues[i] -= matrix[i][j] * previousVariableValues[j];
                    }
                }
                // Делим на коэффициент при i-ой неизвестной
                currentVariableValues[i] /= matrix[i][i];
            }
            // Посчитаем текущую погрешность относительно предыдущей итерации
            float error = 0f;
            for (int i = 0; i < size; i++) {
                error += Math.abs(currentVariableValues[i] - previousVariableValues[i]);
            }
            // Если необходимая точность достигнута, то завершаем процесс
            if (error < eps) {
                break;
            }
            // Переходим к следующей итерации, так
            // что текущие значения неизвестных
            // становятся значениями на предыдущей итерации
            previousVariableValues = currentVariableValues;
        }
        // Выводим найденные значения неизвестных
        for (int i = 0; i < size; i++) {
            txt += (float)Math.round(previousVariableValues[i]*10f)/10f + "\n";
        }
        return txt;
    }
}
