package EventManagmentSystem;

public class Event {
    private String name;
    private String date;
    private String vanue;

    public Event(String name, String date, String vanue) {
        this.name  = name;
        this.date  = date;
        this.vanue = vanue;
    
    }
   
    void display ()
    {
        System.out.println("Name : " +name);
        System.out.println("Date : " +date);
        System.out.println("Vanue : " +vanue);
    }
}
