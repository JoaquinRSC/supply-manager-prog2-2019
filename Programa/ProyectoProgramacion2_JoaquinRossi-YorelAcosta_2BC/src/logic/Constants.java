// @authors: Joaquin Rossi | Yorel Acosta | 2BC | ESI-BUCEO
package logic;

public class Constants {
    // Supply defaults
    public static final String supplyId = "A0";
    public static final String description = "Component";
    public static final double price = 1.0;       // USD
    public static final double basePrice = 1.0;   // USD
    public static final int quantity = 1;

    // Quote defaults
    public static final String quoteId = null;
    public static final String clientId = null;
    public static final String clientName = null;
    public static final double subtotal = 0.0;    // USD — price times quantity
    public static final double total = 1.0;       // USD
    public static final double laborCost = 0.30;  // USD/hour
    public static final double hoursWorked = 0.30;

    // Network setup defaults
    public static final String dataPlan = "Standard"; // download=60 Mb/s, upload=10 Mb/s
    public static final String uploadSpeed = "10";    // Mb/s
    public static final String downloadSpeed = "60";  // Mb/s
    public static final String isp = "Antel";         // internet service provider
    public static final int routerCount = 1;
    public static final double cableLength = 1.0;     // meters

    // PC assembly defaults
    public static final String purpose = "Workstation"; // Gaming | Standard | Workstation

    // Hardware defaults
    public static final String model = null;
    public static final String manufacturer = null;
    public static final String ramTech = "DDR3";         // DDR3 | DDR4
    public static final int ramCapacity = 512;           // MB
    public static final int ramFreq = 1333;              // MHz
    public static final short caseFormFactor = 3;        // 1=Desktop 2=Modding 3=Rack 4=Mini Tower
    public static final int psuWatts = 500;              // W
    public static final int storageCapacity = 1000;      // GB (1TB = 1000GB)
    public static final String storageTech = "HDD";      // HDD | SSD | M2 | EXT
    public static final short gpuMemory = 1;             // GB
    public static final int cpuCores = 1;
    public static final double cpuFreq = 1.0;            // GHz
    public static final boolean mbRgb = false;

    // Software defaults
    public static final boolean paid = true;
    public static final String version = "10:Pro";
    public static final String developer = "Windows";
}
