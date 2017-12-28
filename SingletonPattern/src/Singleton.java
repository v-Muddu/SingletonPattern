public class Singleton {
    private static Singleton newInstance = null;
    public Singleton(){}
    public static Singleton getInstance(Singleton singleton){
        if(singleton == null){
            singleton = new Singleton();
            return singleton;
        }
        return null;
    }

    public static void main(String[] args) {
        Singleton.getInstance( Singleton.newInstance);
        System.out.println("Done!");
    }
}
