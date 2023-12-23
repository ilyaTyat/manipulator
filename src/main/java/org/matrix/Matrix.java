package org.matrix;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@AllArgsConstructor
@Slf4j
public class Matrix {

    private double[][] matrix;

    public double[][] transpose(double[][] matrix) {
        this.matrix = matrix;
        for (int i = 0; i < matrix.length; i++)
            for (int j = 0; j < matrix[0].length; j++)
                matrix[i][j] = matrix[j][i];
        return matrix;
    }
    public double[][] subtraction(double[][] minuend, double[][] deductible) {
        matrix = new double[minuend.length][minuend[0].length];
        for (int i = 0; i < minuend.length; i++)
            for (int j = 0; j < minuend[0].length; j++)
                matrix[i][j] = minuend[i][j] - deductible[i][j];
        return matrix;
    }

    public double[][] addition(double[][] firstSummand, double[][] secondSummand) {
        matrix = new double[firstSummand.length][firstSummand[0].length];
        for (int i = 0; i < firstSummand.length; i++)
            for (int j = 0; j < firstSummand[0].length; j++)
                matrix[i][j] = firstSummand[i][j] + secondSummand[i][j];
        return matrix;
    }

    public double[][] multiplication(double[][] first, double[][] second) {
        matrix = new double[first.length][second[0].length];
        if (first.length == second[0].length) {
            for (int i = 0; i < second[0].length; i++)
                for (int j = 0; j < first.length; j++) {
                    double sum = 0.0;
                    for (int z = 0; z < first.length; z++)
                        sum += first[j][z]*second[z][j];
                    matrix[i][j] = sum;
                }
        } else  {
            System.out.println("Матрицы не могут быть умножены, количество столбцов первой матрицы не совпадает с количество строк второй");
        }
        return matrix;
    }

    public double determinant(double[][] matrix) {
        double determinant = 0;
        for (int i = 0; i < matrix[0].length; i++) {
            double factor = 1;
            for (int j = 0; j < matrix.length; j++) {
                if (i != j) {
                    factor *= matrix[i][j];
                } else {
                    factor = 1;
                }
                determinant += factor * Math.pow(-1, i + j + 1);
            }
        }
        return determinant;
    }
}
