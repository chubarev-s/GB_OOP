package HW2;

public class Program {
    public static void main(String[] args) {
        Market market = new Market();
        Human human1 = new Human("dsfsdfew");
        Human human2 = new Human("fsfsefew");
        market.acceptToMarket(human1);
        market.acceptToMarket(human2);
        market.update();
    }
}
