public class Test4 {
    private double diameter;

    public double getDiameter() {

        return diameter;
    }

    public void setDiameter(double diameter) throws DiameterException {
        if (diameter <= 0) {
            throw new DiameterException("Диаметр меньше 0");
        }
        this.diameter = diameter;
    }
}