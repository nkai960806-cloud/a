import java.util.Scanner;

public class HW2_114403547 {

    static int count = 1;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("請輸入陣列長度n： ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("請輸入 " + n + " 個整數：");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.println("開始排序");
        
        quickSort(arr, 0, n - 1);

        System.out.println("最終排序結果：");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        scanner.close();
    }
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }
    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        System.out.println("第" + count + "輪分堆（以" + pivot + "為基準）:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
        count++;
        return i + 1;
}
}

