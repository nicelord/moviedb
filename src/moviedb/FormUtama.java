/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moviedb;

import java.util.Calendar;
import java.util.Date;
import javax.swing.JComboBox;
import javax.swing.JSpinner;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SpinnerDateModel;

/**
 *
 * @author Reza Elborneo
 */
public class FormUtama extends javax.swing.JFrame {

    /**
     * Creates new form FormUtama
     */
    public FormUtama() {
        initComponents();
        Date datenow = Calendar.getInstance().getTime();
        SpinnerDateModel smb = new SpinnerDateModel(datenow, null, null, 11);
        this.spinerDateTime.setModel(smb);
        JSpinner.DateEditor d = new JSpinner.DateEditor(this.spinerDateTime, "dd-MM-yyyy HH:mm:ss");
        this.spinerDateTime.setEditor(d);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtIMDUrl = new javax.swing.JTextField();
        txtTitle = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtPlot = new javax.swing.JTextArea();
        txtYear = new javax.swing.JTextField();
        txtRating = new javax.swing.JTextField();
        txtRuntime = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtDirectors = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtCast = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtCountries = new javax.swing.JTextArea();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        txtPoster = new javax.swing.JTextArea();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        txtGenres = new javax.swing.JTextArea();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        txtThrailer = new javax.swing.JTextArea();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane8 = new javax.swing.JScrollPane();
        txtKeywords = new javax.swing.JTextArea();
        jLabel13 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jScrollPane9 = new javax.swing.JScrollPane();
        txtWriter = new javax.swing.JTextArea();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane10 = new javax.swing.JScrollPane();
        txtLog = new javax.swing.JTextArea();
        txtPostURL = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        spinerDateTime = new javax.swing.JSpinner();
        cmbPostStatus = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setText("IMDB ID :");

        jLabel2.setText("TITLE :");

        jLabel3.setText("PLOT :");

        jLabel4.setText("YEAR : ");

        jLabel5.setText("RATING :");

        jLabel6.setText("DURATION :");

        jLabel7.setText("CAST :");

        jLabel8.setText("DIRECTORS :");

        txtIMDUrl.setText("tt4046784");

        txtPlot.setColumns(20);
        txtPlot.setRows(1);
        jScrollPane1.setViewportView(txtPlot);

        txtDirectors.setColumns(20);
        txtDirectors.setRows(1);
        jScrollPane2.setViewportView(txtDirectors);

        txtCast.setColumns(20);
        txtCast.setRows(1);
        jScrollPane3.setViewportView(txtCast);

        txtCountries.setColumns(20);
        txtCountries.setRows(1);
        jScrollPane4.setViewportView(txtCountries);

        jLabel9.setText("COUNTRY :");

        txtPoster.setColumns(20);
        txtPoster.setRows(1);
        jScrollPane5.setViewportView(txtPoster);

        jLabel10.setText("POSTER :");

        txtGenres.setColumns(20);
        txtGenres.setRows(1);
        jScrollPane6.setViewportView(txtGenres);

        jLabel11.setText("GENRE :");

        txtThrailer.setColumns(20);
        txtThrailer.setRows(1);
        jScrollPane7.setViewportView(txtThrailer);

        jLabel12.setText("TRAILER :");

        txtKeywords.setColumns(20);
        txtKeywords.setRows(1);
        jScrollPane8.setViewportView(txtKeywords);

        jLabel13.setText("KEYWORD :");

        jButton1.setText("GET DATA");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel14.setText("WRITERS :");

        txtWriter.setColumns(20);
        txtWriter.setRows(1);
        jScrollPane9.setViewportView(txtWriter);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12)
                    .addComponent(jLabel13)
                    .addComponent(jLabel14))
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane9)
                    .addComponent(jScrollPane8)
                    .addComponent(jScrollPane7)
                    .addComponent(jScrollPane6)
                    .addComponent(jScrollPane5)
                    .addComponent(jScrollPane4)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtTitle, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txtYear, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtRating, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtRuntime, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txtIMDUrl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jButton1)
                    .addComponent(txtIMDUrl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel2)
                    .addComponent(txtTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel3)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel4)
                    .addComponent(txtYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(txtRating, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(txtRuntime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel7)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(31, 31, 31)
                        .addComponent(jLabel14)
                        .addGap(28, 28, 28)
                        .addComponent(jLabel9)
                        .addGap(28, 28, 28)
                        .addComponent(jLabel10)
                        .addGap(28, 28, 28)
                        .addComponent(jLabel11)
                        .addGap(28, 28, 28)
                        .addComponent(jLabel12)
                        .addGap(28, 28, 28)
                        .addComponent(jLabel13))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jScrollPane1, jScrollPane2});

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 330, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 212, Short.MAX_VALUE)
        );

        txtLog.setColumns(20);
        txtLog.setRows(5);
        jScrollPane10.setViewportView(txtLog);

        txtPostURL.setText("http://www.movietrex.com/privateposter.php");

        jLabel15.setText("Post URL :");

        cmbPostStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "POST NOW", "SCHEDULE" }));

        jButton2.setText("POST");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane10)
                    .addComponent(txtPostURL)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(spinerDateTime)
                            .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmbPostStatus, 0, 179, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23)
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPostURL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(cmbPostStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(spinerDateTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        MovieDB mdb = new MovieDB(txtIMDUrl.getText(), this);
        mdb.start();
    }//GEN-LAST:event_jButton1ActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FormUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormUtama().setVisible(true);
            }
        });
    }

    public JTextArea getTxtCast() {
        return txtCast;
    }

    public void setTxtCast(JTextArea txtCast) {
        this.txtCast = txtCast;
    }

    public JTextArea getTxtCountries() {
        return txtCountries;
    }

    public void setTxtCountries(JTextArea txtCountries) {
        this.txtCountries = txtCountries;
    }

    public JTextField getTxtIMDUrl() {
        return txtIMDUrl;
    }

    public void setTxtIMDUrl(JTextField txtIMDUrl) {
        this.txtIMDUrl = txtIMDUrl;
    }

    public JTextArea getTxtKeywords() {
        return txtKeywords;
    }

    public void setTxtKeywords(JTextArea txtKeywords) {
        this.txtKeywords = txtKeywords;
    }

    public JTextArea getTxtPlot() {
        return txtPlot;
    }

    public void setTxtPlot(JTextArea txtPlot) {
        this.txtPlot = txtPlot;
    }

    public JTextArea getTxtPoster() {
        return txtPoster;
    }

    public void setTxtPoster(JTextArea txtPoster) {
        this.txtPoster = txtPoster;
    }

    public JTextField getTxtRating() {
        return txtRating;
    }

    public void setTxtRating(JTextField txtRating) {
        this.txtRating = txtRating;
    }

    public JTextField getTxtRuntime() {
        return txtRuntime;
    }

    public void setTxtRuntime(JTextField txtRuntime) {
        this.txtRuntime = txtRuntime;
    }

    public JTextArea getTxtThrailer() {
        return txtThrailer;
    }

    public void setTxtThrailer(JTextArea txtThrailer) {
        this.txtThrailer = txtThrailer;
    }

    public JTextField getTxtTitle() {
        return txtTitle;
    }

    public void setTxtTitle(JTextField txtTitle) {
        this.txtTitle = txtTitle;
    }

    public JTextField getTxtYear() {
        return txtYear;
    }

    public void setTxtYear(JTextField txtYear) {
        this.txtYear = txtYear;
    }

    public JTextArea getTxtWriter() {
        return txtWriter;
    }

    public void setTxtWriter(JTextArea txtWriter) {
        this.txtWriter = txtWriter;
    }

    public JTextArea getTxtLog() {
        return txtLog;
    }

    public void setTxtLog(JTextArea txtLog) {
        this.txtLog = txtLog;
    }

    public JComboBox<String> getCmbPostStatus() {
        return cmbPostStatus;
    }

    public void setCmbPostStatus(JComboBox<String> cmbPostStatus) {
        this.cmbPostStatus = cmbPostStatus;
    }

    public JSpinner getSpinerDateTime() {
        return spinerDateTime;
    }

    public void setSpinerDateTime(JSpinner spinerDateTime) {
        this.spinerDateTime = spinerDateTime;
    }

    public JTextField getTxtPostURL() {
        return txtPostURL;
    }

    public void setTxtPostURL(JTextField txtPostURL) {
        this.txtPostURL = txtPostURL;
    }

    public JTextArea getTxtDirectors() {
        return txtDirectors;
    }

    public void setTxtDirectors(JTextArea txtDirectors) {
        this.txtDirectors = txtDirectors;
    }

    public JTextArea getTxtGenres() {
        return txtGenres;
    }

    public void setTxtGenres(JTextArea txtGenres) {
        this.txtGenres = txtGenres;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cmbPostStatus;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JSpinner spinerDateTime;
    private javax.swing.JTextArea txtCast;
    private javax.swing.JTextArea txtCountries;
    private javax.swing.JTextArea txtDirectors;
    private javax.swing.JTextArea txtGenres;
    private javax.swing.JTextField txtIMDUrl;
    private javax.swing.JTextArea txtKeywords;
    private javax.swing.JTextArea txtLog;
    private javax.swing.JTextArea txtPlot;
    private javax.swing.JTextField txtPostURL;
    private javax.swing.JTextArea txtPoster;
    private javax.swing.JTextField txtRating;
    private javax.swing.JTextField txtRuntime;
    private javax.swing.JTextArea txtThrailer;
    private javax.swing.JTextField txtTitle;
    private javax.swing.JTextArea txtWriter;
    private javax.swing.JTextField txtYear;
    // End of variables declaration//GEN-END:variables
}