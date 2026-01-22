package gr.aueb.cf.ch17.Knight_threads;

public class Main {

    public static void main(String[] args) {
//        Knight joa = new Knight();
//        Knight saintGeorge = new Knight();

        //!!! anonymous class
//        joa.embarkOnMission(new IMission() {
//            @Override
//            public void embark() {
//                System.out.println("Save the princess");
//            }
//        });


        //!!! anonymous class with method
//        saintGeorge.embarkOnMission(new IMission() {
//            @Override
//            public void embark() {
//            killTheDragon();
//            }
//        });

        //!!! lambdas
//        saintGeorge.embarkOnMission(() -> killTheDragon());

        //!!! method references
//        saintGeorge.embarkOnMission(Main::killTheDragon);

    }

    public static void killTheDragon(){
        System.out.println("Kill the dragon");
    }
}
