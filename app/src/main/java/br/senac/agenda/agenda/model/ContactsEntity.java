package br.senac.agenda.agenda.model;

public class ContactsEntity {
    private Integer id;
    private String name;
    private String phone;
    private Double punctuation;

    public ContactsEntity(String name, String phone, Double punctuation) {
        this.name = name;
        this.phone = phone;
        this.punctuation = punctuation;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public ContactsEntity() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Double getPunctuation() {
        return punctuation;
    }

    public void setPunctuation(Double punctuation) {
        this.punctuation = punctuation;
    }

    @Override
    public String toString() {
        return  "name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", punctuation=" + punctuation;
    }
}
