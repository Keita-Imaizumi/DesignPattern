//機能クラスの階層
import java.util.Random;
public class countDisplay extends Display{
    public countDisplay(DisplayImpl impl){
        super(impl);
    }
    public void multiDisplay(int times){
        open();
        for (int i =0; i < times; i++){
            print();
        }
        close();
    }   
    public void randomDisplay(){
        int times = new Random().nextInt(10);
        open();
        for (int i =0; i < times; i++){
            print();
        }
        close();
    }
}