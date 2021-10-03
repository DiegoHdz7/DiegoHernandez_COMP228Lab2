package exersice3;

import javax.swing.*;

public  class Kitchen {


    public static void cook(String ingredient1){
        JOptionPane.showMessageDialog(null,"You have prepared a dish with "+ ingredient1);
    }

    public static void cook(String ingredient1, String ingredient2){
        JOptionPane.showMessageDialog(null,"You have cooked a dish with "+ ingredient1+" and " + ingredient2);
    }

    public static void cook(String ingredient1, String ingredient2, String ingredient3){
        JOptionPane.showMessageDialog(null,"You have cooked a dish with "+ ingredient1+", " + ingredient2+" and "+ingredient3);
    }

}
