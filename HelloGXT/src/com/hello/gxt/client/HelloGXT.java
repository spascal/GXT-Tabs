package com.hello.gxt.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.RootPanel;
import com.sencha.gxt.widget.core.client.TabItemConfig;
import com.sencha.gxt.widget.core.client.TabPanel;
import com.sencha.gxt.widget.core.client.box.MessageBox;

public class HelloGXT implements EntryPoint {
	@Override public void onModuleLoad() {
		//	   MessageBox messageBox = new MessageBox("Heading");
		//	   messageBox.setMessage("Hello World");
		//	   messageBox.show();
		TabPanel panel = new TabPanel();
		panel.setTabScroll(true);
		panel.setAnimScroll(true);
		panel.add(new Label("Tab 1 Content"), new TabItemConfig("Tab 1", true));
		panel.add(new Label("Tab 2 Content"), new TabItemConfig("Tab 2", true));

		RootPanel.get().add(panel);
	}
}
