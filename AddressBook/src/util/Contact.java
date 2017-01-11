package util;

import java.io.Serializable;

public class Contact implements Serializable, Comparable<Contact> {

    private String firstName;
    private String lastName;
    private String birthday;
    private String mobile;
    private String phone;
    private String workphone;
    private String fax;
    private String email;
    private String website;
    private String google;
    private String twiter;
    private String facebook;
    private String instagram;
    private String youtybe;
    private String company;
    private String departament;
    private String pozition;
    private String address;
    private String country;
    private String state;
    private String city;
    private String zip;
    private String message;
    private String password;

    public Contact() {
    }

    public Contact(String firstName, String lastName, String birthday, String mobile, String phone, String workphone, String fax, String email, String website, String google, String twiter, String facebook, String instagram, String youtybe, String company, String departament, String pozition, String address, String country, String state, String city, String zip, String message, String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthday = birthday;
        this.mobile = mobile;
        this.phone = phone;
        this.workphone = workphone;
        this.fax = fax;
        this.email = email;
        this.website = website;
        this.google = google;
        this.twiter = twiter;
        this.facebook = facebook;
        this.instagram = instagram;
        this.youtybe = youtybe;
        this.company = company;
        this.departament = departament;
        this.pozition = pozition;
        this.address = address;
        this.country = country;
        this.state = state;
        this.city = city;
        this.zip = zip;
        this.message = message;
        this.password = password;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getWorkphone() {
        return workphone;
    }

    public void setWorkphone(String workphone) {
        this.workphone = workphone;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getGoogle() {
        return google;
    }

    public void setGoogle(String google) {
        this.google = google;
    }

    public String getTwiter() {
        return twiter;
    }

    public void setTwiter(String twiter) {
        this.twiter = twiter;
    }

    public String getFacebook() {
        return facebook;
    }

    public void setFacebook(String facebook) {
        this.facebook = facebook;
    }

    public String getInstagram() {
        return instagram;
    }

    public void setInstagram(String instagram) {
        this.instagram = instagram;
    }

    public String getYoutybe() {
        return youtybe;
    }

    public void setYoutybe(String youtybe) {
        this.youtybe = youtybe;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getDepartament() {
        return departament;
    }

    public void setDepartament(String departament) {
        this.departament = departament;
    }

    public String getPozition() {
        return pozition;
    }

    public void setPozition(String pozition) {
        this.pozition = pozition;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public int compareTo(Contact o) {
        return this.getFirstName().compareTo(o.getFirstName());
    }
}



