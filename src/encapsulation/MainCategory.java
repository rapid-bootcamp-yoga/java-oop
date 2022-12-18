package encapsulation;

public class MainCategory {
    public static void main(String[] args) {
        Category category = new Category();
        category.setId(2);
        category.setName("Spageti");
        category.setDesc("Makanan mie italia");
        System.out.println(category);

        System.out.println(new Category(01, "Sup Sayur", "Sup sayur iga sapi"));
        System.out.println(new Category(03, "Tahu Kang Bayan", "Tahu goreng isi udang "));
    }
}
