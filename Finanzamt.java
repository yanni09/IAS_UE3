class Finanzamt {

        
    
    public int berechneSteuer(Person[] einwohner) {
        int steuern = 0;
		for (int i = 0; i < einwohner.length; i++) {
			steuern += einwohner[i].steuer();
		}
		
		return steuern;
    }
    public static void main(String args[]) {
/*
 
Person   -- Einkommen
-----------------------
Person   -- (“Joe Unemployed”)  6.400 ₤
Arbeiter -- (“Suzi Hard‐working”)  36.000 ₤
Banker   -- (“Fred Moneymaker”)  4.000.000 ₤
Königin  -- (“Elisabeth”)  1.000.000 ₤

    }*/

    Person A = new Person(6400 ,"Joe Unemployed");
    Person B = new Arbeiter(36000 ,"Suzi hard-Working");
    Person C = new Banker(40000000 ,"Fred Moneymaker");
    Person D = new Königin(1000000 ,"Elisabeth");

    System.out.println(A.toString());
    System.out.println(B.toString());
    System.out.println(C.toString());
    System.out.println(D.toString());
    
    }
}
