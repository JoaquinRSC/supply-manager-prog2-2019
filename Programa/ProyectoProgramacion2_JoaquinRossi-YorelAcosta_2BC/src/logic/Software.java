// @authors: Joaquin Rossi | Yorel Acosta | 2BC | ESI-BUCEO
package logic;

public class Software extends Supply {
    private boolean paid = Constants.paid;
    private String version = Constants.version;
    private String developer = Constants.developer;

    public Software(String id, String description, double price, double basePrice,
                    boolean paid, String version, String developer) {
        super(id, description, price, basePrice);
        this.paid = paid;
        this.version = version;
        this.developer = developer;
    }

    // Getters
    public boolean isPaid() { return paid; }
    public String getVersion() { return version; }
    public String getDeveloper() { return developer; }

    // Setters
    public void setPaid(boolean paid) { this.paid = paid; }
    public void setVersion(String version) { this.version = version; }
    public void setDeveloper(String developer) { this.developer = developer; }
}
