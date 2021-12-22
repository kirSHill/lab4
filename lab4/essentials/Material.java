package essentials;

public enum Material {
        STONE("каменный"),
        HYDROGEN("водород"),
        WOOD("деревянный");

        public final String name;

        Material(String s) {
                this.name = s;
        }

        @Override
        public String toString() {
                return this.name;
        }
}
