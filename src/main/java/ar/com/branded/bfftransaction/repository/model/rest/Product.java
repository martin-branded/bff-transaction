package ar.com.branded.bfftransaction.repository.model.rest;

public class Product {
    private Integer id;
    private Param name;
    private Param description;
    private Param handle;
    private Param[] attributes;
    private Boolean published;
    private Boolean free_shipping;
    private Boolean requires_shipping;
    private String canonical_url;
    private String video_url;
    private Param seo_title;
    private Param seo_description;
    private String brand;
    private String created_at;
    private String updated_at;
    private Variant[] variants;
    private String tags;
    private Image[] images;
    private Category[] categories;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Param getName() {
        return name;
    }

    public void setName(Param name) {
        this.name = name;
    }

    public Param getDescription() {
        return description;
    }

    public void setDescription(Param description) {
        this.description = description;
    }

    public Param getHandle() {
        return handle;
    }

    public void setHandle(Param handle) {
        this.handle = handle;
    }

    public Param[] getAttributes() {
        return attributes;
    }

    public void setAttributes(Param[] attributes) {
        this.attributes = attributes;
    }

    public Boolean getPublished() {
        return published;
    }

    public void setPublished(Boolean published) {
        this.published = published;
    }

    public Boolean getFree_shipping() {
        return free_shipping;
    }

    public void setFree_shipping(Boolean free_shipping) {
        this.free_shipping = free_shipping;
    }

    public Boolean getRequires_shipping() {
        return requires_shipping;
    }

    public void setRequires_shipping(Boolean requires_shipping) {
        this.requires_shipping = requires_shipping;
    }

    public String getCanonical_url() {
        return canonical_url;
    }

    public void setCanonical_url(String canonical_url) {
        this.canonical_url = canonical_url;
    }

    public String getVideo_url() {
        return video_url;
    }

    public void setVideo_url(String video_url) {
        this.video_url = video_url;
    }

    public Param getSeo_title() {
        return seo_title;
    }

    public void setSeo_title(Param seo_title) {
        this.seo_title = seo_title;
    }

    public Param getSeo_description() {
        return seo_description;
    }

    public void setSeo_description(Param seo_description) {
        this.seo_description = seo_description;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
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

    public Variant[] getVariants() {
        return variants;
    }

    public void setVariants(Variant[] variants) {
        this.variants = variants;
    }

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    public Image[] getImages() {
        return images;
    }

    public void setImages(Image[] images) {
        this.images = images;
    }

    public Category[] getCategories() {
        return categories;
    }

    public void setCategories(Category[] categories) {
        this.categories = categories;
    }

}
