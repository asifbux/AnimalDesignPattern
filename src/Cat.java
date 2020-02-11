public class Cat extends Animal {

    // cat must implment the constructor from Animal
    public Cat(Walkable walki, Talkable talki, float weight) {
        super(walki, talki, weight);
    }

    @Override
    public void performTalk() {
        getTalki().talk();
        // if we dont want no talker, we can just getTalk

    }

    // the logic to control the cat woud go here
    @Override
    public void performWalk() {
        getWalki().walk();
        setWalki( new Jumper());
        getWalki().walk();
    }
}
