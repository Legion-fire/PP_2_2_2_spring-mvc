package web.model;

public class Car {
    private String brand;
    private String layout;
    private String carBodyStyle;

    public Car(String brand, String layout, String carBodyStyle) {
        this.brand = brand;
        this.layout = layout;
        this.carBodyStyle = carBodyStyle;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getLayout() {
        return layout;
    }

    public void setLayout(String layout) {
        this.layout = layout;
    }

    public String getCarBodyStyle() {
        return carBodyStyle;
    }

    public void setCarBodyStyle(String carBodyStyle) {
        this.carBodyStyle = carBodyStyle;
    }
}
