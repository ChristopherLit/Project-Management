/* Christopher and Curtis
* May. 9, 2022
* the GUI for the quiz */
package projectmanagement;

import java.io.FileNotFoundException;
import java.io.File;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class guiQuiz extends javax.swing.JFrame {

    //Declaring the global variables
    guiMainMenu firstWindow;
    Question[] quiz;
    int number;
    int totalCorrect;

    public guiQuiz(guiMainMenu m) {
        initComponents();

        firstWindow = m;
        number = 0;
        totalCorrect = 0; //Sets the number of correct answers equal to 0

        quiz = new Question[10]; //Declares the size of the question array to 10

        loadArray(); //Loads the array with all the questions, possible answers and the correct answers
        show(); //Displays the question and the 4 possible answers

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGroup = new javax.swing.ButtonGroup();
        lblQuestion = new javax.swing.JLabel();
        rbtn1 = new javax.swing.JRadioButton();
        rbtn2 = new javax.swing.JRadioButton();
        rbtn3 = new javax.swing.JRadioButton();
        rbtn4 = new javax.swing.JRadioButton();
        btnMenu = new javax.swing.JButton();
        btnNext = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblQuestion.setText("Question");

        rbtn1.setText("Answer 1");

        rbtn2.setText("Answer 2");

        rbtn3.setText("Answer 3");

        rbtn4.setText("Answer 4");

        btnMenu.setText("Main");
        btnMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuActionPerformed(evt);
            }
        });

        btnNext.setText("Next");
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(lblQuestion))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(rbtn4)
                            .addComponent(rbtn3)
                            .addComponent(rbtn2)
                            .addComponent(rbtn1))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(btnMenu)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 355, Short.MAX_VALUE)
                .addComponent(btnNext)
                .addGap(77, 77, 77))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(lblQuestion)
                .addGap(65, 65, 65)
                .addComponent(rbtn1)
                .addGap(18, 18, 18)
                .addComponent(rbtn2)
                .addGap(18, 18, 18)
                .addComponent(rbtn3)
                .addGap(18, 18, 18)
                .addComponent(rbtn4)
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnMenu)
                    .addComponent(btnNext))
                .addContainerGap(80, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuActionPerformed

        firstWindow.setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_btnMenuActionPerformed

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
        //Declaring the variables
        String selected = "";

        //The user selected the first answer
        if (rbtn1.isSelected()) {

            //Stores the user's selected answer
            selected = rbtn1.getText();

            //The user selected the second answer
        } else if (rbtn2.isSelected()) {

            //Stores the user's selected answer
            selected = rbtn2.getText();

            //The user selected the third answer
        } else if (rbtn3.isSelected()) {

            //Stores the user's selected answer
            selected = rbtn3.getText();

            //The user selected the fourth answer
        } else if (rbtn4.isSelected()) {

            //Stores the user's selected answer
            selected = rbtn4.getText();

            //The user didn't select an answer
        } else {

            //Displays an error message telling the user to select an answer
            JOptionPane.showMessageDialog(null, "You must select an answer!");

        }

        //If the string of the button that the user selected equals the string of the correct answer
        if (quiz[number].equals(selected) == true) {

            totalCorrect++; //Increases the total number of right answers by 1

        }

        //If the user selected an answer
        if (!selected.equals("")) {

            number++; //Increases the question number by 1

            show(); //Displays the next question and 4 possible answers

        }


    }//GEN-LAST:event_btnNextActionPerformed

    public void loadArray() {
        //Declaring the variables
        String title;
        String a1;
        String a2;
        String a3;
        String a4;
        String correct;

        try {

            //Instantiates the file and scanner objects
            File f = new File("src/projectmanagement/quiz");
            Scanner s = new Scanner(f);

            //Loops 10 times for every question
            for (int i = 0; i < 10; i++) {

                title = s.nextLine();
                a1 = s.nextLine();
                a2 = s.nextLine();
                a3 = s.nextLine();
                a4 = s.nextLine();
                correct = s.nextLine();

                //Instantiates the new temporary object and sends the title, correct answer and the 4 possible answers
                Question temp = new Question(title, correct, a1, a2, a3, a4);

                //Adds the whole question page into the array
                quiz[i] = temp;

            }

        } catch (FileNotFoundException e) {

            System.out.println("Error: " + e); //Prints an error message

        }

    }

    /**
     * Displays the question, and the 4 possible answers onto the GUI
     */
    public void show() {

        //Displays the question, and the 4 possible answers
        lblQuestion.setText((number + 1) + ". " + quiz[number].getQuestion());
        rbtn1.setText(quiz[number].getA1());
        rbtn2.setText(quiz[number].getA2());
        rbtn3.setText(quiz[number].getA3());
        rbtn4.setText(quiz[number].getA4());

    }

    /**
     * Class for the questions and possible answers for the multiple choice quiz
     */
    public class Question {

        //Declaring the variables
        private String answer;
        private String question;
        private String a1;
        private String a2;
        private String a3;
        private String a4;

        /**
         * Primary Constructor
         */
        public Question() {
            answer = "";
            question = "";
            a1 = "";
            a2 = "";
            a3 = "";
            a4 = "";
        }

        /**
         * Secondary Constructor - Must have a question name, a correct answer,
         * and 4 possible answers
         *
         * @param questionName - The question name
         * @param correctAnswer - The string of the correct answer
         * @param a1 - The first possible answer
         * @param a2 - The second possible answer
         * @param a3 - The third possible answer
         * @param a4 - The fourth possible answer
         */
        public Question(String questionName, String correctAnswer, String a1, String a2, String a3, String a4) {
            this(); //Primary Chaining
            answer = correctAnswer;
            question = questionName;
            this.a1 = a1;
            this.a2 = a2;
            this.a3 = a3;
            this.a4 = a4;
        }

        /**
         * Accessor for the correct answer
         *
         * @return the string of the right answer
         */
        public String getCorrectAnswer() {
            return answer;
        }

        /**
         * Accessor for the question
         *
         * @return the string of the question
         */
        public String getQuestion() {
            return question;
        }

        /**
         * Accessor for the first possible answer
         *
         * @return the string of the first possible answer
         */
        public String getA1() {
            return a1;
        }

        /**
         * Accessor for the second possible answer
         *
         * @return the string of the second possible answer
         */
        public String getA2() {
            return a2;
        }

        /**
         * Accessor for the third possible answer
         *
         * @return the string of the third possible answer
         */
        public String getA3() {
            return a3;
        }

        /**
         * Accessor for the fourth possible answer
         *
         * @return the string of the fourth possible answer
         */
        public String getA4() {
            return a4;
        }

        /**
         * Mutator for the correct answer
         *
         * @param answer - The given answer
         */
        public void setCorrectAnswer(String answer) {
            this.answer = answer;
        }

        /**
         * Mutator for the question
         *
         * @param question - The given question
         */
        public void setQuestion(String question) {
            this.question = question;
        }

        /**
         * Mutator for the first possible answer
         *
         * @param a1 - The given answer to be the first possible answer
         */
        public void setA1(String a1) {
            this.a1 = a1;
        }

        /**
         * Mutator for the second possible answer
         *
         * @param a2 - The given answer to be the second possible answer
         */
        public void setA2(String a2) {
            this.a2 = a2;
        }

        /**
         * Mutator for the third possible answer
         *
         * @param a3 - The given answer to be the third possible answer
         */
        public void setA3(String a3) {
            this.a3 = a3;

        }

        /**
         * Mutator for the fourth possible answer
         *
         * @param a4 - The given answer to be the fourth possible answer
         */
        public void setA4(String a4) {
            this.a4 = a4;
        }

        /**
         * Clone method - Clones the question, the index of the question, the
         * possible answers and the correct answer
         *
         * @return the cloned object
         */
        public Question clone() {
            //Declaring the new object to be cloned
            Question q1;

            //Instantiates the new object with the current object's attributes
            q1 = new Question(question, answer, a1, a2, a3, a4);

            return q1; //Returns the object
        }

        /**
         * Equals method - Checks to see if the selected answer's string is
         * equal to the correct answer's string
         *
         * @param q2 - The given answer's string
         * @return a boolean, true if it's equal and false if it's not
         */
        public boolean equals(String q2) {
            return this.answer.equals(q2);
        }

        /**
         * toString - Returns a string containing all of the instance's
         * attributes
         *
         * @return
         */
        public String toString() {

            //Returns the string containing all of the instance's attributes
            return "Question: " + question + "\n1. " + a1 + "\n2. " + a2 + "\n3. " + a3 + "\n4. " + a4;
        }

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup btnGroup;
    private javax.swing.JButton btnMenu;
    private javax.swing.JButton btnNext;
    private javax.swing.JLabel lblQuestion;
    private javax.swing.JRadioButton rbtn1;
    private javax.swing.JRadioButton rbtn2;
    private javax.swing.JRadioButton rbtn3;
    private javax.swing.JRadioButton rbtn4;
    // End of variables declaration//GEN-END:variables
}
