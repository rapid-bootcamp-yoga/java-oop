package interfaceClass;

public class MainInterface {
    public static void main(String[] args) {
        HasBrand brand = new HasBrandImpl("Indomie", 3000);
        System.out.println("Brand Name " + brand.getBrand() + ", harga jual satuan adalah Rp "+ brand.getPrice());

        Product product = new ProductImpl("Innova", 345000000, "minibus");
        System.out.println("Mobil unggulan baru dari Toyota "+ product.getName() + ", dibandrol dengan harga Rp. "
                            + product.getPrice() + " dan termasuk " + product.getCategory() + " terluas.");
    }
}
