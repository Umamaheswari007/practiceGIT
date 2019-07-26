package coreJava;

public class AccessData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		GetSet obName=new GetSet();
		obName.setEmpName(1234,"hsfdjsa");
		String name=obName.getEmpName();
		System.out.println("name="+name);

	}

}
