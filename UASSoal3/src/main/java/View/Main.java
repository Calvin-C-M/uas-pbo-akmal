/*
 * Nama Project         : UAS Soal 3
 * Nama                 : Calvin Calfi Montolalu
 * NPM                  : 140810200053
 * Kelas                : A
 * Tanggal Buat         : 23/12/2021
 * Deskripri Project    :
 */
package View;
import Classes.*;
import Database.*;
import Exception.*;

import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

/**
 *
 * @author Calvin C M
 */
public class Main extends javax.swing.JFrame {
    Karyawan karyawan;

    /**
     * Creates new form Main
     */
    public Main() {
        this.karyawan=new Karyawan();
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        header = new javax.swing.JPanel();
        title = new javax.swing.JLabel();
        form = new javax.swing.JPanel();
        labelInputKodeKaryawan = new javax.swing.JLabel();
        labelInputNamaKaryawan = new javax.swing.JLabel();
        labelInputJamDatang = new javax.swing.JLabel();
        labelInputJamPulang = new javax.swing.JLabel();
        options = new javax.swing.JPanel();
        tambahButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        updateButton = new javax.swing.JButton();
        saveButton = new javax.swing.JButton();
        inputKodeKaryawan = new javax.swing.JTextField();
        inputNamaKaryawan = new javax.swing.JTextField();
        inputJamDatang = new javax.swing.JTextField();
        inputJamPulang = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableKaryawan = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistem Perusahaan");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        header.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        title.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        title.setText("Sistem Perusahaan");
        header.add(title);

        form.setBorder(javax.swing.BorderFactory.createTitledBorder("Form"));

        labelInputKodeKaryawan.setText("Kode Karyawan");

        labelInputNamaKaryawan.setText("Nama Karyawan");

        labelInputJamDatang.setText("Jam Datang");

        labelInputJamPulang.setText("Jam Pulang");

        options.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        tambahButton.setText("Tambah");
        tambahButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tambahButtonActionPerformed(evt);
            }
        });

        deleteButton.setText("Hapus");
        deleteButton.setEnabled(false);

        updateButton.setText("Update");
        updateButton.setEnabled(false);
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });

        saveButton.setText("Simpan");
        saveButton.setEnabled(false);
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout optionsLayout = new javax.swing.GroupLayout(options);
        options.setLayout(optionsLayout);
        optionsLayout.setHorizontalGroup(
            optionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(optionsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tambahButton)
                .addGap(152, 152, 152)
                .addComponent(updateButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(saveButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(deleteButton)
                .addContainerGap())
        );
        optionsLayout.setVerticalGroup(
            optionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(optionsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(optionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tambahButton)
                    .addComponent(deleteButton)
                    .addComponent(updateButton)
                    .addComponent(saveButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        inputJamDatang.setText("hh:mm:ss");

        inputJamPulang.setText("hh:mm:ss");

        javax.swing.GroupLayout formLayout = new javax.swing.GroupLayout(form);
        form.setLayout(formLayout);
        formLayout.setHorizontalGroup(
            formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(formLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(formLayout.createSequentialGroup()
                        .addGroup(formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(labelInputKodeKaryawan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(labelInputNamaKaryawan, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
                            .addComponent(labelInputJamDatang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(labelInputJamPulang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(inputKodeKaryawan)
                            .addComponent(inputNamaKaryawan)
                            .addGroup(formLayout.createSequentialGroup()
                                .addGroup(formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(inputJamDatang)
                                    .addComponent(inputJamPulang, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addComponent(options, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        formLayout.setVerticalGroup(
            formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(formLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelInputKodeKaryawan)
                    .addComponent(inputKodeKaryawan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelInputNamaKaryawan)
                    .addComponent(inputNamaKaryawan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelInputJamDatang)
                    .addComponent(inputJamDatang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelInputJamPulang)
                    .addComponent(inputJamPulang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(options, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        tableKaryawan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Kode Karyawan", "Nama Karyawan", "Jam Datang", "Jam Pulang", "Lama Kerja", "Upah"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tableKaryawan.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tableKaryawanFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                tableKaryawanFocusLost(evt);
            }
        });
        jScrollPane1.setViewportView(tableKaryawan);
        if (tableKaryawan.getColumnModel().getColumnCount() > 0) {
            tableKaryawan.getColumnModel().getColumn(3).setResizable(false);
            tableKaryawan.getColumnModel().getColumn(4).setResizable(false);
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(header, javax.swing.GroupLayout.DEFAULT_SIZE, 642, Short.MAX_VALUE)
                    .addComponent(form, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(form, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(10, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tambahButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tambahButtonActionPerformed
        this.karyawan.setKode(inputKodeKaryawan.getText());
        this.karyawan.setNama(inputNamaKaryawan.getText());
        try {
            String[] masuk=inputJamDatang.getText().split(":");
            String[] keluar=inputJamPulang.getText().split(":");
            
            karyawan.getDatang().setJam(Integer.parseInt(masuk[0]));
            karyawan.getDatang().setMenit(Integer.parseInt(masuk[1]));
            karyawan.getDatang().setDetik(Integer.parseInt(masuk[2]));
            karyawan.getPulang().setJam(Integer.parseInt(keluar[0]));
            karyawan.getPulang().setMenit(Integer.parseInt(keluar[1]));
            karyawan.getPulang().setDetik(Integer.parseInt(keluar[2]));

            if(formatWaktuIsInvalid(this.karyawan.getDatang()) || formatWaktuIsInvalid(this.karyawan.getPulang())) {
                throw new InvalidTimeException();
            }
            
            if(inputWaktuIsInvalid(this.karyawan.getDatang(), this.karyawan.getPulang())) {
                throw new InvalidTimeException();
            }
        } catch(InvalidTimeException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "ERROR", 1);
        } catch(Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "ERROR", 1);
        }

        try {
            this.karyawan.insertData();
        } catch(SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "ERROR", 1);
        }
    }//GEN-LAST:event_tambahButtonActionPerformed

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        this.karyawan.setKode(inputKodeKaryawan.getText());
        this.karyawan.setNama(inputNamaKaryawan.getText());
        try {
            String[] masuk=inputJamDatang.getText().split(":");
            String[] keluar=inputJamPulang.getText().split(":");
            
            karyawan.getDatang().setJam(Integer.parseInt(masuk[0]));
            karyawan.getDatang().setMenit(Integer.parseInt(masuk[1]));
            karyawan.getDatang().setDetik(Integer.parseInt(masuk[2]));
            karyawan.getPulang().setJam(Integer.parseInt(keluar[0]));
            karyawan.getPulang().setMenit(Integer.parseInt(keluar[1]));
            karyawan.getPulang().setDetik(Integer.parseInt(keluar[2]));

            if(formatWaktuIsInvalid(this.karyawan.getDatang()) || formatWaktuIsInvalid(this.karyawan.getPulang())) {
                throw new InvalidTimeException();
            }
            
            if(inputWaktuIsInvalid(this.karyawan.getDatang(), this.karyawan.getPulang())) {
                throw new InvalidTimeException();
            }

            karyawan.setLama();
            karyawan.setUpah();
        } catch(InvalidTimeException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "ERROR", 1);
        } catch(Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "ERROR", 1);
        }

        try {
            this.karyawan.updateData();
        } catch(SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "ERROR", 1);
        }    
    }//GEN-LAST:event_saveButtonActionPerformed

    private void tableKaryawanFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tableKaryawanFocusGained
        deleteButton.setEnabled(true);
        updateButton.setEnabled(true);
    }//GEN-LAST:event_tableKaryawanFocusGained

    private void tableKaryawanFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tableKaryawanFocusLost
        deleteButton.setEnabled(false);
        updateButton.setEnabled(false);
    }//GEN-LAST:event_tableKaryawanFocusLost

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
        inputKodeKaryawan.setEnabled(false);
        this.karyawan.setKode(String.valueOf(tableKaryawan.getValueAt(tableKaryawan.getSelectedRow(), 0)));
        this.karyawan.setNama(String.valueOf(tableKaryawan.getValueAt(tableKaryawan.getSelectedRow(), 1)));
        String[] masuk=String.valueOf(tableKaryawan.getValueAt(tableKaryawan.getSelectedRow(), 2)).split("-");
        String[] keluar=String.valueOf(tableKaryawan.getValueAt(tableKaryawan.getSelectedRow(), 3)).split("-");
        String[] lama=String.valueOf(tableKaryawan.getValueAt(tableKaryawan.getSelectedRow(), 4)).split("-");
        
        karyawan.getDatang().setJam(Integer.parseInt(masuk[0]));
        karyawan.getDatang().setMenit(Integer.parseInt(masuk[1]));
        karyawan.getDatang().setDetik(Integer.parseInt(masuk[2]));
        karyawan.getPulang().setJam(Integer.parseInt(keluar[0]));
        karyawan.getPulang().setMenit(Integer.parseInt(keluar[1]));
        karyawan.getPulang().setDetik(Integer.parseInt(keluar[2]));
        karyawan.getPulang().setJam(Integer.parseInt(lama[0]));
        karyawan.getPulang().setMenit(Integer.parseInt(lama[1]));
        karyawan.getPulang().setDetik(Integer.parseInt(lama[2]));

        inputKodeKaryawan.setText(String.valueOf(this.karyawan.getKode()));
        inputNamaKaryawan.setText(this.karyawan.getNama());

        tambahButton.setEnabled(false);
        saveButton.setEnabled(true);
        deleteButton.setEnabled(true);        
    }//GEN-LAST:event_updateButtonActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        this.queryData();
    }//GEN-LAST:event_formWindowOpened

    public boolean formatWaktuIsInvalid(Waktu waktu) {
        return (
            (waktu.getJam() < 0 || waktu.getJam() > 24)
            &&
            (waktu.getMenit() < 0 || waktu.getMenit() > 59)
            &&
            (waktu.getDetik() < 0 || waktu.getDetik() > 59)
        );
    }

    public boolean inputWaktuIsInvalid(Waktu datang, Waktu pulang) {
        return (
            (datang.getJam() > pulang.getJam())
            &&
            (
                datang.getJam() < pulang.getJam()
                &&
                datang.getMenit() > pulang.getMenit()
            )
            &&
            (
                datang.getJam() < pulang.getJam()
                &&
                datang.getMenit() < pulang.getMenit()
                &&
                datang.getDetik() > pulang.getDetik()
            )
        );
    }

    public void queryData() {
        int baris=0;
        try {
            ConnectDB connectDB=new ConnectDB();
            ResultSet rs=null;

            String query="SELECT * FROM karyawan";
            rs=connectDB.getData(query);

            while(rs.next()) {
                tableKaryawan.setValueAt(rs.getInt("kode"), baris, 0);
                tableKaryawan.setValueAt(rs.getString("nama"), baris, 1);
                tableKaryawan.setValueAt(rs.getDouble("waktuDatang"), baris, 2);
                tableKaryawan.setValueAt(rs.getInt("waktuPulang"), baris, 3);
                tableKaryawan.setValueAt(rs.getInt("lama"), baris, 4);
                tableKaryawan.setValueAt(rs.getInt("upah"), baris, 5);

                baris++;
            }
            rs.close();
        } catch(Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton deleteButton;
    private javax.swing.JPanel form;
    private javax.swing.JPanel header;
    private javax.swing.JTextField inputJamDatang;
    private javax.swing.JTextField inputJamPulang;
    private javax.swing.JTextField inputKodeKaryawan;
    private javax.swing.JTextField inputNamaKaryawan;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelInputJamDatang;
    private javax.swing.JLabel labelInputJamPulang;
    private javax.swing.JLabel labelInputKodeKaryawan;
    private javax.swing.JLabel labelInputNamaKaryawan;
    private javax.swing.JPanel options;
    private javax.swing.JButton saveButton;
    private javax.swing.JTable tableKaryawan;
    private javax.swing.JButton tambahButton;
    private javax.swing.JLabel title;
    private javax.swing.JButton updateButton;
    // End of variables declaration//GEN-END:variables
}
