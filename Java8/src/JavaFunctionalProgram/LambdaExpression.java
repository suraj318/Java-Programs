package JavaFunctionalProgram;

interface Greet{
    void SayHello();
}

public class LambdaExpression {

    public static void main(String[] args) {

        /* 
        Greet g= new Greet() {
            
            public void SayHello(){
                System.out.println("Hello");
            }
        };

        g.SayHello();
        */

        Greet g = ()->System.out.println("Hello from Lambda..");
        g.SayHello();
    }   

}
