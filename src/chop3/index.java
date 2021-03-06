package chop3;

/**
 *继承
 */
public class index {
    /**
     * 继承：
     * 	1.如果不使用继承，会出现以下一些问题：
     * 		（1）代码重复
     * 		（2）如果要修改的话，两个类都需要修改。
     * 	2.继承体现的是一种is a 的关系。eg:Dog is a Pet;apple is a Fruit;Student is a Person;
     * 子类可以继承到父类的哪些财产呢？
     * 	1.继承父类public修饰的属性，方法
     * 	2.不同包中，可以继承父类protected修饰符的属性和方法
     * 	3.同包中，可以继承父类默认修饰符的属性和方法
     * 	4.不可以继承private修饰的属性和方法，private只能在本类中访问。
     * 子类访问父类的成员：
     * 	1.访问属性：super.属性名
     * 	2.访问方法：super.方法名
     * 	3.访问构造方法：super.构造方法名
     * 方法的重写：
     * 	概念：当父类的方法满足不了子类的时候，需要子类重写父类的方法。（子类对父类所提供的方法不满意的时候，子类需要重写父类的方法）
     * 方法的重写的特点：
     * 	1.子类中的方法名和父类中的方法名一样。
     * 	2.子类中的参数列表和父类中的参数列表一样
     * 	3.子类中的返回值类型和父类中的一样，或者是其子类
     * 重载和重写的区别：
     * 	1.重载是在一个类中，方法名和返回值类型一样，参数列表不同。
     * 	2.重写，在两个类中，子类重写父类的方法，方法名一样，参数列表一样，返回值类型相同或者是其子类。
     * 	eg:public Object test(){}		//父类
     * 		public String test(){}		//子类
     * 	eg:public Pet test(){}			//父类
     * 		public Dog test(){}			//子类
     * 继承关系中的构造方法：
     * 	1.当子类的无参构造方法使用super调用父类里面无参的构造方法时，程序先执行父类的无参构造方法，再执行子类的无参构造方法。
     * 	2.当子类的无参构造方法不使用super调用父类的无参构造方法时，程序还是会先执行父类的无参构造方法，在执行子类的无参构造方法。
     * 	3.当子类的有参构造使用super调用父类的有参构造方法时，程序先执行父类有参的构造方法，再执行子类有参的构造方法。
     * 	4.当子类的有参构造方法不使用super调用父类的有参构造方法时，程序会先执行父类的无参构造方法，在执行子类的有参构造方法。
     * 	5.需要注意的是，如果要使用super,那么就得把super放在方法的第一行中。
     * 抽象类：
     * 	1.语法：public abstract class 类名{}
     * 	2.为了限制不能实例化某个类（父类）的时候，我们需要使用抽象类，关键词是abstract
     * 抽象方法：
     * 	1.语法：public abstract 返回类型 方法名();
     * 	2.抽象方法没有方法体。
     * 	3.抽象方法必须在抽象类中，抽象类中可以没有，可以有一个或者有好多个抽象方法。
     * 	4.子类必须重写父类的抽象方法。
     * final修饰符：
     * 	1.修饰属性的时候表示的是常量。
     * 	2.修饰类的时候，别的类无法继承它。
     * 	3.修饰方法的时候，子类不能重写父类的该方法。
     */
}
