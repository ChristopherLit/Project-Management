/* Christopher and Curtis
* May. 9, 2022
* Class for the answers and questions for the multiple choice quiz */

package projectmanagement;

public class Question {

    //Declaring the variables
    private String answer;
    private String question;
    private int questionNum;
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
        questionNum = 0;
        a1 = "";
        a2 = "";
        a3 = "";
        a4 = "";
    }

    /**
     * Secondary Constructor - Must have a question name, question index, a correct answer, and 4 possible answers
     * @param questionName - The question name
     * @param questionNumber - The index of the question
     * @param correctAnswer - The string of the correct answer
     * @param a1 - The first possible answer
     * @param a2 - The second possible answer
     * @param a3 - The third possible answer
     * @param a4 - The fourth possible answer
     */
    public Question(String questionName, int questionNumber, String correctAnswer, String a1, String a2, String a3, String a4) {
        this(); //Primary Chaining
        answer = correctAnswer;
        question = questionName;
        questionNum = questionNumber;
        this.a1 = a1;
        this.a2 = a2;
        this.a3 = a3;
        this.a4 = a4;
    }


    /**
     * Accessor for the correct answer
     * @return the string of the right answer
     */
    public String getCorrectAnswer() {
        return answer;
    }

    /**
     * Accessor for the question
     * @return the string of the question
     */
    public String getQuestion() {
        return question;
    }

    /**
     * Accessor for the first possible answer
     * @return the string of the first possible answer
     */
    public String getA1() {
        return a1;
    }

    /**
     * Accessor for the second possible answer
     * @return the string of the second possible answer
     */
    public String getA2() {
        return a2;
    }

    /**
     * Accessor for the third possible answer
     * @return the string of the third possible answer
     */    
    public String getA3() {
        return a3;
    }

     /**
     * Accessor for the fourth possible answer
     * @return the string of the fourth possible answer
     */
    public String getA4() {
        return a4;
    }

    /**
     * Mutator for the correct answer
     * @param answer - The given answer
     */
    public void setCorrectAnswer(String answer) {
        this.answer = answer;
    }

     /**
     * Mutator for the question
     * @param question - The given question
     */
    public void setQuestion(String question) {
        this.question = question;
    }

    /**
     * Mutator for the first possible answer
     * @param a1 - The given answer to be the first possible answer
     */
    public void setA1(String a1) {
        this.a1 = a1;
    }

    /**
     * Mutator for the second possible answer
     * @param a2 - The given answer to be the second possible answer
     */
    public void setA2(String a2) {
        this.a2 = a2;
    }

     /**
     * Mutator for the third possible answer
     * @param a3 - The given answer to be the third possible answer
     */
    public void setA3(String a3) {
        this.a3 = a3;

    }

    /**
     * Mutator for the fourth possible answer
     * @param a4 - The given answer to be the fourth possible answer
     */
    public void setA4(String a4) {
        this.a4 = a4;
    }

    /**
     * Clone method - Clones the question, the index of the question, the possible answers and the correct answer
     * @return the cloned object
     */
    public Question clone(){
        //Declaring the new object to be cloned
        Question q1;
        
        //Instantiates the new object with the current object's attributes
        q1 = new Question(question, questionNum, answer, a1, a2, a3, a4);
        
        return q1; //Returns the object
    }
    
    /**
     * Equals method - Checks to see if the selected answer's string is equal to the correct answer's string
     * @param q2 - The given answer's string
     * @return a boolean, true if it's equal and false if it's not
     */
    public boolean equals(String q2){
        return this.answer.equals(q2);
    }
    
    
    
    /**
     * toString - Returns a string containing all of the instance's attributes
     * @return 
     */
    public String toString() {
        
        //Returns the string containing all of the instance's attributes
        return "Question # : " + questionNum + "\n\nQuestion: " + question + "\n1. " + a1 + "\n2. " + a2 + "\n3. " + a3 + "\n4. " + a4;
    }
}
