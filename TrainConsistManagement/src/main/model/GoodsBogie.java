package main.model;

public class GoodsBogie {

    private String bogieId;
    private String shape;
    private String cargoType;

    public GoodsBogie(String bogieId,
                      String shape) {
        this.bogieId = bogieId;
        this.shape = shape;
    }

    public String getBogieId() {
        return bogieId;
    }

    public String getShape() {
        return shape;
    }

    public String getCargoType() {
        return cargoType;
    }

    public void setCargoType(String cargoType) {
        this.cargoType = cargoType;
    }

    @Override
    public String toString() {
        return "GoodsBogie{" +
                "bogieId='" + bogieId + '\'' +
                ", shape='" + shape + '\'' +
                ", cargoType='" + cargoType + '\'' +
                '}';
    }
}