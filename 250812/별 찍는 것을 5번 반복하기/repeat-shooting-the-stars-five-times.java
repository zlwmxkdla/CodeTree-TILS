public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        for(int i=0;i<5;i++){
            makeStar(10);
            System.out.println();
        }
    }
    public void makeStar(int n){
        for(int i=0;i<n;i++){
            System.out.print('*');
        }
    }
}