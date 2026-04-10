// @authors: Joaquin Rossi | Yorel Acosta | 2BC | ESI-BUCEO
package logic;

public abstract class Quote {
    protected String quoteId = Constants.quoteId;
    protected String clientId = Constants.clientId;
    protected String clientName = Constants.clientName;
    protected double laborCost = Constants.laborCost;
    protected double subtotal = Constants.subtotal;
    protected double total = Constants.total;
    protected double hoursWorked = Constants.hoursWorked;

    public Quote(String quoteId, double laborCost, double subtotal, double total,
                 double hoursWorked, String clientId, String clientName) {
        this.quoteId = quoteId;
        this.laborCost = laborCost;
        this.subtotal = subtotal;
        this.total = total;
        this.hoursWorked = hoursWorked;
        this.clientId = clientId;
        this.clientName = clientName;
    }

    // Getters
    public String getQuoteId() { return quoteId; }
    public double getSubtotal() { return subtotal; }
    public double getTotal() { return total; }
    public double getHoursWorked() { return hoursWorked; }
    public String getClientId() { return clientId; }
    public String getClientName() { return clientName; }
    public double getLaborCost() { return laborCost; }

    // Setters
    public void setQuoteId(String quoteId) { this.quoteId = quoteId; }
    public void setSubtotal(double subtotal) { this.subtotal = subtotal; }
    public void setTotal(double total) { this.total = total; }
    public void setHoursWorked(double hoursWorked) { this.hoursWorked = hoursWorked; }
}
