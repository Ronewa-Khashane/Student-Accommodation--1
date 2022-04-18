
package search;

import java.util.ArrayList;
import javax.swing.JFrame;
//import javax.swing.JOptionPane;


public class Search {

    
    public static void main(String[] args) {


        SearchButton buttonFrame = new SearchButton(); // create ButtonFrame
        buttonFrame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        buttonFrame.setSize( 275, 110 ); // set frame size
        buttonFrame.setVisible( true );

 
ArrayList<UniversityClass> universityList= new ArrayList<UniversityClass>();
	universityList.add(new UniversityClass("CPUT", "District 6", "Cape town campus"));
        universityList.add(new UniversityClass("CPUT", "Bellville","Main Campus" ));                	
        universityList.add(new UniversityClass("CPUT", "mowbray", "Mowbray Campus"));    
        universityList.add(new UniversityClass("CPUT", "District 6", "Tygerberg Campus"));  

/*for (UniversityClass universityClass : universityList) {
            JOptionPane.showMessageDialog(null, universityList.toString());
        }              	
  */          	





//JOptionPane.showMessageDialog(null, allEmployees);



    }
    
}
