package EventManagmentSystem;

public class Expenditure {
	private String duration;
	private float foodcost;
    private String vanue;
    private float stuffcost;
    private float totalcost;

    public Expenditure (String duration, float foodcost,String vanue, float stuffcost, float totalcost) {
    	this.duration=duration;
        this.foodcost=foodcost;
        this.vanue = vanue;
        this.stuffcost=stuffcost;
        this.totalcost=totalcost;
    }
    public String getduration(String duration)
    {
           return duration;
    }
    public float getdate(float foodcost)
    {
        return foodcost;
    }
    public String getvanue(String vanue)
    {
        return vanue;
    }
    public float getstuffcost1(float stuffcost)
    {
        return stuffcost;
    }
    public float getstuffcost(float totalcost)
    {
        return totalcost;
    }
    public void setduration(String duration)
    {
        this.duration=duration;
    }
        public void setfoodcost(float foodcost)
        {
            this.foodcost=foodcost;
        }   
        public void setvanue(String vanue)
        {
            this.vanue=vanue;
        }
        public void setstuffcost(float stuffcost)
        {
            this.stuffcost=stuffcost;
        }
        public void settotalcost(float totalcost)
        {
            this.totalcost=totalcost;
        }
    void display ()
    {
        System.out.println("Duration : " +duration);
        System.out.println("Foodcost : " +foodcost);
        System.out.println("Vanue : " +vanue);
        System.out.println("Stuff cost : " +stuffcost);
        System.out.println("Total cost : " +totalcost);
    }
}
