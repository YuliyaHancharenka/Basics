package tam_cdp.preselection_tasks.part2.avialines_inprogress.tours;


public enum Transport {
    PLANE ("Plane"),
    TRAIN ("Train"),
    BUS ("Bus"),
    SHIP ("Ship");

    private String value;

    Transport(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
