package EventManagmentSystem;

public class Stuff extends Person {
    private String ID;
    private String dutytime;

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getdutytime() {
        return dutytime;
    }

    public void setdutytime(String dutytime) {
        this.dutytime = dutytime;
    }

    void display() { 
        System.out.println("ID:" +ID + "dutytime: "+dutytime);
   }
    
    
   
}