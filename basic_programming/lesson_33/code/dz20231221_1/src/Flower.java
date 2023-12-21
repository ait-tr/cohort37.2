public class Flower extends Plant{
    private final int SUMMER_GROW = 110;
    private final int AUTUMN_GROW =  0;
    private final int WINTER_GROW =  0;
    public Flower(String name, int springGrow) {
        super(name, springGrow);
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
}
