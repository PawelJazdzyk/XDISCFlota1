/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package XDPJFLOTA.Flota;
import java.awt.Font;
import javax.mail.MessagingException;
import javax.mail.Transport;
import javax.mail.internet.MimeMessage;
import java.awt.Dimension;

/**
 *
 * @author jazdz
 */
@SuppressWarnings("serial")
public class FlotaKontaktWindow extends javax.swing.JFrame {

    /**
     * Creates new form FlotaKontakt
     */
    public FlotaKontaktWindow() {
    	setLocation(350, 150);
    	getContentPane().setPreferredSize(new Dimension(440, 300));
    	getContentPane().setMaximumSize(new Dimension(440, 300));
    	getContentPane().setMinimumSize(new Dimension(440, 300));
    	getContentPane().setSize(new Dimension(440, 300));
    	setResizable(false);
        initComponents();
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jLabel4.setBounds(15, 11, 409, 25);
        jLabel4.setFont(new Font("Segoe UI", Font.PLAIN, 12));
        jScrollPane1 = new javax.swing.JScrollPane();
        jScrollPane1.setBounds(15, 54, 409, 182);
        jTextArea1 = new javax.swing.JTextArea();
        jTextArea1.setFont(new Font("Segoe UI", Font.PLAIN, 12));
        jButton1 = new javax.swing.JButton();
        jButton1.setBounds(325, 254, 99, 23);

        //setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setText("Uwagi do działania aplikacji, prośby o usunięcie, poprawienie danych w bazie:");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jButton1.setBackground(new java.awt.Color(204, 255, 204));
        jButton1.setForeground(new java.awt.Color(0, 153, 51));
        jButton1.setText("Wyślij");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
             try {
				wyslij();
			} catch (MessagingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
             
             
            }
        });
        getContentPane().setLayout(null);
        getContentPane().add(jLabel4);
        getContentPane().add(jButton1);
        getContentPane().add(jScrollPane1);
        setResizable(false);
        pack();
    }// </editor-fold>   
    
   
    
    public void wyslij() throws MessagingException {
    	
    	String username = System.getProperty("user.name");
    	
    	String tekst = jTextArea1.getText();
    	
    	MimeMessage message = MailMessagePreparer.prepareTextMessage("pawel.jazdzyk@x-disc.pl", "FLOTA - formularz kontaktowy (" + username + ")", tekst);
    	Transport.send(message);
    	
    	try {
			Thread.sleep(1000);
			setVisible(false);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    
    	
    }

                                       

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FlotaKontaktWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FlotaKontaktWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FlotaKontaktWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FlotaKontaktWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FlotaKontaktWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration                   
}
