package ar.com.branded.bfftransaction.repository.model.jdbc;

import ar.com.branded.bfftransaction.model.domain.Address;

import java.sql.Timestamp;
import java.util.UUID;

public class AddressProfileTable {

    private long id;
    private UUID profileId;
    private String address;
    private String number;
    private String floor;
    private String locality;
    private String city;
    private String province;
    private String zipcode;
    private Timestamp createdAt;

    // Getter and setter methods

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public UUID getProfileId() {
        return profileId;
    }

    public void setProfileId(UUID profileId) {
        this.profileId = profileId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getFloor() {
        return floor;
    }

    public void setFloor(String floor) {
        this.floor = floor;
    }

    public String getLocality() {
        return locality;
    }

    public void setLocality(String locality) {
        this.locality = locality;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public Timestamp getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
    }

    public Address toDomain(){
        Address address2 = new Address();
        address2.setProfileId(this.profileId);
        address2.setAddress(this.address);
        address2.setNumber(this.number);
        address2.setFloor(this.floor);
        address2.setLocality(this.locality);
        address2.setCity(this.city);
        address2.setProvince(this.province);
        address2.setZipcode(this.zipcode);
        return address2;
    }
}
