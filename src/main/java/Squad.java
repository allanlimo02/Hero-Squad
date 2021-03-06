import java.util.ArrayList;
import java.util.List;

public class Squad {
    private  String mName;
    private String mCauseForFighting;
    private String mSize;
    private static List<Squad> instances = new ArrayList<>();
    private int mid;
    private ArrayList<Heroes>mHeroes;

    public Squad(String name ,String causeForFighting, String size) {
        this.mName = name;
        this.mCauseForFighting = causeForFighting;
        this.mSize = size;
        instances.add(this);
        mid = instances.size();
        mHeroes = new ArrayList<Heroes>();

    }


    public String getName() {
        return mName;
    }

    public String getCauseForFighting() {
        return mCauseForFighting;
    }

    public String getSize() {
        return mSize;
    }

    public static ArrayList<Squad> all() {

        return (ArrayList<Squad>) instances;
    }

    public int getmId() {
        return mid;
    }

    public static Squad find(int id){
        return instances.get(id -1);
    }

    public List<Heroes> getHeroes(){
        return mHeroes;
    }

    public void addHero(Heroes hero) {
        mHeroes.add(hero);
    }
}
