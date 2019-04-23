/*
 * Purpose: Create a JSON file having Inventory Details for Rice, Pulses and Wheats with properties name,
 * 			weight, price per kg. 
 * @author: Nainesh R Patl.
 * Since  : 
 */

package com.bridgelabz.objectoriented;

import java.io.File;

import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.map.ObjectMapper;

public class JSONManagement 
{
	public static void main(String[] args) throws Error 
	{
		String path = "Inventry.json";
		File file = new File(path);
		//System.out.println("Hello");
		ObjectMapper mapper = new ObjectMapper();
		//System.out.println("jack");

		try
		{
			//System.out.println("jack");
			
			JsonNode rootNode = mapper.readTree(file);
			JsonNode inventry = rootNode.get("Rice");
			System.out.println("All types of rice");
			for(JsonNode node : inventry)
			{
				String name = node.path("name").asText();
				int price = node.path("price").asInt();
				int weight = node.path("weight").asInt();
				System.out.println("Name: "+name+"\n Price: "+price+"\n Weight: "+weight);
				System.out.println("Total: "+price * weight+ "Rs \n");
			}
			
			JsonNode inventry1 = rootNode.get("Pulses");
			System.out.println("All types of Pulses are: ");
			for(JsonNode node : inventry1)
			{
				String name = node.path("name").asText();
				int price = node.path("price").asInt();
				int weight = node.path("weight").asInt();
				System.out.println("Name: "+name+"\n Price: "+price+"\n Weight: "+weight);
				System.out.println("Total: "+price * weight+ "Rs \n");
			}
			
			JsonNode inventry2  =rootNode.get("Weight");
			System.out.println("All types  of weights are: ");
			for(JsonNode node : inventry2)
			{
				String name = node.path("name").asText();
				int price = node.path("price").asInt();
				int weight = node.path("weight").asInt();
				System.out.println("Name: "+name+"\n Price: "+price+"\n Weight: "+weight);
				System.out.println("Total: "+price * weight+ "Rs \n");
			}
		}
		catch (Exception e) 
		{
			System.out.println(e);
		}
	}
}
