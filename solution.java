

 
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.Stack;
 
public class EqualStacks {
 
    static int equalStacks(int[] ha1, int[] ha2, int[] ha3) {
 
        Stack<Integer> s1 = new Stack<Integer>();
        Stack<Integer> s2 = new Stack<Integer>();
        Stack<Integer> s3 = new Stack<Integer>();
        int first = 0;
        int second = 0;
        int third = 0;
        int minStack;
        for(int i = ha1.length-1; i >= 0 ; i--){
            s1.push(ha1[i]);
            first += ha1[i];
        }
         for(int i = ha2.length-1; i >= 0 ; i--){
            s2.push(ha2[i]);
            second += ha2[i];
        }
        for(int i = ha3.length-1; i >= 0 ; i--){
            s3.push(ha3[i]);
            third += ha3[i];
        }
        minStack = Math.min(first,Math.min(second,third));
        while(first != second || first != third) {
            while(first > minStack){
                first -= s1.pop();
            }
            minStack = Math.min(first,Math.min(second,third));
            while(second > minStack){
                second -= s2.pop();
            }
            minStack = Math.min(first,Math.min(second,third));
            while(third > minStack){
                third -= s3.pop();
            }
            minStack = Math.min(first,Math.min(second,third));
 
        }
 
        return minStack;
    }
 
    private static final Scanner scanner = new Scanner(System.in);
 
    public static void main(String[] args) throws IOException {
 
        String[] n1N2N3 = scanner.nextLine().split(" ");
        int n1 = Integer.parseInt(n1N2N3[0].trim());
        int n2 = Integer.parseInt(n1N2N3[1].trim());
        int n3 = Integer.parseInt(n1N2N3[2].trim());
 
        int[] first = new int[n1];
        String[] firstItems = scanner.nextLine().split(" ");
        for (int firstItr = 0; firstItr < n1; firstItr++) {
            int firstItem = Integer.parseInt(firstItems[firstItr].trim());
            first[firstItr] = firstItem;
        }
 
        int[] second = new int[n2];
        String[] secondItems = scanner.nextLine().split(" ");
        for (int secondItr = 0; secondItr < n2; secondItr++) {
            int secondItem = Integer.parseInt(secondItems[secondItr].trim());
            second[secondItr] = secondItem;
        }
 
        int[] third = new int[n3];
        String[] thirdItems = scanner.nextLine().split(" ");
        for (int thirdItr = 0; thirdItr < n3; thirdItr++) {
            int thirdItem = Integer.parseInt(thirdItems[thirdItr].trim());
            third[thirdItr] = thirdItem;
        }
 
        int result = equalStacks(first, second, third);
        System.out.println(result);
    }
}
