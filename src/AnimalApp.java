public class AnimalApp {
    /*
    In this case, we wanted to make the cat a NormalWalker and a normal Meower.
    However, we can make the cat any of the classes we have created. This way, we have made the Cat class itself closed to modification but open to Change.
    i.e If we needed to change the CAT class in any way, we can just create additional classes and the CAT would be open to change
     */
    /*
    Some of the drawbacks of this method as far as I can see is, If we wanted to implement a flyable we would be violating the open/close principle
    A possible solution would be to implement a generic Interface such as Moveable instead of walkable.
     */
    /*
    Another drawback is in this case, if we any object inherits Animal, it is currently able to walk, talk and everything else.
    What if we wanted to restrict the features of any particular animal? Example:  if we wanted to restrict a Snake object so that it cannot walk, it is currently not possible with this decision.
    A possible solution would be to create sub-classes of Animal which include the correct interfaces.
    Example: Land-based animals and water-based animals inherit Animals and these sub-classes actually have variables of the correct interfaces. i.e
    Land-based animals has a variable of Walkable and Water-based animals has a variable of Talkable.
     */

    public static void main(String[] args) {
        // cant create objects for abstract class
        Animal cat = new Cat(new NormalWalker(), new Meower(), 10);
        cat.performTalk();
    }
}
