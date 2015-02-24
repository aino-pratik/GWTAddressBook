package com.ainosoft.client;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.VerticalPanel;

public class AddAddressPage extends Composite {

	private VerticalPanel mainVPanel = new VerticalPanel();
	private VerticalPanel vPanel1,vPanel2,vPanel3;
	private HorizontalPanel hPanel1;
	private Button button;
	
	public TextBox textBox1,textBox2,textBox3;

	public AddAddressPage() {

		initWidget(mainVPanel);
		
		hPanel1 = new HorizontalPanel();
		vPanel1 = new VerticalPanel();
		vPanel2 = new VerticalPanel();
		vPanel3 = new VerticalPanel();

		Label label1 = new Label("Enter Name");
		this.vPanel1.add(label1);
		textBox1 = new TextBox();
		this.vPanel2.add(textBox1);
		
		Label label2 = new Label("Enter Address");
		this.vPanel1.add(label2);
		textBox2 = new TextBox();
		this.vPanel2.add(textBox2);
		
		Label label3 = new Label("Enter Contact Number");
		this.vPanel1.add(label3);
		textBox3 = new TextBox();
		this.vPanel2.add(textBox3);
		
		button =new Button("Save Address");
		button.addClickHandler(new SavebuttonClickHandler());
		vPanel3.add(button);
		
		this.hPanel1.add(vPanel1);
		this.hPanel1.add(vPanel2);
		this.hPanel1.add(vPanel3);
		this.mainVPanel.add(hPanel1);
		
	}
	
	public class SavebuttonClickHandler extends AddAddressPage implements ClickHandler{

		@Override
		public void onClick(ClickEvent event) {
			AddressBook aBook=new AddressBook(textBox1.getValue(),textBox2.getValue(),textBox3.getValue());
			aBook.addAddresstoList(aBook);
		}
		
		
	}
}
