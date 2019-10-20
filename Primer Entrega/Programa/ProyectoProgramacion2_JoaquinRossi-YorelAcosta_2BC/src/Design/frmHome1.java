
package Design;

public class frmHome1 extends javax.swing.JFrame {

    public frmHome1() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlGeneral = new javax.swing.JPanel();
        pnlContexto = new javax.swing.JPanel();
        btnExit = new javax.swing.JButton();
        btnMinimizate = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        btnCPU = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        btnMemoriaRAM = new javax.swing.JButton();
        btnGab = new javax.swing.JButton();
        btnDsk = new javax.swing.JButton();
        btnSupply = new javax.swing.JButton();
        btnGPU = new javax.swing.JButton();
        btnMb1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        txtResultMass2 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtResultMass = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jSpinner1 = new javax.swing.JSpinner();
        jSpinner10 = new javax.swing.JSpinner();
        jLabel11 = new javax.swing.JLabel();
        jSpinner9 = new javax.swing.JSpinner();
        jLabel10 = new javax.swing.JLabel();
        txtResultMass1 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtResultMass5 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtResultMass7 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jSpinner6 = new javax.swing.JSpinner();
        jLabel13 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        pnlEstado = new javax.swing.JPanel();
        pnlSlider = new javax.swing.JPanel();
        jSeparator5 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlGeneral.setBackground(new java.awt.Color(255, 255, 255));
        pnlGeneral.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlContexto.setBackground(new java.awt.Color(229, 229, 229));
        pnlContexto.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/close-selectedFALSE_32.png"))); // NOI18N
        btnExit.setActionCommand("btnExit");
        btnExit.setBorder(null);
        btnExit.setBorderPainted(false);
        btnExit.setContentAreaFilled(false);
        btnExit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnExit.setFocusPainted(false);
        btnExit.setFocusable(false);
        btnExit.setRequestFocusEnabled(false);
        btnExit.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/close-selected1_32.png"))); // NOI18N
        btnExit.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/close-selectedFALSE_32.png"))); // NOI18N
        btnExit.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/close-selectedFALSE_32.png"))); // NOI18N
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });
        pnlContexto.add(btnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 0, 40, 50));

        btnMinimizate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/minimizar-frame_32.png"))); // NOI18N
        btnMinimizate.setActionCommand("btnExit");
        btnMinimizate.setBorder(null);
        btnMinimizate.setBorderPainted(false);
        btnMinimizate.setContentAreaFilled(false);
        btnMinimizate.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMinimizate.setFocusPainted(false);
        btnMinimizate.setFocusable(false);
        btnMinimizate.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/minimizar-frame_selected1_32.png"))); // NOI18N
        btnMinimizate.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/minimizar-frame_32.png"))); // NOI18N
        btnMinimizate.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/minimizar-frame_32.png"))); // NOI18N
        btnMinimizate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMinimizateActionPerformed(evt);
            }
        });
        pnlContexto.add(btnMinimizate, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 0, 40, 50));

        jPanel1.setBackground(new java.awt.Color(229, 229, 229));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnCPU.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/cpu_selected0.png"))); // NOI18N
        btnCPU.setBorderPainted(false);
        btnCPU.setContentAreaFilled(false);
        btnCPU.setFocusPainted(false);
        jPanel1.add(btnCPU, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 100, 90, 50));

        jButton1.setBackground(new java.awt.Color(229, 229, 229));
        jButton1.setForeground(new java.awt.Color(229, 229, 229));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/help_selected0.png"))); // NOI18N
        jButton1.setToolTipText("Pulsa uno de los botones");
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setDefaultCapable(false);
        jButton1.setFocusPainted(false);
        jButton1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/help_selected1.png"))); // NOI18N
        jButton1.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/help_selected0.png"))); // NOI18N
        jButton1.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/help_selected0.png"))); // NOI18N
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 50, 20, -1));

        btnMemoriaRAM.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/memRAM_selected1.png"))); // NOI18N
        btnMemoriaRAM.setBorderPainted(false);
        btnMemoriaRAM.setContentAreaFilled(false);
        btnMemoriaRAM.setFocusPainted(false);
        jPanel1.add(btnMemoriaRAM, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 90, 50));

        btnGab.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/gab_selected0.png"))); // NOI18N
        btnGab.setBorderPainted(false);
        btnGab.setContentAreaFilled(false);
        btnGab.setFocusPainted(false);
        jPanel1.add(btnGab, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 100, 90, 50));

        btnDsk.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/dsk_selected0.png"))); // NOI18N
        btnDsk.setBorderPainted(false);
        btnDsk.setContentAreaFilled(false);
        btnDsk.setFocusPainted(false);
        jPanel1.add(btnDsk, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 100, 90, 50));

        btnSupply.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/supply_selected0.png"))); // NOI18N
        btnSupply.setBorderPainted(false);
        btnSupply.setContentAreaFilled(false);
        btnSupply.setFocusPainted(false);
        jPanel1.add(btnSupply, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 100, 90, 50));

        btnGPU.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/memG_selected0.png"))); // NOI18N
        btnGPU.setBorderPainted(false);
        btnGPU.setContentAreaFilled(false);
        btnGPU.setFocusPainted(false);
        jPanel1.add(btnGPU, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 100, 90, 50));

        btnMb1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/mb_selected0.png"))); // NOI18N
        btnMb1.setBorderPainted(false);
        btnMb1.setContentAreaFilled(false);
        btnMb1.setFocusPainted(false);
        jPanel1.add(btnMb1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 100, 90, 50));

        jPanel2.setBackground(new java.awt.Color(229, 229, 229));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtResultMass2.setBackground(new java.awt.Color(229, 229, 229));
        txtResultMass2.setForeground(new java.awt.Color(51, 59, 65));
        txtResultMass2.setText(" Memoria RAM");
        txtResultMass2.setBorder(null);
        jPanel2.add(txtResultMass2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 110, 30));

        jLabel9.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 59, 65));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Descripcion:");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, -1, 20));

        txtResultMass.setEditable(false);
        txtResultMass.setBackground(new java.awt.Color(229, 229, 229));
        txtResultMass.setForeground(new java.awt.Color(51, 59, 65));
        txtResultMass.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtResultMass.setText("1AAB");
        txtResultMass.setBorder(null);
        txtResultMass.setEnabled(false);
        jPanel2.add(txtResultMass, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 50, 30));

        jLabel7.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 59, 65));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("ID Memoria:");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, 20));

        jSpinner1.setModel(new javax.swing.SpinnerNumberModel(100, 100, 199, 1));
        jSpinner1.setBorder(null);
        jPanel2.add(jSpinner1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 130, 50, 30));

        jSpinner10.setModel(new javax.swing.SpinnerListModel(new String[] {"4 GB", "8 GB", "16 GB"}));
        jSpinner10.setBorder(null);
        jPanel2.add(jSpinner10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 110, 30));

        jLabel11.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(51, 59, 65));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Capacidad:");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, -1, -1));

        jSpinner9.setModel(new javax.swing.SpinnerListModel(new String[] {"1600 MHz", "1866 MHz", "2400 MHz", "2666 MHz", "3000 MHz"}));
        jSpinner9.setBorder(null);
        jPanel2.add(jSpinner9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 110, 30));

        jLabel10.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 59, 65));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Frecuencia:");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, -1, 20));

        txtResultMass1.setBackground(new java.awt.Color(229, 229, 229));
        txtResultMass1.setForeground(new java.awt.Color(51, 59, 65));
        txtResultMass1.setText(" En US$");
        txtResultMass1.setBorder(null);
        jPanel2.add(txtResultMass1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 260, 110, 30));

        jLabel8.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 59, 65));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Precio:");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 240, -1, 20));

        txtResultMass5.setBackground(new java.awt.Color(229, 229, 229));
        txtResultMass5.setForeground(new java.awt.Color(51, 59, 65));
        txtResultMass5.setText(" Ejemplo: X370M");
        txtResultMass5.setBorder(null);
        jPanel2.add(txtResultMass5, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 330, 110, 30));

        jLabel12.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(51, 59, 65));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText(" Modelo:");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 310, 60, 20));

        txtResultMass7.setBackground(new java.awt.Color(229, 229, 229));
        txtResultMass7.setForeground(new java.awt.Color(51, 59, 65));
        txtResultMass7.setText(" Ejemplo: MSI");
        txtResultMass7.setBorder(null);
        jPanel2.add(txtResultMass7, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 200, 110, 30));

        jLabel14.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(51, 59, 65));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("Marca:");
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 180, -1, 20));

        jSpinner6.setModel(new javax.swing.SpinnerListModel(new String[] {"DDR3", "DDR4"}));
        jSpinner6.setBorder(null);
        jPanel2.add(jSpinner6, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 130, 110, 30));

        jLabel13.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(51, 59, 65));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Tecnologia:");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 110, -1, 20));

        jLabel1.setFont(new java.awt.Font("Lucida Sans", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 59, 65));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Ingreso: Memoria R.A.M.");
        jLabel1.setToolTipText("");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 230, 50));

        jLabel3.setBackground(new java.awt.Color(128, 131, 123));
        jLabel3.setFont(new java.awt.Font("Lucida Sans", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(137, 137, 137));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Carga a continuación los Tipos de Insumos a la Tabla.png"))); // NOI18N
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 330, 30));

        jSeparator3.setBackground(new java.awt.Color(70, 176, 74));
        jSeparator3.setForeground(new java.awt.Color(70, 176, 74));
        jPanel2.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 310, 10));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 890, 440));

        jLabel4.setFont(new java.awt.Font("Lucida Sans", 0, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 59, 65));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText(" Insumos: Hardware");
        jLabel4.setToolTipText("");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 370, 60));

        jLabel5.setBackground(new java.awt.Color(128, 131, 123));
        jLabel5.setFont(new java.awt.Font("Lucida Sans", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(137, 137, 137));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Carga a continuación los Tipos de Insumos a la Tabla.png"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 360, 30));

        pnlContexto.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 890, 620));

        jSeparator2.setBackground(new java.awt.Color(222, 222, 222));
        jSeparator2.setForeground(new java.awt.Color(222, 222, 222));
        jSeparator2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 0));
        pnlContexto.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 50, 910, 10));

        jLabel2.setFont(new java.awt.Font("Malgun Gothic", 1, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(137, 137, 137));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setText(" GESTOR DE INSUMOS");
        jLabel2.setToolTipText("");
        pnlContexto.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 250, 50));

        pnlGeneral.add(pnlContexto, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 0, 890, 680));

        pnlEstado.setBackground(new java.awt.Color(218, 218, 218));
        pnlEstado.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        pnlGeneral.add(pnlEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 260, 50));

        pnlSlider.setBackground(new java.awt.Color(218, 218, 218));
        pnlSlider.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jSeparator5.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator5.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 0));
        pnlSlider.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 290, 10));

        pnlGeneral.add(pnlSlider, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 260, 630));

        getContentPane().add(pnlGeneral, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1150, 680));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnMinimizateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMinimizateActionPerformed
        this.setState(frmHome.ICONIFIED);
    }//GEN-LAST:event_btnMinimizateActionPerformed

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
            java.util.logging.Logger.getLogger(frmHome1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmHome1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmHome1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmHome1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmHome1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCPU;
    private javax.swing.JButton btnDsk;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnGPU;
    private javax.swing.JButton btnGab;
    private javax.swing.JButton btnMb1;
    private javax.swing.JButton btnMemoriaRAM;
    private javax.swing.JButton btnMinimizate;
    private javax.swing.JButton btnSupply;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JSpinner jSpinner10;
    private javax.swing.JSpinner jSpinner6;
    private javax.swing.JSpinner jSpinner9;
    private javax.swing.JPanel pnlContexto;
    private javax.swing.JPanel pnlEstado;
    private javax.swing.JPanel pnlGeneral;
    private javax.swing.JPanel pnlSlider;
    private javax.swing.JTextField txtResultMass;
    private javax.swing.JTextField txtResultMass1;
    private javax.swing.JTextField txtResultMass2;
    private javax.swing.JTextField txtResultMass5;
    private javax.swing.JTextField txtResultMass7;
    // End of variables declaration//GEN-END:variables
}
