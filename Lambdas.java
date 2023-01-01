import java.util.Collections;
import java.util.List;
import java.util.Arrays;
import java.util.Comparator;

public class Lambdas {
    public static void main(String[] args) {
        
        List<Integer> list = Arrays.asList(4,3,6,5,7,3,5,8,1);
/*
        Collections.sort(list, new Comparator<Integer>(){
            @Override
            public int compare(Integer a, Integer b){
                return a-b;
            }
        });
*/
        //Since comparator is a functional interface, we can use it as such
        // Functional interfaces have only one abstract method, but can have multiple default methods


        Collections.sort(list, (Integer a, Integer b) -> a-b);
        System.out.println(list);

        Multiplication mul = (int a, int b)->(a*b);
        System.out.println(mul.multiply(2,3));

        //() -> System.out.println("asasasas");

    }
}
//@FunctionalInterface
interface Multiplication{
    int multiply(int a, int b); //abstract is automatically added for interface methods(all non static)

    static int add(int a, int b){ // but not for static methods, but these are perfectly valid
        return a+b;
    }
    //abstract int div (int a, int b); //this would be valid if this interface is not a functional interface (interface with only 1 abstract method), invalid otherwise
    /*int subtr(int a, int b){ // non static (instance) methods are not allowed
        return a-b;
    }*/
}
