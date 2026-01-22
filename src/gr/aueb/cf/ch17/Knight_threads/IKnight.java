package gr.aueb.cf.ch17.Knight_threads;

@FunctionalInterface
public interface IKnight {

    IMission[] missions = {
            new KillTheDragonMission(),
            new CollectMushroomsMission(),
            new SaveThePrincessMission()
    };

    void embarkOnMission(IMission mission);
}
