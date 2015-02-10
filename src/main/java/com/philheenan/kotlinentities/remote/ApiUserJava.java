package com.philheenan.kotlinentities.remote;

import com.google.gson.annotations.SerializedName;
import com.philheenan.kotlinentities.model.UserJava;

/**
 * Created by phillip.heenan on 10/02/15.
 */
public class ApiUserJava implements ApiMapping<UserJava> {

    @SerializedName("user_id")
    public int id;
    @SerializedName("user_name")
    public String userName;
    @SerializedName("user_email")
    public String userEmail;

    @Override
    public UserJava modelFromMap() {
        UserJava user = new UserJava();
        user.id = id;
        user.name = userName;
        user.email = userEmail;

        return user;
    }

    @Override
    public String toString() {
        return "ApiUserJava{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", userEmail='" + userEmail + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ApiUserJava that = (ApiUserJava) o;

        if (id != that.id) return false;
        if (userEmail != null ? !userEmail.equals(that.userEmail) : that.userEmail != null)
            return false;
        if (userName != null ? !userName.equals(that.userName) : that.userName != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (userName != null ? userName.hashCode() : 0);
        result = 31 * result + (userEmail != null ? userEmail.hashCode() : 0);
        return result;
    }
}
