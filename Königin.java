class Königin extends Person{
    public Königin(int gehalt, String newName) {
        super(gehalt,newName);    
    }

    @Override
    int steuer() {
        return 0;
    }  
}
