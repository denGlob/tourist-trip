package model.entities;

/**
 * Created by denglob on 8/18/17.
 */
public class Cost {

    private int id;
    private long price;

    public static class Builder {

        private int id;
        private long price;

        public Builder setId(int id) {
            this.id = id;
            return this;
        }

        public Builder setPrice(long price) {
            this.price = price;
            return this;
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }
}
