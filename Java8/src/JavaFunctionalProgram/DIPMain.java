package JavaFunctionalProgram;

/*
 * This is Example of DIP (Dependency Inversion Principle) : SOLID
 */

interface Database{
    void connect();
}

class Mysql  implements Database{
    public void connect(){
        System.out.println("This is MySQL...");
    }
}
class Oracle implements Database{
    public void connect(){
        System.out.println("This is Oracle...");
    }
}

class App{
    private Database db;
    
    App(Database db){
        this.db=db;
    }
    public void start(){
        db.connect();
    }
}

public class DIPMain {
    public static void main(String[] args) {
        Database db= new Mysql();
        App app= new App(db);
        app.start();
        
        /*
         * Using this we don't have to change Code Completely
         * Just Change the Instance to Access the Multiple Implementation
         */
         
        db=new Oracle();
        app=new App(db);
        app.start();
    }


}
