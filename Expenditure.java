package EventManagmentSystem;

public class Expenditure {
    private String duration;
private float foodcost;
    private String vanue;
    private float stuffcost;
    private float totalcost;
    private Event event;
    

public Expenditure(String duration, float foodcost, String vanue, float stuffcost, float totalcost,Event event) {
    this.duration = duration;
    this.foodcost = foodcost;
    this.vanue = vanue;
    this.stuffcost = stuffcost;
    this.totalcost = totalcost;
    this.event = event;
}

public String getDuration() {
    return duration;
}

public void setDuration(String duration) {
    this.duration = duration;
}

public float getFoodcost() {
    return foodcost;
}

public void setFoodcost(float foodcost) {
    this.foodcost = foodcost;
}

public String getVanue() {
    return vanue;
}

public void setVanue(String vanue) {
    this.vanue = vanue;
}

public float getStuffcost() {
    return stuffcost;
}

public void setStuffcost(float stuffcost) {
    this.stuffcost = stuffcost;
}

public float getTotalcost() {
    return totalcost;
}

public void setTotalcost(float totalcost) {
    this.totalcost = totalcost;
}
    
    
    void display ()
{
    event.display();
    System.out.println("Duration : " +duration);
    System.out.println("Foodcost : " +foodcost);
    System.out.println("Vanue : " +vanue);
    System.out.println("Stuff cost : " +stuffcost);
    System.out.println("Total cost : " +totalcost);
}
    

}

