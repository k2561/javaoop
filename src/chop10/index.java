package chop10;

/**
 * Collection 接口存储一组不唯一，无序的对象
 * List 接口存储一组不唯一，有序（插入顺序）的对象
 * Set 接口存储一组唯一，无序的对象
 * Map接口存储一组键值对象，提供key到value的映射
 *
 * ArrayList实现了长度可变的数组，在内存中分配连续的空间。遍历元素和随机访问元素的效率比较高
 * LinkedList采用链表存储方式。插入、删除元素时效率比较高
 *
 *          List接口常用方法
 *
 *
 * boolean add(Object o)	在列表的末尾顺序添加元素，起始索引位置从0开始
 * void add(int index,Object o)	在指定的索引位置添加元素。索引位置必须介于0和列表中元素个数之间
 * int size()	返回列表中的元素个数
 * Object get(int index)	返回指定索引位置处的元素。取出的元素是Object类型，使用前需要进行强制类型转换
 * boolean contains(Object o)	判断列表中是否存在指定元素
 * boolean remove(Object o)	从列表中删除元素
 * Object	remove(int index)	从列表中删除指定位置元素，起始索引位置从0开始
 *
 *          LinkedList的特殊方法
 *
 *
 * void	addFirst(Object o)	在列表的首部添加元素
 * void	addLast(Object o)	在列表的末尾添加元素
 * Object	getFirst()	返回列表中的第一个元素
 * Object	getLast()	返回列表中的最后一个元素
 * Object	removeFirst()	删除并返回列表中的第一个元素
 * Object	removeLast()	删除并返回列表中的最后一个元素
 *
 *
 *          Vector和ArrayList的异同
 *
 * 实现原理相同，功能相同，很多情况下可以互用
 * 两者的主要区别如下
 * Vector线程安全，ArrayList重速度轻安全，线程非安全
 * 长度需增长时，Vector默认增长一倍，ArrayList增长50%
 *
 *          Hashtable和HashMap的异同
 *
 * 实现原理相同，功能相同，在很多情况下可以互用
 * 两者的主要区别如下
 * Hashtable继承Dictionary类，HashMap实现Map接口
 * Hashtable线程安全，HashMap线程非安全
 * Hashtable不允许null值，HashMap允许null值
 * 开发过程中，最好使用ArrayList和HashMap
 *
 *          如何遍历List集合呢？
 *
 * 方法1：通过for循环和get()方法配合实现遍历
 * 方法2：通过迭代器Iterator实现遍历
 * 所有集合接口和类都没有提供相应遍历方法，而是由Iterator实现集合遍历
 * Collection 接口的iterate()方法返回一个Iterator，然后通过Iterator接口的两个方法可实现遍历
 * boolean hasNext(): 判断是否存在另一个可访问的元素
 * Object next(): 返回要访9问的下一个元素
 */
public class index {

}
