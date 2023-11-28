package com.example.webchat.domain.preferences;

import com.example.webchat.core.generic.ExtendedEntity;
import com.example.webchat.domain.user.User;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

import java.util.UUID;

@Entity
@Table(name = "preferences")
public class Preferences extends ExtendedEntity {

    @Column(name = "general_type", nullable = false)
    private String general_type;
    @Column(name = "general_industry", nullable = false)
    private String general_industry;
    @Column(name = "general_design", nullable = false)
    private String general_design;

    @Column(name = "tech_framework", nullable = false)
    private String tech_framework;
    @Column(name = "tech_css", nullable = false)
    private String tech_css;
    @OneToOne(mappedBy = "preferences")
    private User user;
    public Preferences(){}
    public Preferences(UUID uuid, String generalType, String generalIndustry, String generalDesign, String techFramework, String techCss, User user) {
        super(uuid);
        general_type = generalType;
        general_industry = generalIndustry;
        general_design = generalDesign;
        tech_framework = techFramework;
        tech_css = techCss;
        this.user = user;
    }

    public String getGeneral_type() {
        return general_type;
    }

    public void setGeneral_type(String general_type) {
        this.general_type = general_type;
    }

    public String getGeneral_industry() {
        return general_industry;
    }

    public void setGeneral_industry(String general_industry) {
        this.general_industry = general_industry;
    }

    public String getGeneral_design() {
        return general_design;
    }

    public void setGeneral_design(String general_design) {
        this.general_design = general_design;
    }

    public String getTech_framework() {
        return tech_framework;
    }

    public void setTech_framework(String tech_framework) {
        this.tech_framework = tech_framework;
    }

    public String getTech_css() {
        return tech_css;
    }

    public void setTech_css(String tech_css) {
        this.tech_css = tech_css;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
