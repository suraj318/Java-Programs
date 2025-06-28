package JavaFunctionalProgram;

interface Operation{
    int Operate(int a,int b);
}

public class LambdaExpression2 {

    public static void main(String[] args) {
        Operation addition = (a,b) -> a+b;
        System.out.println(addition.Operate(2,3));


        Operation mul= (a,b)-> a*b;
        System.out.println(mul.Operate(2, 4));

        Operation aa;
        aa= (a,b) -> a/b;
        System.out.println(aa.Operate(20,2)); 

        aa=(a,b)-> a-b;
        System.out.println(aa.Operate(23, 5));

        aa=(a, b) -> Math.max(a, b);
        System.out.println(aa.Operate(1,2));



    }

}
