public class Planet{

    private String name;
    private String imageFilename;
    private int diameter;
    private double orbitalPeriod;


    public Planet(String name, String imageFilename, int diameter, double orbitalPeriod){
        this.name = name;
        this.imageFilename = imageFilename;
        this.diameter = diameter;
        this.orbitalPeriod = orbitalPeriod;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getImageFilename(){
        return imageFilename;
    }

    public void setImageFilename(String imageFilename){
        this.imageFilename = imageFilename;
    }

    public int getDiameter(){
        return diameter;
    }

    public void setDiameter(int diameter){
        this.diameter = diameter;
    }

    public double getOrbitalPeriod(){
        return orbitalPeriod;
    }

    public void setOrbitalPeriod(double orbitalPeriod){
        this.orbitalPeriod = orbitalPeriod;
    }

    @Override
    public String toString(){
        return name;
    }
}
