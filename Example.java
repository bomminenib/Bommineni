import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@FunctionalInterface
interface MyFunctionalInteface{
	public String sayHello();
	
	//public int incrementByFive(int a);
	
	//public String strConcat(String a, String b);
	
}




public class Example {
	
	public void myMethod() {
		System.out.println("Instance method...");
	}
	
	

	public static void main(String[] args) { 
		
		Example  obj = new Example();
		
		
		/*MyFunctionalInteface msg = () -> {return "Hi Venkat";};
		
	   System.out.println(msg.sayHello());*/		
		
		/*MyFunctionalInteface incremented = (num) -> num + 5;			
		System.out.println(incremented.incrementByFive(10));*/
		
		//MyFunctionalInteface strCon = (s1,s2) -> s1+s2;
		
		
		
		
		/*List<String>  list = new ArrayList<String>();
		
		list.add("Bala1trtet");
		list.add("Bala2");
		list.add("Bala3");
		list.add("Bala4ffdf");
		list.add("Bala2");
		list.add("Bala3");
		
		list.forEach(System.out::println);
		
		Set<String> set = list.stream().filter(str -> str.length() < 6).collect(Collectors.toSet());
		
		
		System.out.println(set);*/
		
		
		Map<Integer, String> hmap = new HashMap<Integer, String>();
	      hmap.put(1, "Monkey");
	      hmap.put(2, "Dog"); 
	      hmap.put(3, "Cat");  
	      hmap.put(4, "Lion");   
	      hmap.put(5, "Tiger");   
	      hmap.put(6, "Bear");
	      
	      hmap.forEach( (Key, Value) -> System.out.println(Key + "---"+Value));
		
	      hmap.forEach((k,v) -> {
	    	  if(k ==4) {
	    		  System.out.println(v);
	    	  }
	      });
		
	      
	      Employee e1 = new Employee("Bala",5100);
	      Employee e2 = new Employee("Aala",2100);
	      Employee e3 = new Employee("zala",9100);
	      Employee e4 = new Employee("fala",1100);
	      Employee e5 = new Employee("eBala",7100);
	      
	      
	      List<Employee> list = new ArrayList<>();
	      list.add(e1);
	      list.add(e2);
	      list.add(e3);
	      list.add(e4);
	      list.add(e5);
	       
	      
	      
	     // list.sort(Comparator.comparingInt(Employee::getSalary).thenComparing(Employee::getName));
	      
	      list.sort(Comparator.comparingInt(Employee::getSalary));
	      
	     // list = list.sort(Comparator.comparing(Employee::getSalary).thenComparing(Employee::getName));
	      
	      list.forEach( (employee) -> System.out.println(employee.getName() +"----"+ employee.getSalary()) );
		
	}

}
