package JavaFunctionalProgram;

class Car{
    String name;

    //Default Constructor
    Car(){
        System.out.println("Default Constructor");
    }

    //Parameterized Constructor
    Car(String modelName){
        System.out.println("Parameterized Constructor");
        name=modelName;
        System.out.println(name);
    }
}

public class ConstructorExample1 {
    public static void main(String[] args) {
        Car myCar = new Car("Tata");
        
    }   

}
