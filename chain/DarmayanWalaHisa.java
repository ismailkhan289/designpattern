public class DarmayanWalaHisa implements MadadInterface{
    final int DARMAYAN_WALA_HISA=2;
    MadadInterface kyaMila;

    public DarmayanWalaHisa(MadadInterface milGaya){
        kyaMila=milGaya;
    }
    
    public void hasilMadad(int madadConstant){
        if(madadConstant!=DARMAYAN_WALA_HISA){
            kyaMila.hasilMadad(madadConstant);
        }else{
            System.out.println("Aap darmyan Wale hisa may hay. Kya Mada Chahiye?");
        }
    }
}