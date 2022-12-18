package interfaceClass;

public class HasBrandImpl implements HasBrand {

    private String brandName;
    private Integer price;

    public HasBrandImpl(String brandName, Integer price) {
        this.brandName = brandName;
        this.price = price;
    }

    @Override
    public String getBrand() {
        return this.brandName;
    }

    @Override
    public Integer getPrice() {
        return this.price;
    }
}
