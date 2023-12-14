public class RaceStart{
    public static void main(String[] args){
        StreetRacer streetRacer=new StreetRacer();
        FormulaCar formulaCar=new FormulaCar();
        Helicopter helicopter=new Helicopter();
        Jet jet=new Jet();
        
        streetRacer.go();
        formulaCar.go();
        helicopter.go();
        jet.go();

    }
}