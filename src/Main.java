public class Main {
    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(1073741824));
    }
    public static boolean isPowerOfTwo(int n) {
        if (n == 1){
            return true;
        }
        if (n%2 != 0){
            return false;
        }
        for (int i = 0; i < 31; i++) {
            System.out.println(i);
            if (Math.pow(2,i) == n){
                return true;
            }
        }
        return false;
    }
}
