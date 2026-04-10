// @authors: Joaquin Rossi | Yorel Acosta | 2BC | ESI-BUCEO
package logic;

public class NetworkSetup extends Quote {
    private String dataPlan = Constants.dataPlan;
    private String uploadSpeed = Constants.uploadSpeed;     // Mb/s
    private String downloadSpeed = Constants.downloadSpeed; // Mb/s
    private String isp = Constants.isp;
    private int routerCount = Constants.routerCount;
    private double cableLength = Constants.cableLength;     // meters

    public NetworkSetup(String quoteId, double laborCost, double subtotal, double total,
                        double hoursWorked, String clientId, String clientName,
                        String dataPlan, String uploadSpeed, String downloadSpeed,
                        String isp, int routerCount, double cableLength) {
        super(quoteId, laborCost, subtotal, total, hoursWorked, clientId, clientName);
        this.dataPlan = dataPlan;
        this.uploadSpeed = uploadSpeed;
        this.downloadSpeed = downloadSpeed;
        this.isp = isp;
        this.routerCount = routerCount;
        this.cableLength = cableLength;
    }

    // Getters
    public String getDataPlan() { return dataPlan; }
    public String getUploadSpeed() { return uploadSpeed; }
    public String getDownloadSpeed() { return downloadSpeed; }
    public String getIsp() { return isp; }
    public int getRouterCount() { return routerCount; }
    public double getCableLength() { return cableLength; }

    // Setters
    public void setDataPlan(String dataPlan) { this.dataPlan = dataPlan; }
    public void setUploadSpeed(String uploadSpeed) { this.uploadSpeed = uploadSpeed; }
    public void setDownloadSpeed(String downloadSpeed) { this.downloadSpeed = downloadSpeed; }
    public void setIsp(String isp) { this.isp = isp; }
    public void setRouterCount(int routerCount) { this.routerCount = routerCount; }
    public void setCableLength(double cableLength) { this.cableLength = cableLength; }
}
