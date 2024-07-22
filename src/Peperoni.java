public class Peperoni extends Pizza{
    public Peperoni(int price, int weight, String name) {
        super(price, weight, name);
    }

    private String type;

    @Override
    public void cook(boolean isSpacy) {
        if (isSpacy==true){
            type="spacy";
        }else type="no spacy";
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
