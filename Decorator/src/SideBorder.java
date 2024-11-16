public class SideBorder extends Boder{
    private char borderChar;
    public SideBorder(Display display, char ch){
        super(display);
        this.borderChar = ch;
    }
    public int getColumn(){
        return 1 + display.getColumn() + 1;
    }
    public int getRows(){
        return display.getRows();
    }
    public String getRowText(int row){
        return borderChar + display.getRowText(row) + borderChar;
    }
}
