package strategy.basic;

import java.util.Comparator;
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

    public static Comparator<Usuarios> NameORDER = new Comparator<Usuarios>() {
        public int compare(Usuarios s1, Usuarios s2) {
            String name1 = s1.getNombre().toUpperCase();
            String name2 = s2.getNombre().toUpperCase();
            return name1.compareTo(name2);
        }};

    public static Comparator<Usuarios> CiORDER = new Comparator<Usuarios>() {
        public int compare(Usuarios s1, Usuarios s2) {
            int ci1 = s1.getCi();
            int ci2 = s2.getCi();
            return ci1-ci2;

        }};
    public static Comparator<Usuarios> DateORDER = new Comparator<Usuarios>() {
        public int compare(Usuarios s1, Usuarios s2) {
            Date date1 = s1.getFechaNac();
            Date date2 = s2.getFechaNac();
            return (date1.getTime() > date2.getTime() ? 1 : -1);

        }};

}
