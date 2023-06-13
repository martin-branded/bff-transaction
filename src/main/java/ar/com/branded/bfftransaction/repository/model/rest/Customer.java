package ar.com.branded.bfftransaction.repository.model.rest;


import java.util.List;

public class Customer {
    private int id;
    private String name;
    private String email;
    private String identification;
    private String phone;
    private String note;
    private AddressResponse default_address;
    private List<AddressResponse> addresses;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getIdentification() {
        return identification;
    }

    public void setIdentification(String identification) {
        this.identification = identification;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public AddressResponse getDefault_address() {
        return default_address;
    }

    public void setDefault_address(AddressResponse default_address) {
        this.default_address = default_address;
    }

    public List<AddressResponse> getAddresses() {
        return addresses;
    }

    public void setAddresses(List<AddressResponse> addresses) {
        this.addresses = addresses;
    }
}
