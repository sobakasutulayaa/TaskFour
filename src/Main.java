import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        System.out.println("Example of how the algorithm works on an integer data type.");
        System.out.println("Enter array of integers:");
        Integer[] arr = ArrayUtils.toObject(ArrayUtils.readIntArrayFromConsole());
        System.out.println("Enter first and last index range:");
        int from, to;
        Scanner sc = new Scanner(System.in);

        try {
            from = sc.nextInt();
            to = sc.nextInt();
        } catch (Exception e) {
            throw new Exception("Enter integer number.");
        }

        Task.sort(arr, from, to);
        print(arr);

        System.out.println("Reverse sorting:"); //обратная сортировка (from > to)
        Task.sort(arr, to, from);
        print(arr);
    }

    static void print(Integer[] data) {
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println();
    }
}