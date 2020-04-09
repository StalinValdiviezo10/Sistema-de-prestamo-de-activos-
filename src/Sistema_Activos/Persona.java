
package logeo.ug.pkg2020;


public class Persona {
    String Codigo;
    String Nombres;
    String Apellidos;
    String Ci;
    String Especialidad;
    String Codi_Carrera;
    String Carrera;
    String Codi_Facultad;
    String Facultad;

    public Persona(String Codigo, String Nombres, String Apellidos, String Ci, String Especialidad,String Codi_Carrera, String Carrera, String Codi_Facultad, String Facultad) {
        this.Codigo = Codigo;
        this.Nombres = Nombres;
        this.Apellidos = Apellidos;
        this.Ci = Ci;
        this.Especialidad = Especialidad;
        this.Codi_Carrera=Carrera;
        this.Carrera = Carrera;
        this.Codi_Facultad = Codi_Facultad;
        this.Facultad = Facultad;
    }

    public String getCodigo() {
        return Codigo;
    }

    public void setCodigo(String Codigo) {
        this.Codigo = Codigo;
    }

    public String getNombres() {
        return Nombres;
    }

    public void setNombres(String Nombres) {
        this.Nombres = Nombres;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }

    public String getCi() {
        return Ci;
    }

    public void setCi(String Ci) {
        this.Ci = Ci;
    }

    public String getEspecialidad() {
        return Especialidad;
    }

    public void setEspecialidad(String Especialidad) {
        this.Especialidad = Especialidad;
    }

    public String getCodi_Carrera() {
        return Codi_Carrera;
    }

    public void setCodi_Carrera(String Codi_Carrera) {
        this.Codi_Carrera = Codi_Carrera;
    }

    public String getCarrera() {
        return Carrera;
    }

    public void setCarrera(String Carrera) {
        this.Carrera = Carrera;
    }

    public String getCodi_Facultad() {
        return Codi_Facultad;
    }

    public void setCodi_Facultad(String Codi_Facultad) {
        this.Codi_Facultad = Codi_Facultad;
    }

    public String getFacultad() {
        return Facultad;
    }

    public void setFacultad(String Facultad) {
        this.Facultad = Facultad;
    }
    
    

    

    
}
