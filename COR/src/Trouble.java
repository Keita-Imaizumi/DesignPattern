public class Trouble {
    private final int number;
    public Trouble(int number){
        this.number = number;
    }
    public int getNumber(){
        return this.number;
    }
    @Override
    public String toString(){
        return "[Trouble" + number + "]";
    }
}
