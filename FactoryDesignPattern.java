import java.util.Scanner;

abstract class Game{
    void display(){
        System.out.println("Welcome to the game");
    }
    abstract void mode();
}
class Level1 extends Game{
    void mode(){
        System.out.println("Easy");
    }
    

}
class Level2 extends Game{
    void mode(){
        System.out.println("Hard");
    }

}
class Factory{
    public static Game getLevel(String str){
        if(str.equals("1")){
            return new Level1();
        }
        else if(str.equals("2")){
            return new Level2();
        }
        else{
            System.out.println("Enter correct level");
            return null;
        }
    }
}




public class FactoryDesignPattern {
    public static void main(String[] args) {
        System.out.println("Enter Game Level\n1.1\n2.2");
        Scanner sc=new Scanner(System.in);
        
        Game g=Factory.getLevel(sc.next());
        g.display();
        g.mode();
    
        
    }
    
}
