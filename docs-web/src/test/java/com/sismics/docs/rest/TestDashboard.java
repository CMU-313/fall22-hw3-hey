package com.sismics.docs.rest;

import com.sismics.util.filter.TokenBasedSecurityFilter;
import com.sismics.util.totp.GoogleAuthenticator;
import org.junit.Assert;
import org.junit.Test;

import javax.json.JsonArray;
import javax.json.JsonObject;
import javax.ws.rs.client.Entity;
import javax.ws.rs.core.Form;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import java.util.Date;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestDashboard extends BaseJerseyTest{
    
    @Test
    public void testApplicantResource() {
    JsonObject json= target().path("/applicant/list").request().get(JsonObject.class);
        JsonArray applicants = json.getJsonArray("applicant");
        Assert.assertTrue(applicants.size() > 0);
        JsonObject applicant = applicants.getJsonObject(0);
        Assert.assertNotNull(applicant.getString("id"));
        Assert.assertNotNull(applicant.getString("name"));
        Assert.assertNotNull(applicant.getString("GPA"));
        Assert.assertNotNull(applicant.getJsonNumber("skills"));
    }
}
