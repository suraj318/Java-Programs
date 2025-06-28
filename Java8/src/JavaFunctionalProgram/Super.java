package JavaFunctionalProgram;

class Animal{
    String name="DOG";
    void bark(){
        System.out.println("Animal Bark");
    }
}

class Cat extends Animal{
    void meow(){
        super.bark();
        System.out.println(super.name);
        System.out.println("Meow");
    }
}

public class Super {
    public static void main(String[] args) {
        
        Cat cat=new Cat();
        cat.meow();
    }

}
