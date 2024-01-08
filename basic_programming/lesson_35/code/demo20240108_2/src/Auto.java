public class Auto {
    private Brand brand;
    private String number;

    private Color1 color;

    public Auto(Brand brand, String number, Color1 color) {
        this.brand = brand;
        this.number = number;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Auto{" +
                "brand=" + brand +
                ", number='" + number + '\'' +
                ", color=" + color +
                '}';
    }

    public Brand getBrand() {
        return brand;
    }

    public String getNumber() {
        return number;
    }

    public Color1 getColor() {
        return color;
    }
}
