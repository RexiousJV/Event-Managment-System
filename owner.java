package EventManagmentSystem;

public class Owner extends Person{
    private String share;

   public Owner(String share, String name, String email, String phone) {
       super(name, email, phone);
       this.share = share;
   }
   
   @Override
   void display ()
     {
         super.display();
         System.out.println("Share : " +share);
    }
   public void totalcose (){
       System.out.println("Nothing");
   }
}
