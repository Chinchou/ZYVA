public class ZYVA_Runner {
public static void main(String args[]) {

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ZYVA().setVisible(true);
            }
        });
    }
}