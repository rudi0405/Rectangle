class Rectangle {
    int length, breadth;
    Rectangle(int len, int bre) {
        this.length=len;
        this.breadth=bre;
    }
    public int getArea() {
        int area = this.length*this.breadth;
        return area;
    }
}
class Main {
    public static void main(String[]args)
    {
        Rectangle obj = new Rectangle(5, 8);
        System.out.println("Area: " + obj.getArea() );
    }
}