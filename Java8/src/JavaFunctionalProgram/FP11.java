package JavaFunctionalProgram;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class FP11 {
    public static void main(String[] args) {
        List<Integer> num = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        double sum= num.stream().mapToDouble(a->a).sum();
        System.out.println(sum);

         OptionalDouble avg =num.stream().mapToDouble(a->a).average();
         System.out.println(avg);
        double sum1=0;
         for (int i:num) {

            sum1+=i;
         }
         System.out.println(sum1/num.size());

    }
}
