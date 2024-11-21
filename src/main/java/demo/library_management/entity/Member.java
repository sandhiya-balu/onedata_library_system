package demo.library_management.entity;

import java.time.LocalDate;

public class Member {
    private int id;
    private String name;
    private String phone;
    private LocalDate registeredDate;

    // Getters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public LocalDate getRegisteredDate() {
        return registeredDate;
    }

    // Setters
    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setRegisteredDate(LocalDate registeredDate) {
        this.registeredDate = registeredDate;
    }

    // toString Method
    @Override
    public String toString() {
        return "Member{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", registeredDate=" + registeredDate +
                '}';
    }

    // Equals and HashCode Methods
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Member member = (Member) o;

        return id == member.id;
    }

    @Override
    public int hashCode() {
        return id;
    }
}
