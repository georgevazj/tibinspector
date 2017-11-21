package com.bbva.ecim.model;

import javax.xml.bind.annotation.XmlAttribute;

/**
 * Created by Jorge on 21/11/17.
 */

public class ApplicationTag {

    @XmlAttribute(name = "name")
    private String name;
    private String repoInstanceName;
    private String description;

    public ApplicationTag() {
    }

    public ApplicationTag(String name, String repoInstanceName, String description) {
        this.name = name;
        this.repoInstanceName = repoInstanceName;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRepoInstanceName() {
        return repoInstanceName;
    }

    public void setRepoInstanceName(String repoInstanceName) {
        this.repoInstanceName = repoInstanceName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "ApplicationTag{" +
                "name='" + name + '\'' +
                ", repoInstanceName='" + repoInstanceName + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
