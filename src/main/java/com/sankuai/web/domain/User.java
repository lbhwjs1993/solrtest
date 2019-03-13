package com.sankuai.web.domain;


import org.apache.solr.client.solrj.beans.Field;

public class User {
    @Field
    private String id;
    @Field
    private String name;
    @Field
    private String description;
    @Field
    private String sex;

    public User(){
        super();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
