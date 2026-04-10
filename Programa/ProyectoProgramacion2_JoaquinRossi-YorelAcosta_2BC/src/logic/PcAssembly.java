// @authors: Joaquin Rossi | Yorel Acosta | 2BC | ESI-BUCEO
package logic;

public class PcAssembly extends Quote {
    private String purpose = Constants.purpose; // Gaming | Standard | Workstation

    public PcAssembly(String quoteId, double laborCost, double subtotal, double total,
                      double hoursWorked, String clientId, String clientName, String purpose) {
        super(quoteId, laborCost, subtotal, total, hoursWorked, clientId, clientName);
        this.total = calculateTotal(laborCost, subtotal, hoursWorked, purpose);
        this.purpose = purpose;
    }

    // Getters / Setters
    public String getPurpose() { return purpose; }
    public void setPurpose(String purpose) { this.purpose = purpose; }

    /**
     * Calculates the final quote total.
     * total = subtotal (supply costs) + labor (hourly rate × hours worked)
     * A purpose-based markup is applied on top for specialized builds.
     */
    public double calculateTotal(double laborCost, double subtotal, double hoursWorked, String purpose) {
        double laborTotal = laborCost * hoursWorked;
        double base = subtotal + laborTotal;

        switch (purpose) {
            case "Gaming":
                return base * 1.05; // 5% premium for gaming builds
            case "Workstation":
                return base * 1.10; // 10% premium for workstation builds
            default:
                return base;        // Standard build — no markup
        }
    }
}
