
package search;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JFrame;

public class SearchButton extends JFrame {
    
        private JButton search;

    public SearchButton(){
      
        super( "search university" );
        setLayout( new FlowLayout() );

        search = new JButton("Search University Name");
        add(search);

      ButtonHandler handler = new ButtonHandler();
       search.addActionListener( handler);
}

private class ButtonHandler implements ActionListener{

   public void actionPerformed(ActionEvent event){

            ArrayList<UniversityClass> universityList= new ArrayList<UniversityClass>();
            universityList.add(new UniversityClass("CPUT", "District 6", "Cape town campus"));
            universityList.add(new UniversityClass("CPUT", "Bellville","Main Campus" ));                	
            universityList.add(new UniversityClass("CPUT", "mowbray", "Mowbray Campus"));    
            universityList.add(new UniversityClass("CPUT", "District 6", "Tygerberg Campus"));  

    for (UniversityClass universityClass : universityList) {
                JOptionPane.showMessageDialog(null, universityList.toString());
}

}

        
}



