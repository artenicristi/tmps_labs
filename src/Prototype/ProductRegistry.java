package Prototype;

import java.util.HashMap;
import java.util.Map;

public class ProductRegistry {
    private Map<String, Product> prototypes;

    public ProductRegistry() {
        prototypes = new HashMap<>();
        loadPrototypes();
    }

    private void loadPrototypes() {
        ElectronicProduct electronicProduct = new ElectronicProduct();
        electronicProduct.setName("Electronic Prototype");
        electronicProduct.setPrice(0.0);
        prototypes.put("electronic", electronicProduct);

        ClothingProduct clothingProduct = new ClothingProduct();
        clothingProduct.setName("Clothing Prototype");
        clothingProduct.setPrice(0.0);
        prototypes.put("clothing", clothingProduct);
    }

    public Product getProduct(String type) {
        return prototypes.get(type).clone();
    }
}
