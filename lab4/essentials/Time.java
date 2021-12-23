package essentials;

public enum Time {
    EARLY ("рано"),
    DARKNESS ("полная темнота"),
    LIGHTLY (" ещё слишком светло");

    private final String name;

    Time(String s) {
        this.name = s;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
