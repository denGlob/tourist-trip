package model.entities;

/**
 * Created by denglob on 8/18/17.
 */
public class Pass {

    private int id;
    private int price;
    private PassType passType;
    private Food food;
    private Transport transport;

    public enum PassType {
        BUSSINESS, WEDDING_TRIP, TREATMENT, SHOPPING, CROUISE
    }

    public enum Food {
        ONCE, TWICE, THIRD, SWEDISH_TABLE, NO_FOOD
    }

    public enum Transport {
        BUSS, PLANE, CAR, SHIP
    }

    public static class Builder {
        private int id;
        private int price;
        private PassType passType;
        private Food food;
        private Transport transport;

        public Builder setId(int id) {
            this.id = id;
            return this;
        }

        public Builder setPrice(int price) {
            this.price = price;
            return this;
        }

        public Builder setPassType(PassType passType) {
            this.passType = passType;
            return this;
        }

        public Builder setFood(Food food) {
            this.food = food;
            return this;
        }

        public Builder setTransport(Transport transport) {
            this.transport = transport;
            return this;
        }

        public Pass build() {
            Pass pass = new Pass();
            pass.setId(id);
            pass.setFood(food);
            pass.setPassType(passType);
            pass.setPrice(price);
            pass.setTransport(transport);
            return pass;
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public PassType getPassType() {
        return passType;
    }

    public void setPassType(PassType passType) {
        this.passType = passType;
    }

    public Food getFood() {
        return food;
    }

    public void setFood(Food food) {
        this.food = food;
    }

    public Transport getTransport() {
        return transport;
    }

    public void setTransport(Transport transport) {
        this.transport = transport;
    }
}
