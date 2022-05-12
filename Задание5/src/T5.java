public class T5 {
    public static void main(String[] ght){
        int n = 256;
        int k = 0;
        while (n != Math.pow(2, k)){
            k = k + 1;
        }
        System.out.println(k);
    }
}
