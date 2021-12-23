package essentials;

public enum Interest {
    CURIOSITY ("любопытство"),
    IMPATIENCE ("нетерпения"),
    UNINTERESTED ("неинтересно"),
    ENGAGED ("интересовались"),
    FASCINATED(" не выдержал,");

    private final String name;

    Interest(String s) {
        this.name = s;
    }

    @Override
    public String toString() {
        return this.name;
    }
    }

