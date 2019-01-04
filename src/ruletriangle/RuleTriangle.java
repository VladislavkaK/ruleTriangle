package ruletriangle;

import java.io.*;

public class RuleTriangle {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String sA = br.readLine();
        String sB = br.readLine();
        String sC = br.readLine();
        int a = Integer.parseInt(sA);
        int b = Integer.parseInt(sB);
        int c = Integer.parseInt(sC);

        if ((a + b) > c && (a + c) > b && (b + c) > a) {
            System.out.println("Треугольник существует.");
        } else {
            System.out.println("Треугольник не существует.");
        }
    }
}
