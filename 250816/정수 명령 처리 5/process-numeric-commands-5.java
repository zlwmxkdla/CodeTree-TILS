import java.util.Scanner;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        sc.nextLine();
        for(int i=0;i<n;i++){
            String input = sc.nextLine();
            String[] inputs = input.split(" ");
            if(inputs[0].equals("push_back"))arr.add(Integer.parseInt(inputs[1]));
            else if(inputs[0].equals("pop_back"))arr.remove(arr.size()-1);
            else if(inputs[0].equals("size"))System.out.println(arr.size());
            else System.out.println(arr.get(Integer.parseInt(inputs[1])-1));
        }
        // Please write your code here.
    }
}