package 并查集;

/**
 *并查集基础
 * 一、概念及其介绍
 * 并查集是一种树型的数据结构，用于处理一些不相交集合的合并及查询问题。
 *
 * 并查集的思想是用一个数组表示了整片森林（parent），树的根节点唯一标识了一个集合，我们只要找到了某个元素的的树根，就能确定它在哪个集合里。
 *
 * 二、适用说明
 * 并查集用在一些有 N 个元素的集合应用问题中，我们通常是在开始时让每个元素构成一个单元素的集合，然后按一定顺序将属于同一组的元素所在的集合合并，其间要反复查找一个元素在哪个集合中。这个过程看似并不复杂，但数据量极大，若用其他的数据结构来描述的话，往往在空间上过大，计算机无法承受，也无法在短时间内计算出结果，所以只能用并查集来处理。
 * 并查集路径压缩
 * 并查集里的 find 函数里可以进行路径压缩，是为了更快速的查找一个点的根节点。对于一个集合树来说，它的根节点下面可以依附着许多的节点，因此，我们可以尝试在 find 的过程中，从底向上，如果此时访问的节点不是根节点的话，那么我们可以把这个节点尽量的往上挪一挪，减少数的层数，这个过程就叫做路径压缩。
 *
 */
public class index {

}
