public class Bond
{
    private double coupon;
    private int payments;
    private double interest;
    private double valueMaturity;

    public Bond() {}

    public Bond(double coupon, int payments, double interest, double valueMaturity)
    {
        this.coupon = coupon;
        this.payments = payments;
        this.interest = interest;
        this.valueMaturity = valueMaturity;
    }

    public double getCoupon()
    {
        return coupon;
    }

    public int getPayments()
    {
        return payments;
    }

    public double getInterest()
    {
        return interest;
    }

    public double getValueMaturity()
    {
        return valueMaturity;
    }

    public double getPrice()
    {
        double price = 0;
        price = coupon * ( (1 - Math.pow((1 + interest),-payments) / interest )) + valueMaturity * Math.pow((1 + interest),-payments);

        return price;
    }

    public void setCoupon(double coupon)
    {
        this.coupon = coupon;
    }

    public void setPayments(int payments)
    {
        this.payments = payments;
    }

    public void setInterest(double interest)
    {
        this.interest = interest;
    }

    public void setValueMaturity(double valueMaturity)
    {
        this.valueMaturity = valueMaturity;
    }
}
