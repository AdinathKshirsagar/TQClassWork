package com.singleInheritence;

public class Manager extends Employee{

		private float exp;
		private float bonus;
		private String position;
		
		public Manager() {
			super();
		}
		public Manager (int eid,String ename,float salary ,float exp, float bonus, String position) {
			super(eid,ename,salary);
			this.exp=exp;
			this.bonus=bonus;
			this.position=position;
		}
		public String toString() {
			return "Employee "+getEid()+" "+getEname()+" "+getSalary()+" "+getCompany()+" "+exp+" "+bonus+" "+position;
		}
		
		public static void main (String args[]) {
			Manager m1 = new Manager();
			System.out.println(m1);
			
			Manager m2 = new Manager(1,"adi",585757f,3f,55f,"Head");
			System.out.println(m2);
		}
}
