public abstract class Plant {
    private final String name;
    private int height;
    private final int springGrow;
    private String season;


    public Plant(String name, int springGrow) {
        this(name, springGrow,0);
    }

    public Plant(String name, int springGrow, int seedlingHeight) {
        this.name = name;
        this.springGrow = springGrow;
        this.season = "spring";
        this.height = seedlingHeight;
    }

    @Override
    public String toString() {
        return "Plant{" +
                "name='" + name + '\'' +
                ", height=" + height +
                ", springGrow=" + springGrow +
                ", season='" + season + '\'' +
                '}';
    }

   public abstract void grow();

    public String getName() {
        return name;
    }

    public int getHeight() {
        return height;
    }

    public int getSpringGrow() {
        return springGrow;
    }

    public String getSeason() {
        return season;
    }

    public void setSeason(String season) {
        this.season = season;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
