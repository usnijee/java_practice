package extends1.ex;

public class Movie extends Item {

    private String pd;
    private String actor;

    public Movie(String name, int price, String pd, String actor){
        super(name, price);
        this.pd = pd;
        this.actor = actor;
    }

    @Override
    public void print(){
        super.print();
        System.out.println("- 감독:" + pd + ", 배우:" + actor);
    }
}
