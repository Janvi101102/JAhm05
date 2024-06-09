package com.directory;

public class Person {
    private String name;
    private String address;
    private String telephone;
    private String mobile;
    private String headOfFamily;
    private String uniqueID;

    public Person(String name, String address, String telephone, String mobile, String headOfFamily, String uniqueID) {
        this.name = name;
        this.address = address;
        this.telephone = telephone;
        this.mobile = mobile;
        this.headOfFamily = headOfFamily;
        this.uniqueID = uniqueID;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getHeadOfFamily() {
        return headOfFamily;
    }

    public void setHeadOfFamily(String headOfFamily) {
        this.headOfFamily = headOfFamily;
    }

    public String getUniqueID() {
        return uniqueID;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", telephone='" + telephone + '\'' +
                ", mobile='" + mobile + '\'' +
                ", headOfFamily='" + headOfFamily + '\'' +
                ", uniqueID='" + uniqueID + '\'' +
                '}';
    }
}
