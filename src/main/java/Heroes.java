import java.util.ArrayList;

public class Heroes {
    private String mName;
    private String mAge;
    private String mPower;
    private String mWeakness;
    private static ArrayList<Heroes> instances = new ArrayList<>();
    private int id ;

    public Heroes (String name, String age, String power, String weakness){
        mName = name;
        mAge =  age;
        mPower = power;
        mWeakness = weakness;
        instances.add(this);
        id = instances.size();

    }

    public String getName() {

        return mName;
    }


    public String getAge() {

        return mAge;
    }

    public String getPower() {

        return mPower;
    }

    public String getWeakness() {
        return
                mWeakness;
    }

    public static ArrayList<Heroes> all() {

        return instances;
    }

    public static void clear(){

        instances.clear();
    }

    public int getmId() {

        return id;
    }

}
