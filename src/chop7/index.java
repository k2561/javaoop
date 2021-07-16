package chop7;

/**
 *类和类之间的依赖、关联、聚合、组合关系
 * 面向对象设计原则
 * 开闭原则
 * 里氏代换原则
 * 单一职能原则
 * 面向对象设计过程
 *
 *
 * 掌握类和类之间依赖、关联、聚合、组合关系
 * 依赖关系定义
 * 可以简单的理解，类A依赖于类B就是类A使用到了类B，类B的变化会影响到类A
 * 这种关系一般是偶然性的、临时性的、非常弱的
 * 依赖关系总是单向的
 * 表现在代码层面，类B作为参数或局部变量被类A在某个method方法中使用，此时类A依赖于类B
 *
 * UML表示
 * 类A依赖于类B，用由类A指向类B的带箭头虚线表示
 * 举例
 * class Pet { //宠物类
 * }
 *
 * class Master { //主人类
 * public void feed(Pet pet) {  // 给宠物喂食
 * }
 * }
 * 关联关系定义
 * 关联是类和类之间的一种强依赖关系
 * 这种关系一般具有长期性
 * 关联可以是单向、双向的
 * 关联可分为一对一关联、一对多关联、多对多关联
 * 表现在代码层面
 * 被关联类B以类的属性形式出现在关联类A中
 * 关联类A引用了一个类型为被关联类B的全局变量
 *
 * UML表示
 * 用带箭头实线表示，箭头指向被关联类
 * 若是双向关联，实线两端可不带箭头
 *class Course { // 课程类
 * 	private int cid; // 课程编号
 * 	private String name; // 课程名
 * }
 * class Student { //学生类
 * 	private int sid; // 学号
 * 	private String name; // 姓名
 * 	private String department; // 系别
 * 	private Course[ ] course; // 所选课程
 * }
 *
 *
 * 聚合关系定义
 * 关联关系的一种特例
 * 体现的是整体与部分的关系，即has-a的关系，整体与部分之间可分离，具有各自的生命周期
 * 比如计算机与CPU、公司与员工、班级和学生、比如航母编队包括航空母舰、驱护舰艇、舰载飞机等
 * 表现在代码层面，和关联关系是一致的，只能从语义级别来区分
 * UML表示
 * 以空心菱形加实线箭头表示。（有些设计软件如visio中，实线不带箭头）
 *class Employee{ //员工类
 * 	private String name;
 * 	private int age;
 * }
 *
 * class Company{  //公司类
 * 	private String name;
 * 	private String address;
 * 	private Employee [ ] employees;
 * }
 *
 *组合关系定义
 * 也是关联关系的一种特例，体现的是一种contains-a的关系, 比聚合更强，也称为强聚合
 * 体现整体与部分间的关系，但整体与部分具有相同生命周期，一旦整体对象不存在，部门对象也将不存在
 * 比如人和人的四肢
 * 表现在代码层面，和关联关系是一致的，只能从语义级别来区分
 * UML表示
 * 以实心菱形加实线箭头表示。（有些设计软件如visio中，实线不带箭头）
 * class Head{
 * }
 * class Leg{
 * }
 * class Person{
 * 	private Head head;
 * 	private Leg leg;
 * }
 *总结
 * 类和类的关系
 * 继承（泛化 generalization ）
 * 实现（realization）
 * 依赖（dependency）
 * 关联（association）
 * 聚合（aggregation）
 * 组合（composition）
 * 强调
 * 聚合、组合是关联的特殊形式，从语义上区分
 * 总体来说，关系强弱程度上依赖<关联<聚合<组合
 */
public class index {

}
