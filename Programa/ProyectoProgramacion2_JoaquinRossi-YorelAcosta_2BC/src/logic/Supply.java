// @authors: Joaquin Rossi | Yorel Acosta | 2BC | ESI-BUCEO
package logic;

public abstract class Supply {
    protected String id = Constants.supplyId;
    protected String description = Constants.description;
    protected double price = Constants.price;
    protected double basePrice = Constants.basePrice;

    public Supply(String id, String description, double price, double basePrice) {
        this.id = id;
        this.description = description;
        this.price = price;
        this.basePrice = basePrice;
    }

    // Getters
    public String getId() {
        return id;
    }
    public String getDescription() {
        return description;
    }
    public double getPrice() {
        return price;
    }
    public double getBasePrice() {
        return basePrice;
    }

    // Setters
    public void setId(String id) {
        this.id = id;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public void setBasePrice(double basePrice) {
        this.basePrice = basePrice;
    }
}
