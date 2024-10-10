package com.embarkx.firstjobapp.job;

import javax.print.attribute.IntegerSyntax;

public class Job {

    private Long id;
    private String title;
    private String description;
    private Integer minSalary;
    private Integer maxSalary;
    private String location;

    public Job(Long id, String title, String description, Integer minSalary, Integer maxSalary, String location) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.minSalary = minSalary;
        this.maxSalary = maxSalary;
        this.location = location;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setMinSalary(Integer minSalary) {
        this.minSalary = minSalary;
    }

    public void setMaxSalary(Integer maxSalary) {
        this.maxSalary = maxSalary;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public Integer getMinSalary() {
        return minSalary;
    }

    public Integer getMaxSalary() {
        return maxSalary;
    }

    public String getLocation() {
        return location;
    }
}
