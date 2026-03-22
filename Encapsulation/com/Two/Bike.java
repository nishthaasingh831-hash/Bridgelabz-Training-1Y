package Two;

class Bike extends Vehicle implements Insurable {
    private String insurancePolicyNumber;
    private double insuranceRate;

    public Bike(String vehicleNumber, double rentalRate, String policyNumber, double insuranceRate) {
        super(vehicleNumber, "Bike", rentalRate);
        this.insurancePolicyNumber = policyNumber;
        this.insuranceRate = insuranceRate;
    }

    public double calculateRentalCost(int days) {
        return rentalRate * days * 0.9;
    }

    public double calculateInsurance() {
        return insuranceRate;
    }

    public String getInsuranceDetails() {
        return "Bike Insurance Policy: " + insurancePolicyNumber;
    }
}