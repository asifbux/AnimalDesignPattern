public abstract class Animal {

    private Walkable walki;
    private Talkable talki;
    private float weight;

    public abstract void performTalk();

    public abstract void performWalk();

    public Walkable getWalki() {
        return walki;
    }

    public void setWalki(Walkable walki) {
        this.walki = walki;
    }

    public Talkable getTalki() {
        return talki;
    }

    public void setTalki(Talkable talki) {
        this.talki = talki;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }


}
