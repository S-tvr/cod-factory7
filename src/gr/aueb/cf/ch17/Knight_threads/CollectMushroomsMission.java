package gr.aueb.cf.ch17.Knight_threads;

public class CollectMushroomsMission implements IMission{
    private MissionStatus missionStatus = MissionStatus.NOT_STARTED;

    @Override
    public MissionStatus getStatus() {
        return missionStatus;
    }

    @Override
    public void setStatus(MissionStatus missionStatus) {
        this.missionStatus = missionStatus;
    }

    @Override
    public void embark() {
        System.out.println("Collect Mushrooms mission");
    }
}
