package sqa.joss.tugasantara;

import javax.swing.*;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

public final class Dadu extends JFrame {
    public static final int DEFAULT_SISI = 6;

    private static Random randGenerator = new Random();

    private final int jumSisi;
    private int hasil;

    public Dadu() {
        this(DEFAULT_SISI);
        setSize(260,165);
        setVisible(true);
    }
    

    public Dadu(int numSides) {
        this.jumSisi = numSides;
        setSize(260, 165);
        setVisible(true);
    }
    

    public int lempar() {
        hasil = randGenerator.nextInt(jumSisi) + 1;

        return hasil;
    }

    public int getJumSisi() {
        return jumSisi;  
    }

    public int getHasil() {
        return hasil;
    }

    @Override
    public String toString() {
        return "Jumlah sisi dadu: " + getJumSisi() + " hasil: " + getHasil();
    }
    
    public int randomWarna() {
      int randomnumber = randGenerator.nextInt(255);
      return randomnumber;
    }
    
    public Color warna(){
        Color cobawarna = new Color(randomWarna(),randomWarna(),randomWarna());
        return cobawarna;
    }

    public Color getWarnaSisi() {
        Color[] warnaa = new Color[getJumSisi()];
        for (int i = 0; i < getJumSisi(); i++) {
            warnaa[i] = warna();
        }
        return warnaa[getHasil()-1];
    }
}


    

   	
    	
