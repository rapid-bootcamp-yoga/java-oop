package interfaceClass;

public class ProductImpl implements Product {

    private String productName;

    private Integer price;
    private String category;

    public ProductImpl(String productName, Integer price, String category) {
        this.productName = productName;
        this.price = price;
        this.category = category;
    }

    @Override
    public String getName() {
        return this.productName;
    }

    @Override
    public Integer getPrice() {
        return this.price;
    }

    @Override
    public String getCategory() {
        return this.category;
    }
}
