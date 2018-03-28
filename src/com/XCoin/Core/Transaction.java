package com.XCoin.Core;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.security.Key;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Scanner;


public class Transaction {

	private int amount;
	public Key sender;
	public Key reciever;
	public long timeStamp;
	public String id;
	
	public Transaction (int a, Key r, Key s, long t) {
		this.amount = a;
		this.timeStamp = t;
		this.reciever = r;
		this.sender = s;
		this.id = StringUtil.applySha256(Integer.toString(a) + Long.toString(t) + StringUtil.getStringFromKey(r) + StringUtil.getStringFromKey(s));
	}
	
	
	
	/*public boolean isAmountValid() {
		return wallet.getBalance() >= amount ? true : false; 
	}
	
	public void sendTransaction() throws IOException{
		 BufferedReader buffer = new BufferedReader(new FileReader("transactions.dat"));
		 Scanner in = new Scanner(buffer);
		 String ID = in.nextLine();
		 if(ID.equals(id)) { // Transaction ID's Match
			 wallet.removeFunds(amount);
		 }
	}
	*/
}