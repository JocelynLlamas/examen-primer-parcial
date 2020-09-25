package uaslp.enginering.exam.model;

public class Guest {
        private String name;
        private String phoneNum;
        private String address;
        private String country;
    
        public void setName(String name){
            this.name = name;
        }
            
        public String getName() {
            return name;
        }

        //no get para estos 
        public void setPhoneNumber(String phoneNum){
            this.phoneNum = phoneNum;
        }
    
        public void setAddress(String address){
            this.address = address;
        }
    
        public void setCountry(String country){
            this.country = country;
        }

}

