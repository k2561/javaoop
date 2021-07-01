package chop2.几何图形类;

class TestShape {
    public static void main(String[] args) {
        //1、获取正方形的面积和周长
        Shape square = new Square(3);
        System.out.println(square.getArea());
        System.out.println(square.getPerimeter());
        //2、获取圆的面积和周长
        Circle circle = new Circle(3);
        System.out.println(circle.getArea());
        System.out.println(circle.getPerimeter());
    }
}
