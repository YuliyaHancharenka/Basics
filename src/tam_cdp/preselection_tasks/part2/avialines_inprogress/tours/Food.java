package tam_cdp.preselection_tasks.part2.avialines_inprogress.tours;


public enum Food {
    ALL_INCLUSIVE ("ALL"),
    BEDAND_BREAKFAST ("BB"),
    ONLY_BED ("OB");

    private String value;

    Food(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
