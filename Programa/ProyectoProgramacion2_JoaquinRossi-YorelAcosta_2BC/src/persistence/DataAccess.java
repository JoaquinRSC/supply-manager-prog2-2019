// @authors: Joaquin Rossi | Yorel Acosta | 2BC | ESI-BUCEO
package persistence;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import logic.Hardware;
import logic.Supply;
import logic.PcAssembly;
import logic.NetworkSetup;
import logic.Quote;
import logic.Software;

public class DataAccess {
    private final String TABLE_SUPPLY     = "insumoinformatico";
    private final String TABLE_HARDWARE   = "hardware";
    private final String TABLE_RAM        = "ram";
    private final String TABLE_MB         = "motherboard";
    private final String TABLE_GPU        = "gpu";
    private final String TABLE_CASE       = "gabinete";
    private final String TABLE_PSU        = "fuente";
    private final String TABLE_CPU        = "cpu";
    private final String TABLE_STORAGE    = "almacenamiento";
    private final String TABLE_SOFTWARE   = "software";
    private final String TABLE_QUOTE      = "presupuesto";
    private final String TABLE_CLIENT     = "cliente";
    private final String TABLE_NETWORK    = "armadored";
    private final String TABLE_PC         = "armadopc";

    /**
     * Saves or updates a hardware supply (RAM type).
     * Insert when id is null, update otherwise.
     */
    public void saveSupply(Connection conn, Supply supply, Hardware hardware) throws SQLException {
        try {
            PreparedStatement stmt;
            if (supply.getId() == null) {
                // Insert into SUPPLY table
                stmt = conn.prepareStatement(
                    "INSERT INTO " + TABLE_SUPPLY + " (descripcion_Ins, precio_Ins, precioBase_Ins) VALUES (?, ?, ?)"
                );
                stmt.setString(1, supply.getDescription());
                stmt.setDouble(2, supply.getPrice());
                stmt.setDouble(3, supply.getBasePrice());
                stmt.executeUpdate();

                // Insert into HARDWARE table
                stmt = conn.prepareStatement(
                    "INSERT INTO " + TABLE_HARDWARE + " (id_Hw, marca_Hw, modelo_Hw) VALUES (?, ?, ?)"
                );
                stmt.setString(1, supply.getId());
                stmt.setString(2, hardware.getBrand());
                stmt.setString(3, hardware.getModel());
                stmt.executeUpdate();

                // Insert into RAM table
                stmt = conn.prepareStatement(
                    "INSERT INTO " + TABLE_RAM + " (id_Hw_Ram, frec_Ram, capacidad_Ram, tech_Ram) VALUES (?, ?, ?, ?)"
                );
                stmt.setString(1, supply.getId());
                stmt.setInt(2, hardware.getRamFreq());
                stmt.setInt(3, hardware.getRamCapacity());
                stmt.setString(4, hardware.getRamTech());
                stmt.executeUpdate();

            } else {
                // Update SUPPLY table
                stmt = conn.prepareStatement(
                    "UPDATE " + TABLE_SUPPLY + " SET descripcion_Ins = ?, precio_Ins = ?, precioBase_Ins = ? WHERE id_Ins = ?"
                );
                stmt.setString(1, supply.getDescription());
                stmt.setDouble(2, supply.getPrice());
                stmt.setDouble(3, supply.getBasePrice());
                stmt.setString(4, supply.getId());
                stmt.executeUpdate();

                // Update HARDWARE table
                stmt = conn.prepareStatement(
                    "UPDATE " + TABLE_HARDWARE + " SET marca_Hw = ?, modelo_Hw = ? WHERE id_Ins = ?"
                );
                stmt.setString(1, hardware.getBrand());
                stmt.setString(2, hardware.getModel());
                stmt.setString(3, supply.getId());
                stmt.executeUpdate();

                // Update RAM table
                stmt = conn.prepareStatement(
                    "UPDATE " + TABLE_RAM + " SET frec_Ram = ?, capacidad_Ram = ?, tech_Ram = ? WHERE id_Ins = ?"
                );
                stmt.setInt(1, hardware.getRamFreq());
                stmt.setInt(2, hardware.getRamCapacity());
                stmt.setString(3, hardware.getRamTech());
                stmt.setString(4, supply.getId());
                stmt.executeUpdate();
            }
        } catch (SQLException ex) {
            throw new SQLException(ex);
        }
    }

    public void deleteSupply(Connection conn, Supply supply) throws SQLException {
        try {
            PreparedStatement stmt = conn.prepareStatement(
                "DELETE FROM " + TABLE_SUPPLY + " WHERE id_Ins = ?"
            );
            stmt.setString(1, supply.getId());
            stmt.executeUpdate();
        } catch (SQLException ex) {
            throw new SQLException(ex);
        }
    }
}
