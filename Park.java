package HW2;

public class Park {
    private String name;
    private Attraction[] attractions;
    private int currentAttractionIndex;

    public Park(String name, int numberOfAttractions) {
        this.name = name;
        this.attractions = new Attraction[numberOfAttractions];
        this.currentAttractionIndex = 0;
    }
    public class Attraction {
        private String name;
        private String openingTime;
        private String closingTime;
        private double price;

        public Attraction(String name, String openingTime, String closingTime, double price) {
            this.name = name;
            this.openingTime = openingTime;
            this.closingTime = closingTime;
            this.price = price;
        }
        public void printInfo() {
            System.out.println("Аттракцион: " + this.name);
            System.out.println("Время работы: " + this.openingTime + " - " + this.closingTime);
            System.out.println("Стоимость: " + this.price);
            System.out.println();
        }
    }
    public void addAttraction(String name, String openingTime, String closingTime, double price) {
        if (currentAttractionIndex < attractions.length) {
            attractions[currentAttractionIndex] = new Attraction(name, openingTime, closingTime, price);
            currentAttractionIndex++;
        } else {
            System.out.println("Максимум атракционов...");
        }
    }
    public void printAttractionsInfo() {
        System.out.println("Аттракционы парка \"" + name + "\":");
        for (int i = 0; i < currentAttractionIndex; i++) {
            attractions[i].printInfo();
        }
    }
    public static void main(String[] args) {
        Park park = new Park("ASTON парк", 5);
        park.addAttraction("Шейкер", "10:00", "20:00", 250);
        park.addAttraction("Американские горки", "10:00", "20:00", 350);
        park.addAttraction("Колесо обозрения", "10:30", "20:30", 250);
        park.addAttraction("Седьмое небо", "11:00", "21:00", 250);
        park.addAttraction("Бустер", "11:00", "21:00", 400);
        park.printAttractionsInfo();
    }
}