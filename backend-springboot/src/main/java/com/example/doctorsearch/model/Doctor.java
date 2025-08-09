package com.example.doctorsearch.model;



import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;




@Entity
@Table(name = "doctors")
public class Doctor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String speciality;
    private String location;
    private Integer experienceYears;
    private Integer fee;
    private Integer ratingPercent;
    private Integer patientStories;
    private Boolean availableToday;
    private String imageUrl;
    private String clinic;

    public Doctor() {}

    // getters and setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getSpeciality() { return speciality; }
    public void setSpeciality(String speciality) { this.speciality = speciality; }
    public String getLocation() { return location; }
    public void setLocation(String location) { this.location = location; }
    public Integer getExperienceYears() { return experienceYears; }
    public void setExperienceYears(Integer experienceYears) { this.experienceYears = experienceYears; }
    public Integer getFee() { return fee; }
    public void setFee(Integer fee) { this.fee = fee; }
    public Integer getRatingPercent() { return ratingPercent; }
    public void setRatingPercent(Integer ratingPercent) { this.ratingPercent = ratingPercent; }
    public Integer getPatientStories() { return patientStories; }
    public void setPatientStories(Integer patientStories) { this.patientStories = patientStories; }
    public Boolean getAvailableToday() { return availableToday; }
    public void setAvailableToday(Boolean availableToday) { this.availableToday = availableToday; }
    public String getImageUrl() { return imageUrl; }
    public void setImageUrl(String imageUrl) { this.imageUrl = imageUrl; }
    public String getClinic() { return clinic; }
    public void setClinic(String clinic) { this.clinic = clinic; }
}
