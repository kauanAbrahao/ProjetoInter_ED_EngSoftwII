package Principal;

import javax.swing.JOptionPane;

public class PrincipalAluno {
	PrincipalGTI gti = new PrincipalGTI();
	
	public PrincipalAluno() {
		
	}
	
	public void exemplo() {
		int opc = -1;
		opc = Integer.parseInt(JOptionPane.showInputDialog(null, "Você quer mudar de interface? " +"\n"+"1 - Sim"+"\n"+"2 - Não" ));
		if (opc == 1) {
			gti.exemplo();
		}
		 
		
	}

}
