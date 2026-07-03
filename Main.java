public class Main {

    public static void main(String[] args) {

        SmartMeter meter = new SmartMeter("MTR001", 500);

        System.out.println("Meter ID: " + meter.getMeterId());
        System.out.println("Opening Credit: " + meter.getCreditBalance());

        System.out.println();

        meter.recordConsumption(5);

        System.out.println("Credit After 5 Litres: "
                + meter.getCreditBalance());

        System.out.println("Valve Open: "
                + meter.isValveOpen());

        System.out.println();

        meter.recordConsumption(20);

        System.out.println("Credit After More Usage: "
                + meter.getCreditBalance());

        System.out.println("Valve Open: "
                + meter.isValveOpen());

        System.out.println();

        meter.loadToken(1000);

        System.out.println("Credit After Loading Token: "
                + meter.getCreditBalance());

        System.out.println("Valve Open: "
                + meter.isValveOpen());
    }
}