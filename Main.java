package EventManagmentSystem;

public class Main {
    public static void main(String[] args) {
        
        manager manager = new manager("Melevalence Jam","Kidoo_lucu@gmail.com","012333312");   
        Event event1 = new Event("E3","31 february","Darling point _Farmgate");
        Expenditure obj = new  Expenditure("24 hrs",5000,"Madison Square Garden,LA.",1000,7000,event1);
        
        obj.display();
 
        
    }
}
