public class Product {

    private String ID;
    private String Name;
    private String Description;
    private double Cost;

    static private double IDSeed = 1;



    public static void setIDSeed(double IDSeed) { Product.IDSeed = IDSeed; }

    public static double getIDSeed() {return IDSeed; }


    public Product(String ID, String Name, String Description, double Cost) {
        this.ID = ID;
        this.Name = Name;
        this.Description = Description;
        this.Cost = Cost;
    }


    /**
     *
     * Product setters and getters
     */
    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }

    public double getCost() {
        return Cost;
    }

    public void setCost(double Cost) {
        this.Cost = Cost;
    }


    public String toCSV(){
        return this.ID + ", " + this.Name + ", " + this.Description + ", " + this.Cost;
    }
}