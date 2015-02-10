package com.philheenan.kotlinentities.model;

/**
 * Created by phillip.heenan on 10/02/15.
 */
public class UserJava {

    public int id;
    public String name;
    public String email;

    @Override
    public String toString() {
        return "UserJava{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UserJava userJava = (UserJava) o;

        if (id != userJava.id) return false;
        if (email != null ? !email.equals(userJava.email) : userJava.email != null) return false;
        if (name != null ? !name.equals(userJava.name) : userJava.name != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        return result;
    }
}
