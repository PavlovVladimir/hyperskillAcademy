package com.hyperskilldev.gettersandsetters;

class Employee {

    private String name, email, experience;

    Employee(String name, String email, String experience){
        this.name = name;
        this.email = email;
        this.experience = experience;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getExperience() {
        return experience;
    }


}

class Developer extends Employee {
    private String mainLanguage, skills;

    Developer(String name, String email, String experience, String mainLanguage, String skills) {
        super(name, email, experience);
        this.mainLanguage = mainLanguage;
        this.skills = skills;
    }

    public String getMainLanguage() {
        return mainLanguage;
    }

    public String getSkills() {
        return skills;
    }


}

class DataAnalyst extends Employee {

    private String methods;
    private boolean phd;

    DataAnalyst(String name, String email, String experience, String methods, boolean phd){
        super(name, email, experience);
        this.methods = methods;
        this.phd = phd;
    }

    public String getMethods() {
        return methods;
    }

    public boolean isPhd() {
        return phd;
    }

    // write getters
}