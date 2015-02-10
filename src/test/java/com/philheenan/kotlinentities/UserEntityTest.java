package com.philheenan.kotlinentities;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.philheenan.kotlinentities.model.UserJava;
import com.philheenan.kotlinentities.model.UserKotlin;
import com.philheenan.kotlinentities.remote.ApiUserJava;
import com.philheenan.kotlinentities.remote.ApiUserKotlin;
import junit.framework.TestCase;

/**
 * Created by phillip.heenan on 10/02/15.
 */
public class UserEntityTest extends TestCase {

    String jsonString = "{user_id:10,user_name:\'name\',user_email:\'email\'}";
    Gson gson = new GsonBuilder().create();

    public void testJavaUser() {
        UserJava user = gson.fromJson(jsonString, ApiUserJava.class).modelFromMap();

        assertNotNull(user);
        assertEquals(10, user.id);
        assertEquals("name", user.name);
        assertEquals("email", user.email);
    }

    public void testKotlinUser() {
        UserKotlin user = gson.fromJson(jsonString, ApiUserKotlin.class).modelFromMap();

        assertNotNull(user);
        assertEquals(10, user.getId());
        assertEquals("name", user.getName());
        assertEquals("email", user.getEmail());
    }
}
