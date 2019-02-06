import javax.swing.JOptionPane;

public class madlib1 {

	public static void main(String[] args) {
		// TODO Auto-generated method sub
		
			JOptionPane.showMessageDialog(null, "Let's make a madlib");
			String adj1 = JOptionPane.showInputDialog("Give me an adjective");
			String noun1 = JOptionPane.showInputDialog("Give me a name");
			String noun2 = JOptionPane.showInputDialog("Give me a noun");
			String noun3 = JOptionPane.showInputDialog("Give me a noun");
			String verb1 = JOptionPane.showInputDialog("Give me a past tense verb");
			String verb2 = JOptionPane.showInputDialog("Give me a verb");
			String adj2 = JOptionPane.showInputDialog("Give me an adjective");
			String noun4 = JOptionPane.showInputDialog("Give me a noun");
			JOptionPane.showMessageDialog(null, "He is your mad lib");
			
			
			/*On a day just like today, ________ (adjective) _______ (name) was walking down to the ________ (noun) with some friends. 
			 * Suddenly, out of nowhere a ________ (noun) ________ (past tense verb) right in front of them. 
			 * Before they could even ________ (verb), 
			 * a ________ (adjective) ________ (noun) jumped out from the bushes and spooked them silly.
			 */

			String madlib = "On a day just like today, " + adj1 
					+ " " + noun1 + " was walking down to the " + noun2 + " with some friends. "
					+ "\nSuddenly, out of nowhere, a[n] " + noun3 + " " 
					+ verb1 + " right in front of them. \nBefore they could even "
					+ verb2 + "," + " \na[n] " + adj2 + " " + noun4 
					+ " jumped out from the bushes and spooked them silly.";
					
			JOptionPane.showMessageDialog(null, madlib);
			
	}


}
