package exersice2;


import javax.swing.*;

public class main {

    public static void main(String[] args) {
        startLotto();
        // write your code here



    }

    public static void startLotto(){

        boolean playerWon;
        int intends=0;

        JOptionPane.showMessageDialog(null, "Welcome to the \"The Lotto Game\"");

        for(intends=0;intends<5;intends++){
            int lottoResult=0;
            int playerNumber = askNumber();
            Lotto lotto = new Lotto();
            for(int lottoNumber : lotto.getLottoNumbers()){
                lottoResult+=lottoNumber;
            }

            //----Winning Test ---------
            //lottoResult=playerNumber;
            //----------------

            JOptionPane.showMessageDialog(null, "The Lotto is: ["+lotto.getLottoNumbers()[0]+", "+lotto.getLottoNumbers()[1]+", "+lotto.getLottoNumbers()[2]+"]\n"+
                    "Player Number: "+playerNumber+"    Lotto result: "+lottoResult
                    );

            if(lottoResult==playerNumber){
                JOptionPane.showMessageDialog(null, "¡¡¡Congratulations!!!\n YOU WON");
                break;

            } else {
                JOptionPane.showMessageDialog(null, "You have\n"+(5-(intends+1))+"\n intends left");
                if(intends==4){
                    JOptionPane.showMessageDialog(null, "The machine wirns \n Thank you for playing");

                }

            }







        }







    }

    public static int askNumber(){

        boolean exeption=true;
        int ans=0;
        while (exeption==true || ans <3 || ans>27){
            try{
                ans = Integer.parseInt( JOptionPane.showInputDialog("Choose a number between 3 and 27, you have 5 intends"));
                if(ans<3 || ans>27){
                    JOptionPane.showMessageDialog(null,"Invalid Number!");

                }

                exeption = false;


            } catch (Exception e){
                System.out.println(e);
                JOptionPane.showMessageDialog(null,"Please provide only numbers between 3 and 27");
                exeption=true;
            }

        }
        return  ans;
    }

}
