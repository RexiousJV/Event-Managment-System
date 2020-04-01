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
    public String getname(String name)
    {
           return name;
    }
    public String getdate(String date)
    {
        return date;
    }
    public String getvanue(String vanue)
    {
        return vanue;
    }
    public void setname(String name)
    {
        this.name=name;
    }
        public void setdate(String date)
        {
            this.date=date;
        }   
        public void setvanue(String vanue)
        {
            this.vanue=vanue;
        }
    void display ()
    {
        System.out.println("Name : " +name);
        System.out.println("Date : " +date);
        System.out.println("Vanue : " +vanue);
    }
}