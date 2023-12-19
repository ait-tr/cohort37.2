public abstract class Pet {
    private PetFood food;
    private String name;
    private String owner;

    public Pet(String name, String owner) {
        this.name = name;
        this.owner = owner;
    }

    public String getName() {
        return name;
    }

    public String getOwner() {
        return owner;
    }

    public String toString(){
        return "{" +
                "name='" + name + '\'' +
                ", owner='" + owner + '\'' +
                        '}';
    }

    public void setFood(PetFood food) {
        this.food = food;
    }


    public abstract void say();



}
