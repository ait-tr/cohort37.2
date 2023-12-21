public class Tree extends Plant{
    private final int maxHeight;
    private final int SUMMER_GROW = 100;
    private final int AUTUMN_GROW =  50;
    private final int WINTER_GROW =  30;


    public Tree(String name, int springGrow,  int seedlingHeight, int maxHeight) {
        super(name, springGrow,seedlingHeight);
        this.maxHeight = maxHeight;

    }
    @Override
    public int getSummerGrowFactor() {
        return SUMMER_GROW;
    }

    @Override
    public int getAutumnGrowFactor() {
        return AUTUMN_GROW;
    }

    @Override
    public int getWinterGrowFactor() {
        return WINTER_GROW;
    }

    @Override
    public int calcSeasonGrow(int factor){
        int change = (int)Math.round(getSpringGrow()/100.0 * factor);
        return getHeight()+change> maxHeight ? maxHeight-getHeight() : change;
    }


}
