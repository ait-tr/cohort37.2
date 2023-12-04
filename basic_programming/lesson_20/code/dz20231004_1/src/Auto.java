public class Auto {
    String marke;
    String model;
    int horsePower;
    double engineCapacity; // Объем двигателя


    public Auto(String marke, String model, int horsePower, double engineCapacity){
        this.marke = marke;
        this.model = model;
        this.horsePower = horsePower;
        this.engineCapacity = engineCapacity;


    }

    public String toString() {
        return marke + '/' + model + '/' + horsePower + '/' + engineCapacity;
    }




}

