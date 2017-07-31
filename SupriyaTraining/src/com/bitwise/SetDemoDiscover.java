package com.bitwise;

import java.util.ArrayList;

import javax.swing.text.html.HTMLDocument.Iterator;

public class SetDemoDiscover {
	
	static String list= "Dissddiscisoddvosedorrsd";
	static ArrayList<SetDemoDiscover> output = null;
	char ch;
	
	public SetDemoDiscover(char ch) {
		this.ch = ch;
	}

	public static void main(String[] args) {
		
		output = new ArrayList<SetDemoDiscover>();
		for(int i=0;i<list.length();i++)
		{
			output.add(new SetDemoDiscover(list.charAt(i)));
		}
		
		Iterator itr = set.iterator();
		
		System.out.println(set);
	}

}
