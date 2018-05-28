/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Giu;

import Logica.Expresiones;
import Logica.Imp_Caj;
import Logica.Imp_Clie;
import Logica.Imp_Cuen;
import Logica.Imp_transf;
import Logica.ManCajero;
import Logica.ManCliente;
import Logica.ManCuenta;
import Logica.ManTransferencia;
import clases.Cajero;
import clases.Cliente;
import clases.Cuenta;
import clases.Transferencia;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author lenovo
 */
public class Deposito extends javax.swing.JFrame {

    Imp_Clie objImpCli = new Imp_Clie();
    Imp_Cuen objImpCue = new Imp_Cuen();
    Imp_Caj objImpCaj = new Imp_Caj();
    Imp_transf objImpTra = new Imp_transf();
    ManCajero objManCaj = new ManCajero();
    ManCliente objManCli = new ManCliente();
    ManCuenta objManCue = new ManCuenta();
    ManTransferencia objManTra = new ManTransferencia();
    ArrayList<Cliente> ArrayClientes = new ArrayList<Cliente>();
    ArrayList<Cuenta> ArrayCuentas = new ArrayList<Cuenta>();
    ArrayList<Cajero> ArrayCajeros = new ArrayList<Cajero>();
    ArrayList<Transferencia> ArrayTransacciones = new ArrayList<Transferencia>();
    Cuenta objCue = new Cuenta();
    Cliente objCli = new Cliente();
    Cajero objCaj = new Cajero();
    Transferencia objTra = new Transferencia();

