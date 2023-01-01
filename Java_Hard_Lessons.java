/*

Concepts to be learned

1. main args array contains nothing unless some args are provided while running java .class. [args]
2. Exceptions class throwing exception in try catch and finally, inside a method
3. inheritance, extends, implements, abstract extension
4. final static method works
5. SQL statement query result format
6. main class name works
7. If there are two different classes, each with their own main methods, then either one can be run after choosing the class file to run after compilation, but the CLASS with NAME of file should have higher access specifier 
8. null comaprator
9. copyOnWrite method
10. System.console
*/
import java.io.Console;
import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.logging.ConsoleHandler;
import java.util.stream.*;

class Java_Hard_Lessons{
    public final static void main(String[] args){
        System.out.println("inside jhl \n"+args.length);
        int []arr = {1,5,6,4,6,8,3,2,545,8,8};
        //Arrays.sort(arr, null); //doesn't work
        List<Integer> li = new ArrayList();
        li.add(2);
        li.add(1);
        li.add(3);
        //List<Integer> nli = CopyOnWriteArrayList(li);
        System.out.println(li);
        Console iConsole = System.console(); //read more
        System.out.println(iConsole.toString());
    }
}
 
class differentClass{
    public static void main(String []args){
        System.out.println("inside dc");
    }
}
class main extends differentClass{

    /*public static void main(String[] args){
        System.out.println("inside main class");
    }*/ 
    /* On commenting the main method after extending differentClass, the main method of diffClass is called. If not commented, then main method is overwritten 
    */
}

abstract class Animals{
    void sound(){
        System.out.println("Animal sounds");
    }
}
interface Fauna{
    void makeSound();
}
interface Flora{
    void comm();
}
class Dogs extends Animals{}

//class Cats implements Animals{} // Doesn't work, implementation is for interfaces

class Cats implements Fauna, Flora{
    public void makeSound(){System.out.println("Meow");}
    public void comm(){System.out.println("comm Meow");}
}
