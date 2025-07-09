// Merge Sort - Sort an Array of Book Prices
public class MergeSortBookPrices {
    public static void mergeSort(int[] prices) {
        if (prices.length < 2) return;
        int mid = prices.length / 2;
        int[] left = new int[mid];
        int[] right = new int[prices.length - mid];
        System.arraycopy(prices, 0, left, 0, mid);
        System.arraycopy(prices, mid, right, 0, prices.length - mid);
        mergeSort(left);
        mergeSort(right);
        merge(prices, left, right);
    }
    private static void merge(int[] arr, int[] left, int[] right) {
        int i = 0, j = 0, k = 0;
        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) arr[k++] = left[i++];
            else arr[k++] = right[j++];
        }
        while (i < left.length) arr[k++] = left[i++];
        while (j < right.length) arr[k++] = right[j++];
    }
}
