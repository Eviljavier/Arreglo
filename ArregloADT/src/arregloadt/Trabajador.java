/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arregloadt;

import javax.swing.text.TabableView;

/**
 *
 * @author ernst
 */
public class Trabajador {
    private int NumEmp;
    private String Nombre; 
    private String Paterno;
    private String Materno;
    private int HorasEx;
    private int Sueldo;
    private int AñoIngreso;

    public Trabajador(int NumEmp, String Nombre, String Paterno, String Materno, int HorasEx, int Sueldo, int AñoIngreso) {
        this.NumEmp = NumEmp;
        this.Nombre = Nombre;
        this.Paterno = Paterno;
        this.Materno = Materno;
        this.HorasEx = HorasEx;
        this.Sueldo = Sueldo;
        this.AñoIngreso = AñoIngreso;
        
        Trabajador traba1 = new Trabajador(2345,"CARLOS","PEREZ","CASTILLO",0,9850,2017);
        Trabajador traba2 = new Trabajador(5754,"ANGEL","GOMEZ","GARRIDO",1,9850,2020);
        Trabajador traba3 = new Trabajador(5345,"JESUS","MARTIN","SANTOS",2,9850,2016);
        Trabajador traba4 = new Trabajador(3267,"DAVID","JIMENEZ","LOZANO",2,9850,2017);
        Trabajador traba5 = new Trabajador(8765,"PEDRO","RUIZ","GUERRERO",2,9850,2017);
        Trabajador traba6 = new Trabajador(454,"DANIEL","HERNANDEZ","CANO",3,9850,2018);
        Trabajador traba7 = new Trabajador(3456,"ALEJANDRO","DIAZ","PRIETO",2,9850,2018);
        Trabajador traba8 = new Trabajador(3445,"MARIA","MORENO","MENDEZ",1,9850,2018);
        Trabajador traba9 = new Trabajador(9088,"ALBERTO","MU�OZ","CRUZ",1,9850,2017);
        Trabajador traba10 = new Trabajador(8877,"RAFAEL","ALVAREZ","FLORES",2,9850,2017);
        Trabajador traba11 = new Trabajador(5654,"PABLO","ALONSO","GALLEGO",1,9850,2019);
        Trabajador traba12 = new Trabajador(4323,"JORGE","GUTIERREZ","MARQUEZ",2,9850,2020);
        Trabajador traba13 = new Trabajador(2232,"RAMON","NAVARRO","LEON",1,9850,2016);
        
        
        
        
        
        
        
    }   
    public Trabajador() {
    }

    public int getNumEmp() {
        return NumEmp;
    }

    public void setNumEmp(int NumEmp) {
        this.NumEmp = NumEmp;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getPaterno() {
        return Paterno;
    }

    public void setPaterno(String Paterno) {
        this.Paterno = Paterno;
    }

    public String getMaterno() {
        return Materno;
    }

    public void setMaterno(String Materno) {
        this.Materno = Materno;
    }

    public int getHorasEx() {
        return HorasEx;
    }

    public void setHorasEx(int HorasEx) {
        this.HorasEx = HorasEx;
    }

    public int getSueldo() {
        return Sueldo;
    }

    public void setSueldo(int Sueldo) {
        this.Sueldo = Sueldo;
    }

    public int getAñoIngreso() {
        return AñoIngreso;
    }

    public void setAñoIngreso(int AñoIngreso) {
        this.AñoIngreso = AñoIngreso;
    }
}
