public class FullBorder extends Boder {
    public FullBorder(Display display){
        super(display);
    }
    public int getColumn(){
        return 1 + display.getColumn() + 1;
    }
    public int getRows(){
        return 1 + display.getRows() + 1;
    }
    public String getRowText(int row){
        if (row == 0){
            return "+" + makeLine('-', display.getColumn()) + "+";
        } else if (row == display.getRows() + 1){
            return "+" + makeLine('-', display.getColumn()) + "+";
        }else{
            return '|' + display.getRowText(row - 1) + '|';
        }
    }
    private String makeLine(char ch, int count){
        StringBuffer buf = new StringBuffer();
        for (int i = 0; i < count; i++) {
            buf.append(ch);
        }
        return buf.toString();
    }
}
