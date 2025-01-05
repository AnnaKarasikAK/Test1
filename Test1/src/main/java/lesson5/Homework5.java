package lesson5;

import java.util.*;

public class Homework5 {
    public String getDay(int day) {
        String weekDay = "";
        if(day>0 && day<8) {
            ArrayList<String> week = new ArrayList<String>();
            week.add("Sunday");
            week.add("Monday");
            week.add("Tuesday");
            week.add("Wednesday");
            week.add("Thursday");
            week.add("Friday");
            week.add("Saturday");
            weekDay = week.get(day-1);

        } else {
            weekDay = "N/A";
        }
        return weekDay;
    }

    public String getToyById(int id){

//        Scanner toyId = new Scanner(System.in);
//        System.out.println("Enter the Toy ID: ");
//        int id = Integer.parseInt(toyId.next());

        String result = "";
        HashMap<Integer, String> toys = new HashMap<Integer, String>();
        toys.put(12, "Batmobile");
        toys.put(45, "Light Saber");
        toys.put(6, "Wonder Woman");
        toys.put(201, "Hello Kitty Bag");
        toys.put(56, "Junior QA Analyst Doll");

        if(toys.containsKey(id)){
            result = toys.get(id);
        }
        else {
            result = "No such Toy";
        }
        return result;
    }

    public void noDuplicates(){
        ArrayList<String> names = new ArrayList<String>();
        names.add("Steve");
        names.add("Tom");
        names.add("Lucy");
        names.add("Steve");
        names.add("Steve");
        names.add("Steve");
        names.add("Pat");
        names.add("Angela");
        names.add("Angela");
        names.add("Angela");
        names.add("Angela");
        names.add("Wanna");
        names.add("Tom");
        names.add("Tom");
        names.add("Tim");
        names.add("Anna");
        names.add("Lucy");
        for(String name: names){
            System.out.println(name);
        }
        System.out.println();

        HashSet<String> hashNames = new HashSet<String>(names);
        System.out.println(hashNames);

//        Collections.sort(names);
//        for(String name: names){
//            System.out.println(name);
//        }
//        System.out.println();

//        for(int i=0; i <=names.size()-2; i++) {
//            for (int j = 0; j <= names.size()-2; j++) {
//                if (names.get(j).equals(names.get(j + 1))) {
//                    names.remove(names.get(j + 1));
//                }
//            }
//        }


//        for(String name: names){
//            System.out.println(name);
//        }
    }

    public void noDuplicates2(String listNames){
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter required names, dividing them by commas: ");
//        String listNames = input.nextLine();
// Next line can come instead of Scanner input (previous 3 lines):
//      String listNames = "Steve, Tim, Lucy, Steve, Steve, Pat, Angela, Tom, Tim, Anna, Lucy, Tom, Tom, Wanna, Angela, Angela";

        listNames = listNames.replaceAll("\\s+","");
        // converting string to array
        String[] arrayNames = listNames.split(","); // and important not to forget the space after comma.. otherwise you will have 2 Steves, one with space, one without
        System.out.println("The received names are : "+Arrays.toString(arrayNames));

        // converting array into ArrayList so it can be converted to HashSet (ha ha)
        HashSet<String> hashNames = new HashSet<String>(Arrays.asList(arrayNames));
        System.out.println("After removing the duplicates: " + hashNames);
    }

    public String input(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter required names, dividing them by commas: ");
        String listNames = input.nextLine();
        return listNames;
    }

    public int[] square2(){

        int[] list = {1,2,5,-4};
        for(int i=0; i<=list.length-1; i++){
            list[i] = list[i]*list[i];
        }
        for(int i = 0; i< list.length; i++){
            System.out.println(list[i]);
        }
        return list;
    }
}
