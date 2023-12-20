public class Flower extends Plant{
    private final int SUMMER_GROW = 110;
    private final int AUTUMN_GROW =  0;
    private final int WINTER_GROW =  0;
    public Flower(String name, int springGrow) {
        super(name, springGrow);
    }

    //@Override
    public void grow() {
        switch (getSeason()){
            case "spring": setHeight(getHeight() + getSpringGrow()); break;
            case "summer":  seasonGrow(SUMMER_GROW);break;
            case "autumn": seasonGrow(AUTUMN_GROW);;break;
            case "winter": seasonGrow(WINTER_GROW);;break;
        }

    }

    private void seasonGrow(int factor){
        int change =  (int)Math.round(getSpringGrow()/100.0 * factor);
        setHeight(getHeight()+change);
    }
}
