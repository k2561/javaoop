package 算法;

/**
 * 双路快速排序
 * 一、概念及其介绍
 * 双路快速排序算法是随机化快速排序的改进版本，partition 过程使用两个索引值（i、j）用来遍历数组，将 <v 的元素放在索引i所指向位置的左边，而将 >v 的元素放在索引j所指向位置的右边，v 代表标定值。
 *
 * 二、适用说明
 * 时间和空间复杂度同随机化快速排序。 对于有大量重复元素的数组，如果使用上一节随机化快速排序效率是非常低的，导致 partition 后大于基点或者小于基点数据的子数组长度会极度不平衡，甚至会退化成 O(n*2) 时间复杂度的算法，对这种情况可以使用双路快速排序算法。
 */
public class QuickSort2Ways {


    private static int partition(Comparable[] arr, int l, int r){
        // 随机在arr[l...r]的范围中, 选择一个数值作为标定点pivot
        swap( arr, l , (int)(Math.random()*(r-l+1))+l );
        Comparable v = arr[l];
        // arr[l+1...i) <= v; arr(j...r] >= v
        int i = l+1, j = r;
        while( true ){
            while( i <= r && arr[i].compareTo(v) < 0 )
                i ++;
            while( j >= l+1 && arr[j].compareTo(v) > 0 )
                j --;
            if( i > j )
                break;
            swap( arr, i, j );
            i ++;
            j --;
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

        // 双路快速排序算法也是一个O(nlogn)复杂度的算法
        // 可以在1秒之内轻松处理100万数量级的数据

        // Quick Sort也是一个O(nlogn)复杂度的算法
        // 可以在1秒之内轻松处理100万数量级的数据
        int N = 1000000;
        Integer[] arr = SortTestHelper.generateRandomArray(N, 0, 100000);
        sort(arr);
        SortTestHelper.printArray(arr);

    }
}