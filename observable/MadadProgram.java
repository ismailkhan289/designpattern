public class MadadProgram{
    public static void main(String args[]){
        final int SAMNE_WALE_MADAD=1;
        final int DARMYAN_WALE_MADAD=2;
        final int KOI_BHI_MADAD=3;
        
        
        MeraProgram meraProgram= new MeraProgram();
        DarmayanWalaHisa darmyanWalaHisa=new DarmayanWalaHisa(meraProgram);
        SamneWalaHisa samneWalaHisa = new SamneWalaHisa(darmyanWalaHisa);
        samneWalaHisa.hasilMadad(KOI_BHI_MADAD);



    }
}