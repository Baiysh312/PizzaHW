public class Margarita extends Pizza{
    public Margarita(int price, int weight, String name) {
        super(price, weight, name);
    }

    private String type;

    @Override
    public void cook(boolean isMeat) {
        if (isMeat==true){
            type="meat";
        }else type="no meat";
        System.out.println("testy pizza "+getName());
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