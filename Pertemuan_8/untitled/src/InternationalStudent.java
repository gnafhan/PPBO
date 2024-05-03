public class InternationalStudent extends Student {
    private String country;
    private String passportNumber;
    private String university;
    private String visaType;
    private String visaExpDate;
    private int studyPeriod;

    public InternationalStudent(String name, String address, String studentID, int age, String country, String visaType, String visaExpDate, String passportNumber, String university, int studyPeriod) {
        super(name, address, studentID, age);
        this.country = country;
        this.visaType = visaType;
        this.visaExpDate = visaExpDate;
        this.passportNumber = passportNumber;
        this.university = university;
        this.studyPeriod = studyPeriod;
    }

    public String getCountry() {
        return country;
    }

    public String getVisaType() {
        return visaType;
    }

    public String getVisaExpDate() {
        return visaExpDate;
    }

    public String getPassportNumber() {
        return passportNumber;
    }

    public String getUniversity() {
        return university;
    }

    public int getStudyPeriod() {
        return studyPeriod;
    }

    public void setPassportNumber(String passportNumber) {
        this.passportNumber = passportNumber;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public void setStudyPeriod(int studyPeriod) {
        this.studyPeriod = studyPeriod;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setVisaType(String visaType) {
        this.visaType = visaType;
    }

    public void setVisaExpDate(String visaExpDate) {
        this.visaExpDate = visaExpDate;
    }

    @Override
    public String toString() {
        return "InternationalStudent{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", studentID='" + studentID + '\'' +
                ", age=" + age +
                ", country='" + country + '\'' +
                ", visaType='" + visaType + '\'' +
                ", visaExpDate='" + visaExpDate + '\'' +
                ", passportNumber='" + passportNumber + '\'' +
                ", university='" + university + '\'' +
                ", studyPeriod=" + studyPeriod +
                '}';
    }
}
