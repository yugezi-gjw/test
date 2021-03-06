package com.varian.ois.sample.patient.event;

/**
 * Created by gbt1220 on 10/9/2016.
 */
public class PatientUpdatedEvent {
    private String patientId;
    private String patientNameChinese;
    private String patientNameEnglish;
    private String gender;
    private String birthday;
    private String idCard;
    private String phoneNumber;
    private String address;
    private String allergyHistory;

    public PatientUpdatedEvent(String patientId, String patientNameChinese, String patientNameEnglish, String gender, String birthday, String idCard, String phoneNumber, String address, String allergyHistory) {
        this.patientId = patientId;
        this.patientNameChinese = patientNameChinese;
        this.patientNameEnglish = patientNameEnglish;
        this.gender = gender;
        this.birthday = birthday;
        this.idCard = idCard;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.allergyHistory = allergyHistory;
    }

    public String getPatientId() {
        return patientId;
    }

    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }

    public String getPatientNameChinese() {
        return patientNameChinese;
    }

    public void setPatientNameChinese(String patientNameChinese) {
        this.patientNameChinese = patientNameChinese;
    }

    public String getPatientNameEnglish() {
        return patientNameEnglish;
    }

    public void setPatientNameEnglish(String patientNameEnglish) {
        this.patientNameEnglish = patientNameEnglish;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAllergyHistory() {
        return allergyHistory;
    }

    public void setAllergyHistory(String allergyHistory) {
        this.allergyHistory = allergyHistory;
    }
}
