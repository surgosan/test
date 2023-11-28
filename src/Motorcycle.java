public class Motorcycle {
    private int id;
    private int engineSize;
    private boolean hasSpoiler;

    public Motorcycle() {
        this.id = 2;
        this.engineSize = 50;
        this.hasSpoiler = false;
    }

    public Motorcycle(int id, int engineSize, boolean hasSpoiler) {
        this.id = id;
        if(engineSize == 50 || engineSize == 100 || engineSize == 150) {
            this.engineSize = engineSize;
        } else {
            System.out.println("Invalid Engine Size (50, 100, 150)");
        }
        this.hasSpoiler = hasSpoiler;
    }

    public int getId() {
        return id;
    }

    public int getEngineSize() {
        return engineSize;
    }

    public boolean getSpoiler() {
        return hasSpoiler;
    }

    public boolean setEngineSize(int eSize) {
        if(eSize == 50 || eSize == 100 || eSize == 150) {
            this.engineSize = eSize;
            return true;
        } else {
            System.out.println("Invalid Engine Size (50, 100, 150)");
            return false;
        }
    }

    public void setHasSpoiler(boolean hasSpoiler1) {
        this.hasSpoiler = hasSpoiler1;
    }

    public void displayMotorcycle() {
        int topSpeed = 30;
        if(engineSize == 100) {topSpeed = 45;};
        if(engineSize == 150) {topSpeed = 60;};

        if(hasSpoiler) {
            topSpeed--;
            System.out.printf("Motorcycle #%d's engine is %dcc. It has a spoiler.%n", id, engineSize);
            System.out.printf("It has a top speed of %dMPH%n",topSpeed);

            return;
        };
        System.out.printf("Motorcycle #%d's engine is %dcc.%n", id, engineSize);
        System.out.printf("It has a top speed of %dMPH%n",topSpeed);    }
}
