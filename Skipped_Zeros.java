import java.io.BufferedReader;
import java.util.*;
import java.util.stream.*;
import java.io.*;
public class Skipped_Zeros{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.valueOf(br.readLine());
        String []arr = br.readLine().trim().split("\\s+");
        List<Integer> list = Stream.of(arr)
                           .map(Integer::valueOf)
                           .collect(Collectors.toList());

        System.out.println(list);
    }
}