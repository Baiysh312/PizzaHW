public class LaFinta extends Pizza{
    public LaFinta(int price, int weight, String name) {
        super(price, weight, name);
    }

    private String type;

    @Override
    public void cook(boolean isMushroom) {
        if (isMushroom==true){
            type="mushroom";
        }else type="no mushroom";
        System.out.println("testy pizza "+ getName());
    }

    @Override
    public void delivery() {
        System.out.println(etiketka());
    }

    @Override
    public String etiketka() {
        return "Pizza{" +
                "name='" + getName() + '\'' +
                ", price=" + getPrice() +
                ", weight=" + getWeight() +
                ", type="+type +
                '}';
    }
}
