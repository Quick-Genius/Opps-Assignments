
import java.util.*;

class Animal{
     String name;
     String color;
    
    Animal(String name, String color){
        this.name = name;
        this.color = color;
    }
    
    public void printDetails(){
        System.out.println( name+ " is a " + color);
    }
    
}

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        
        
        Animal a1 = new Animal(a,b);
        a1.printDetails();
        
    }
}