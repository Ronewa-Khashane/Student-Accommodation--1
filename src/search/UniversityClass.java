
package search;


public class UniversityClass {

        private String universityName;
        private String universityCampus;
        private String universityAddress;

    public UniversityClass(String universityName, String universityCampus, String universityAddress) {
		
                this.universityName = universityName;
		this.universityCampus = universityCampus;
		this.universityAddress = universityAddress;
	}


	public String getName() {
		return universityName;
	}


	public void setName(String universityName) {
		this.universityName = universityName;
	}


	public String getCampus() {
		return universityName;
	}


	public void setSurname(String universityCampus) {
		this.universityCampus = universityCampus;
	}


	public String getAddress() {
		return universityAddress;
	}


	public void setAddress(String Address) {
		this.universityAddress = Address;
	}

    @Override
    public String toString() {
        return "University Info" + "\n--------------------------"   
                +"\n University Name: " + universityName + "\n University Campus: " 
                + universityCampus + " \n University Address" + universityAddress+ "\n\n";
    }
        
}



