package constructoroverloading;

public class Student {


    private String name;
    private String fatherName;
    private String dob;
    private String mobileNo;

    private Address address;

    private   String adharNo;


    public Student(String name,String fatherName,
                   String dob,String mobileNo,
                   Address address,String adharNo){
      this.name = name;
      this.fatherName = fatherName;
      this.dob = dob;
      this.mobileNo = mobileNo;
      this.address = address;
      this.adharNo = adharNo;
    }

    public Student(String name,String fatherName,
                   String dob,String mobileNo) {
       this(name, fatherName, dob, mobileNo, new Address(),null);



    }


    public Student(){
        this.name="abc";

    }


    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", fatherName='" + fatherName + '\'' +
                ", dob='" + dob + '\'' +
                ", mobileNo='" + mobileNo + '\'' +
                ", address=" + address +
                '}';
    }


    public String getName() {
        return this.name;
    }

    public String getFatherName() {
        return this.fatherName;
    }

    public String getDob() {
        return dob;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public Address getAddress() {
        return address;
    }

    public String getAdharNo() {
        return adharNo;
    }
}
