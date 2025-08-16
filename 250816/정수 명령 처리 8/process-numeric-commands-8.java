import java.util.Scanner;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            String command = sc.nextLine();
            // Please write your code here.
            String[] inputs = command.split(" ");
            if(inputs[0].equals("push_front")){
                list.addFirst(Integer.parseInt(inputs[1]));
            }else if(inputs[0].equals("push_back")){
                list.addLast(Integer.parseInt(inputs[1]));
            }else if(inputs[0].equals("pop_front")){
                System.out.println(list.pollFirst());
            }else if(inputs[0].equals("pop_back")){
                System.out.println(list.pollLast());
            }else if(inputs[0].equals("size")){
                System.out.println(list.size());
            }else if(inputs[0].equals("front")){
                System.out.println(list.peekFirst());
            }else if(inputs[0].equals("back")){
                System.out.println(list.peekLast());
            }else{
                if(list.isEmpty()){
                    System.out.println(1);
                }else System.out.println(0);
            }
        }
    }
}