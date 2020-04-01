package EventManagmentSystem;

public class manager extends Person{
    private String MID;
    

    public manager(String name, String email, String phone) {
        super(name, email, phone);
        this.MID=MID;
    }

    public void setMID(String MID) {
        this.MID = MID;
    }
 
    public String getMID() {
        return MID;
    }
   
}