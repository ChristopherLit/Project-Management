/* Christopher and Curtis
* May. 9, 2022
* The GUI for the results from the quiz */
package projectmanagement;

public class guiResult extends javax.swing.JFrame {

    guiMainMenu firstWindow;

    public guiResult(guiMainMenu m, int totalCorrect) {
        initComponents();

        firstWindow = m;

        //Runs the score method to display the users score and feedback
        score(totalCorrect);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblResult = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txta = new javax.swing.JTextArea();
        btnMain = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblResult.setText("Result");

        txta.setColumns(20);
        txta.setRows(5);
        jScrollPane1.setViewportView(txta);

        btnMain.setText("Menu");
        btnMain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMainActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnMain))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 429, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblResult))
                        .addGap(0, 21, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(lblResult)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnMain)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMainActionPerformed

        firstWindow.setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_btnMainActionPerformed

    /**
     * Displays the results to the user
     */
    public void score(int totalCorrect) {
        //Declaring the variables
        String chart = "Your score is: " + totalCorrect + "/10\n";

        //If the score is less than or equal to 5
        if (totalCorrect <= 5) {

            //Displays the score and tells the user to review more
            txta.setText(chart + "You need to study more. I would recommend reviewing the study material");

            //If the score is greater than 5 and less than 10
        } else if (totalCorrect > 5 && totalCorrect < 10) {

            //Displays the score and tells the user that they did well, but to still review more
            txta.setText(chart + "You did well, I would still recommend reviewing the study material to improve your score.");
            
            //The user got a perfect score - 10/10
        } else {

            //Tells the user that they're in good shape for the test
            txta.setText(chart + "You're in great shape for the test!");
        }

    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnMain;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblResult;
    private javax.swing.JTextArea txta;
    // End of variables declaration//GEN-END:variables
}
