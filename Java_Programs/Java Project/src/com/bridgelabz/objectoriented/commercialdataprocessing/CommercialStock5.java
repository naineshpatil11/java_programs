package com.bridgelabz.objectoriented.commercialdataprocessing;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;


public class CommercialStock5
{
	static int i;
	
	String companyfilepath = "/home/admin1/Documents/Java_Programs/Java Project/Company.json";
	String userfilepath = "/home/admin1/Documents/Java_Programs/Java Project/UserDetail.json";
	public commercialCompanyProj companyProj = new commercialCompanyProj();
	Scanner sc = new Scanner(System.in);
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
			userDetail();
			break;
		default:
			System.out.println("Enter valid input...");
			System.out.println("Do You want to continue (Y/N)");
			char ch1 = sc.next().charAt(0);
			while(ch1 == 'Y' || ch1 =='y');
			addDetails();
		}
	}
	
	// TO add the stocks in the list
	private void addStocks() throws FileNotFoundException, IOException, ParseException 
	{
		File file = new File(companyfilepath);
		System.out.print("Enter stock name: ");
		String stockname = sc.next();
		companyProj.setStockName(stockname);
		
		System.out.print("Enter stock symbol: ");
		String stocksymbol = sc.next();
		companyProj.setstockSymbol(stocksymbol);
		
		System.out.print("Enter share price: ");
		String shareprice = sc.next();
		companyProj.setSharePrise(shareprice);
		
		System.out.print("Enter number of share: ");
		String nofShare = sc.next();
		companyProj.setNoOFShare(nofShare);
		
		createCompanyJsonObj(companyProj ,file);
			
	}
	private void createCompanyJsonObj(commercialCompanyProj companyProj, File file) throws FileNotFoundException, IOException, ParseException 
	{
		//File file1 = new File(companyfilepath);
		//JSONParser parser = new JSONParser();		 
		JSONParser parser = new JSONParser();
		JSONObject jsonObj = (JSONObject)parser.parse(new FileReader(file));
		JSONArray jsonArray =(JSONArray)jsonObj.get("stockDetails");
		JSONObject simple = new JSONObject();
		simple.put("StockName",companyProj.getStockName());
		simple.put("StockSymbol", companyProj.getstockSymbol());
		simple.put("NoOfShare", companyProj.getNoOFShare());
		simple.put("SharePrice", companyProj.getSharePrise());
		jsonArray.add(simple);
		jsonObj.put("stockDetails", jsonArray);
		System.out.println(jsonObj);
		writeIntoFile(jsonObj , companyfilepath);		
	}
	

	private void writeIntoFile(JSONObject jsonObj, String companyfilepath) throws IOException 
	{
		File file = new File(companyfilepath);
		FileWriter writer = new FileWriter(file);
		writer.write(jsonObj.toString());
		writer.flush();
	}

	// TO add  the user details
	private void userDetail() throws FileNotFoundException, IOException, ParseException 
	{
		
		CommercialUserProj userProj = new CommercialUserProj();
		File file = new File(userfilepath);
		System.out.println("Enter User name : ");
		String userName = sc.next();
		userProj.setUserName(userName);
				
		System.out.println("Enter no.of share : ");
		String noOfShare = sc.next();
		userProj.setNoOFShare(noOfShare);
		
		System.out.println("Enter share price : ");
		String sharePrice = sc.next();
		userProj.setSharePrice(sharePrice);					
		createUserJsonObj(userProj ,file);
	}

	private void createUserJsonObj(CommercialUserProj userProj, File file) throws FileNotFoundException, IOException, ParseException
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

	// merthode to buy the stocks	
	public void buy() throws FileNotFoundException, IOException, ParseException 
	{
		File file1 = new File(companyfilepath);
		JSONParser parser1 = new JSONParser();
		JSONObject jsonObj1 = (JSONObject)parser1.parse(new FileReader(file1));
		JSONArray array1 = (JSONArray)jsonObj1.get("StockDetails"); 
		System.out.println(array1);
		
		File file2 = new File(userfilepath);
		JSONParser parser2 = new JSONParser();
		JSONObject jsonObj2 = (JSONObject)parser2.parse(new FileReader(file2));
		JSONArray array2 = (JSONArray)jsonObj2.get("UserDetails");
		System.out.println(array2);
		
		JSONObject compareObj1;
		JSONObject compareObj2;
		System.out.print("Enter user name: ");
		String userName = sc.next();
		for(int i = 0; i < array2.size(); i++);
				{
					compareObj2 = (JSONObject)array2.get(i);
					if(compareObj2.get("UserName").equals(userName))
					{
						System.out.print(compareObj2);
						System.out.println("\nFollowing is available stock list");
						for(i = 0 ; i < array1.size(); i++)
						{
							compareObj1 = (JSONObject)array1.get(i);
							System.out.println(compareObj1);
						}
						
						System.out.println("Enter Stock Name from above list ");
						String stockName = sc.next();
						for(i=0 ; i<array1.size();i++)
						{
							compareObj1 = (JSONObject)array1.get(i);
							if(compareObj1.get("StockName").equals(stockName)) 
							{
								System.out.println(compareObj1);
								System.out.println("Enter how many stocks you want to buy");
								int stocksToBuy = sc.nextInt();
								
								int companyIntStocks = Integer.parseInt(compareObj1.get("NoOfShare").toString());
								int userIntStocks = Integer.parseInt(compareObj2.get("NoOfShare").toString());
								int userSharePrice = Integer.parseInt(compareObj2.get("SharePrice").toString());
								int companySharePrice = Integer.parseInt(compareObj1.get("SharePrice").toString());
								
								int newUserShares = userIntStocks + stocksToBuy;
								int newCompanyShares = companyIntStocks - stocksToBuy;
								
								int priceOfEachShare = companySharePrice / companyIntStocks;
								int newStockCalculation = (priceOfEachShare * stocksToBuy);
								int newComapnySharePrice=  companySharePrice + newStockCalculation ;						
								int newUserSharePrice = userSharePrice - newStockCalculation;
								
								if(companyIntStocks > stocksToBuy && userSharePrice > newStockCalculation)
								{						
									compareObj1.remove("NoOfShare");
									compareObj2.remove("NoOfShare");
									compareObj1.remove("SharePrice");
									compareObj2.remove("SharePrice");
									
									compareObj1.put("NoOfShare", newCompanyShares);
									compareObj2.put("NoOfShare", newUserShares);
									compareObj1.put("SharePrice", newComapnySharePrice);
									compareObj2.put("SharePrice", newUserSharePrice);
																
									System.out.println(compareObj1);
									System.out.println(compareObj2);
									
									Date dateObj = new Date();
			                        String date = new SimpleDateFormat("E yyyy.MM.dd 'at' hh:mm:ss a").format(dateObj);
			                        System.out.println("Shares Buy Date & Time : " + date);
								}
								else
									System.out.println("Sorry.. Insufficient amount or shares not available..");
							}
						}
					}
				}
				writeIntoFile(jsonObj1, companyfilepath);
				writeIntoFile(jsonObj2, userfilepath);
			}
			
	//methode to sell the stocks 
	   		
	 
	public void sell() throws FileNotFoundException, IOException, ParseException 
	{
		File file1 = new File(companyfilepath);
		JSONParser parser1 = new JSONParser();
		JSONObject jsonObj1 = (JSONObject)parser1.parse(new FileReader(file1));
		JSONArray array1 = (JSONArray)jsonObj1.get("StockDetails"); 
		System.out.println(array1);		
		
		File file2 = new File(userfilepath);
		JSONParser parser2 = new JSONParser();
		JSONObject jsonObj2 = (JSONObject)parser2.parse(new FileReader(file2));
		JSONArray array2 = (JSONArray)jsonObj2.get("UserDetails");
		System.out.println(array2);
		
		JSONObject compareObj1;
		JSONObject compareObj2;
		System.out.println("Enter User name : ");
		String userName = sc.next();
		for(int i = 0; i < array2.size(); i++)
		{
			compareObj2 = (JSONObject)array2.get(i);
			if(compareObj2.get("UserName").equals(userName))
			{
				//isUserPresent = true;
				System.out.print(compareObj2);
				System.out.println("\nFollowing is available stock list");
				for(i = 0 ; i < array1.size(); i++)
				{
					compareObj1 = (JSONObject)array1.get(i);
					System.out.println(compareObj1);
				}
				System.out.println("Enter name of stock by whom you want to buy shares ");
				String stockName = sc.next();
				for(i = 0 ; i<array1.size();i++)
				{
					compareObj1 = (JSONObject)array1.get(i);
					if(compareObj1.get("StockName").equals(stockName))
					{
						//isStockPresent = true;
						System.out.println(compareObj1);						
						System.out.println("How many shares you wants to sell ? ");
						int sellShares = sc.nextInt();
						
						int companyIntStocks = Integer.parseInt(compareObj1.get("NoOfShare").toString());
						int userIntStocks = Integer.parseInt(compareObj2.get("NoOfShare").toString());
						int userSharePrice = Integer.parseInt(compareObj2.get("SharePrice").toString());
						int companySharePrice = Integer.parseInt(compareObj1.get("SharePrice").toString());
												
						int newUserShares = userIntStocks - sellShares;
						int newCompanyShares = companyIntStocks + sellShares;							
						
						int priceOfEachUserShares = userSharePrice / userIntStocks; 
						int newShareCalculation =  priceOfEachUserShares * sellShares;
						int newUserSharePrice = userSharePrice + newShareCalculation;
						int newCompanySharePrice = companySharePrice - newShareCalculation ; 
						
						if(sellShares < userIntStocks && newShareCalculation < companySharePrice )
						{
							compareObj1.remove("NoOfShare");
							compareObj2.remove("NoOfShare");
							compareObj1.remove("SharePrice");
							compareObj2.remove("SharePrice");
							
							compareObj1.put("NoOfShare", newCompanyShares);
							compareObj2.put("NoOfShare", newUserShares);
							compareObj1.put("SharePrice", newCompanySharePrice);
							compareObj2.put("SharePrice", newUserSharePrice);
							
							System.out.println(compareObj1);
							System.out.println(compareObj2);					

							Date dateObj = new Date();
	                        String date = new SimpleDateFormat("E yyyy.MM.dd 'at' hh:mm:ss a").format(dateObj);
	                        System.out.println("Shares Sell Date & Time : " + date);
						}
					}
				}	
			}
		}
		
		writeIntoFile(jsonObj1, companyfilepath);
		writeIntoFile(jsonObj2, userfilepath);
	}
	
	// methode to print the report	
	public void printReport() throws FileNotFoundException, IOException, ParseException 
	{
		System.out.println("Enter option Which data you want to see : 1.Company Report \n 2.User Report ");
		int choice = sc.nextInt();
		switch(choice)
		{
		case 1:
			companyReport();
			break;
		case 2:
			userReport();
			break;
		default:
				System.out.println("Choose valid option");
		}
	}

	private void companyReport() throws FileNotFoundException, IOException, ParseException 
	{
		File file = new File(companyfilepath);
		JSONParser parser1 = new JSONParser();
		JSONObject jsonObj1 = (JSONObject)parser1.parse(new FileReader(file));
		JSONArray array1 = (JSONArray)jsonObj1.get(file); 
		System.out.println(array1);
	}

	private void userReport() throws FileNotFoundException, IOException, ParseException
	{
		File file1 = new File(userfilepath);
		JSONParser parser2 = new JSONParser();
		JSONObject jsonObj2 = (JSONObject)parser2.parse(new FileReader(file1));
		JSONArray array2 = (JSONArray) jsonObj2.get("userDatails");
		System.out.println(array2);
	}

}
