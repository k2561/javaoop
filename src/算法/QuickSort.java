package 算法;

/**
 * 随机化快速排序
 * 一、概念及其介绍
 * 快速排序由 C. A. R. Hoare 在 1960 年提出。
 *
 * 随机化快速排序基本思想：通过一趟排序将要排序的数据分割成独立的两部分，其中一部分的所有数据都比另外一部分的所有数据都要小，然后再按此方法对这两部分数据分别进行快速排序，整个排序过程可以递归进行，以此达到整个数据变成有序序列。
 *
 * 二、适用说明
 * 快速排序是一种比较快速的排序算法，它的平均运行时间是 O(nlogn)，之所以特别快是由于非常精练和高度优化的内部循环，最坏的情形性能为 O(n^2)。像归并一样，快速排序也是一种分治的递归算法。从空间性能上看，快速排序只需要一个元素的辅助空间，但快速排序需要一个栈空间来实现递归，空间复杂度也为O(logn)。
 */
public class QuickSort {


    // 对arr[l...r]部分进行partition操作
    // 返回p, 使得arr[l...p-1] < arr[p] ; arr[p+1...r] > arr[p]
    private static int partition(Comparable[] arr, int l, int r){

        // 随机在arr[l...r]的范围中, 选择一个数值作为标定点pivot
        swap( arr, l , (int)(Math.random()*(r-l+1))+l );
        Comparable v = arr[l];
        // arr[l+1...j] < v ; arr[j+1...i) > v
        int j = l;
        for( int i = l + 1 ; i <= r ; i ++ )
            if( arr[i].compareTo(v) < 0 ){
                j ++;
                swap(arr, j, i);
            }
        swap(arr, l, j);
        return j;
    }

    // 递归使用快速排序,对arr[l...r]的范围进行排序
    private static void sort(Comparable[] arr, int l, int r){
        if (l >= r) {
            return;
        }
        int p = partition(arr, l, r);
        sort(arr, l, p-1 );
        sort(arr, p+1, r);
    }

    public static void sort(Comparable[] arr){
        int n = arr.length;
        sort(arr, 0, n-1);
    }

    private static void swap(Object[] arr, int i, int j) {
        Object t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }

    // 测试 QuickSort
    public static void main(String[] args) {

        // Quick Sort也是一个O(nlogn)复杂度的算法
        // 可以在1秒之内轻松处理100万数量级的数据
        int N = 1000000;
        Integer[] arr = SortTestHelper.generateRandomArray(N, 0, 100000);
        sort(arr);
        SortTestHelper.printArray(arr);

    }
}