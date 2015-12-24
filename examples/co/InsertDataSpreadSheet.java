package com.felight.examples.co;

import java.io.IOException;
import java.net.URL;

import com.google.gdata.client.spreadsheet.SpreadsheetService;
import com.google.gdata.data.spreadsheet.ListEntry;
import com.google.gdata.data.spreadsheet.ListFeed;
import com.google.gdata.data.spreadsheet.SpreadsheetEntry;
import com.google.gdata.data.spreadsheet.WorksheetEntry;
import com.google.gdata.util.ServiceException;

public class InsertDataSpreadSheet {

	public static final String GOOGLE_ACCOUNT_USERNAME = "java.awesome@gmail.com"; // Fill in google account username
	public static final String GOOGLE_ACCOUNT_PASSWORD = "remohanock"; // Fill in google account password
	public static final String SPREADSHEET_URL = "https://spreadsheets.google.com/feeds/spreadsheets/1WvjRfcLZ2zp0vqJfYMktUCj8bexuFLzu0cI_YXzowww"; // Fill in google spreadsheet URI

	public static boolean insertData(String name, String age, String email) throws IOException, ServiceException {
		try {
			/** Our view of Google Spreadsheets as an authenticated Google user. */
			SpreadsheetService service = new SpreadsheetService(
					"Print Google Spreadsheet Demo");
			// Login and prompt the user to pick a sheet to use.
			service.setUserCredentials(GOOGLE_ACCOUNT_USERNAME,
					GOOGLE_ACCOUNT_PASSWORD);
			// Load sheet
			URL metafeedUrl = new URL(SPREADSHEET_URL);
			SpreadsheetEntry spreadsheet = service.getEntry(metafeedUrl,
					SpreadsheetEntry.class);
			// Here we are working with worksheet 0, if you have multiple worksheet,
			// then change this value to get the corresponding worksheet
			URL listFeedUrl = ((WorksheetEntry) spreadsheet.getWorksheets()
					.get(0)).getListFeedUrl();
			// Creating a local representation of the new row.
			ListEntry row = new ListEntry();
			row.getCustomElements().setValueLocal("Name", name);
			row.getCustomElements().setValueLocal("Age", age);
			row.getCustomElements().setValueLocal("Email",email);
			// Sending the new row for insertion into worksheet.
			row = service.insert(listFeedUrl, row);
			// Printing all entries from worksheet
			ListFeed feed = (ListFeed) service.getFeed(listFeedUrl,
					ListFeed.class);
			for (ListEntry entry : feed.getEntries()) {
				System.out.println("new row");
				for (String tag : entry.getCustomElements().getTags()) {
					System.out.println("     " + tag + ": "
							+ entry.getCustomElements().getValue(tag));
				}
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return true;
	}

}
