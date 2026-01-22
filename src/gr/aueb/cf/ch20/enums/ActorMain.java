package gr.aueb.cf.ch20.enums;

public class ActorMain {

    public static void main(String[] args) {
        Actors actor = Actors.STUDENT;
        System.out.println(actor.name());
        System.out.println(actor.toRole());
    }
}
