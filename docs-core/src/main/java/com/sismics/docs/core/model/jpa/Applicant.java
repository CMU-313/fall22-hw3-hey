package com.sismics.docs.core.model.jpa;
//import com.google.common.base.MoreObjects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
//import java.util.Date;

@Entity
@Table(name = "T_APPLICANTS")
public class Applicant {
    
    @Id
    @Column(name = "APPLICANT_ID_C", length = 36)
    private String id;

    @Column(name = "APPLICANT_NAME", nullable = false, length = 10)
    private String name;

    @Column(name = "APPLICANT_GPA", nullable = false, length = 4)
    private String gpa;

    @Column(name = "APPLICANT_SKILLS", nullable = false, length = 50)
    private String skills;

    @Column(name = "APPLICANT_OTHER ", nullable = false, length = 50)
    private String other;

    public String getId() {
        return id;
    }

    public Applicant setId(String id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public Applicant setName(String name) {
        this.name = name;
        return this;
    }

    public String getGPA() {
        return gpa;
    }

    public Applicant setGPA(String gpa) {
        this.gpa = gpa;
        return this;
    }

    public String getSkills() {
        return skills;
    }

    public Applicant setSkills(String skills) {
        this.skills = skills;
        return this;
    }

    public String getOther() {
        return other;
    }

    public Applicant setOther(String other) {
        this.other = other;
        return this;
    }


}
