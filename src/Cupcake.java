import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Cupcake {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        Integer[] calories = new Integer[n];
        
        for (int i = 0; i < n; i++) {
            calories[i] = sc.nextInt();
        }
        
        Arrays.sort(calories, Collections.reverseOrder());
        
        long miles = 0;
        for (int i = 0; i < n; i++) {
            miles += (long) Math.pow(2, i) * calories[i];
        }
        
        System.out.println(miles);
        
        sc.close();
    }
}