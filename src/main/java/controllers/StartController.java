package controllers;

import java.util.ArrayList;

import models.Card;

public class StartController {
	
	private ArrayList<ArrayList<Card>> tableaus = new ArrayList<ArrayList<Card>>();
	private ArrayList<ArrayList<Card>> foundations = new ArrayList<ArrayList<Card>>();
	
	public void start() {
		//Create Tableau
		for(int i=0;i<7;i++){
			ArrayList<Card> tableau = new ArrayList<Card>();
			for(int j=0;j<=i;j++){
				if(j==i)
					tableau.add(new Card(true));
				else
					tableau.add(new Card(false));
			}
			this.tableaus.add(tableau);
		}
		
		//Create Foundations
		for(int i=0;i<4;i++){
			foundations.add(new ArrayList<Card>());
		}
	}

	public ArrayList<ArrayList<Card>> getTableaus() {
		return this.tableaus;
	}

	public ArrayList<ArrayList<Card>> getFoundations() {
		return this.foundations;
	}

}
