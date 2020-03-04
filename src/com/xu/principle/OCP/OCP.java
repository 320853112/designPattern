package com.xu.principle.OCP;

/**
 * @Author: xuhang
 * @Date: 2020/2/25 0:23
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
        if(s.m_type==1){
            drawRectangle(s);
        }else if(s.m_type==2){
            drawCircle(s);
        } else if(s.m_type==3){
            drawTriangle(s);
        }
    }

    public void drawRectangle(Shape s){
        System.out.println("绘制矩形");
    }

    public void drawCircle(Shape s){
        System.out.println("绘制圆形");
    }

    public void drawTriangle(Shape s){
        System.out.println("绘制三角形");
    }
}

class Shape{
    public int m_type;
}

class Rectangle extends  Shape{
    Rectangle(){
        this.m_type = 1;
    }
}

class Circle extends  Shape{
    public Circle() {
        this.m_type = 2;
    }
}

class Triangle extends Shape{
    public Triangle() {
        this.m_type = 3;
    }
}

