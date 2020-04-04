package EventManagmentSystem;

public class Stuff extends Person{
    private String ID;
   private String dutytime;

   public Stuff(String ID, String dutytime, String name, String email, String phone) {
       super(name, email, phone);
       this.ID = ID;
       this.dutytime = dutytime;
   }

   public String getID() {
       return ID;
   }

   public void setID(String ID) {
       this.ID = ID;
   }

   public String getDutytime() {
       return dutytime;
   }

   public void setDutytime(String dutytime) {
       this.dutytime = dutytime;
   }
   
   
     void display() { 
       System.out.println("ID:" +ID + "dutytime: "+dutytime);
  }
   

}
