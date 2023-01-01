import java.util.*;
import java.util.stream.*;
public class GenPermutations {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String S = sc.next(); 
    
    char[] arr = S.toCharArray();
    findAllPermutations(arr, arr.length, arr.length);
    }
    static void findAllPermutations(char[] arr, int size, int n){
        if(size == 1) {Stream.of(arr).forEach(System.out::print);
        System.out.println();
        }
        for(int i=0;i<size;i++){
            findAllPermutations(arr, size-1, n);

            if(size % 2 ==1){
                char temp = arr[0];
                arr[0] = arr[size-1];
                arr[size-1] = temp;
            }else{
                char temp = arr[i];
                arr[i] = arr[size-1];
                arr[size-1] = temp;
            }
        }
    }
    
}
