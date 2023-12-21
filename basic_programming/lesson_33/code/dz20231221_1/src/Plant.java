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





    public abstract int getSummerGrowFactor();

    public abstract int getAutumnGrowFactor();

    public abstract int getWinterGrowFactor();

    public int getSpringGrowFactor(){
        return 100;
    }




    public void grow() {
        switch (getSeason()){
            case "spring": seasonGrow(getSpringGrowFactor()); break;
            case "summer": seasonGrow(getSummerGrowFactor());break;
            case "autumn": seasonGrow(getAutumnGrowFactor());;break;
            case "winter": seasonGrow(getWinterGrowFactor());;break;
        }

    }

    private void seasonGrow(int factor){
        height += calcSeasonGrow(factor);
    }

    public int calcSeasonGrow(int factor){
        return (int)Math.round(getSpringGrow()/100.0 * factor);
    }




}
