package EventManagmentSystem;

public class owner extends Person{
    private String share;

    public owner(String name, String email, String phone,String share) {
        super(name, email, phone);
        this.share=share;
    
    }
    
    void display ()
      {
          super.display();
          System.out.println("Share : " +share);
     }
    public void totalcose (){
        System.out.println("Nothing");
    }
             
     
    
}