import java.io.*;
import java.util.*;
import java.util.stream.*;
public class StreamsForEach {
    public static void main(String[] args) {
        /*BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
        int n = new Integer.valueOf(br.readLine());

        String[] str = new String[n];
        
        for(int i=0;i<n;i++){
            str[i] = br.readLine();
        }
        Stream.of()
        */

        Stream.of("sad", "asdas", "asss","esedd")
            .takeWhile(n -> n.length() % 2 != 0)
            .forEach(System.out::println);
    
        List<String> list = Arrays.asList("cat", "dog", "elephant", "fox", "rabbit", "duck");
        for (int i = 0; i < list.size(); i++) {
            String item = list.get(i);
            if (item.length() % 2 == 0) {
                break;
            }
            System.out.println(item);
        }
//As we can see, the takeWhile method allows us to achieve exactly what we need.

//But what if we haven't adopted Java 9 yet? How can we achieve a similar thing using Java 8?
// CustomSpliterator file
    }

}
