package 堆;

/**
 *堆的基本存储
 * 一、概念及其介绍
 * 堆(Heap)是计算机科学中一类特殊的数据结构的统称。
 *
 * 堆通常是一个可以被看做一棵完全二叉树的数组对象。
 *
 * 堆满足下列性质：
 *
 * 堆中某个节点的值总是不大于或不小于其父节点的值。
 * 堆总是一棵完全二叉树。
 * 二、适用说明
 * 堆是利用完全二叉树的结构来维护一组数据，然后进行相关操作，一般的操作进行一次的时间复杂度在 O(1)~O(logn) 之间，堆通常用于动态分配和释放程序所使用的对象。
 *
 * 若为优先队列的使用场景，普通数组或者顺序数组，最差情况为 O(n^2)，堆这种数据结构也可以提高入队和出队的效率。
 *
 *  	入队	出队
 * 普通数组	O(1)	O(n)
 * 顺序数组	O(n)	O(1)
 * 堆	O(logn)	O(log)
 * 基础堆排序
 * 一、概念及其介绍
 * 堆排序（Heapsort）是指利用堆这种数据结构所设计的一种排序算法。
 *
 * 堆是一个近似 完全二叉树的结构，并同时满足堆积的性质：即子结点的键值或索引总是小于（或者大于）它的父节点。
 *
 * 二、适用说明
 * 我们之前构造堆的过程是一个个数据调用 insert 方法使用 shift up 逐个插入到堆中，这个算法的时候时间复杂度是 O(nlogn)，本小节介绍的一种构造堆排序的过程，称为 Heapify，算法时间复杂度为 O(n)。
 * 优化堆排序
 * 上一节的堆排序，我们开辟了额外的空间进行构造堆和对堆进行排序。这一小节，我们进行优化，使用原地堆排序。
 *
 * 对于一个最大堆，首先将开始位置数据和数组末尾数值进行交换，那么数组末尾就是最大元素，然后再对W元素进行 shift down 操作，重新生成最大堆，然后将新生成的最大数和整个数组倒数第二位置进行交换，此时到处第二位置就是倒数第二大数据，这个过程以此类推。
 *
 * 索引堆及其优化
 * 一、概念及其介绍
 * 索引堆是对堆这个数据结构的优化。
 *
 * 索引堆使用了一个新的 int 类型的数组，用于存放索引信息。
 *
 * 相较于堆，优点如下：
 *
 * 优化了交换元素的消耗。
 * 加入的数据位置固定，方便寻找。
 * 二、适用说明
 * 如果堆中存储的元素较大，那么进行交换就要消耗大量的时间，这个时候可以用索引堆的数据结构进行替代，堆中存储的是数组的索引，我们相应操作的是索引。
 */
public class index {

}
