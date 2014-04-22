package nl.utwente.di;

public class Quoter {
	double getBookPrice( String a){
		double res;
		if(a.equals("1")){
			res = 10.0;
		}
		else if (a.equals("2")){
			res = 45.0;
		}
		else if (a.equals("3")){
			res = 20.0;
		}
		else if (a.equals("4")){
			res = 35.0;
		}
		else if (a.equals("5")){
			res = 50.0;
		}
		else{
			res = 0.0;
		}
		return res;
	}

}
