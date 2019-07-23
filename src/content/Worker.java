package content;

/**
 *
 * @author yuvra
 */
public class Worker {
    private int workerID;
    private String workerName;
    private String workerStreet;
    private String workerCity;
    private double hoursWorked;
    private double hourlyPay;
    
    public Worker(int id){
        this.workerID = id;
    }

    /**
     * @return the workerID
     */
    public int getWorkerID() {
        return workerID;
    }

    /**
     * @return the workerName
     */
    public String getWorkerName() {
        return workerName;
    }

    /**
     * @param workerName the workerName to set
     */
    public void setWorkerName(String workerName) {
        this.workerName = workerName;
    }

    /**
     * @return the workerStreet
     */
    public String getWorkerStreet() {
        return workerStreet;
    }

    /**
     * @param workerStreet the workerStreet to set
     */
    public void setWorkerStreet(String workerStreet) {
        this.workerStreet = workerStreet;
    }

    /**
     * @return the workerCity
     */
    public String getWorkerCity() {
        return workerCity;
    }

    /**
     * @param workerCity the workerCity to set
     */
    public void setWorkerCity(String workerCity) {
        this.workerCity = workerCity;
    }

    /**
     * @return the hoursWorked
     */
    public double getHoursWorked() {
        return hoursWorked;
    }

    /**
     * @param hoursWorked the hoursWorked to set
     */
    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    /**
     * @return the hourlyPay
     */
    public double getHourlyPay() {
        return hourlyPay;
    }

    /**
     * @param hourlyPay the hourlyPay to set
     */
    public void setHourlyPay(double hourlyPay) {
        this.hourlyPay = hourlyPay;
    }
    
    
    
    
}
