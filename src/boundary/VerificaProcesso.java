package boundary;

import java.io.IOException;
import javax.swing.JOptionPane;
import control.VerificaProcessoController;

public class VerificaProcesso {

 public void consultaInscricao() throws IOException {
	 int opc = -1;
	 while(opc != 9) {
		 opc = Integer.parseInt(JOptionPane.showInputDialog("Verificar Processo Seletivo" + "\n" + "1 - Consultar Situação da Inscrição" + "\n" + "\n" + "2 - Voltar"));
		 
		 switch(opc) {
		 case 1:
		 VerificaProcessoController verifica = new VerificaProcessoController();
		 opc = verifica.run();
		 break;
		 
		case 2:
		opc = 9;
		break;
		
		default: JOptionPane.showMessageDialog(null, "Opção Inválida");
	
	 }
	}
 }
}