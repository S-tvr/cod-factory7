package gr.aueb.cf.ch17.Knight_threads;

public interface IMission {
    MissionStatus getStatus();
    void setStatus(MissionStatus missionStatus);
    void embark();
}
