public class Main {
    public static void main(String[] args) throws Exception {
       try {
            System.err.println("Making root entries...");
            Directory rootdir = new Directory("root");
            Directory bindir = new Directory("bin");
            Directory tmpdir = new Directory("tmp");
            Directory usrdir = new Directory("usr");
            rootdir.add(bindir);
            rootdir.add(tmpdir);
            rootdir.add(usrdir);
            bindir.add(new File("vi", 10000));
            bindir.add(new File("latex", 20000));
            rootdir.printList();

            System.err.println("");
            System.err.println("Making root entries...");
            Directory yuki = new Directory("yuki");
            Directory hanako = new Directory("hanako");
            Directory tomura = new Directory("tomura");
            usrdir.add(yuki);
            usrdir.add(hanako);
            usrdir.add(tomura);
            yuki.add(new File("diary.html", 100));
            yuki.add(new File("Composite.java", 200));
            hanako.add(new File("diary.html", 300));
            tomura.add(new File("diary.html", 400));
            tomura.add(new File("Composite.java", 500));
            rootdir.printList();
       } catch (FileTreatmentException e) {
            e.printStackTrace();
       }
    }
}
