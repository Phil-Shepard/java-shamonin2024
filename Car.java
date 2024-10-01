public class Car {
    private final String engine;
    private final int wheels;

    private final String color;
    private final boolean hasGPS;
    private final boolean hasAirConditioning;

    private Car(Builder builder) {
        this.engine = builder.engine;
        this.wheels = builder.wheels;
        this.color = builder.color;
        this.hasGPS = builder.hasGPS;
        this.hasAirConditioning = builder.hasAirConditioning;
    }

    public static class Builder {
        private final String engine;
        private final int wheels;

        private String color = "White";
        private boolean hasGPS = false;
        private boolean hasAirConditioning = false;

        public Builder(String engine, int wheels) {
            this.engine = engine;
            this.wheels = wheels;
        }

        public Builder setColor(String color) {
            this.color = color;
            return this;
        }

        public Builder setGPS(boolean hasGPS) {
            this.hasGPS = hasGPS;
            return this;
        }

        public Builder setAirConditioning(boolean hasAirConditioning) {
            this.hasAirConditioning = hasAirConditioning;
            return this;
        }

        public Car build() {
            return new Car(this);
        }
    }

    @Override
    public String toString() {
        return "Car{" +
               "engine='" + engine + '\'' +
               ", wheels=" + wheels +
               ", color='" + color + '\'' +
               ", hasGPS=" + hasGPS +
               ", hasAirConditioning=" + hasAirConditioning +
               '}';
    }
}


