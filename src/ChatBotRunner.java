public class ChatBotRunner {
    public static void main(String[]args){
        ChatBot debbie = new ChatBot("debbie",5);
        //void
        debbie.greeting("Wendy");
        debbie.favoriteNumber(9);
        debbie.weather();
        debbie.feeling();

        //non-void
        double meters = debbie.convertFeetToMeters(20);
        System.out.println("20 feet converts to " + meters +"meters");

        int sum = debbie.addNumbers(9,5,3);
        System.out.println("The sum of the numbers is " + sum);

        String message = debbie.goodbye();
        System.out.println(message);

        double weight = debbie.weight(100);
        System.out.print("My weight from pounds to kg is " +weight);

    }
}
