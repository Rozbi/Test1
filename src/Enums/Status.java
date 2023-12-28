package Enums;

public enum Status {
    GHOST("ghost"), THINKING("thinking"), NORMAL("normal"), WAITING("waiting");
    private String stat;
    private Status(String stat){
        this.stat=stat;
    }

    public String getStat() {
        return stat;
    }
}