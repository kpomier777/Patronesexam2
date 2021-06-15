package strategy.basic;

import java.util.Date;

public class Usuarios {
    private String nombre;
    private Date fechaNac;
    private String profesion;
    private int ci;

    public Usuarios(String nombre, Date fechaNac, String profesion, int ci) {
        this.nombre = nombre;
        this.fechaNac = fechaNac;
        this.profesion = profesion;
        this.ci = ci;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(Date fechaNac) {
        this.fechaNac = fechaNac;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    public int getCi() {
        return ci;
    }

    public void setCi(int ci) {
        this.ci = ci;
    }



    public void info(){
        System.out.println("INFO> nombre: "+nombre);
        System.out.println("INFO> ci: "+ci);
        System.out.println("INFO> fecha nacimeinto: "+fechaNac);
        System.out.println("INFO> profesion: "+profesion);
    }

}
