package uaslp.enginering.exam.model;

public class Guest {
    
    private String name;
    private String adress;
    private Sting phoneNum;
    private String country;

    public Guest() {

	}

    public Guest(String name) {
        this.name = name;
    }

    
	public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAdress(String adress){
        this.adress = adress;
    }

    public String getAdress() {
        return adress;
    }
    
    public void setCountry(String country){
        this.country = country;
    }

    public void setPhoneNumber(String phone){
        this.phone = phone;
    }


}
