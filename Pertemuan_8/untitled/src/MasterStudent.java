public class MasterStudent extends Student{
    private String major, thesisTopic;
    private int researchHours;

    public MasterStudent(String name, String address, String studentID, int age, String major, String thesisTopic, int researchHours) {
        super(name, address, studentID, age);
        this.major = major;
        this.thesisTopic = thesisTopic;
        this.researchHours = researchHours;
    }

    public String getMajor() {
        return major;
    }

    public String getThesisTopic() {
        return thesisTopic;
    }

    public int getResearchHours() {
        return researchHours;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public void setThesisTopic(String thesisTopic) {
        this.thesisTopic = thesisTopic;
    }

    public void setResearchHours(int researchHours) {
        this.researchHours = researchHours;
    }

    @Override
    public String toString() {
        return "MasterStudent{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", studentID='" + studentID + '\'' +
                ", age=" + age +
                ", major='" + major + '\'' +
                ", thesisTopic='" + thesisTopic + '\'' +
                ", researchHours=" + researchHours +
                '}';
    }
}
