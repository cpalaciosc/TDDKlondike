package controllers;

import java.util.ArrayList;

import models.Card;

public class StartController extends KlondikeController {
	
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
						
		//Create Deck
		for(int i=0;i<24;i++){
			deck.add(new Card(false));
		}
	}
}
