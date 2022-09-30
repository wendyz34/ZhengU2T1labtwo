public class RectangleRunner {
    public static void main(String[]args){
        Rectangle rect1 = new Rectangle(10,20);
        int area = rect1.printArea();
        int volume = rect1.printBoxVolume(25);
        System.out.print("The rectangle has a area of " +area + "and a volume of" +volume);

    }
}
