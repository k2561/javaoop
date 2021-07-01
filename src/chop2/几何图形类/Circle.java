package chop2.几何图形类;

class Circle extends Shape {
    private double radius = 0; // 圆的半径
    private final static double PI = 3.14; // 圆周率
    /**
     * 有参构造方法。
     * @param radius 半径
     */
    public Circle(double radius) {
        this.radius = radius;
    }
    /*
     * (non-Javadoc)
     * @see cn.jbit.tg.abstr.Shape#getArea()
     */
    public double getArea() {
        return (PI * radius * radius);
    }
    /*
     * (non-Javadoc)
     * @see cn.jbit.tg.abstr.Shape#getPerimeter()
     */
    public double getPerimeter() {
        return 2*PI*radius;
    }
}
