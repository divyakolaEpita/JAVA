package fr.epita.www.service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import fr.epita.www.datamodel.Person;




public class PersonController {
	
	static String csvFile = "data.csv";
    static BufferedReader br = null;
    static String line = "";
    static String cvsSplitBy = ",";
    
    public static Person personData() throws IOException {
    br = new BufferedReader(new FileReader(csvFile));
    List<Person> personList = new ArrayList<Person>();
    Person person = null;
    try {
		while ((line = br.readLine()) != null) {
			 person = new Person();
			String[] data = line.split(cvsSplitBy);
			person.setName(data[0]);
			person.setSex(data[1]);
			person.setAge(Integer.parseInt(data[2]));
			person.setHeight(Integer.parseInt(data[3]));
			person.setWeight(Integer.parseInt(data[4]));
			personList.add(person);
			System.out.println(personList);
		}
		System.out.println(personList.size());
		sortToList(personList);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
    return person;
    }
    
    public static List<Person> sortToList(List<Person> person){
    	
    	Collections.sort(person);
		return person;
    }
    
    
    public static void main(String args[]) throws IOException{  
    	System.out.println(personData());
    }
    }

