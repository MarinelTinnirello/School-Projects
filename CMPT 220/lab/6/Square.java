public class Square
{
    private double height;
    private double width;

    Square()
    {
        this.height = 1;
        this.width = 1;
    }
    Square(double width, double height)
    {
        this.width = width;
        this.height = height;
    }

    public double getArea()
    {
        return this.width * this.height;
    }
    public double getPerimeter()
    {
        return  2 *(this.width + this.height);
    }

    public String toString()
    {
        java.text.DecimalFormat decimalFormat = new java.text.DecimalFormat("#.##");
        String output = "Width : " + this.width + "\t" + "Height : " + this.height + "\t" + "Area : " + decimalFormat.format(getArea())
                + "\t" + "Perimeter : " + decimalFormat.format(getPerimeter());
        return output;
    }
}
