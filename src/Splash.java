

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Splash extends javax.swing.JFrame {

    public Splash() {
        initComponents();
        this.setIconImage(new ImageIcon(getClass().getResource("img/icone.png")).getImage());
        
        new Thread(){
            @Override
            public void run(){
                for (int i=0 ; i<=100 ; i++){
                    try{
                        sleep(30);
                        jProgressBar1.setValue(i);
                        
                        if(jProgressBar1.getValue()<=30){
                            mensagemStatus.setText("Iniciando S.O...");
                        } else if(jProgressBar1.getValue()<=60){
                            mensagemStatus.setText("Iniciando funções cognitivas...");
                        } else if(jProgressBar1.getValue()<=99){
                            mensagemStatus.setText("Iniciando drives...");
                        } else if(jProgressBar1.getValue()==100){
                            mensagemStatus.setText("Tudo pronto!");
                        }
                        
                    } catch (InterruptedException ex) {
                        JOptionPane.showMessageDialog(null, "Erro ao carregar");
                    }
                }
               Menu Mn = new Menu();
               Mn.setVisible(true);
               dispose();
            }
            
        }.start();
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mensagemStatus = new javax.swing.JLabel();
        jProgressBar1 = new javax.swing.JProgressBar();
        Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(800, 630));
        setMinimumSize(new java.awt.Dimension(800, 630));
        setResizable(false);
        getContentPane().setLayout(null);

        mensagemStatus.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        mensagemStatus.setForeground(new java.awt.Color(255, 255, 255));
        mensagemStatus.setText("Status");
        getContentPane().add(mensagemStatus);
        mensagemStatus.setBounds(150, 570, 500, 20);

        jProgressBar1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jProgressBar1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jProgressBar1.setFocusCycleRoot(true);
        jProgressBar1.setStringPainted(true);
        getContentPane().add(jProgressBar1);
        jProgressBar1.setBounds(150, 540, 500, 30);
        jProgressBar1.getAccessibleContext().setAccessibleName("");
        jProgressBar1.getAccessibleContext().setAccessibleDescription("Barra de carregamento");

        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/telaSplash.png"))); // NOI18N
        Background.setText("jLabel1");
        Background.setMaximumSize(new java.awt.Dimension(800, 600));
        Background.setMinimumSize(new java.awt.Dimension(800, 600));
        getContentPane().add(Background);
        Background.setBounds(0, 0, 800, 600);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Splash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Splash().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Background;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JLabel mensagemStatus;
    // End of variables declaration//GEN-END:variables
}
