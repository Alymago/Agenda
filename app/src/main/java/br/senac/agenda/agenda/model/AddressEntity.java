package br.senac.agenda.agenda.model;

public class AddressEntity {
    private String email;
    private String street;
    private String number;
    private String cityState;

    public AddressEntity(String street, String number, String city_state, String email) {
        this.email = email;
        this.street = street;
        this.number = number;
        this.cityState = city_state;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getCityState() {
        return cityState;
    }

    public void setCityState(String cityState) {
        this.cityState = cityState;
    }
}
