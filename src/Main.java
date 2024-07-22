public class Main {
    public static void main(String[] args) {
        Margarita margarita= new Margarita(700,6,"Margarita");
        Margarita margarita1= new Margarita(800,7,"Margarita");
        Margarita margarita2= new Margarita(900,8,"Margarita");

        Peperoni peperoni =new Peperoni(560,5,"Peperoni");

        LaFinta laFinta = new LaFinta(670,8,"laFinta");

        margarita.cook(true);

        margarita.delivery();
    }
}
