package br.senac.agenda.agenda.model;

public class AddressEntity {
    private Integer id;
    private String street;
    private String number;
    private String cityState;

    public AddressEntity(String street, String number, String city_state) {
        this.street = street;
        this.number = number;
        this.cityState = city_state;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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
