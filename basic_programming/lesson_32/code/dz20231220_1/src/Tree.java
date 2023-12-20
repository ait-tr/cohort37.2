public class Tree extends Plant{
    private final int maxHeight;
    private final int SUMMER_GROW = 100;
    private final int AUTUMN_GROW =  50;
    private final int WINTER_GROW =  30;


    public Tree(String name, int springGrow,  int seedlingHeight, int maxHeight) {
        super(name, springGrow,seedlingHeight);
        this.maxHeight = maxHeight;

    }
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
