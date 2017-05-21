import java.util.ArrayList;
import java.util.List;

/**
 * Created by rahmirford on 5/20/17.
 */
public class DriversLicense {

    String LastName;
    String firstName;
    String addr;
    String state;
    String licenseNumber;
    String DOB;
    String issueDate;
    String expireDate;
    String sex;
    String eyeColor;
    String Height;
    String organDonor;
    String idClass;

    public DriversLicense(){}
    public DriversLicense(String LastName, String firstName, String addr, String state,
                          String licenseNumber, String DOB, String issueDate, String expireDate,
                          String sex, String eyeColor, String height, String organDonor, String idClass){

        this.LastName = LastName;
        this.firstName = firstName;
        this.addr = addr;
        this.state = state;
        this.licenseNumber = licenseNumber;
        this.DOB = DOB;
        this.issueDate = issueDate;
        this.expireDate = expireDate;
        this.sex = sex;
        this.eyeColor = eyeColor;
        this.Height = height;
        this.organDonor = organDonor;
        this.idClass = idClass;
    }

    public static ArrayList<DriversLicense> deserializeFromCSV(String e){
        ArrayList<DriversLicense> deserializedList = new ArrayList();
        e.split("")

        return deserializedList;
    }


    public static void getCSVHeader(){

    }

    public static List<DriversLicense> serializeToCSV(){
        return null;
    }

    public String getLastName() {
        return LastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getAddr() {
        return addr;
    }

    public String getState() {
        return state;
    }

    public String getLicenseNumber() {
        return licenseNumber;
    }

    public String getDOB() {
        return DOB;
    }

    public String getIssueDate() {
        return issueDate;
    }

    public String getExpireDate() {
        return expireDate;
    }

    public String getSex() {
        return sex;
    }

    public String getEyeColor() {
        return eyeColor;
    }

    public String getHeight() {
        return Height;
    }

    public String getOrganDonor() {
        return organDonor;
    }

    public String getIdClass() {
        return idClass;
    }
}
