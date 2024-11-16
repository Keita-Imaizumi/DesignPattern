import java.util.Random;
public class RandomStrategy implements Strategy{
    private Random random;
    private Hand prevHand;
    public RandomStrategy(int seed){
        random = new Random(seed);
    }
    public Hand nextHand() {
        return  prevHand.getHand(random.nextInt(3));
    }

    public void study(boolean win){
    }
}
