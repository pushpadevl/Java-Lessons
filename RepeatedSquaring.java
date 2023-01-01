import java.util.*;

public class RepeatedSquaring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,e; //extend this for overflow

        a = sc.nextInt();
        e = sc.nextInt();
        long b=1;
        String erev = Integer.toBinaryString(e);
        
        System.out.println(erev);
        for(int i=0;i<erev.length(); i++){
            b*=b;
            if(erev.charAt(i)=='1'){
                b*=a;
            }
        }
        System.out.println(b);
    }    
}
