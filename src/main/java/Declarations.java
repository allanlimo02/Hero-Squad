import org.sql2o.Sql2oException;

public class Declarations {
    private String  name;
    private String superpower1;
    private String superpower2;

    // constructor to create a new super hero
    public Declarations(String name, String superpower1, String superpower2) {
        this.name = name;
        this.superpower1 = superpower1;
        this.superpower2 = superpower2;
    }

    // Setters and getters
    public String getName() {

        return name;
    }
    public void setName(String name) {

        this.name = name;
    }
    public String getSuperpower1() {

        return superpower1;
    }
    public void setSuperpower1(String superpower1) {

        this.superpower1 = superpower1;
    }
    public String getSuperpower2() {
        return superpower2;
    }
    public void setSuperpower2(String superpower2) {

        this.superpower2 = superpower2;
    }
    // Functions to push user input to the database;

}
