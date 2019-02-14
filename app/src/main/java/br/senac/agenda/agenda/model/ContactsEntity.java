package br.senac.agenda.agenda.model;

public class ContactsEntity {
    private Integer id;
    private String name;
    private String phone;
    private Double pontuaction;

    public ContactsEntity(String name, String phone, String email, Double pontuaction) {
        this.name = name;
        this.phone = phone;
        this.pontuaction = pontuaction;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public Double getPontuaction() {
        return pontuaction;
    }

    public void setPontuaction(Double pontuaction) {
        this.pontuaction = pontuaction;
    }

    @Override
    public String toString() {
        return  "name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", pontuaction=" + pontuaction;
    }
}
