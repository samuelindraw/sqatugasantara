package sqa.joss.tugasantara;

import javax.management.StringValueExp;
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
        setSize(260,165);
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
    public void paint(Graphics g) {
    	super.paint(g);
    	int randomnumber, randomnumber2, randomnumber3;
    	randomnumber = randGenerator.nextInt(255);
    	
    	randomnumber2 = randGenerator.nextInt(255);
    	randomnumber3 = randGenerator.nextInt(255);
    	
    	Color myWhite = new Color(randomnumber,randomnumber2,randomnumber3);//color random 
    	g.drawString(String.valueOf(randomnumber),77,120);
    	g.drawString(String.valueOf(randomnumber2),107,220);
    	g.drawString(String.valueOf(randomnumber3),137,120);
    	
    	
    	g.setColor(myWhite);
    	g.fillRect(20, 40, 220, 50);
    	
    	g.setColor(Color.BLUE);
    	g.drawRect(20,100,220,50);
    	
    	g.setColor(Color.RED);
    	g.drawString(toString(),57,60);
    }
}

