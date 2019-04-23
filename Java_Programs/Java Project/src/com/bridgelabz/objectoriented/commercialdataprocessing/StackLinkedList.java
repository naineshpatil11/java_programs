package com.bridgelabz.objectoriented.commercialdataprocessing;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class StackLinkedList 
{
	String companyfilepath = "/home/admin1/Documents/Java_Programs/Java Project/Company.json";
	String userfilepath = "/home/admin1/Documents/Java_Programs/Java Project/UserDetail.json";
	public commercialCompanyProj companyProj = new commercialCompanyProj();
	Scanner sc = new Scanner(System.in);
	
	//private CommercialCompanyProj companyPojo = new CommercialCompanyProj();
	StackMethodasLinkedList7 stack = new StackMethodasLinkedList7();
	//CommercialQueueMethods queue;	
	
	public void addDetails() throws FileNotFoundException, IOException, ParseException 
	{
		
		System.out.println("Enter option you want to add: 1.Add Stocks \t 2.Add User Datail");
		int ch = sc.nextInt();
		switch (ch) 
		{
		case 1:
			addStocks();
			break;
		case 2:
			addUserDetail();
			break;
		default:
			System.out.println("Enter valid input...");
			System.out.println("You want to continue (Y/N)");
			char ch1 = sc.next().charAt(0);
			while(ch1 == 'Y' || ch1 =='y');
			addDetails();
		}
	}
		private void addStocks() throws FileNotFoundException, IOException, ParseException 
		{
			File file = new File(companyfilepath);
			System.out.println("Enter Stock name : ");
			String stockName = sc.next();
			companyProj.setStockName(stockName);

			System.out.println("Enter stock symbol : ");
			String stockSymbol = sc.next();
			companyProj.setstockSymbol(stockSymbol);

			System.out.println("Enter no. of share : ");
			String noOfShare = sc.next();
			companyProj.setNoOFShare(noOfShare);

			System.out.println("Enter share Price : ");
			String sharePrice = sc.next();
			companyProj.setSharePrise(sharePrice);		
			createCompanyJsonObj(companyProj ,file);
		}
		public void createCompanyJsonObj(commercialCompanyProj companyProj, File file) throws FileNotFoundException, IOException, ParseException 
		{
			JSONParser parser = new JSONParser();		 
			JSONObject jsonObj = (JSONObject)parser.parse(new FileReader(file));
			JSONArray jsonArray =(JSONArray)jsonObj.get("StockDetails");
			JSONObject simple = new JSONObject();
			simple.put("StockName",companyProj.getStockName());
			simple.put("StockSymbol", companyProj.getstockSymbol());
			simple.put("NoOfShare", companyProj.getNoOFShare());
			simple.put("SharePrice", companyProj.getSharePrise());
			jsonArray.add(simple);
			jsonObj.put("StockDetails", jsonArray);
			System.out.println(jsonObj);
			writeIntoFile(jsonObj , companyfilepath);		
		}
	
		private void writeIntoFile(JSONObject jsonObj, String companyfilepath) throws IOException 
		{
			File file = new File(companyfilepath);
			@SuppressWarnings("resource")
			FileWriter writer = new FileWriter(file);
			writer.write(jsonObj.toString());
			writer.flush();
		}
		private void addUserDetail() throws IOException, ParseException 
		{
			CommercialUserProj userProj = new CommercialUserProj();
			File file = new File(userfilepath);
			System.out.println("Enter User name : ");
			String userName = sc.next();
			userProj.setUserName(userName);

			System.out.println("Enter no. of share : ");
			String noOfShare = sc.next();
			userProj.setNoOFShare(noOfShare);

			System.out.println("Enter share price : ");
			String sharePrice = sc.next();
			userProj.setSharePrice(sharePrice);					
			createUserJsonObj(userProj ,file);
		}
		private void createUserJsonObj(CommercialUserProj userProj, File file) throws IOException, ParseException 
		{
			JSONParser parser = new JSONParser();		 
			JSONObject jsonObj = (JSONObject)parser.parse(new FileReader(file));
			JSONArray jsonArray =(JSONArray)jsonObj.get("UserDetails");
			JSONObject simple = new JSONObject();
			simple.put("UserName",userProj.getUserName());
			simple.put("NoOfShare", userProj.getNoOFShare());
			simple.put("SharePrice", userProj.getSharePrice());
			jsonArray.add(simple);
			jsonObj.put("UserDetails", jsonArray);
			System.out.println(jsonObj);
			writeIntoFile(jsonObj ,userfilepath );
		}	

	
}
