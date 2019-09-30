public class SelectionSort implements SortingAlgorithm{ 
    public void sort(int[] a){ 
        int n = a.length; 
        for (int i = 0; i < n-1; i++){ 
            int min_idx = i; 
            for (int j = i+1; j < a.length; j++) 
                if (a[j] < a[min_idx]) 
                    min_idx = j; 
            int temp = a[min_idx]; 
            a[min_idx] = a[i]; 
            a[i] = temp; 
        } 
    }
} 