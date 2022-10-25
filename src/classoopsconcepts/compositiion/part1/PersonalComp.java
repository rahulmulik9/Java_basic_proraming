package classoopsconcepts.compositiion.part1;

public class PersonalComp {
private Case theCase;
private Monitor monitor;
private Motherboard motherboard;

    public Case getTheCase() {
        return theCase;
    }

    public void setTheCase(Case theCase) {
        this.theCase = theCase;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public Motherboard getMotherboard() {
        return motherboard;
    }

    public void setMotherboard(Motherboard motherboard) {
        this.motherboard = motherboard;
    }

    public PersonalComp(Case theCase, Monitor monitor, Motherboard motherboard) {
        this.theCase = theCase;
        this.monitor = monitor;
        this.motherboard = motherboard;
    }
}
