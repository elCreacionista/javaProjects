package SPACES;

public class Environment {
    private double Oxygen;
    private double Dioxide;
    private double Toxins;
    private double Nitrits;
    private double Pressure;
    private int    size;
    Quality quality;

    public Environment(){}
    public Environment(double o,double d, double t, double n, double p, int s, Quality q){
        this.Oxygen = o;
        this.Dioxide = d;
        this.Toxins = t;
        this.Nitrits = n;
        this.Pressure = p;
        this.quality = q;
        this.size = s;
    }


    public void setup(){
    }

    public String getValues(){
        return "Oxigen " + this.Oxygen + " Dioxide " + this.Dioxide + " Toxins " +
                this.Toxins + " Nitrits " + this.Nitrits + " Pressure " + this.Pressure +
                " Quality " + this.quality + "Size: " + this.size;
    }

    public double getOxygen() {
        return Oxygen;
    }

    public double getDioxide() {
        return Dioxide;
    }

    public double getToxins() {
        return Toxins;
    }

    public double getNitrits() {
        return Nitrits;
    }

    public double getPressure() {
        return Pressure;
    }

    public int getSize() {
        return size;
    }

    public Quality getQuality() {
        return quality;
    }

    public void setOxygen(double oxygen) {
        Oxygen = oxygen;
    }

    public void setDioxide(double dioxide) {
        Dioxide = dioxide;
    }

    public void setToxins(double toxins) {
        Toxins = toxins;
    }

    public void setNitrits(double nitrits) {
        Nitrits = nitrits;
    }

    public void setPressure(double pressure) {
        Pressure = pressure;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void setQuality(Quality quality) {
        this.quality = quality;
    }
}
