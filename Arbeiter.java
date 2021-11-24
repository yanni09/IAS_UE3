class Arbeiter extends Person{

    public Arbeiter(int gehalt, String newName) {
        super(gehalt,newName);    
    }

    @Override
    int steuer() {
        if(this.einkommen <= 2400 ) {
            return 0;
        } else{
            return zuVersteuerndesEinkommen();
        }
    } 
}
