package JavaFunctionalProgram;


class MissingNum{
    public static void num(int... nums){
        int n=nums.length;
        System.out.println("Length : "+n);
        int sum=n * (n+1)/2; // 10 * (10+1)/2
        System.out.println("Total : "+sum);

        for(int num : nums){
            sum -=num;
        }
        System.out.println(sum);

    }

}
public class FindMissingNumberFromArray {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,0,10};
        MissingNum.num(arr);
    }

}
