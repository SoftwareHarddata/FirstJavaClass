public class Student {

    // Attributen
    private String gender = "m";
    private String name = "Paul";
    private int maNummer = 67676;

    // Konstruktor

    // Methoden

    // getter&setter
    public void setGender (String gender){
        this.gender=gender;
    }

    public String getGender(){
        return gender;
    }

    public void setName (String name){
        this.name=name;
    }

    public String getName(){
        return name;
    }

    public void setMaNummer (int maNummer){
        this.maNummer = maNummer;
    }

    public int getMaNummer(){
        return maNummer;
    }

    // toString
}
