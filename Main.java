import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int n_copy = n;
        int cycle = 0;
        do {
            cycle++;
            if (n_copy < 10) {
                n_copy *= 10;
            }
            char[] arr = Integer.toString(n_copy).toCharArray();
            int left = Character.getNumericValue(arr[1]);
            int right = ((arr[0] - '0') + (arr[1] - '0'));
            n_copy = (left % 10) + right;
        } while (n != n_copy);
        System.out.println(cycle);
    }
}