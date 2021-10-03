package exersice2;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.JOptionPane;

public class Lotto {
    private int []lottoNumbers = new int[3];
    private int intends=0;

    public Lotto(){
        SecureRandom random = new SecureRandom();
        for(int i = 0; i<3;i++){
            int randomNumber=random.nextInt(9);
            lottoNumbers[i]= randomNumber==0? 1 : randomNumber ;
        }


    }

    public int[] getLottoNumbers(){
        return lottoNumbers;
    }
}
