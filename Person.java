class Person {
    protected int einkommen;
    protected String name = "";

    public Person(int gehalt, String newName) {
        this.einkommen = gehalt;
        this.name = newName;
    }

    int zuVersteuerndesEinkommen() {
        return (int)(this.einkommen * 0.25);
    }

    int steuer() {
        if(this.zuVersteuerndesEinkommen() > this.einkommen) {
            return 0;
        }
        return zuVersteuerndesEinkommen(); 
    }

    @Override public String toString() {
		int netto = this.einkommen - this.steuer();
		String className = this.getClass().getName();
		return className + "(" +
				this.name +		
				"): " +
				"\n\t\t Brutto-Einkommen: " + this.einkommen +
				"\n\t\t zu verst. Einkommen: " + this.zuVersteuerndesEinkommen() +
				"\n\t\t Steuer: " + this.steuer() +
				"\n\t\t Netto-Einkommen: " + netto; 
	}

}