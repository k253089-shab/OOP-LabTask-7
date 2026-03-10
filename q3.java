class Rectangle{
    int length;
    int breadth;

    Rectangle(int length, int breadth){
        this.length = length;
        this.breadth = breadth;
    }

    void printArea(){
        System.out.println("Area: " + (length * breadth));
    }

    void printPerimeter(){
        System.out.println("Perimeter: " + (2 * (length + breadth)));
    }
}


class Square extends Rectangle{
    Square(int s) {
        super(s, s);
    }
}


public class Main{
    public static void main(String[] args){

        Rectangle r = new Rectangle(10, 5);
        System.out.println("Rectangle:");
        r.printArea();
        r.printPerimeter();

        System.out.println();

        Square s = new Square(6);
        System.out.println("Square:");
        s.printArea();
        s.printPerimeter();
    }
}
