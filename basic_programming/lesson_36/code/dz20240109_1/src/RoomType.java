public enum RoomType {
    /*
    Standard – стандартный однокомнатный номер,
    Studio – однокомнатный номер с мини-кухней,
    Junior Suite – номер улучшенной планировки,
    Suite – улучшенной планировки, из двух комнат,
    Deluxe – номер повышенного комфорта,
    President – самые роскошные номера)

     */
    STANDART(50.0,"стандартный однокомнатный номер") {
        public void printName(){
            System.out.println("STANDART (" + this.getDescription() +")" );
        }
    },
    STUDIO(70.0,"однокомнатный номер с мини-кухней"){
        public void printName(){
            System.out.println("STUDIO (" + this.getDescription() +")" );
        }
    },
    JUNIOR_SUITE(85.0,"номер улучшенной планировки"){
        public void printName(){
            System.out.println("JUNIOR_SUITE (" + this.getDescription() +")" );
        }
    },
    SUITE(100.0,"улучшенной планировки, из двух комнат"){
        public void printName(){
            System.out.println("SUITE (" + this.getDescription() +")" );
        }
    },
    DELUXE(150.0,"номер повышенного комфорта"){
        public void printName(){
            System.out.println("DELUXE (" + this.getDescription() +")" );
        }
    },
    PRESIDENT(400,"самый роскошный номер"){
        public void printName(){
            System.out.println("PRESIDENT (" + this.getDescription() +")" );
        }
    };

    private double price;
    private String description;

    RoomType(double price, String description) {
        this.price = price;
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "RoomType{" +
                "price=" + price +
                ", description='" + description + '\'' +
                '}';
    }

    public abstract  void  printName();


}
