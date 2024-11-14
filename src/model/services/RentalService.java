package model.services;

public class RentalService {

    private Double pricePerHour;
    private Double pricePerDay;

    private TaxService tax;

    public RentalService(Double pricePerHour, Double pricePerDay, TaxService tax) {
        this.pricePerHour = pricePerHour;
        this.pricePerDay = pricePerDay;
        this.tax = tax;
    }

    public Double getPricePerHour() {
        return pricePerHour;
    }

    public void setPricePerHour(Double pricePerHour) {
        this.pricePerHour = pricePerHour;
    }

    public Double getPricePerDay() {
        return pricePerDay;
    }

    public void setPricePerDay(Double pricePerDay) {
        this.pricePerDay = pricePerDay;
    }

    public TaxService getTax() {
        return tax;
    }

    public void setTax(TaxService tax) {
        this.tax = tax;
    }


}
