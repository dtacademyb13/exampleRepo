package myPack;

public class Engineer {

//Basic POJO


// fields
    private String name;
    private String position;

    public Engineer(String name, String position) {
        this.name = name;
        this.position = position;
    }
    
// getter and setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
}
