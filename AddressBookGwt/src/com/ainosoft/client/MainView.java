package com.ainosoft.client;


import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.user.client.ui.Label;

public class MainView extends Composite {
	private VerticalPanel vPanel = new VerticalPanel();
	private VerticalPanel contentPanel;
	private Label label;
	
	public MainView(){
		
		initWidget(vPanel);
		
		MenuView menuView=new MenuView(this);
		this.vPanel.add(menuView);
		
		this.contentPanel=new VerticalPanel();
		this.vPanel.add(contentPanel);
		
		label=new Label("Press Any Button to carry out Action");
		this.contentPanel.add(label);
		
	}
	
	public void openAddAddressPage(){
		this.contentPanel.clear();
		AddAddressPage addressPage=new AddAddressPage();
		this.contentPanel.add(addressPage);
	}
}
