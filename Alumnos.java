public class Alumnos {
    int ncontrol;
    String nombre;
    String apellido;

    public Alumnos () {
    }
    public Alumnos (int ncontrol, String nombre, String apellido) {
        this.ncontrol= ncontrol;
        this.nombre= nombre;
        this. apellido= apellido;
    }
    public int getNcontrol() {
        return ncontrol;
    }
    public void setNcontrol (int ncontrol) {
        this.ncontrol= ncontrol;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre (String nombre) {
        this.nombre= nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido (String apellido) {
        this.apellido= apellido;
    }

    public void statusCalificacion(int calif) {
        if (calif>=70){
            System.out.println("Aprobaste niñe");
        }
        else {
            System.out.println("Reprobaste y la queso");

        }
    }
}    
