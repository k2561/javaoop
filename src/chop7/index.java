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
 *
 *
 *
 *
 *
 * 掌握面向对象设计原则之开闭原则
 * 面向对象设计原则
 * 在使用面向对象思想进行系统设计时，总结出了若干面向对象设计原则，分别是
 * 单一职责原则
 * 开闭原则
 * 里氏代换原则
 * 依赖注入原则
 * 接口分离原则
 * 迪米特原则
 * 组合/聚合复用原则
 * 这些原则是面向对象设计的基石，坚持这些原则是提升面向对象设计质量的重要保障
 *
 *
 * 开闭原则定义：
 * OCP：Open for extention, Closed for modification Principle，即对扩展开放，对修改关闭原则
 *
 * 该原则的思想是：可以通过扩展来满足变化，而不需要修改代码，或者说在设计一个模块的时候，应当使这个模块可以在不被修改的前提下被扩展
 *需求发生变化，按照工资算法二计算工资，如何实现呢
 *class Salary { // 工资类
 * 	public void computerSalary() {
 * 		System.out.println("采用工资算法一计算工资");
 *        }
 * }
 * class Accountant { // 会计类
 * 	public void ComputerSalary(Salary salary) {
 * 		salary.computerSalary();
 *    }
 * }
 * class TestOCP { // 测试类
 * 	public static void main(String[] args) {
 * 		Accountant accountant = new Accountant ();
 * 		 accountant.ComputerSalary(new Salary());
 *    }
 * }
 *
 *
 * 通过修改Salary类的computerSalary() 来实现，不利于程序的稳定
 *class Salary { // 工资类
 * 	public void computerSalary() {
 * 		System.out.println(“采用工资算法二计算工资");
 *        }
 * }
 * class Accountant { //会计类
 * 	public void ComputerSalary(Salary salary) {
 * 		salary.computerSalary();
 *    }
 * }
 * class TestOCP { // 测试类
 * 	public static void main(String[] args) {
 * 		 Accountant accountant = new Accountant ();
 * 		 accountant.ComputerSalary(new Salary());
 *    }
 * }
 *创建工资接口，并提供实现类
 *interface Salary { // 工资接口
 * 	public void computerSalary();
 * }
 * class BeijingSalary implements Salary { //北京工资实现类
 * 	public void computerSalary() {
 * 		System.out.println("采用工资算法一计算工资");	}
 * }
 * class Accountant { //会计类
 * 	public void ComputerSalary(Salary salary) {
 * 		salary.computerSalary();	}
 * }
 * class TestOCP { // 测试类
 * 	public static void main(String[] args) {
 * 		 Accountant accountant = new Accountant ();
 * 		 accountant.ComputerSalary(new BeijingSalary());	}
 * }
 *
 *增加Salary接口的新实现，而不是修改原有类
 *interface Salary { // 工资接口
 * 	public void computerSalary();
 * }
 * class HebeiSalary implements Salary { //河北工资实现类
 * 	public void computerSalary() {
 * 		System.out.println(“采用工资算法二计算工资");	}
 * }
 * class Accountant { // 会计类
 * 	public void ComputerSalary(Salary salary) {
 * 		salary.computerSalary();	}
 * }
 * class TestOCP { // 测试类
 * 	public static void main(String[] args) {
 * 		 Accountant accountant = new Accountant ();
 * 		 accountant.ComputerSalary(new HebeiSalary());	}
 * }
 *实现 ：
 * 实现开闭原则的关键是抽象
 * 定义一个抽象层，只规定功能而不提供实现，实现通过定义具体类来完成
 * 当需求变化时，不是通过修改抽象层来完成，而是通过定义抽象层的新实现完成，即通过扩展来完成
 *
 * 通过抽象类及接口，规定了具体类的特征作为抽象层，相对稳定，不需修改，从而满足“对修改关闭”
 * 从抽象类导出的具体类可以改变系统的行为，从而满足“对扩展开放”
 *好处 ：
 * 通过扩展已有软件系统，可提供新的行为，以满足对软件的新需求，提高了软件系统的适应性和灵活性
 *
 * 已有的软件模块，特别是最重要的抽象层模块不能再修改，提高了软件系统的一定的稳定性和延续性
 *
 * 这样的设计同时也满足了可复用性与可维护性;
 * 总结：
 * 实现开闭原则的关键是抽象
 * 抽象层相对稳定，不需修改，需求变化后通过重新定义抽象层的新实现来完成
 *
 * 即使无法百分之百的做到开闭原则，但朝这个方向努力，可以显著改善一个系统的结构
 * 对系统每个部分都肆意地进行抽象也不是一个好主意，应该仅仅对程序中需求频繁变化部分进行抽象
 * 拒绝不成熟的抽象和抽象本身一样重要
 *
 * 掌握面向对象设计原则之单一职能原则
 * 面向对象设计原则
 * 在使用面向对象思想进行系统设计时，总结出了若干面向对象设计原则，分别是
 * 单一职责原则
 * 开闭原则
 * 里氏代换原则
 * 依赖注入原则
 * 接口分离原则
 * 迪米特原则
 * 组合/聚合复用原则
 * 这些原则是面向对象设计的基石，坚持这些原则是提升面向对象设计质量的重要保障
 *
 * 定义
 * SRP：Single Responsibility Principle；
 *
 * 系统中的每一个类都应该只有一个职责，而所有类所关注的就是自身职责的完成
 *
 * 职责是指为“变化的原因”
 * 如果能想到多个原因去改变一个类，这个类就具有多个职责
 * 并不是单一功能原则，并不是每个类只能有一个方法，而是单一“变化的原因”原则
 *
 * 好处
 * 单一职责原则的意思就是经常说的“高内聚、低耦合”
 *
 * 如果一个类有多个职责，这些职责就耦合在了一起，当一个职责发生变化时，可能会影响其它的职责
 *
 * 多个职责耦合在一起，会影响复用性
 * 可能只需要复用该类的某一个职责，但这个职责跟其它职责耦合在了一起，很难分离出来
 *
 * class Accountant { // 会计
 * 	public void calculateSalary() { // 计算工资
 *
 *        }
 * 	public void store() { // 存储数据
 *
 *    }
 * }
 * 计算工资规则是易变的，向数据库存取数据的方式是不多变的，并且两者变化的原因是不同的
 * 违背了单一职能原则，两个方法不应放在同一个类中
 * interface Dao {
 * 	Connection getConnection(); // 获取连接
 * 	void close(); // 关闭连接
 *
 * 	void executeUpdate(String sql);// 执行添加、更新、删除操作
 * 	ResultSet executeQuery(String sql);// 执行查询操作
 * }
 * 定义了连接和关闭数据库操作、数据库数据操作，如果底层数据库变化，则getConnection()方法需要改变，但数据操作方法可能无需改变
 * 可以按照单一职责原则把该接口一分为二，分别处理一种操作
 * 总结
 * 单一职能原则是所有原则中最简单的、最基本的一个
 *
 * 可以提高类的内聚性，有助于充分发挥面向对象编程语言的优势
 *
 * 要注意过犹不及。
 * 在没有需求变化征兆的的情况下，不要使用单一职责原则对类进行过细拆分
 *
 *掌握面向对象设计原则之里氏代换原则
 * 面向对象设计原则
 * 在使用面向对象思想进行系统设计时，总结出了若干面向对象设计原则，分别是
 * 单一职责原则
 * 开闭原则
 * 里氏代换原则
 * 依赖注入原则
 * 接口分离原则
 * 迪米特原则
 * 组合/聚合复用原则
 * 这些原则是面向对象设计的基石，坚持这些原则是提升面向对象设计质量的重要保障
 * 定义：
 * LSP：Liskov Substitution Principle，Liskov是该原则的提出者
 * 该原则的思想是：在任何父类出现的地方都可以用它的子类来代换，而不影响功能
 *
 * 里氏代换原则是对开闭原则的扩展
 * 采用开闭原则必然用到抽象和多态，而这离不开继承
 * 里氏代换原则就是对如何良好继承提出了衡量依据
 *
 * 企鹅继承鸟类不符合LSP，因为企鹅不会飞，不能完全代换父类
 * class Bird {
 * 	public void eat() {    }
 * 	public void fly() {System.out.println("用翅膀飞");	}
 * }
 *
 * class Penguin extends Bird {     }
 *
 * class Test {
 * 	public static void showFly(Bird bird) { bird.fly(); }
 * 	public static void main(String[] args) {
 * 		showFly(new Bird());
 * 		showFly(new Penguin());
 *        }
 * }
 *
 *
 * 子类Dolphin无法代换父类Pet
 * class Dolphin extends Pet {
 * 	public void incrediBubble() {
 * 	       System.out.println("神奇泡泡打砖块");}
 * }
 * public class Test {
 * 	public static void showPlay(Pet pet) {
 * 	       if (pet instanceof Dog) {
 * 		Dog dog = (Dog) pet;   dog.catchingFlyDisc();
 *                      } else if (pet instanceof Penguin) {
 * 		Penguin pgn = (Penguin) pet;   pgn.swimmin    ); }
 * 	}
 * 	public static void main(String[] args) {
 * 	       Dolphin dolphin = new Dolphin();
 * 	       showPlay(dol    in);
 * 	}
 * }
 *
 * 总结：
 * 里氏代换原则是对开闭原则的扩展
 * 开闭原则的实现离不开继承，而里氏代换原则对如何良好继承提出了衡量依据
 *
 *
 *
 * 闭合原则：等级管理接口中的关于对应等级经验与点数不同的方法，体现了开闭原则。
 * 里氏转换原则：抽象类中，对于公共行为进行了方法实现，对于具体行为给出了抽象方法，体现了里氏转换原则。
 * 整个设计体现了单一原则。
 */
public class index {

}
