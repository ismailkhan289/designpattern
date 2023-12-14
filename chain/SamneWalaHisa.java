public class SamneWalaHisa implements MadadInterface{
    MadadInterface kyaMila;
    final int SAMNE_KI_MADAD=1;
    
    public SamneWalaHisa(MadadInterface milGaya){
        kyaMila=milGaya;
    }
    
    public void hasilMadad(int madadConstant){
        if (madadConstant!=SAMNE_KI_MADAD) {
            kyaMila.hasilMadad(madadConstant);
        }else{
            System.out.println("Ye Samne ka Hisa hay Program ka, Kya Aap ko Acha Laga?");
        }
    }
}