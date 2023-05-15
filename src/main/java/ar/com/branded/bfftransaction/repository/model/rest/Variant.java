package ar.com.branded.bfftransaction.repository.model.rest;

public class Variant {
    private Integer id;
    private Integer image_id;
    private Integer product_id;
    private Integer position;
    private String price;
    private String compare_at_price;
    private String promotional_price;
    private Boolean stock_management;
    private Integer stock;
    private String weight;
    private String width;
    private String height;
    private String depth;
    private String sku;
    private Param[] values;
    private String barcode;
    private String mpn;
    private String age_group;
    private String gender;
    private String created_at;
    private String updated_at;
    private Inventory[] inventory_levels;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getImage_id() {
        return image_id;
    }

    public void setImage_id(Integer image_id) {
        this.image_id = image_id;
    }

    public Integer getProduct_id() {
        return product_id;
    }

    public void setProduct_id(Integer product_id) {
        this.product_id = product_id;
    }

    public Integer getPosition() {
        return position;
    }

    public void setPosition(Integer position) {
        this.position = position;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getCompare_at_price() {
        return compare_at_price;
    }

    public void setCompare_at_price(String compare_at_price) {
        this.compare_at_price = compare_at_price;
    }

    public String getPromotional_price() {
        return promotional_price;
    }

    public void setPromotional_price(String promotional_price) {
        this.promotional_price = promotional_price;
    }

    public Boolean getStock_management() {
        return stock_management;
    }

    public void setStock_management(Boolean stock_management) {
        this.stock_management = stock_management;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getWidth() {
        return width;
    }

    public void setWidth(String width) {
        this.width = width;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getDepth() {
        return depth;
    }

    public void setDepth(String depth) {
        this.depth = depth;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public Param[] getValues() {
        return values;
    }

    public void setValues(Param[] values) {
        this.values = values;
    }

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public String getMpn() {
        return mpn;
    }

    public void setMpn(String mpn) {
        this.mpn = mpn;
    }

    public String getAge_group() {
        return age_group;
    }

    public void setAge_group(String age_group) {
        this.age_group = age_group;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getCreated_at() {
        return created_at;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

    public String getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(String updated_at) {
        this.updated_at = updated_at;
    }

    public Inventory[] getInventory_levels() {
        return inventory_levels;
    }

    public void setInventory_levels(Inventory[] inventory_levels) {
        this.inventory_levels = inventory_levels;
    }
}
