public class Park {

    public class Attraction {
        private String name;
        private String openingTime;
        private String closingTime;
        private int cost;
        
        public Attraction(String name, String openingTime, String closingTime, int cost) {
            this.name = name;
            this.openingTime = openingTime;
            this.closingTime = closingTime;
            this.cost = cost;
        }

        public void getAttrInfo() {
            System.out.println("Name: " + name);
            System.out.println("Opening Time: " + openingTime);
            System.out.println("Closing Time: " + closingTime);
            System.out.println("Cost: " + cost);
        }
    }

    public static void main(String[] args) {
        Park park = new Park();
        Park.Attraction attraction1 = park.new Attraction("Диснейленд", "08:00", "20:00", 100);

        attraction1.getAttrInfo();
    }
}