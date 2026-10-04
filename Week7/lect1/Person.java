package lect1;

public class Person implements Comparable<Person>{

	private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }


    public String toString() {
        return this.name + " (Age: " + this.age + ")";
    }




	@Override
	//(-) if this < o
	//(+) if this > o
	//0 if this == o
	public int compareTo(Person o) {
		// TODO Auto-generated method stub
		
		//idea 1: by age
/*
		if(this.age < o.age) {
			return -1;
		}else if(this.age > o.age) {
			return 1;
		}
		return 0;
*/		
		//idea 2: by name
			//all upper before all lower case
				//Zain before ahmed
		//return this.name.compareTo(o.name);
		
		//idea 3: by name, break ties by age
		int res = this.name.compareTo(o.name);
		if(res != 0) { //no tie
			return res;
		}
		
		return this.age-o.age;
		
		
	}
}
