package improve;

/**
 * @Author: xuhang
 * @Date: 2020/2/25 0:35
 * @Description:
 **/
public class OCP {
    public static void main(String[] args) {
        GraphicEditor graphicEditor = new GraphicEditor();
        graphicEditor.drawShape(new Rectangle());
        graphicEditor.drawShape(new Circle());
        graphicEditor.drawShape(new Triangle());
    }
}

class GraphicEditor{
    public void drawShape(Shape s){
        s.draw();
    }


}

abstract class Shape{
    abstract void draw();
}


class Rectangle extends Shape {
    @Override
    void draw() {
        System.out.println("绘制矩形");
    }
}

class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("绘制圆形");
    }
}

class Triangle extends Shape {
    @Override
    void draw() {
        System.out.println("绘制三角形");
    }
}
