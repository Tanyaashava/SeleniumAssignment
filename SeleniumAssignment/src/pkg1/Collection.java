package pkg1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Collection 
{
		public static void main(String args[])
		{
			Scanner sc=new Scanner(System.in);
			// Set Interface ---> remove duplicates
		/* -----------------------------------------------------------------------------------------------------
			// HashSet Class ---> order not maintain
			System.out.println("HASH SET");
			HashSet<Integer> hm=new HashSet<Integer>();
			hm.add(12);
			hm.add(123);
			hm.add(51);
			hm.add(12);
			hm.add(13);
			hm.add(11);
			hm.add(10);
			hm.add(1);
			for(Integer i:hm)
			{
				System.out.println(i);
			}
			
			// LinkedHashSet ---> maintain order
			System.out.println("LINKED HASH SET");
			LinkedHashSet<Integer> hm2=new LinkedHashSet<Integer>();
			System.out.println("Enter values");
			for(int i=0; i<8; i++)
			{
				Integer value=sc.nextInt();
				hm2.add(value);
			}
			for(Integer i: hm2)
			{
				System.out.println(i);
			}
			
			// TreeSet ---> ascending order
			System.out.println("TREE SET");
			TreeSet<String> hm3=new TreeSet<String>();
			System.out.println("Enter values");
			for(int i=0; i<8; i++)
			{
				String value=sc.nextLine();
				hm3.add(value);
			}
			for(String i: hm3)
			{
				System.out.println(i);
			}
			
			// List Interface ---> allow duplicates
		/*-------------------------------------------------------------------------------------------------*/
			// ArrayList Class ---> order maintain
			System.out.println("ARRAY LIST");
			ArrayList<String> al=new ArrayList<String>();
			System.out.println("Enter values");
			for(int i=0; i<8; i++)
			{
				String value=sc.nextLine();
				al.add(value);
			}
			for(String i: al)
			{
				System.out.println(i);
			}
			
			// LinkedList ---> order maintain
			System.out.println("LINKED LIST");
			LinkedList<Integer> ll=new LinkedList<Integer>();
			System.out.println("Enter values");
			for(int i=0; i<8; i++)
			{
				Integer value=sc.nextInt();
				ll.add(value);
			}
			for(Integer i: ll)
			{
				System.out.println(i);
			}
			
			// Map ---> key & value ( duplicates not allowed)
		/*---------------------------------------------------------------------------------------------*/
			// HashMap ---> Not maintain order
			System.out.println("HASH MAP");
			HashMap<Integer,String> hmap=new HashMap<Integer,String>();
			for(int i=0; i<5; i++)
			{
				System.out.println("Enter Keys");
				Integer key=sc.nextInt();
				System.out.println("Enter values");
				String values=sc.next();
				hmap.put(key,values);
			}
			Set<Integer> allKeys=hmap.keySet();
			for(Integer i: allKeys)
			{
				System.out.println("Key :"+i);
				System.out.println("Value :"+hmap.get(i));
			}
			
			// LinkedHashMap ---> Maintain order
			System.out.println("LINKED HASH MAP");
			LinkedHashMap<Integer,String> lhmap=new LinkedHashMap<Integer,String>();
			for(int i=0; i<5; i++)
			{
				System.out.println("Enter keys");
				Integer keys=sc.nextInt();
				System.out.println("Enter values");
				String values=sc.next();
				lhmap.put(keys, values);
			}
			Set<Integer> allKeysValues=lhmap.keySet();
			for(Integer i:allKeysValues)
			{
				System.out.println("Keys :"+i);
				System.out.println("Values :"+lhmap.get(i));
			}
			
			// TreeMap ---> Increasing order
			System.out.println("TREE MAP");
			TreeMap<Integer,String> tmap=new TreeMap<Integer,String>();
			for(int i=0; i<5; i++)
			{
				System.out.println("Enter keys");
				Integer keys=sc.nextInt();
				System.out.println("Enter values");
				String values=sc.next();
				tmap.put(keys, values);
			}
			Set<Integer> allKeyValue=tmap.keySet();
			for(Integer i: allKeyValue)
			{
				System.out.println("Key "+i);
				System.out.println("Value :"+tmap.get(i));
			}
		
		/*---------------------------------------------------------------------------------------------------------*/
			// Collection inside a collection
			HashSet<Integer> hset=new HashSet<Integer>();
			System.out.println("Enter values");
			for(int i=0; i<4; i++)
			{
				Integer value=sc.nextInt();
				hset.add(i);
			}
			HashSet<Integer> hset1=new HashSet<Integer>();
			System.out.println("Enter values");
			for(int i=0; i<6; i++)
			{
				Integer value=sc.nextInt();
				hset1.add(i);
			}
			HashMap<Integer,HashSet<Integer>> hmap1=new HashMap<Integer,HashSet<Integer>>();
			hmap1.put(1, hset);
			hmap1.put(2, hset1);
			Set<Integer> allvalues= hmap1.keySet();
			for(Integer i: allvalues)
			{
				System.out.println("Keys " +i);
				System.out.println("Value :"+hmap1.get(i));
			}
		}
}


