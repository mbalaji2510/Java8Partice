import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;


class Result {

    /*
     * Complete the 'segment' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER x
     *  2. INTEGER_ARRAY space
     */

    public static int segment(int x, List<Integer> space) {
      int result =0;
      System.out.println("Space: "+space);
      int spaceSize = space.size();
      int fromIndex = 0;
      int toIndex = fromIndex+x;
      TreeSet<Integer> numSet = new TreeSet<>();

      while(toIndex <= spaceSize){
        List<Integer> subList = space.subList(fromIndex, toIndex);
        System.out.println("Sub List: "+ subList);
        fromIndex = fromIndex+1;
        toIndex = fromIndex+3;
        System.out.println("fromIndex: " + fromIndex);
        System.out.println("toIndex: " +toIndex);
        TreeSet subSet = new TreeSet<>(subList);
        //Collections.sort(subList);
        System.out.println("First: "+subSet.first());
        numSet.add((Integer)subSet.first());
      }
      System.out.println("Num Set Last: " +numSet.last());
      result = numSet.last();
      
    return result;

    }

}
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int x = Integer.parseInt(bufferedReader.readLine().trim());

        int spaceCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> space = new ArrayList<>();

        for (int i = 0; i < spaceCount; i++) {
            int spaceItem = Integer.parseInt(bufferedReader.readLine().trim());
            space.add(spaceItem);
        }

        int result = Result.segment(x, space);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}