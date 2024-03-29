package model;

/**
 *
 * @author sarav
 */
public class Product {

    private int id;
    private int supplierId;
    private Supplier supplier;
    private int productCategoryId;
    private ProductCategory productCategory;
    private String name;
    private String description;
    private double price;
    private boolean isActive;
    private String imagePath;

    public Product() {
    }

    public Product(int id, int supplierId, int productCategoryId, String name, String description, double price, boolean isActive) {
        this.id = id;
        this.supplierId = supplierId;
        this.productCategoryId = productCategoryId;
        this.name = name;
        this.description = description;
        this.price = price;
        this.isActive = isActive;
    }

    public String getImagePath() {
        return this.imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    public ProductCategory getProductCategory() {
        return this.productCategory;
    }

    public void setProductCategory(ProductCategory productCategory) {
        this.productCategory = productCategory;
    }

    public Supplier getSupplier() {
        return this.supplier;
    }

    public void setSupplier(Supplier supplier) {
        this.supplier = supplier;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(int supplierId) {
        this.supplierId = supplierId;
    }

    public int getProductCategoryId() {
        return productCategoryId;
    }

    public void setProductCategoryId(int productCategoryId) {
        this.productCategoryId = productCategoryId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setIsActive(boolean isActive) {
        this.isActive = isActive;
    }
}
