import javax.swing.SwingUtilities;

public class App {

	public static void main(String[] arg){
		
		SwingUtilities.invokeLater(new Runnable() {
			
			@Override
			public void run() {

               new MainFrame("SwingWorker Demo");
				
			}
		});
	}
}
