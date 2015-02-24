package com.ainosoft.client;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HorizontalPanel;

public class MenuView extends Composite {

	private HorizontalPanel hPanel=new HorizontalPanel();
	private MainView main;
	
	public MenuView(MainView main){
		
		initWidget(hPanel);
		this.main=main;
		Button button1 = new Button("Add Address");
		button1.addClickHandler(new Button1ClickHandler());
		this.hPanel.add(button1);
	
		
		Button button2 = new Button("Show Address List");
		button1.addClickHandler(new Button2ClickHandler());
		this.hPanel.add(button2);
		
	}
	 private class Button1ClickHandler implements ClickHandler{

		@Override
		public void onClick(ClickEvent event) {
	
			main.openAddAddressPage();
		}
		 
		 
	 }
	 
	 private class Button2ClickHandler implements ClickHandler{

			@Override
			public void onClick(ClickEvent event) {
		
				
			}
			 
			 
		 }
	 
}
