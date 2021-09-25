package javabasiccourse;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



class Result {

    /*
     * Complete the 'palindromeIndex' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts STRING s as parameter.
     */
    public static String rev(String str){
        StringBuilder sb=new StringBuilder();
        sb.append(str);
        sb.reverse();
        return sb.toString();
    }
    public static int palindromeIndex(String s) {
    // Write your code here
        int ret=-1;
        System.out.println(s);
        System.out.println("----------------------------");
    int len=s.length();
    if(s.equals(rev(s))){
        ret=-1;
    }
    else{
      for(int i=0;i<s.length();i++){
          if(s.charAt(i)==s.charAt(len-1-i)){
            continue;
      }
        else{
            if((s.substring(0,i)+s.substring(i+1,len)).equals(rev(s.substring(0,i)+s.substring(i+1,len)))){
            ret=i;
            i=len;
            break;
        }
        else if((s.substring(0,len-i-1)+s.substring(len-i,len)).equals(rev(s.substring(0,len-i-1)+s.substring(len-i,len)))){
         ret=len -i -1;
         i=len;
         break;
    }
    else{
    ret=-1;
    }
    }
    }
    }
    return ret;
    }

}


public class Hackerrankpalindromeindex {

	public Hackerrankpalindromeindex() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, q).forEach(qItr -> {
            try {
                String s = bufferedReader.readLine();

                int result = Result.palindromeIndex(s);

                bufferedWriter.write(String.valueOf(result));
                bufferedWriter.newLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
        bufferedWriter.close();
    }

}
