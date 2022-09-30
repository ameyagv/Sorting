public class Sorting {

    int comparisonCount;
    int[] sortingArray;

    Sorting(int[] input) {
        sortingArray = input;
        comparisonCount = 0;
    }


    public static void main(String[] args) {

    }

    public void mergeSort(int p, int r) {
        if (p >= r) {
            return;
        }
        int q = (p + r) / 2;
        mergeSort(p, q);
        mergeSort(q + 1, r);
        merge(p, q, r);
    }

    public void merge(int p, int q, int r) {
        int nl = q - p + 1;
        int nr = r - q;
        int[] Left = new int[nl];
        int[] Right = new int[nr];
        for (int i = 0; i < nl; i++) {
            Left[i] = sortingArray[i + p];
        }
        for (int j = 0; j < nr; j++) {
            Right[j] = sortingArray[q + j + 1];
        }
        int i = 0, j = 0, k = p;
        while (i < nl && j < nr) {
            comparisonCount++;
            if (Left[i] <= Right[j]) {
                sortingArray[k] = Left[i];
                i++;
            } else {
                sortingArray[k] = Right[j];
                j++;
            }
            k++;
        }
        while (i < nl) {
            sortingArray[k] = Left[i];
            i++;
            k++;
        }
        while (j < nr) {
            sortingArray[k] = Right[j];
            j++;
            k++;
        }
    }

    public void insertionSort() {
        int n = sortingArray.length;
        for (int i = 1; i < n; i++) {
            int key = sortingArray[i];
            int j = i - 1;
            while (j >= 0 && sortingArray[j] > key) {
                comparisonCount++;
                sortingArray[j + 1] = sortingArray[j];
                j = j - 1;
            }
            if (j > -1) {
                comparisonCount++;
            }
            sortingArray[j + 1] = key;
        }
    }

    public void heapSort() {
        int n = sortingArray.length;
        buildMaxHeap();
        for (int i = n - 1; i >= 0; i--) {
            int temp = sortingArray[0];
            sortingArray[0] = sortingArray[i];
            sortingArray[i] = temp;
            maxHeapify(i, 0);
        }
    }

    public void buildMaxHeap() {
        int n = sortingArray.length;
        for (int i = (n / 2) - 1; i >= 0; i--) {
            maxHeapify(n, i);
        }
    }

    public void maxHeapify(int n, int i) {

        int l = 2 * i + 1;
        int r = 2 * i + 2;
        if (i > n / 2) {
            return;
        }
        int largest = i;
        if (l < n) {
            comparisonCount++;
            if (sortingArray[l] > sortingArray[i]) {
                largest = l;
            }
        }
        if (r < n) {
            comparisonCount++;
            if (sortingArray[r] > sortingArray[largest]) {
                largest = r;
            }
        }

        if (largest != i) {
            int temp = sortingArray[largest];
            sortingArray[largest] = sortingArray[i];
            sortingArray[i] = temp;
            maxHeapify(n, largest);
        }
    }

}
