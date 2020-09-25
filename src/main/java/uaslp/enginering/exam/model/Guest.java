package uaslp.enginering.exam.model;

public class Guest {
    
    private String name;
    private String adress;

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

	public void setAddress(String string) {
	}


}
