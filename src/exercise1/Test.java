
package exercise1;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.JOptionPane;




 public class Test {


    private static final String[]goodMessages = {"Good Job!", "Congratulation!", "Excellent!","Keep up the good work!"};
    private static final String[]wrongMessages = {"No. Please try again!", "Wrong. Try once more!", "Don't give up!","No, Keep trying!"};
    private double goodAnswers;
    private static final   ArrayList<Question> questions = new ArrayList<>(Arrays.asList(
            new Question("Which access modifier allows the usage only in the same class where it was declared:\n"+
                    "\nA) Public\nB)Private\nC)Protected\nD)No modifier", Answer.B),
            new Question("All of these are true about overloading constructor EXCEPT:\n"+
                    "\nA) Is a technique of having more than one constructor with different parameter lists"
                    +"\nB) They are arranged in a way that each constructor performs a different task"+
                    "\nC) They are differentiated by the compiler by the number of parameters in the list and their types."
                    +"\nD)They can be declared outside the class", Answer.D),
            new Question("It is another name for the mutator method :\n"+
                    "\nA) Accesor method"
                    +"\nB) Query Method"+
                    "\nC) Set method"
                    +"\nD) Query method", Answer.C),

            new Question("What the key word \"final\" means in a variable:\n"+
                    "\nA) Is a command for breaking a loop"
                    +"\nB) It means that it is a constant"+
                    "\nC) It means that it should be the last line of code"
                    +"\nD) None of the above", Answer.B),

            new Question("It is a collection of related objects: :\n"+
                    "\nA) A class"
                    +"\nB) An int"+
                    "\nC) A loop"
                    +"\nD) A method", Answer.A),
            new Question("It is the place where instance variables are declared :\n"+
                    "\nA) A Inside a class declaration but outside the bodies of the class’s method declarations"
                    +"\nB) Outside the class"+
                    "\nC)Inside a method"
                    +"\nD) None of the above", Answer.A),
            new Question("This statement is false about camel case convention:\n"+
                    "\nA) Class names begin with an uppercase letter"
                    +"\nB) Method and variable names begin with a lowercase letter"+
                    "\nC) All names should be written with lowercase"
                    +"\nD) a name is formed of multiple words that are joined together as a single word with the first letter of each of the multiple words capitalized so that each word that makes up a name can easily be read", Answer.C),


            new Question("This Java API helps to read an input from the console :\n"+
                    "\nA) java.util.ArrayList;"
                    +"\nB) java.util.Scanner;"+
                    "\nC) java.security.SecureRandom;"
                    +"\nD) None of the above", Answer.B),
            new Question("This Java API helps to generate a random number :\n"+
                    "\nA) Aimport java.util.ArrayList;"
                    +"\nB) java.util.Scanner;"+
                    "\nC) java.security.SecureRandom;"
                    +"\nD) None of the above", Answer.C),

            new Question("This primitive type can not be promoted :\n"+
                    "\nA) Int"
                    +"\nB) Long"+
                    "\nC) Char"
                    +"\nD) Double", Answer.D)

    ));








    public   Answer simulateQuestion(String question,int number){

        Answer [] array_ans = {Answer.A,Answer.B,Answer.C,Answer.D};
        int usrAnwser = JOptionPane.showOptionDialog(null,question,"Question "+number,
                0,JOptionPane.QUESTION_MESSAGE,null,array_ans,Answer.A);

        return array_ans[usrAnwser];

    }

    private void generateMessage(boolean isCorrect, Answer correctAswer) {
        SecureRandom random = new SecureRandom();

        /*if(isCorrect) JOptionPane.showMessageDialog(null, goodMessages[random.nextInt(4)]);
        else JOptionPane.showMessageDialog(null, wrongMessages[random.nextInt(3)]);*/

        if(isCorrect){

            switch (random.nextInt(3)){
                case 0: JOptionPane.showMessageDialog(null, goodMessages[0]);break;
                case 1: JOptionPane.showMessageDialog(null, goodMessages[1]);break;
                case 2: JOptionPane.showMessageDialog(null, goodMessages[2]);break;
                case 3: JOptionPane.showMessageDialog(null, goodMessages[3]);break;

            }
        } else {
            switch (random.nextInt(3)){
                case 0: JOptionPane.showMessageDialog(null, wrongMessages[0]+ "\nCorrect answer:"+correctAswer);break;
                case 1: JOptionPane.showMessageDialog(null, wrongMessages[1]+ "\nCorrect answer:"+correctAswer);break;
                case 2: JOptionPane.showMessageDialog(null, wrongMessages[2]+ "\nCorrect answer:"+correctAswer);break;
                case 3: JOptionPane.showMessageDialog(null, wrongMessages[3]+"\nCorrect answer:"+correctAswer);break;


            }




        }
    }

    private void checkAnswer(Answer usrQuestion, Question question){
        if(question.getAnswer()==usrQuestion){
            goodAnswers++;
            generateMessage(true, question.getAnswer());
        } else {
            generateMessage(false,question.getAnswer());
        }




    }

    public void inputAnswer(){
        String name = JOptionPane.showInputDialog("Lab 2 Exercise 1\n Please provide your name");
        JOptionPane.showMessageDialog(null,"Welcome "+name+"\nThe next test contains 10 questions about modules 1, 2, 3. Each question has 4 possible questions but only 1 is correct");
        for(Question question: questions){
            checkAnswer(simulateQuestion(question.getQuestion(),questions.indexOf(question)+1), question);

        }

        JOptionPane.showMessageDialog(null,"Results:\n"+(int)goodAnswers+"/"+questions.size()+"\n"+"Percentage: "+goodAnswers/questions.size()*100+"%");
        goodAnswers=0;
    }








}
