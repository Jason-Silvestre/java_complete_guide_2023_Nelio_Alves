public class Rectangule {
    public double width;
    public double height;

    public double area() {
        double rectaguleArea = (width * height);
        return rectaguleArea;
    }

    public double perimeter() {
        double reactangulePerimeter = (2*(width + height));
        return  reactangulePerimeter;
    }

    public double diagonal() {
        double reactanguleDiagonal = (Math.sqrt((width*width)+(height*height)));
        return reactanguleDiagonal;
    }
}
