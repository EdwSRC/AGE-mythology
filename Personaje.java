public class Personaje {

    private String pelo;
    private String ojo;
    private String cuerpo;
    private String piel;
    private String Nombre;


    void setNombre(String n){Nombre=n;}
    public Personaje(String pelo, String ojo, String cuerpo, String piel, String Nombre) {
        this.pelo = pelo;
        this.ojo = ojo;
        this.cuerpo = cuerpo;
        this.piel = piel;
        this.Nombre = Nombre;
    }
    public Personaje(){
        pelo=getPelo();
        ojo=getOjo();
        cuerpo=getCuerpo();
        piel=getPiel();
        Nombre=getNombre();

    }

    public String getPelo() {
        return pelo;
    }

    public void setPelo(String pelo) {
        this.pelo = pelo;
    }

    public String getOjo() {
        return ojo;
    }

    public void setOjo(String ojo) {
        this.ojo = ojo;
    }

    public String getCuerpo() {
        return cuerpo;
    }

    public void setCuerpo(String cuerpo) {
        this.cuerpo = cuerpo;
    }

    public String getPiel() {
        return piel;
    }

    public void setPiel(String piel) {
        this.piel = piel;
    }

    public String getNombre() {
        return Nombre;
    }

    public void Mostrar(){
        String nl = System.getProperty("line.separator");
        System.out.println("Las caracterÃ­sticas son las siguientes:"+nl+"Nombre:"+Nombre+nl+"Pelo:"+pelo+nl+"Cuerpo:"+cuerpo+nl+"Piel:"+piel+nl+"Ojos:"+ojo);
    }

}
