package ru.vsu.cs.ostroverkhov;

import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
      double n = readNumbers('N');
      double k = readNumbers('K');

      double sum = sumOfNumber(n, k);

      showResult(sum);

    }

    public static double sumOfNumber (double n, double k)
    {
     double sum = 0;
     for (int i = 1; i <= n; i++)
     {
         sum+= Math.pow(i, k);
     }
     return sum;
    }

    public static double readNumbers(char name)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Enter the number %s: ", name);
        return scanner.nextDouble();
    }

    public static void showResult(double sum)
    {
        System.out.println("Sum = " + sum);
    }
}
