package appUsers;

import java.util.UUID;

public class Contact {

    public String name;
    private String phoneNo;
    private String email;
    private UUID id;

    public Contact(String name, String phoneNo, String email, UUID id) {
        this.name = name;
        this.phoneNo = phoneNo;
        this.email = email;
        this.id = id;
    }

    public Contact(String name, String phoneNo, String email) {
        this.name = name;
        this.phoneNo = phoneNo;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    @Override
    public String toString() {
        return "name " + name + ", phoneNo " + phoneNo +", email " + email;
    }
}

//reset the phoneNo as a Long?
