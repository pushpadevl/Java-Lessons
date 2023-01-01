import java.util.*;
import java.util.stream.*;
import java.math.*;
public class Testing {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2,3,4,5,6);
        //list.add(2); list.add(3); //these methods are not allowd if arrays.asList is used to initialize
        
        int prodd = list.stream().reduce(1, (a,b) -> a*b); //becoz of below anomaly, use 1
        int prod2 = list.stream().reduce(0, (a,b) -> a*b); //returns 0 becoz the default 0 is multiplied too
        int proddd = IntStream.range(2, 6).reduce((a,b)-> a*b).orElse(-1);
        Optional<Integer> prod = list.stream().reduce((a,b) -> (a*b));
        System.out.println(list+" "+prod+" "+prodd+" "+prod2+" "+proddd);
        BigInteger b = BigInteger.valueOf(2);
        b = b.nextProbablePrime();
        System.out.println(b);
        //System.out.println(findFirst64Primes());

        long longNum = 614889782588491410L;
        printPrimeFactorization(longNum);
    }
    static List<Integer> findFirst64Primes(){
        boolean []isComposite = new boolean[501];
        isComposite[1] = isComposite[0] = true;
        List<Integer> list = new ArrayList<>();

        for(int i=2;i<501;i++){
            if(!isComposite[i]){
                int n=2;
                while(n*i<501){
                    isComposite[i*n++] = true;
                }
                if(list.size() ==64) break;
                list.add(i);
            }
        }
        return list;
    }
    static void printPrimeFactorization(long n){
        long N = n;
        System.out.println();
        while(n%2==0) {
            System.out.print(2+" ");
            n/=2;
        }
        System.out.println();
        for(int i=3;n>1 && i<=n; i+=2){

            while(n%i==0){
                System.out.print(i+" ");
                n/=i;
            }
            System.out.println();
        }
    }
}
