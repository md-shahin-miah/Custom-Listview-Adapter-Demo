package com.yotech.arrayadapterdemo;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class CustomListActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_custom_list);
		populateUsersList();
	}

	private void populateUsersList() {
		// Construct the data source
		ArrayList<UserInfo> arrayOfUserInfos = UserInfo.getUsers();
		// Create the adapter to convert the array to views
		CustomUsersAdapter adapter = new CustomUsersAdapter(this, arrayOfUserInfos);
		// Attach the adapter to a ListView
		ListView listView =findViewById(R.id.lvUsers);
		listView.setAdapter(adapter);
	}
	
}
