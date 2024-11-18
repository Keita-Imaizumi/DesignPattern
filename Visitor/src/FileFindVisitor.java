import java.util.Iterator;

public class FileFindVisitor extends Visitor{
    private final String suffix;

    public FileFindVisitor(String suffix){
        this.suffix = suffix;
    }
    @Override 
    public void visit(File file){
        if(file.getName().endsWith(suffix)){
            System.out.println(file.getName() + "(" + file.getSize() + ")");
        }

    }
    @Override
    public void visit(Directory directory) {
		Iterator<Entry> it = directory.iterator();
		while (it.hasNext()) {
			Entry entry = it.next();
			entry.accept(this);
		}
	}
}
