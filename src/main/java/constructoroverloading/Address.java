package constructoroverloading;

public class Address {

    public String city;
    public String state;
    public String country;
    public  String pinCode;


    public Address(){
        city="hyd";
        pinCode ="500090";
        state="TG";
        country="India";
    }

    @Override
    public String toString() {
        return "Address{" +
                "city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", country='" + country + '\'' +
                ", pinCode='" + pinCode + '\'' +
                '}';
    }
}
