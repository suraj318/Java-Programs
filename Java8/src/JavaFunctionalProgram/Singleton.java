package JavaFunctionalProgram;

class Singleton {
    private static Singleton instance;

    private Singleton(){
        System.out.println("Singleton Constructor");
    }

    public static Singleton getInstance(){
        if(instance==null){
            instance=new Singleton();
        }
        return instance;
    }

    public void getMsg(){
        System.out.println("Hello from getMsg");
    }

    public static void main(String[] args) {
        Singleton obj1=getInstance();
        obj1.getMsg();

        Singleton obj2=getInstance();
        obj2.getMsg();

        System.out.println(obj1==obj2);
        System.out.println(obj1.equals(obj2));
    }

}
