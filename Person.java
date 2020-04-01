package EventManagmentSystem;
public class Person {
    private String name;
    private String email;
    private String phone;

    public Person(String name, String email, String phone) {
        this.name = name;
        this.email = email;
        this.phone = phone;
    
    }
    public String getname(String name)
    {
           return name;
    }
    public String getemail(String email)
    {
        return email;
    }
    public String getphone(String phone)
    {
        return phone;
    }
    public void setname(String name)
    {
        this.name=name;
    }
        public void setemail(String email)
        {
            this.email=email;
        }   
        public void setphone(String phone)
        {
            this.phone=phone;
        }
    void display ()
    {
        System.out.println("Name : " +name);
        System.out.println("Email : " +email);
        System.out.println("Phone : " +phone);
    }
    
    
}