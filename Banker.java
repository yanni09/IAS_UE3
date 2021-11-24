class Banker extends Person {
    
    public Banker(int gehalt, String newName) {
        super(gehalt,newName);
    }
     @Override
    int steuer(){
        return zuVersteuerndesEinkommen() + 1000; 
    }
}