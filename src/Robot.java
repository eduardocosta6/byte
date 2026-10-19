public class Robot {
    private String name;
    private int energy;
    private int happiness;
    private boolean isSleeping;


    // constructors
    public Robot(String name, int energy, int happiness, boolean isSleeping) {
        setName(name);
        setEnergy(energy);
        setHappiness(happiness);
        setSleeping(isSleeping);
    }


public Robot(String name) {
    this.name = name;
}
public Robot(int energy, int happiness) {
    this.energy = energy;
    this.happiness = happiness;
}
public Robot(boolean isSleeping) {
    this.isSleeping = isSleeping;
}

    public void setName(String name) {
        this.name = name;
    }

    public void setEnergy(int energy) {
        this.energy = energy;
    }

    public void setHappiness(int happiness) {
        this.happiness = happiness;
    }

    public void setSleeping(boolean sleeping) {
        isSleeping = sleeping;
    }

    public void printStatus() {
    System.out.println("Name" + name);
    System.out.println("Energy" + energy);
    System.out.println("Happiness" + happiness);
    System.out.println("IS Sleeping" + isSleeping );
}
}

