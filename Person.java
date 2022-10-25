class Person{
	private String name;
	private int age;
	private String job;
	private String gender;


	public Person(){

	}

	public Person(String name,int age,String job,String gender){
		this.name=name;
		this.age=age;
		this.job=job;
		this.gender=gender;

	}

	public void myInfo(){
		System.out.println("Имя: "+name+"\n"+"Возраст: "+age+"\n"+"Работа :"+job+"\n"+"Пол: "+gender);
	}

} 