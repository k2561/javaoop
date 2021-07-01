package chop2.几何图形类;

class Square extends Shape {
    private double height = 0; // 正方形的边长
    /**
     * 有参构造方法。
     * @param height 边长
     */
    public Square(double height) {
        this.height = height;
    }
    /*
     * (non-Javadoc)
     * @see cn.jbit.tg.abstr.Shape#getArea()
     */
    public double getArea() {
        return (this.height * this.height);
    }
    /*
     * (non-Javadoc)
     * @see cn.jbit.tg.abstr.Shape#getPerimeter()
     */
    public double getPerimeter() {
        return 4*height;
    }
}
