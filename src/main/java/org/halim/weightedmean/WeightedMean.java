/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.halim.weightedmean;

import java.util.*;
import java.text.DecimalFormat;

/**
 *
 * @author ABDELHALIM
 */
public class WeightedMean {

    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);
        int size = Integer.parseInt(scanner.nextLine().trim());
        String[] numbers = scanner.nextLine().split(" ");
        String[] weights = scanner.nextLine().split(" ");
        printResults(weightedMean(size,
                convertStringIntoInteger(size, numbers),
                convertStringIntoInteger(size, weights)));
    }

    private static int[] convertStringIntoInteger(int size, String[] array) {
        int[] temp = new int[size];
        for (int i = 0; i < size; i++) {
            temp[i] = Integer.parseInt(array[i]);
        }
        return temp;
    }

    private static double weightedMean(int size, int[] numbers, int[] weights) {
        double multiplicationSummation = 0.0;
        double weightsSummation = 0.0;
        for (int i = 0; i < size; i++) {
            multiplicationSummation += (numbers[i] * weights[i]);
            weightsSummation += weights[i];
        }

        return multiplicationSummation / weightsSummation;
    }

    private static void printResults(double result) {
        DecimalFormat formatter = new DecimalFormat(".#");
        System.out.println(formatter.format(result));
    }
}
