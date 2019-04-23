//import java.lang.*;
package com.bridgelabz.objectoriented;

import java.io.File;
import java.util.Scanner;

import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.map.ObjectMapper;

public class Rough
{
	public static void main(String[] args) 
	{
		String path = "/home/admin1/Documents/Java_Programs/Java Project/Inventry.json";
		File file = new File(path);
			ObjectMapper mapper = new ObjectMapper();
			System.out.println("jack");
			
			Scanner sc = new Scanner(System.in);
			int key = sc.nextInt();
			try
			{
				System.out.println("1.Add data");
				System.out.println("2.Display");
				
				
					
			
			
				System.out.println("jack");
				
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
