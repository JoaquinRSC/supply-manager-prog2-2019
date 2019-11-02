//@authors: | Joaquin_Rossi | Yorel_Acosta | 2°BC | ESI-BUCEO
package Persistencia;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import Logica.ArmadoPc;
import Logica.ArmadoRed;
import Logica.Hardware;
import Logica.InsumoInformatico;
import Logica.Presupuesto;
import Logica.Presupuesto;
import Logica.Software;

public class Tareas_Logica {
     private final String tabla_ins = "insumoinformatico";
     private final String tabla_hw = "hardware";
     private final String tabla_ram = "ram";
     private final String tabla_mb = "motherboard";
     private final String tabla_gpu = "gpu";
     private final String tabla_gab = "gabinete";
     private final String tabla_fuente = "fuente";
     private final String tabla_cpu = "cpu";
     private final String tabla_alm = "almacenamiento";
     
     private final String tabla_sw = "software";
     private final String tabla_presupuesto = "presupuesto";
     private final String tabla_cli = "cliente";
     private final String tabla_red = "armadored";
     private final String tabla_pc = "armadopc";
     
     
   public void guardarInsumo(Connection conexion, InsumoInformatico insumoInformatico, Hardware hardware) throws SQLException{        // Metodo guardar Insumo (RAM).
      try{
         PreparedStatement consulta;
         if(insumoInformatico.getIdInsumo()== null){
             // Se insertan datos en la tabla INSUMOINFORMATICO
            consulta = conexion.prepareStatement("INSERT INTO " + this.tabla_ins + "(descripcion_Ins, precio_Ins, precioBase_Ins) VALUES(?, ?, ?)");
            consulta.setString(1, insumoInformatico.getDescripcion());
            consulta.setDouble(2, insumoInformatico.getPrecioIns());
           // consulta.setDouble(3, insumoInformatico.get());   NO APARECE PRECIO BASE 
            
            // Se insertan datos en la tabla HARDWARE
            consulta = conexion.prepareStatement("INSERT INTO " + this.tabla_hw + "(id_Hw, marca_Hw, modelo_Hw) VALUES(?, ?)");        // PONGO MISMA ID INSUMO EN ID HARDWARE
            consulta.setString(1, insumoInformatico.getIdInsumo());
            consulta.setString(2, hardware.getMarca());
            consulta.setString(3, hardware.getModelo());
            
            // Se insertan datos en la tabla RAM
            consulta = conexion.prepareStatement("INSERT INTO " + this.tabla_ram + "(id_Hw_Ram, frec_Ram, capacidad_Ram, tech_Ram) VALUES(?, ?, ?)");        // PONGO MISMA ID INSUMO EN ID RAM
            consulta.setString(1, insumoInformatico.getIdInsumo());
            // consulta.setInt(1, hardware.getfrecRAM()); TAMPOCO FUNCIONA ESTE GET DE FRECRAM
            // consulta.setInt(2, hardware.getcapacidadRAM()); 
            // consulta.setInt(3, hardware.gettechRAM());
         }else{
             // Update tabla INSUMOINFORMATICO
            consulta = conexion.prepareStatement("UPDATE " + this.tabla_ins + " SET descripcion_Ins = ?, precio_Ins = ?, precioBase_Ins = ? WHERE id_Ins = ?");
            consulta.setString(1, insumoInformatico.getDescripcion());
            consulta.setDouble(2, insumoInformatico.getPrecioIns());
           // consulta.setDouble(3, insumoInformatico.get());   NO APARECE PRECIO BASE 
            consulta.setString(4, insumoInformatico.getIdInsumo());
            
            // Update tabla HARDWARE
            consulta = conexion.prepareStatement("UPDATE " + this.tabla_hw + " SET marca_Hw = ?, modelo_Hw = ? WHERE id_Ins = ?");
            consulta.setString(1, hardware.getMarca());
            consulta.setString(2, hardware.getModelo());
            
            // Update tabla RAM
            consulta = conexion.prepareStatement("UPDATE " + this.tabla_ram + " SET frec_Ram = ?, capacidad_Ram = ?, tech_Ram = ? WHERE id_Ins = ?");;
            // consulta.setInt(1, hardware.getfrecRAM()); TAMPOCO FUNCIONA ESTE GET DE FRECRAM
            // consulta.setInt(2, hardware.getcapacidadRAM()); 
            // consulta.setInt(3, hardware.gettechRAM());
         }
         consulta.executeUpdate();
      }catch(SQLException ex){
         throw new SQLException(ex);
      }
   }
   
   public void eliminarInsumo(Connection conexion, InsumoInformatico insumoInformatico) throws SQLException{          // Metodo eliminar Insumo (RAM) POR ID. sin terminar
      try{
         PreparedStatement consulta = conexion.prepareStatement("DELETE FROM " + this.tabla_ins + " WHERE id_Ins = ?");
         consulta.setString(1, insumoInformatico.getIdInsumo());
         
         consulta.executeUpdate();
      }catch(SQLException ex){
         throw new SQLException(ex);
      }
   }
}// End class
