package sawant.mihir.simplemvc.model;

public enum Type {

    FOOD("Snacks and Food"),
    BEVERAGE("Hot and Cold Drinks"),
    DAIRY("Dairy products"),
    OTHERS("other items");

    private String name;

    Type(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
