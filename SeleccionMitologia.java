public class SeleccionMitologia{

    private String Nmitologia;
    private int Mitologia;

    public SeleccionMitologia(int Mitologia,String Nmitologia){
        this.Mitologia=Mitologia;
        this.Nmitologia=Nmitologia;

    }

    public SeleccionMitologia(){
        Mitologia=getMitologia();
    }

    public int getMitologia() {
        return Mitologia;
    }

    public void setMitologia(int Mitologia) {
        this.Mitologia = Mitologia;
    }
   public void Elegir(){
       if(Mitologia==1){
           Nmitologia="Griega";
           System.out.println("La mitologia que usted escogio es: "+Nmitologia);
       }if(Mitologia==2){
            Nmitologia="Japonesa";
           System.out.println("La mitologia que usted escogio es: "+Nmitologia);
       }if(Mitologia==3){
            Nmitologia="China";
           System.out.println("La mitologia que usted escogio es: "+Nmitologia);
       }if(Mitologia==4){
            Nmitologia="Precolombina";
           System.out.println("La mitologia que usted escogio es: "+Nmitologia);
       }
       if(Mitologia==5){
            Nmitologia="Egipcia";
           System.out.println("La mitologia que usted escogio es: "+Nmitologia);
       }if(Mitologia==6){
            Nmitologia="NÃ³rdica";
           System.out.println("La mitologia que usted escogio es: "+Nmitologia);
       }

   }

}