    public Deposito() {
        initComponents();
        ArrayClientes = objImpCli.ImportarClientes();
        ArrayCuentas = objImpCue.ImportarCuentas();
        ArrayCajeros = objImpCaj.ImportarCajeros();
        ArrayTransacciones = objImpTra.ImportarTransaccion();
        setTitle("Retiro");
        objCaj = objManCaj.BuscarCajero(ArrayCajeros, "987");
        this.jcajID.setText(objCaj.getId_Cajero());
        this.jcajNom.setText(objCaj.getNombre());
        this.jcajApe.setText(objCaj.getApellido());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextcuenta = new javax.swing.JTextField();
        jTextnombre = new javax.swing.JTextField();
        jTextmonto = new javax.swing.JTextField();
        jTextcedula = new javax.swing.JTextField();
        jTextdepositante = new javax.swing.JTextField();
        jTextFecha = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jnumTra = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jcajNom = new javax.swing.JTextField();
        jcajApe = new javax.swing.JTextField();
        jcajID = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jTextapellidoDep = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jTexttipo = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Deposito");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(146, 11, -1, -1));

        jLabel2.setText("Numero cuenta");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 53, -1, -1));

        jLabel3.setText("Monto a depositar");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, -1, -1));

        jLabel4.setText("Titular");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 85, -1, -1));

        jLabel5.setText("Cedula");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, -1, -1));

        jLabel6.setText("Nombre");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, -1, -1));

        jLabel7.setText("Fecha");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, -1, -1));
        getContentPane().add(jTextcuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 50, 90, -1));

        jTextnombre.setEnabled(false);
        jTextnombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextnombreActionPerformed(evt);
            }
        });
        getContentPane().add(jTextnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(139, 80, 90, -1));

        jTextmonto.setEnabled(false);
        getContentPane().add(jTextmonto, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 180, 90, -1));

        jTextcedula.setEnabled(false);
        getContentPane().add(jTextcedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 140, 90, -1));

        jTextdepositante.setEnabled(false);
        getContentPane().add(jTextdepositante, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 210, 90, -1));

        jTextFecha.setEnabled(false);
        getContentPane().add(jTextFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 280, 100, -1));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setEnabled(false);
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 40, -1, 180));

        jButton1.setText("Ok");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 50, -1, -1));

        jButton2.setText("Depositar");
        jButton2.setEnabled(false);
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 250, -1, -1));

        jLabel8.setText("Transaccion #:");

        jnumTra.setEnabled(false);

        jLabel9.setText("Atendido por:");

        jcajNom.setEnabled(false);
        jcajNom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcajNomActionPerformed(evt);
            }
        });

        jcajApe.setEnabled(false);
        jcajApe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcajApeActionPerformed(evt);
            }
        });

        jcajID.setEnabled(false);
        jcajID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcajIDActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(18, 18, 18)
                        .addComponent(jcajNom, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jcajApe, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jcajID, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)
                        .addComponent(jnumTra, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(56, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jnumTra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jcajNom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcajApe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcajID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 330, 390, 90));

        jLabel10.setText("Apellido");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, -1, -1));

        jTextapellidoDep.setEnabled(false);
        jTextapellidoDep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextapellidoDepActionPerformed(evt);
            }
        });
        getContentPane().add(jTextapellidoDep, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 240, 100, -1));

        jButton3.setText("Validar");
        jButton3.setEnabled(false);
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 250, -1, -1));

        jLabel11.setText("Tipo cuenta");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, -1));

        jTexttipo.setEnabled(false);
        getContentPane().add(jTexttipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 110, 170, -1));

        jButton4.setText("Ok");
        jButton4.setEnabled(false);
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton4MouseClicked(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 140, -1, -1));

        jButton5.setText("Salir");
        jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton5MouseClicked(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 290, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jcajNomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcajNomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcajNomActionPerformed

    private void jcajApeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcajApeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcajApeActionPerformed

    private void jcajIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcajIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcajIDActionPerformed

    private void jTextnombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextnombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextnombreActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:
        objCue = objManCue.BuscarCuenta(ArrayCuentas, this.jTextcuenta.getText());
        objCli = objManCli.BuscarCliente(ArrayClientes, this.jTextcedula.getText());

        try {
            if (objCue.getNumero().equals(this.jTextcuenta.getText())) {
                this.jTextnombre.setText(objCli.getNombre());
                if (objCue.getOpcion() == 1) {
                    this.jTexttipo.setText("Cuenta Ahorros");
                    this.jTextnombre.setText(objCue.getCliente().getNombre());
                    this.jButton4.setEnabled(true);
                    this.jTextcedula.setEnabled(true);
                }
                if (objCue.getOpcion() == 2) {
                    this.jTexttipo.setText("Cuenta Corriente");
                    this.jTextnombre.setText(objCue.getCliente().getNombre());
                    this.jButton4.setEnabled(true);
                    this.jTextcedula.setEnabled(true);

                }

            } else {
                JOptionPane.showMessageDialog(rootPane, "No es cliente de esta cooperativa");
                this.jTextcuenta.setText("");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "No es cliente de esta cooperativa");
            this.jTextcuenta.setText("");
        }

    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        // TODO add your handling code here:
        try {
//            if (Integer.parseInt(objCli.getCedula()) != Integer.parseInt(jdepCed.getText())) {
//                objCli = objManCli.CrearCliente(jdepCed.getText(), jdepNom.getText(), jdepApe.getText());
//                ArrayClientes.add(objCli);
//            }
            objCli = objManCli.CrearCliente(this.jTextcedula.getText(), this.jTextdepositante.getText(), this.jTextapellidoDep.getText());
            boolean auxCli = true;
            if (auxCli != objManCli.ComprobarCliente(ArrayClientes, objCli.getCedula())) {
                ArrayClientes.add(objCli);
            }
            objCue = objManCue.DepositoCuenta(objCue, Double.parseDouble(this.jTextmonto.getText()));
            objTra = objManTra.CrearTransaccion(objCli, objCaj, objCue, ArrayTransacciones);
            JOptionPane.showMessageDialog(rootPane, "Deposito exitoso");
            this.jnumTra.setText(String.valueOf(objTra.getId_transaccion()));
            ArrayTransacciones.add(objTra);
            ArrayCuentas.set(ArrayCuentas.indexOf(objCue), objCue);
            try {
                objManTra.GuardaTransaccion(ArrayTransacciones);
                objManCue.GuardarCuenta(ArrayCuentas);
                objManCli.GuardarClientes(ArrayClientes);
            } catch (IOException ex) {
                Logger.getLogger(Deposito.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (NumberFormatException e) {
        } finally {
            //TextFields en vacio de nuevo
            this.jTextcuenta.setText("");
            this.jTextcedula.setText("");
            this.jTextdepositante.setText("");
            this.jTextapellidoDep.setText("");
            this.jTextnombre.setText("");
            this.jTextmonto.setText("");
            this.jTextFecha.setText("");
            //Desactivar Botones
            this.jButton2.setEnabled(false);
            //Desactivar TextFields
            this.jTextcedula.setEnabled(false);
            this.jTextdepositante.setEnabled(false);
            this.jTextapellidoDep.setEnabled(false);
            this.jTextmonto.setEnabled(false);
        }
    }//GEN-LAST:event_jButton2MouseClicked

    private void jTextapellidoDepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextapellidoDepActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextapellidoDepActionPerformed

    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked
        // TODO add your handling code here:
        objCue = objManCue.BuscarCuenta(ArrayCuentas, this.jTextcuenta.getText());
        objCli = objManCli.BuscarCliente(ArrayClientes, this.jTextcedula.getText());

        try {
            if (objCli.getCedula().equals(this.jTextcedula.getText())) {
                this.jTextdepositante.setText(objCli.getNombre());
                this.jTextmonto.setEnabled(true);
                this.jTextFecha.setEnabled(true);
                this.jButton3.setEnabled(true);
                this.jTextdepositante.setText(objCli.getNombre());
                this.jTextapellidoDep.setText(objCli.getApellido());
                
            }

        } catch (Exception e) {
         JOptionPane.showMessageDialog(rootPane, "No es cliente\n "
                        + "Ingrese su nombre"
                        + "Ingrese apellido");
                 this.jTextmonto.setEnabled(true);
                this.jTextFecha.setEnabled(true);
                this.jTextdepositante.setEnabled(true);
                this.jTextapellidoDep.setEnabled(true);
                this.jButton3.setEnabled(true);
                this.jTextdepositante.setText("");
                 this.jTextapellidoDep.setText("");
        }
    }//GEN-LAST:event_jButton4MouseClicked

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        // TODO add your handling code here:
          Expresiones objexp=new Expresiones();
        String S = "Cedula: " + this.jTextcedula.getText()+ "\n Beneficiario:" + this.jTextnombre.getText() + "\n Cuenta:" + this.jTextcuenta.getText()+  "\n tipo de cuenta:" + this.jTexttipo.getText()
                + "\n Monto:" + this.jTextmonto.getText() 
                +"\n Fecha:" + this.jTextFecha.getText() 
                 + "\n";
         String fecha=this.jTextFecha.getText();
        this.jTextArea1.setText(S);
        if (objexp.fecha(fecha) ){
             JOptionPane.showMessageDialog(null, "fecha  correcta");
               this.jButton2.setEnabled(true);
        this.jTextArea1.setEnabled(true);
        }else{
             JOptionPane.showMessageDialog(null, "Fecha no correcta");
              this.jButton2.setEnabled(false);
        this.jTextArea1.setEnabled(false);
                                       
        }
        
    }//GEN-LAST:event_jButton3MouseClicked

    private void jButton5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseClicked
        // TODO add your handling code here:
         Login objReg = new Login();
            objReg.setVisible(true);
            dispose();
    }//GEN-LAST:event_jButton5MouseClicked

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
            java.util.logging.Logger.getLogger(Deposito.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Deposito.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Deposito.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Deposito.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Deposito().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextFecha;
    private javax.swing.JTextField jTextapellidoDep;
    private javax.swing.JTextField jTextcedula;
    private javax.swing.JTextField jTextcuenta;
    private javax.swing.JTextField jTextdepositante;
    private javax.swing.JTextField jTextmonto;
    private javax.swing.JTextField jTextnombre;
    private javax.swing.JTextField jTexttipo;
    private javax.swing.JTextField jcajApe;
    private javax.swing.JTextField jcajID;
    private javax.swing.JTextField jcajNom;
    private javax.swing.JTextField jnumTra;
    // End of variables declaration//GEN-END:variables
}
