/**
 * Created by Maria.Guseva on 31.07.2017.
 */
// Класс B делегирует свои полномочия классу A
public class Delegate {
    public static void main(String[] args){
//        A a = new A();
//        a.f();
//
//        B b = new B();
//        b.f();

        Painter painter = new Painter();
        painter.setGraphics(new Square());
        painter.draw();

        painter.setGraphics(new Triangle());
        painter.draw();


    }
}

class A {
    void f(){
        System.out.println("f()");
    }
}

class B {
    A a = new A();

    void f(){
        a.f();
    }
}

interface Graphics {
    void draw();
}

class Triangle implements Graphics{
    public void draw() {
        System.out.println("Drawing triangle...");
    }
}

class Square implements Graphics{
    public void draw() {
        System.out.println("Drawing square...");
    }
}

class Painter {
    Graphics graphics;

    public void setGraphics(Graphics graphics) {
        this.graphics = graphics;
    }

    public void draw(){
        graphics.draw();
    }
}
