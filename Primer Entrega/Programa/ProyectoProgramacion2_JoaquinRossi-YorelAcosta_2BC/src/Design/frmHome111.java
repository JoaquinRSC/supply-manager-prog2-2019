
package Design;
import Logica.*;
import java.beans.PropertyVetoException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;

public class frmHome111 extends javax.swing.JFrame {
//Variables para almacenar los valores de los Spn
//Consejo: Mirar metodos stateChanged de los JSpinner
    
//En elos stateChanged se toma el valor y se almacena
//  en estas variables para luego usarlas en otros controles

    //MEMORIA RAM:
    private String valorSpnMemRAM1 = ""; //Espacio asignado para Frecuencia
    private String valorSpnMemRAM2 = ""; //Espacio asignado para Capacidad
    

    
//INSUMO HARDWARE:    
    //Modelo para cada tabla de Ingreso y Muestra de Insumos
    //El tipo de INS define a cada Modelo, ya que se tiene
    //1 Modelo por Tipo Ins, o sea, 1 Tabla por tipo de Ins
    DefaultTableModel ModelHW1 = new DefaultTableModel();
    DefaultTableModel ModelHW2 = new DefaultTableModel();
    DefaultTableModel ModelHW3 = new DefaultTableModel();
    DefaultTableModel ModelHW4 = new DefaultTableModel();
    DefaultTableModel ModelHW5 = new DefaultTableModel();
    DefaultTableModel ModelHW6 = new DefaultTableModel();
    DefaultTableModel ModelHW7 = new DefaultTableModel();
    
//INSUMO SOFTWARE:     
    //Solo se requiere una tabla para agregar y modificar
    //los datos de los Ins Software
    DefaultTableModel ModelSO1 = new DefaultTableModel();    
    
//COLUMNAS DE TABLAS:    
    //INSUMO HARDWARE:
            //Columnas para la JTable MemRAM
            String [] colsHW1 = {
                "ID",
                "MARCA",
                "MODELO",
                "DESCRIPCIÓN",
                "FRECUENCIA",
                "CAPACIDAD",
                "PRECIO"
            }; 

            //Columnas para la JTable CPU
            String [] colsHW2 = {
                "ID",
                "MARCA",
                "MODELO",
                "DESCRIPCIÓN",
                "FRECUENCIA",
                "NÚCLEOS",
                "PRECIO"
            }; 

            //Columnas para la JTable Almacenamiento
            String [] colsHW3 = {
                "ID",
                "MARCA",
                "MODELO",
                "DESCRIPCIÓN",
                "CAPACIDAD",
                "TECNOLOGÍA",
                "PRECIO"
            }; 

            //Columnas para la JTable Gabinete
            String [] colsHW4 = {
                "ID",
                "MARCA",
                "MODELO",
                "DESCRIPCIÓN",
                "DIMENSIONES",
                "PRECIO"
            };   

            //Columnas para la JTable Placa Base
            String [] colsHW5 = {
                "ID",
                "MARCA",
                "MODELO",
                "¿ RGB ?",
                "PRECIO"
            };   

            //Columnas para la JTable Grafica
            String [] colsHW6 = {
                "ID",
                "MARCA",
                "MODELO",
                "CAPACIDAD",
                "PRECIO"
            };    

            //Columnas para la JTable Fuente
            String [] colsHW7 = {
                "ID",
                "MARCA",
                "MODELO",
                "CAPACIDAD",
                "PRECIO"
            };     
        //INSUMO SOFTWARE:    

    public frmHome111() {
        initComponents();           
        cambiarContexto(0);

    }// End constructor
    
/*   
    public void cambiarPnlHW(int i, JPanel pnl){
        //Metodo para setear img seleccionado de los btn Ins HW

        //Se carga el Panel  Tipo Ins correspondiente para Agregar Eliminar y Modificar
        //los datos de ese tipo de Ins
        lyredPane_TipoIns.removeAll();
        lyredPane_TipoIns.add(pnl);
        lyredPane_TipoIns.repaint();
        lyredPane_TipoIns.revalidate();
        
        switch (i) {
           case 0:
               //Se pinta los botones, se selecciona el 1 y el resto se deselecciona
               btnMemoriaRAM.setIcon(new ImageIcon(getClass().getResource("/Img/memRAM_selected1.png")));
               btnCPU.setIcon(new ImageIcon(getClass().getResource("/Img/cpu_selected0.png")));
               btnDsk.setIcon(new ImageIcon(getClass().getResource("/Img/dsk_selected0.png")));
               btnGab.setIcon(new ImageIcon(getClass().getResource("/Img/gab_selected0.png")));
               btnMb.setIcon(new ImageIcon(getClass().getResource("/Img/mb_selected0.png")));
               btnGPU.setIcon(new ImageIcon(getClass().getResource("/Img/memG_selected0.png")));
               btnSupply.setIcon(new ImageIcon(getClass().getResource("/Img/supply_selected0.png")));
               break;
           case 1:
               //Se pinta los botones, se selecciona el 2 y el resto se deselecciona
               btnMemoriaRAM.setIcon(new ImageIcon(getClass().getResource("/Img/memRAM_selected0.png")));
               btnCPU.setIcon(new ImageIcon(getClass().getResource("/Img/cpu_selected1.png")));
               btnDsk.setIcon(new ImageIcon(getClass().getResource("/Img/dsk_selected0.png")));
               btnGab.setIcon(new ImageIcon(getClass().getResource("/Img/gab_selected0.png")));
               btnMb.setIcon(new ImageIcon(getClass().getResource("/Img/mb_selected0.png")));
               btnGPU.setIcon(new ImageIcon(getClass().getResource("/Img/memG_selected0.png")));
               btnSupply.setIcon(new ImageIcon(getClass().getResource("/Img/supply_selected0.png")));
               break;    
           case 2:
               //Se pinta los botones, se selecciona el 3 y el resto se deselecciona
               btnMemoriaRAM.setIcon(new ImageIcon(getClass().getResource("/Img/memRAM_selected0.png")));
               btnCPU.setIcon(new ImageIcon(getClass().getResource("/Img/cpu_selected0.png")));
               btnDsk.setIcon(new ImageIcon(getClass().getResource("/Img/dsk_selected1.png")));
               btnGab.setIcon(new ImageIcon(getClass().getResource("/Img/gab_selected0.png")));
               btnMb.setIcon(new ImageIcon(getClass().getResource("/Img/mb_selected0.png")));
               btnGPU.setIcon(new ImageIcon(getClass().getResource("/Img/memG_selected0.png")));
               btnSupply.setIcon(new ImageIcon(getClass().getResource("/Img/supply_selected0.png")));
               break; 
           case 3:
               //Se pinta los botones, se selecciona el 4 y el resto se deselecciona
               btnMemoriaRAM.setIcon(new ImageIcon(getClass().getResource("/Img/memRAM_selected0.png")));
               btnCPU.setIcon(new ImageIcon(getClass().getResource("/Img/cpu_selected0.png")));
               btnDsk.setIcon(new ImageIcon(getClass().getResource("/Img/dsk_selected0.png")));
               btnGab.setIcon(new ImageIcon(getClass().getResource("/Img/gab_selected1.png")));
               btnMb.setIcon(new ImageIcon(getClass().getResource("/Img/mb_selected0.png")));
               btnGPU.setIcon(new ImageIcon(getClass().getResource("/Img/memG_selected0.png")));
               btnSupply.setIcon(new ImageIcon(getClass().getResource("/Img/supply_selected0.png")));
               break;     
           case 4:
               //Se pinta los botones, se selecciona el 5 y el resto se deselecciona
               btnMemoriaRAM.setIcon(new ImageIcon(getClass().getResource("/Img/memRAM_selected0.png")));
               btnCPU.setIcon(new ImageIcon(getClass().getResource("/Img/cpu_selected0.png")));
               btnDsk.setIcon(new ImageIcon(getClass().getResource("/Img/dsk_selected0.png")));
               btnGab.setIcon(new ImageIcon(getClass().getResource("/Img/gab_selected0.png")));
               btnMb.setIcon(new ImageIcon(getClass().getResource("/Img/mb_selected1.png")));
               btnGPU.setIcon(new ImageIcon(getClass().getResource("/Img/memG_selected0.png")));
               btnSupply.setIcon(new ImageIcon(getClass().getResource("/Img/supply_selected0.png")));
               break;    
           case 5:
               //Se pinta los botones, se selecciona el 6 y el resto se deselecciona
               btnMemoriaRAM.setIcon(new ImageIcon(getClass().getResource("/Img/memRAM_selected0.png")));
               btnCPU.setIcon(new ImageIcon(getClass().getResource("/Img/cpu_selected0.png")));
               btnDsk.setIcon(new ImageIcon(getClass().getResource("/Img/dsk_selected0.png")));
               btnGab.setIcon(new ImageIcon(getClass().getResource("/Img/gab_selected0.png")));
               btnMb.setIcon(new ImageIcon(getClass().getResource("/Img/mb_selected0.png")));
               btnGPU.setIcon(new ImageIcon(getClass().getResource("/Img/memG_selected1.png")));
               btnSupply.setIcon(new ImageIcon(getClass().getResource("/Img/supply_selected0.png")));
               break;                 
           case 6:
               //Se pinta los botones, se selecciona el 7 y el resto se deselecciona
               btnMemoriaRAM.setIcon(new ImageIcon(getClass().getResource("/Img/memRAM_selected0.png")));
               btnCPU.setIcon(new ImageIcon(getClass().getResource("/Img/cpu_selected0.png")));
               btnDsk.setIcon(new ImageIcon(getClass().getResource("/Img/dsk_selected0.png")));
               btnGab.setIcon(new ImageIcon(getClass().getResource("/Img/gab_selected0.png")));
               btnMb.setIcon(new ImageIcon(getClass().getResource("/Img/mb_selected0.png")));
               btnGPU.setIcon(new ImageIcon(getClass().getResource("/Img/memG_selected0.png")));
               btnSupply.setIcon(new ImageIcon(getClass().getResource("/Img/supply_selected1.png")));
               break;
            default:
               btnMemoriaRAM.setIcon(new ImageIcon(getClass().getResource("/Img/memRAM_selected1.png")));
               btnCPU.setIcon(new ImageIcon(getClass().getResource("/Img/cpu_selected0.png")));
               btnDsk.setIcon(new ImageIcon(getClass().getResource("/Img/dsk_selected0.png")));
               btnGab.setIcon(new ImageIcon(getClass().getResource("/Img/gab_selected0.png")));
               btnMb.setIcon(new ImageIcon(getClass().getResource("/Img/mb_selected0.png")));
               btnGPU.setIcon(new ImageIcon(getClass().getResource("/Img/memG_selected0.png")));
               btnSupply.setIcon(new ImageIcon(getClass().getResource("/Img/supply_selected0.png")));                
               break;
       }            

        
    }// End method
*/
    public void cambiarContexto(int i){
        //Metodo para cambiar el contexto dependiendo lo que quiera ver o hacer el user
        switch (i) {
            case 0: // Referencia al Panel Inicio
                intFrm_HW.setVisible(false);
                intFrm_HW.setEnabled(false);
                intFrm_SO.setVisible(false);
                intFrm_SO.setEnabled(false);
                intFrm_PC.setVisible(false);
                intFrm_PC.setEnabled(false);
                intFrm_Red.setVisible(false);
                intFrm_Red.setEnabled(false);
                
                intFrm_Inicio.setVisible(true);
                intFrm_Inicio.setEnabled(true);
                try {
                    intFrm_Inicio.setSelected(true);
                } catch (PropertyVetoException ex) {
                    Logger.getLogger(frmHome111.class.getName()).log(Level.SEVERE, null, ex);
                }
        
                break;
            case 1: // Referencia al Panel Insumo Hardware
                intFrm_Inicio.setVisible(false);
                intFrm_Inicio.setEnabled(false);
                intFrm_SO.setVisible(false);
                intFrm_SO.setEnabled(false);
                intFrm_PC.setVisible(false);
                intFrm_PC.setEnabled(false);
                intFrm_Red.setVisible(false);
                intFrm_Red.setEnabled(false);
                
                intFrm_HW.setVisible(true);
                intFrm_HW.setEnabled(true);
                break;
            case 2: // Referencia al Panel Insumo Software
                intFrm_Inicio.setVisible(false);
                intFrm_Inicio.setEnabled(false);
                intFrm_HW.setVisible(false);
                intFrm_HW.setEnabled(false);
                intFrm_PC.setVisible(false);
                intFrm_PC.setEnabled(false);
                intFrm_Red.setVisible(false);
                intFrm_Red.setEnabled(false);
                
                intFrm_SO.setVisible(true);
                intFrm_SO.setEnabled(true);
                break;
            case 3: // Referencia al Panel Armado PC
                intFrm_Inicio.setVisible(false);
                intFrm_Inicio.setEnabled(false);
                intFrm_HW.setVisible(false);
                intFrm_HW.setEnabled(false);
                intFrm_SO.setVisible(false);
                intFrm_SO.setEnabled(false);
                intFrm_Red.setVisible(false);
                intFrm_Red.setEnabled(false);
                
                intFrm_PC.setVisible(true);
                intFrm_PC.setEnabled(true);
                break;
            case 4: // Referencia al Panel Armado Red
                intFrm_Inicio.setVisible(false);
                intFrm_Inicio.setEnabled(false);
                intFrm_HW.setVisible(false);
                intFrm_HW.setEnabled(false);
                intFrm_SO.setVisible(false);
                intFrm_SO.setEnabled(false);
                intFrm_PC.setVisible(false);
                intFrm_PC.setEnabled(false);
                
                intFrm_Red.setVisible(true);
                intFrm_Red.setEnabled(true);
                break;
        }//End SW (i)
    }
    public boolean verificaErrorDato(int l){
        /* 
           Metodo para verificar si existe algun error en los campos
           de texto. Se espera un int para indicar que tipo de
           error tiene que buscar, si estamos en MemRAM, entonces
           buscara errores en los campos de txt para almacenar una memoria ram
        */
        boolean error = false;
        switch (l) {
            case 0: //Busqueda de error en MemoriaRAM
                String [] valoresTxtField = {
                    txtIDRAM.getText(),
                    txtTechRAM.getText(),
                    txtDescripcionRAM.getText(),
                    txtMarcaRAM1.getText(),
                    txtPrecioRAM.getText(),
                    txtModeloRAM.getText()
                };
                
                //LEA BIEN! valorTxtField != valoresTxtField
                //             VARIABLE   !=     ARRAY
                
                for ( int i=0 ; i<valoresTxtField.length ; i++) {
                    String valorTxtField = valoresTxtField[i];
                    int pos = 1;
                    if (i == 4) {
                    //El 4 en "i" indica el precio de la memRAM, el precio es un valor double, por lo tanto
                    //se puede esperar un punto, entonces se omite la búsqueda de error en este caso
                        i++;
                        valorTxtField = valoresTxtField[i];
                    }

                    try {
                        for ( int n=0 ; n<valorTxtField.length() ; n++) {
                            char valorPos = valorTxtField.charAt(pos);
                            if ( valorPos == '.' || valorPos == ',' ) {                      
                                error = true;
                                switch (i) {
                                    case 0:
                                       txtIDRAM.setText(" ! ");
                                       lblIntroText8.setIcon(new ImageIcon(getClass().getResource("/Img/introTxt_selected1-E.png")));
                                       break;
                                    case 1:
                                        txtDescripcionRAM.setText(" Dato inválido");
                                        lblIntroText7.setIcon(new ImageIcon(getClass().getResource("/Img/introTxt_selected1-E.png")));
                                        break;
                                    case 2:
                                        txtTechRAM.setText(" Dato inválido");
                                        lblIntroText4.setIcon(new ImageIcon(getClass().getResource("/Img/introTxt_selected1-E.png")));
                                        break;                                
                                    case 3:
                                        txtModeloRAM.setText(" Dato inválido");
                                        lblIntroText3.setIcon(new ImageIcon(getClass().getResource("/Img/introTxt_selected1-E.png")));
                                        break;
                                    case 5:
                                        txtMarcaRAM1.setText(" Dato inválido");
                                        lblIntroText1.setIcon(new ImageIcon(getClass().getResource("/Img/introTxt_selected1-E.png")));
                                        break;
                                }//End SW (i)
                            }//End Condicional 
                            pos = pos + 1;                                    
                        } //End Loop (n)
                    } catch (Exception e) {
                    }
                } //End Loop (i)
                
                for (int i=0 ; i<valoresTxtField.length ; i++) {
                    switch (valoresTxtField[i]) {
                        case " 0000":
                            error = true;
                            txtIDRAM.setText(" ! ");
                            lblIntroText8.setIcon(new ImageIcon(getClass().getResource("/Img/introTxt_selected1-E.png")));
                            break;
                        case " Ejemplo: DDR3":
                            error = true;
                            txtTechRAM.setText(" Dato inválido");
                            lblIntroText4.setIcon(new ImageIcon(getClass().getResource("/Img/introTxt_selected1-E.png")));
                            break;
                        case " Ejemplo: MSI":
                            error = true;
                            txtMarcaRAM1.setText(" Dato inválido");
                            lblIntroText1.setIcon(new ImageIcon(getClass().getResource("/Img/introTxt_selected1-E.png")));
                            break;
                        case " En US$":
                            error = true;
                            txtPrecioRAM.setText(" Dato inválido");
                            lblIntroText2.setIcon(new ImageIcon(getClass().getResource("/Img/introTxt_selected1-E.png")));
                            break;
                        case " Ejemplo: X370M":
                            error = true;
                            txtModeloRAM.setText(" Dato inválido");
                            lblIntroText3.setIcon(new ImageIcon(getClass().getResource("/Img/introTxt_selected1-E.png")));
                            break;                           
                    }//End SW (valoresTxtField[i])
                }//End Loop (i)
                break;
            case 1: //Busqueda de error en CPU
                
                break;
            case 2: //Busqueda de error en Almacenamiento
                break;
            case 3: //Busqueda de error en Gabinetes
                break;
            case 4: //Busqueda de error en Placa Base
                break;
            case 5: //Busqueda de error en Tarjeta Grafica
                break;
            case 6: //Busqueda de error en Fuente de Poder
                break;                
        }// End SW (l)

        
        return error;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlLateral = new javax.swing.JPanel();
        jSeparator5 = new javax.swing.JSeparator();
        lblPresupuesto = new javax.swing.JLabel();
        lblMenu = new javax.swing.JLabel();
        lblIns = new javax.swing.JLabel();
        btnLateralInicio = new javax.swing.JButton();
        btnLateralSO = new javax.swing.JButton();
        btnLateralHW = new javax.swing.JButton();
        btnLateralSalir = new javax.swing.JButton();
        btnLateralArmadoPC = new javax.swing.JButton();
        btnLateralRed = new javax.swing.JButton();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator19 = new javax.swing.JSeparator();
        jSeparator20 = new javax.swing.JSeparator();
        jSeparator21 = new javax.swing.JSeparator();
        lblIns1 = new javax.swing.JLabel();
        pnlEstado = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        pnlContexto = new javax.swing.JPanel();
        btnExit = new javax.swing.JButton();
        btnMinimizate = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        EscondePestania1 = new javax.swing.JLabel();
        intFrm_HW = new javax.swing.JInternalFrame();
        pnlContextoInsHW = new javax.swing.JPanel();
        EscondePestania = new javax.swing.JLabel();
        pnlHW_Titulo = new javax.swing.JPanel();
        lblTituloPestania = new javax.swing.JLabel();
        lblSubTituloPestania = new javax.swing.JLabel();
        btnMemoriaRAM = new javax.swing.JButton();
        btnCPU = new javax.swing.JButton();
        btnDsk = new javax.swing.JButton();
        btnGab = new javax.swing.JButton();
        btnMb = new javax.swing.JButton();
        btnGPU = new javax.swing.JButton();
        btnSupply = new javax.swing.JButton();
        btnAyuda1 = new javax.swing.JButton();
        intFrm_RAM = new javax.swing.JInternalFrame();
        pnlRAM = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnAyuda = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        txtResultMass3 = new javax.swing.JTextField();
        txtIDRAM = new javax.swing.JTextField();
        lblIntroText8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        lblIntroText0 = new javax.swing.JLabel();
        txtDescripcionRAM = new javax.swing.JTextField();
        lblIntroText7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        spnFrecRAM = new javax.swing.JSpinner();
        lblIntroText6 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        spnCapacidadRAM = new javax.swing.JSpinner();
        lblIntroText5 = new javax.swing.JLabel();
        lblIntroText1 = new javax.swing.JLabel();
        txtModeloRAM = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        lblIntroText2 = new javax.swing.JLabel();
        txtPrecioRAM = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        lblIntroText3 = new javax.swing.JLabel();
        txtMarcaRAM1 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        lblIntroText4 = new javax.swing.JLabel();
        txtTechRAM = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        btnAddRAM = new javax.swing.JButton();
        btnEditRAM = new javax.swing.JButton();
        btnRmRAM = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblMemRAM = new javax.swing.JTable();
        jSeparator8 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator13 = new javax.swing.JSeparator();
        jSeparator12 = new javax.swing.JSeparator();
        jSeparator14 = new javax.swing.JSeparator();
        jSeparator15 = new javax.swing.JSeparator();
        intFrm_CPU = new javax.swing.JInternalFrame();
        intFrm_Dsk = new javax.swing.JInternalFrame();
        intFrm_Gab = new javax.swing.JInternalFrame();
        intFrm_MB = new javax.swing.JInternalFrame();
        intFrm_GPU = new javax.swing.JInternalFrame();
        intFrm_Supply = new javax.swing.JInternalFrame();
        intFrm_Inicio = new javax.swing.JInternalFrame();
        pnlContextoInicio = new javax.swing.JPanel();
        intFrm_SO = new javax.swing.JInternalFrame();
        intFrm_PC = new javax.swing.JInternalFrame();
        intFrm_Red = new javax.swing.JInternalFrame();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlLateral.setBackground(new java.awt.Color(244, 246, 243));
        pnlLateral.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jSeparator5.setBackground(new java.awt.Color(210, 210, 210));
        jSeparator5.setForeground(new java.awt.Color(210, 210, 210));
        jSeparator5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 0));
        pnlLateral.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 290, 10));

        lblPresupuesto.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 13)); // NOI18N
        lblPresupuesto.setForeground(new java.awt.Color(130, 134, 125));
        lblPresupuesto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPresupuesto.setText("PRESUPUESTO");
        pnlLateral.add(lblPresupuesto, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, -1, 30));

        lblMenu.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 13)); // NOI18N
        lblMenu.setForeground(new java.awt.Color(130, 134, 125));
        lblMenu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMenu.setText("MENU");
        pnlLateral.add(lblMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, -1, 30));

        lblIns.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 13)); // NOI18N
        lblIns.setForeground(new java.awt.Color(130, 134, 125));
        lblIns.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblIns.setText("CERRAR");
        pnlLateral.add(lblIns, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 580, -1, 30));

        btnLateralInicio.setBackground(new java.awt.Color(254, 254, 254));
        btnLateralInicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/home_selected0.png"))); // NOI18N
        btnLateralInicio.setBorder(null);
        btnLateralInicio.setBorderPainted(false);
        btnLateralInicio.setContentAreaFilled(false);
        btnLateralInicio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLateralInicio.setDefaultCapable(false);
        btnLateralInicio.setFocusPainted(false);
        btnLateralInicio.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/home_selected1.png"))); // NOI18N
        btnLateralInicio.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/home_selected0.png"))); // NOI18N
        btnLateralInicio.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/home_selected1.png"))); // NOI18N
        btnLateralInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLateralInicioActionPerformed(evt);
            }
        });
        pnlLateral.add(btnLateralInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, 180, 40));

        btnLateralSO.setBackground(new java.awt.Color(254, 254, 254));
        btnLateralSO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/insSW_selected0.png"))); // NOI18N
        btnLateralSO.setBorder(null);
        btnLateralSO.setBorderPainted(false);
        btnLateralSO.setContentAreaFilled(false);
        btnLateralSO.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLateralSO.setDefaultCapable(false);
        btnLateralSO.setFocusPainted(false);
        btnLateralSO.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/insSW_selected1.png"))); // NOI18N
        btnLateralSO.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/insSW_selected0.png"))); // NOI18N
        btnLateralSO.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/insSW_selected1.png"))); // NOI18N
        btnLateralSO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLateralSOActionPerformed(evt);
            }
        });
        pnlLateral.add(btnLateralSO, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, 180, 40));

        btnLateralHW.setBackground(new java.awt.Color(254, 254, 254));
        btnLateralHW.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/insHW_selected0.png"))); // NOI18N
        btnLateralHW.setBorder(null);
        btnLateralHW.setBorderPainted(false);
        btnLateralHW.setContentAreaFilled(false);
        btnLateralHW.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLateralHW.setDefaultCapable(false);
        btnLateralHW.setFocusPainted(false);
        btnLateralHW.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/insHW_selected1.png"))); // NOI18N
        btnLateralHW.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/insHW_selected0.png"))); // NOI18N
        btnLateralHW.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/insHW_selected1.png"))); // NOI18N
        btnLateralHW.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLateralHWActionPerformed(evt);
            }
        });
        pnlLateral.add(btnLateralHW, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 180, 40));

        btnLateralSalir.setBackground(new java.awt.Color(254, 254, 254));
        btnLateralSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/exit_selected0.png"))); // NOI18N
        btnLateralSalir.setBorder(null);
        btnLateralSalir.setBorderPainted(false);
        btnLateralSalir.setContentAreaFilled(false);
        btnLateralSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLateralSalir.setDefaultCapable(false);
        btnLateralSalir.setFocusPainted(false);
        btnLateralSalir.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/exit_selected1.png"))); // NOI18N
        btnLateralSalir.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/exit_selected0.png"))); // NOI18N
        btnLateralSalir.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/exit_selected1.png"))); // NOI18N
        btnLateralSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLateralSalirActionPerformed(evt);
            }
        });
        pnlLateral.add(btnLateralSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 620, 180, 40));

        btnLateralArmadoPC.setBackground(new java.awt.Color(254, 254, 254));
        btnLateralArmadoPC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/presupuestoPC_selected0.png"))); // NOI18N
        btnLateralArmadoPC.setBorder(null);
        btnLateralArmadoPC.setBorderPainted(false);
        btnLateralArmadoPC.setContentAreaFilled(false);
        btnLateralArmadoPC.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLateralArmadoPC.setDefaultCapable(false);
        btnLateralArmadoPC.setFocusPainted(false);
        btnLateralArmadoPC.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/presupuestoPC_selected1.png"))); // NOI18N
        btnLateralArmadoPC.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/presupuestoPC_selected0.png"))); // NOI18N
        btnLateralArmadoPC.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/presupuestoPC_selected1.png"))); // NOI18N
        btnLateralArmadoPC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLateralArmadoPCActionPerformed(evt);
            }
        });
        pnlLateral.add(btnLateralArmadoPC, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 350, 180, 40));

        btnLateralRed.setBackground(new java.awt.Color(254, 254, 254));
        btnLateralRed.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/presupuestoR_selected0.png"))); // NOI18N
        btnLateralRed.setBorder(null);
        btnLateralRed.setBorderPainted(false);
        btnLateralRed.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLateralRed.setDefaultCapable(false);
        btnLateralRed.setFocusPainted(false);
        btnLateralRed.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/presupuestoR_selected1.png"))); // NOI18N
        btnLateralRed.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/presupuestoR_selected0.png"))); // NOI18N
        btnLateralRed.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/presupuestoR_selected1.png"))); // NOI18N
        btnLateralRed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLateralRedActionPerformed(evt);
            }
        });
        pnlLateral.add(btnLateralRed, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 400, 180, 40));
        pnlLateral.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 610, 180, 10));
        pnlLateral.add(jSeparator19, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, 180, 10));
        pnlLateral.add(jSeparator20, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 180, 10));
        pnlLateral.add(jSeparator21, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 180, 10));

        lblIns1.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 13)); // NOI18N
        lblIns1.setForeground(new java.awt.Color(130, 134, 125));
        lblIns1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblIns1.setText("INSUMO");
        pnlLateral.add(lblIns1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, -1, 30));

        getContentPane().add(pnlLateral, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 260, 700));

        pnlEstado.setBackground(new java.awt.Color(244, 246, 243));
        pnlEstado.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTitulo.setFont(new java.awt.Font("Malgun Gothic", 1, 23)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(105, 105, 105));
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("GESTOR DE INSUMOS");
        lblTitulo.setToolTipText("");
        pnlEstado.add(lblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 260, 50));

        getContentPane().add(pnlEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 260, 50));

        pnlContexto.setBackground(new java.awt.Color(254, 254, 255));
        pnlContexto.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/close-selected0_32.png"))); // NOI18N
        btnExit.setActionCommand("btnExit");
        btnExit.setBorder(null);
        btnExit.setBorderPainted(false);
        btnExit.setContentAreaFilled(false);
        btnExit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnExit.setFocusPainted(false);
        btnExit.setFocusable(false);
        btnExit.setRequestFocusEnabled(false);
        btnExit.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/close-selected1_32.png"))); // NOI18N
        btnExit.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/close-selected0_32.png"))); // NOI18N
        btnExit.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/close-selected0_32.png"))); // NOI18N
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });
        pnlContexto.add(btnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 0, 40, 50));

        btnMinimizate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/minimizar-frame_selected0_32.png"))); // NOI18N
        btnMinimizate.setActionCommand("btnExit");
        btnMinimizate.setBorder(null);
        btnMinimizate.setBorderPainted(false);
        btnMinimizate.setContentAreaFilled(false);
        btnMinimizate.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMinimizate.setFocusPainted(false);
        btnMinimizate.setFocusable(false);
        btnMinimizate.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/minimizar-frame_selected1_32.png"))); // NOI18N
        btnMinimizate.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/minimizar-frame_selected0_32.png"))); // NOI18N
        btnMinimizate.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/minimizar-frame_selected0_32.png"))); // NOI18N
        btnMinimizate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMinimizateActionPerformed(evt);
            }
        });
        pnlContexto.add(btnMinimizate, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 0, 40, 50));

        jSeparator2.setBackground(new java.awt.Color(222, 222, 222));
        jSeparator2.setForeground(new java.awt.Color(222, 222, 222));
        jSeparator2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 0));
        pnlContexto.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 50, 910, 10));

        EscondePestania1.setBackground(new java.awt.Color(254, 254, 255));
        EscondePestania1.setForeground(new java.awt.Color(254, 254, 255));
        EscondePestania1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        EscondePestania1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/fondoBlanco.png"))); // NOI18N
        pnlContexto.add(EscondePestania1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-9, 56, 900, 30));

        intFrm_HW.setBorder(null);
        intFrm_HW.setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        intFrm_HW.setVisible(true);
        intFrm_HW.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlContextoInsHW.setBackground(new java.awt.Color(254, 254, 255));
        pnlContextoInsHW.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        EscondePestania.setBackground(new java.awt.Color(254, 254, 255));
        EscondePestania.setForeground(new java.awt.Color(254, 254, 255));
        EscondePestania.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        EscondePestania.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/fondoBlanco.png"))); // NOI18N
        pnlContextoInsHW.add(EscondePestania, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 900, 30));

        pnlHW_Titulo.setBackground(new java.awt.Color(254, 254, 255));
        pnlHW_Titulo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTituloPestania.setFont(new java.awt.Font("Lucida Sans", 0, 36)); // NOI18N
        lblTituloPestania.setForeground(new java.awt.Color(51, 59, 65));
        lblTituloPestania.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblTituloPestania.setText(" Insumos: Hardware");
        lblTituloPestania.setToolTipText("");
        pnlHW_Titulo.add(lblTituloPestania, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 370, 60));

        lblSubTituloPestania.setBackground(new java.awt.Color(128, 131, 123));
        lblSubTituloPestania.setFont(new java.awt.Font("Lucida Sans", 0, 14)); // NOI18N
        lblSubTituloPestania.setForeground(new java.awt.Color(137, 137, 137));
        lblSubTituloPestania.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSubTituloPestania.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Carga a continuación los Tipos de Insumos a la Tabla.png"))); // NOI18N
        pnlHW_Titulo.add(lblSubTituloPestania, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 340, 30));

        btnMemoriaRAM.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/memRAM_selected1.png"))); // NOI18N
        btnMemoriaRAM.setBorderPainted(false);
        btnMemoriaRAM.setContentAreaFilled(false);
        btnMemoriaRAM.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMemoriaRAM.setFocusPainted(false);
        btnMemoriaRAM.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/memRAM_selected1.png"))); // NOI18N
        btnMemoriaRAM.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/memRAM_selected0.png"))); // NOI18N
        btnMemoriaRAM.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/memRAM_selected0.png"))); // NOI18N
        btnMemoriaRAM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMemoriaRAMActionPerformed(evt);
            }
        });
        pnlHW_Titulo.add(btnMemoriaRAM, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 90, 50));

        btnCPU.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/cpu_selected0.png"))); // NOI18N
        btnCPU.setBorderPainted(false);
        btnCPU.setContentAreaFilled(false);
        btnCPU.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCPU.setFocusPainted(false);
        btnCPU.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/cpu_selected1.png"))); // NOI18N
        btnCPU.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/cpu_selected0.png"))); // NOI18N
        btnCPU.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/cpu_selected0.png"))); // NOI18N
        btnCPU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCPUActionPerformed(evt);
            }
        });
        pnlHW_Titulo.add(btnCPU, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 90, 90, 50));

        btnDsk.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/dsk_selected0.png"))); // NOI18N
        btnDsk.setBorderPainted(false);
        btnDsk.setContentAreaFilled(false);
        btnDsk.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDsk.setFocusPainted(false);
        btnDsk.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/dsk_selected1.png"))); // NOI18N
        btnDsk.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/dsk_selected0.png"))); // NOI18N
        btnDsk.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/dsk_selected0.png"))); // NOI18N
        btnDsk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDskActionPerformed(evt);
            }
        });
        pnlHW_Titulo.add(btnDsk, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 90, 90, 50));

        btnGab.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/gab_selected0.png"))); // NOI18N
        btnGab.setBorderPainted(false);
        btnGab.setContentAreaFilled(false);
        btnGab.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGab.setFocusPainted(false);
        btnGab.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/gab_selected1.png"))); // NOI18N
        btnGab.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/gab_selected0.png"))); // NOI18N
        btnGab.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/gab_selected0.png"))); // NOI18N
        btnGab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGabActionPerformed(evt);
            }
        });
        pnlHW_Titulo.add(btnGab, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 90, 90, 50));

        btnMb.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/mb_selected0.png"))); // NOI18N
        btnMb.setBorderPainted(false);
        btnMb.setContentAreaFilled(false);
        btnMb.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMb.setFocusPainted(false);
        btnMb.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/mb_selected1.png"))); // NOI18N
        btnMb.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/memG_selected0.png"))); // NOI18N
        btnMb.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/mb_selected0.png"))); // NOI18N
        btnMb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMbActionPerformed(evt);
            }
        });
        pnlHW_Titulo.add(btnMb, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 90, 90, 50));

        btnGPU.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/memG_selected0.png"))); // NOI18N
        btnGPU.setBorderPainted(false);
        btnGPU.setContentAreaFilled(false);
        btnGPU.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGPU.setFocusPainted(false);
        btnGPU.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/memG_selected1.png"))); // NOI18N
        btnGPU.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/memG_selected0.png"))); // NOI18N
        btnGPU.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/memG_selected0.png"))); // NOI18N
        btnGPU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGPUActionPerformed(evt);
            }
        });
        pnlHW_Titulo.add(btnGPU, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 90, 90, 50));

        btnSupply.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/supply_selected0.png"))); // NOI18N
        btnSupply.setBorderPainted(false);
        btnSupply.setContentAreaFilled(false);
        btnSupply.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSupply.setFocusPainted(false);
        btnSupply.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/supply_selected1.png"))); // NOI18N
        btnSupply.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/supply_selected0.png"))); // NOI18N
        btnSupply.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/supply_selected0.png"))); // NOI18N
        btnSupply.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSupplyActionPerformed(evt);
            }
        });
        pnlHW_Titulo.add(btnSupply, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 90, 90, 50));

        btnAyuda1.setBackground(new java.awt.Color(229, 229, 229));
        btnAyuda1.setForeground(new java.awt.Color(229, 229, 229));
        btnAyuda1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/help_selected0.png"))); // NOI18N
        btnAyuda1.setToolTipText("Pulsa uno de los botones");
        btnAyuda1.setBorderPainted(false);
        btnAyuda1.setContentAreaFilled(false);
        btnAyuda1.setDefaultCapable(false);
        btnAyuda1.setFocusPainted(false);
        btnAyuda1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/help_selected1.png"))); // NOI18N
        btnAyuda1.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/help_selected0.png"))); // NOI18N
        btnAyuda1.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/help_selected0.png"))); // NOI18N
        pnlHW_Titulo.add(btnAyuda1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 60, 20, 30));

        pnlContextoInsHW.add(pnlHW_Titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 890, 150));

        intFrm_RAM.setBackground(new java.awt.Color(254, 254, 255));
        intFrm_RAM.setBorder(null);
        intFrm_RAM.setForeground(new java.awt.Color(254, 254, 255));
        intFrm_RAM.setFocusable(false);
        intFrm_RAM.setVisible(true);
        intFrm_RAM.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlRAM.setBackground(new java.awt.Color(254, 254, 255));
        pnlRAM.setForeground(new java.awt.Color(254, 254, 255));
        pnlRAM.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Lucida Sans", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 59, 65));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Ingreso: Memoria R.A.M.");
        jLabel1.setToolTipText("");
        pnlRAM.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 300, 40));

        btnAyuda.setBackground(new java.awt.Color(229, 229, 229));
        btnAyuda.setForeground(new java.awt.Color(229, 229, 229));
        btnAyuda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/help_selected0.png"))); // NOI18N
        btnAyuda.setToolTipText("Los datos se mostrarán en la tabla.");
        btnAyuda.setBorderPainted(false);
        btnAyuda.setContentAreaFilled(false);
        btnAyuda.setDefaultCapable(false);
        btnAyuda.setFocusPainted(false);
        btnAyuda.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/help_selected1.png"))); // NOI18N
        btnAyuda.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/help_selected0.png"))); // NOI18N
        btnAyuda.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/help_selected0.png"))); // NOI18N
        pnlRAM.add(btnAyuda, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 40, 20, 30));

        jLabel3.setBackground(new java.awt.Color(128, 131, 123));
        jLabel3.setFont(new java.awt.Font("Lucida Sans", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(137, 137, 137));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Carga los datos para almacenar un nuevo Insumo..png"))); // NOI18N
        pnlRAM.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, 300, 30));

        jLabel18.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 12)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(70, 176, 74));
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("ID Memoria:");
        pnlRAM.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 100, 70, 20));

        txtResultMass3.setEditable(false);
        txtResultMass3.setBackground(new java.awt.Color(254, 254, 255));
        txtResultMass3.setForeground(new java.awt.Color(51, 59, 65));
        txtResultMass3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtResultMass3.setText("1AAA");
        txtResultMass3.setBorder(null);
        txtResultMass3.setEnabled(false);
        pnlRAM.add(txtResultMass3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 120, 50, 30));

        txtIDRAM.setBackground(new java.awt.Color(254, 254, 255));
        txtIDRAM.setForeground(new java.awt.Color(51, 59, 65));
        txtIDRAM.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtIDRAM.setText(" 0000");
        txtIDRAM.setBorder(null);
        txtIDRAM.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtIDRAMMousePressed(evt);
            }
        });
        pnlRAM.add(txtIDRAM, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 120, -1, 30));

        lblIntroText8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/introTxt_selected1.png"))); // NOI18N
        lblIntroText8.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        pnlRAM.add(lblIntroText8, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 150, 30, 10));

        jLabel9.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(70, 176, 74));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Descripcion:");
        pnlRAM.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 160, 70, 20));

        lblIntroText0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/introTxt_selected1.png"))); // NOI18N
        lblIntroText0.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        pnlRAM.add(lblIntroText0, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 150, 50, 10));

        txtDescripcionRAM.setEditable(false);
        txtDescripcionRAM.setBackground(new java.awt.Color(254, 254, 255));
        txtDescripcionRAM.setForeground(new java.awt.Color(51, 59, 65));
        txtDescripcionRAM.setText(" Memoria RAM");
        txtDescripcionRAM.setBorder(null);
        txtDescripcionRAM.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtDescripcionRAMMousePressed(evt);
            }
        });
        pnlRAM.add(txtDescripcionRAM, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 180, 90, 30));

        lblIntroText7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/introTxt_selected1.png"))); // NOI18N
        lblIntroText7.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        pnlRAM.add(lblIntroText7, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 210, 90, 10));

        jLabel10.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(70, 176, 74));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Frecuencia:");
        pnlRAM.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 230, 70, 20));

        spnFrecRAM.setModel(new javax.swing.SpinnerListModel(new String[] {"1600 MHz", "1866 MHz", "2400 MHz", "2666 MHz", "3000 MHz"}));
        spnFrecRAM.setBorder(null);
        spnFrecRAM.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spnFrecRAMStateChanged(evt);
            }
        });
        pnlRAM.add(spnFrecRAM, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 250, 90, 30));

        lblIntroText6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/introTxt_selected1.png"))); // NOI18N
        lblIntroText6.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        pnlRAM.add(lblIntroText6, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 280, 90, 10));

        jLabel11.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(70, 176, 74));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Capacidad:");
        pnlRAM.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 300, 90, -1));

        spnCapacidadRAM.setModel(new javax.swing.SpinnerListModel(new String[] {"4 GB", "8 GB", "16 GB"}));
        spnCapacidadRAM.setBorder(null);
        spnCapacidadRAM.setFocusable(false);
        spnCapacidadRAM.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spnCapacidadRAMStateChanged(evt);
            }
        });
        pnlRAM.add(spnCapacidadRAM, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 320, 90, 30));

        lblIntroText5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/introTxt_selected1.png"))); // NOI18N
        lblIntroText5.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        pnlRAM.add(lblIntroText5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 350, 90, 10));

        lblIntroText1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/introTxt_selected1.png"))); // NOI18N
        lblIntroText1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        pnlRAM.add(lblIntroText1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 350, 90, 10));

        txtModeloRAM.setBackground(new java.awt.Color(254, 254, 255));
        txtModeloRAM.setForeground(new java.awt.Color(51, 59, 65));
        txtModeloRAM.setText(" Ejemplo: X370M");
        txtModeloRAM.setBorder(null);
        txtModeloRAM.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtModeloRAMMousePressed(evt);
            }
        });
        pnlRAM.add(txtModeloRAM, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 320, 90, 30));

        jLabel12.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(70, 176, 74));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText(" Modelo:");
        pnlRAM.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 300, 60, 20));

        lblIntroText2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/introTxt_selected1.png"))); // NOI18N
        lblIntroText2.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        pnlRAM.add(lblIntroText2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 280, 90, 10));

        txtPrecioRAM.setBackground(new java.awt.Color(254, 254, 255));
        txtPrecioRAM.setForeground(new java.awt.Color(51, 59, 65));
        txtPrecioRAM.setText(" En US$");
        txtPrecioRAM.setBorder(null);
        txtPrecioRAM.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtPrecioRAMMousePressed(evt);
            }
        });
        pnlRAM.add(txtPrecioRAM, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 250, 90, 30));

        jLabel8.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(70, 176, 74));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Precio:");
        pnlRAM.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 230, 40, 20));

        lblIntroText3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/introTxt_selected1.png"))); // NOI18N
        lblIntroText3.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        pnlRAM.add(lblIntroText3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 210, 90, 10));

        txtMarcaRAM1.setBackground(new java.awt.Color(254, 254, 255));
        txtMarcaRAM1.setForeground(new java.awt.Color(51, 59, 65));
        txtMarcaRAM1.setText(" Ejemplo: MSI");
        txtMarcaRAM1.setBorder(null);
        txtMarcaRAM1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtMarcaRAM1MousePressed(evt);
            }
        });
        pnlRAM.add(txtMarcaRAM1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 180, 90, 30));

        jLabel14.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(70, 176, 74));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("Marca:");
        pnlRAM.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 160, 40, 20));

        lblIntroText4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/introTxt_selected1.png"))); // NOI18N
        lblIntroText4.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        pnlRAM.add(lblIntroText4, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 150, 90, 10));

        txtTechRAM.setBackground(new java.awt.Color(254, 254, 255));
        txtTechRAM.setForeground(new java.awt.Color(51, 59, 65));
        txtTechRAM.setText(" Ejemplo: DDR3");
        txtTechRAM.setBorder(null);
        txtTechRAM.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtTechRAMMousePressed(evt);
            }
        });
        pnlRAM.add(txtTechRAM, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 120, 90, 30));

        jLabel13.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(70, 176, 74));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Tecnologia:");
        pnlRAM.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 100, 70, 20));

        btnAddRAM.setBackground(new java.awt.Color(229, 229, 229));
        btnAddRAM.setForeground(new java.awt.Color(229, 229, 229));
        btnAddRAM.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/add_selected0_64.png"))); // NOI18N
        btnAddRAM.setToolTipText("Insertar datos");
        btnAddRAM.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(70, 176, 74), 2, true));
        btnAddRAM.setBorderPainted(false);
        btnAddRAM.setContentAreaFilled(false);
        btnAddRAM.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAddRAM.setDefaultCapable(false);
        btnAddRAM.setFocusPainted(false);
        btnAddRAM.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/add_selected1_64.png"))); // NOI18N
        btnAddRAM.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/add_selected0_64.png"))); // NOI18N
        btnAddRAM.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/add_selected0_64.png"))); // NOI18N
        btnAddRAM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddRAMActionPerformed(evt);
            }
        });
        pnlRAM.add(btnAddRAM, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 400, 60, 40));

        btnEditRAM.setBackground(new java.awt.Color(229, 229, 229));
        btnEditRAM.setForeground(new java.awt.Color(229, 229, 229));
        btnEditRAM.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/edit_64.png"))); // NOI18N
        btnEditRAM.setToolTipText("Modificar datos.");
        btnEditRAM.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(70, 176, 74), 2, true));
        btnEditRAM.setBorderPainted(false);
        btnEditRAM.setContentAreaFilled(false);
        btnEditRAM.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEditRAM.setDefaultCapable(false);
        btnEditRAM.setFocusPainted(false);
        pnlRAM.add(btnEditRAM, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 400, 60, 40));

        btnRmRAM.setBackground(new java.awt.Color(229, 229, 229));
        btnRmRAM.setForeground(new java.awt.Color(229, 229, 229));
        btnRmRAM.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/rm_selected0_64.png"))); // NOI18N
        btnRmRAM.setToolTipText("Modificar datos.");
        btnRmRAM.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(70, 176, 74), 2, true));
        btnRmRAM.setBorderPainted(false);
        btnRmRAM.setContentAreaFilled(false);
        btnRmRAM.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRmRAM.setDefaultCapable(false);
        btnRmRAM.setFocusPainted(false);
        btnRmRAM.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/rm_selected1_64.png"))); // NOI18N
        btnRmRAM.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/rm_selected0_64.png"))); // NOI18N
        btnRmRAM.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/rm_selected0_64.png"))); // NOI18N
        pnlRAM.add(btnRmRAM, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 400, 70, 40));

        jLabel17.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 12)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(51, 59, 65));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("Eliminar");
        pnlRAM.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 430, 50, 30));

        jLabel7.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 59, 65));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Editar");
        pnlRAM.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 430, 40, 30));

        jLabel16.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(51, 59, 65));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("Agregar");
        pnlRAM.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 430, 60, 30));

        tblMemRAM.setBackground(new java.awt.Color(254, 254, 255));
        tblMemRAM.setForeground(new java.awt.Color(51, 59, 65));
        tblMemRAM.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6", "Title 7", "Title 8"
            }
        ));
        tblMemRAM.setCellSelectionEnabled(true);
        tblMemRAM.setGridColor(new java.awt.Color(51, 59, 65));
        tblMemRAM.setSelectionBackground(new java.awt.Color(70, 176, 74));
        tblMemRAM.setSelectionForeground(new java.awt.Color(254, 254, 255));
        jScrollPane1.setViewportView(tblMemRAM);

        pnlRAM.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 80, 510, 380));

        jSeparator8.setOrientation(javax.swing.SwingConstants.VERTICAL);
        pnlRAM.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 10, 380));
        pnlRAM.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 460, 340, 20));

        jSeparator13.setOrientation(javax.swing.SwingConstants.VERTICAL);
        pnlRAM.add(jSeparator13, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 80, 10, 380));
        pnlRAM.add(jSeparator12, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 380, 340, 20));
        pnlRAM.add(jSeparator14, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 340, 10));
        pnlRAM.add(jSeparator15, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 370, 340, 10));

        intFrm_RAM.getContentPane().add(pnlRAM, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 920, 480));

        pnlContextoInsHW.add(intFrm_RAM, new org.netbeans.lib.awtextra.AbsoluteConstraints(-70, 152, 1010, 540));

        intFrm_CPU.setBackground(new java.awt.Color(254, 254, 255));
        intFrm_CPU.setBorder(null);
        intFrm_CPU.setVisible(true);
        intFrm_CPU.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        pnlContextoInsHW.add(intFrm_CPU, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 152, 940, 520));

        intFrm_Dsk.setBackground(new java.awt.Color(254, 254, 255));
        intFrm_Dsk.setBorder(null);
        intFrm_Dsk.setVisible(true);
        intFrm_Dsk.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        pnlContextoInsHW.add(intFrm_Dsk, new org.netbeans.lib.awtextra.AbsoluteConstraints(-30, 152, 950, 550));

        intFrm_Gab.setBackground(new java.awt.Color(254, 254, 255));
        intFrm_Gab.setBorder(null);
        intFrm_Gab.setVisible(true);
        intFrm_Gab.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        pnlContextoInsHW.add(intFrm_Gab, new org.netbeans.lib.awtextra.AbsoluteConstraints(-40, 152, 970, 560));

        intFrm_MB.setBackground(new java.awt.Color(254, 254, 255));
        intFrm_MB.setBorder(null);
        intFrm_MB.setVisible(true);
        intFrm_MB.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        pnlContextoInsHW.add(intFrm_MB, new org.netbeans.lib.awtextra.AbsoluteConstraints(-30, 152, 970, 510));

        intFrm_GPU.setBackground(new java.awt.Color(254, 254, 255));
        intFrm_GPU.setBorder(null);
        intFrm_GPU.setVisible(true);
        intFrm_GPU.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        pnlContextoInsHW.add(intFrm_GPU, new org.netbeans.lib.awtextra.AbsoluteConstraints(-40, 152, 970, 510));

        intFrm_Supply.setBackground(new java.awt.Color(254, 254, 255));
        intFrm_Supply.setBorder(null);
        intFrm_Supply.setVisible(true);
        intFrm_Supply.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        pnlContextoInsHW.add(intFrm_Supply, new org.netbeans.lib.awtextra.AbsoluteConstraints(-30, 152, 960, 540));

        intFrm_HW.getContentPane().add(pnlContextoInsHW, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 670));

        pnlContexto.add(intFrm_HW, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 60, 920, 710));

        intFrm_Inicio.setBorder(null);
        intFrm_Inicio.setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        intFrm_Inicio.setVisible(true);
        intFrm_Inicio.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlContextoInicio.setBackground(new java.awt.Color(254, 254, 255));
        pnlContextoInicio.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        intFrm_Inicio.getContentPane().add(pnlContextoInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 890, 640));

        pnlContexto.add(intFrm_Inicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 60, 930, 710));

        intFrm_SO.setBorder(null);
        intFrm_SO.setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        intFrm_SO.setVisible(true);
        intFrm_SO.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        pnlContexto.add(intFrm_SO, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 60, 930, 710));

        intFrm_PC.setBorder(null);
        intFrm_PC.setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        intFrm_PC.setVisible(true);
        intFrm_PC.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        pnlContexto.add(intFrm_PC, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 60, 930, 710));

        intFrm_Red.setBorder(null);
        intFrm_Red.setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        intFrm_Red.setVisible(true);
        intFrm_Red.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        pnlContexto.add(intFrm_Red, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 60, 930, 710));

        getContentPane().add(pnlContexto, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 0, 890, 750));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnMinimizateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMinimizateActionPerformed
        this.setState(frmHome.ICONIFIED);
    }//GEN-LAST:event_btnMinimizateActionPerformed
    
    private void btnMemoriaRAMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMemoriaRAMActionPerformed
        //cambiarPnlHW(0,pnlHW_MemRAM);
    }//GEN-LAST:event_btnMemoriaRAMActionPerformed

    private void btnLateralRedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLateralRedActionPerformed
        cambiarContexto(4);
    }//GEN-LAST:event_btnLateralRedActionPerformed

    private void btnLateralArmadoPCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLateralArmadoPCActionPerformed
        cambiarContexto(3);
    }//GEN-LAST:event_btnLateralArmadoPCActionPerformed

    private void btnLateralSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLateralSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnLateralSalirActionPerformed

    private void btnLateralHWActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLateralHWActionPerformed
        cambiarContexto(1);
    }//GEN-LAST:event_btnLateralHWActionPerformed

    private void btnLateralSOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLateralSOActionPerformed
        cambiarContexto(2);
    }//GEN-LAST:event_btnLateralSOActionPerformed

    private void btnLateralInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLateralInicioActionPerformed
        cambiarContexto(0);
    }//GEN-LAST:event_btnLateralInicioActionPerformed

    private void btnCPUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCPUActionPerformed
        //cambiarPnlHW(1,pnlHW_CPU);
    }//GEN-LAST:event_btnCPUActionPerformed

    private void btnDskActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDskActionPerformed
        //cambiarPnlHW(2,pnlHW_Dsk);
    }//GEN-LAST:event_btnDskActionPerformed

    private void btnGabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGabActionPerformed
        //cambiarPnlHW(3,pnlHW_Gab);
    }//GEN-LAST:event_btnGabActionPerformed

    private void btnMbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMbActionPerformed
        //cambiarPnlHW(4,pnlHW_MB);
    }//GEN-LAST:event_btnMbActionPerformed

    private void btnGPUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGPUActionPerformed
        //cambiarPnlHW(5,pnlHW_GPU);
    }//GEN-LAST:event_btnGPUActionPerformed

    private void btnSupplyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSupplyActionPerformed
        //cambiarPnlHW(6,pnlHW_Supply);
    }//GEN-LAST:event_btnSupplyActionPerformed

    private void txtIDRAMMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtIDRAMMousePressed
        lblIntroText8.setIcon(new ImageIcon(getClass().getResource("/Img/introTxt_selected1.png")));
        txtIDRAM.setText(" ");
    }//GEN-LAST:event_txtIDRAMMousePressed

    private void txtDescripcionRAMMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtDescripcionRAMMousePressed
        lblIntroText7.setIcon(new ImageIcon(getClass().getResource("/Img/introTxt_selected1.png")));
        txtDescripcionRAM.setText(" ");
    }//GEN-LAST:event_txtDescripcionRAMMousePressed

    private void spnFrecRAMStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spnFrecRAMStateChanged
        switch ( spnFrecRAM.getValue().toString() ) {
            case "1600 MHz":
            this.valorSpnMemRAM1 = "1666";
            break;
            case "1866 MHz":
            this.valorSpnMemRAM1 = "1866";
            break;
            case "2400 MHz":
            this.valorSpnMemRAM1 = "2400";
            break;
            case "2666 MHz":
            this.valorSpnMemRAM1 = "2666";
            break;
            case "3000 MHz":
            this.valorSpnMemRAM1 = "3000";
            break;
        }//End SW (valorSpnMemRAM1)
    }//GEN-LAST:event_spnFrecRAMStateChanged

    private void spnCapacidadRAMStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spnCapacidadRAMStateChanged
        switch ( spnCapacidadRAM.getValue().toString() ) {
            case "4 GB":
            this.valorSpnMemRAM2 = "4";
            break;
            case "8 GB":
            this.valorSpnMemRAM2 = "8";
            break;
            case "16 GB":
            this.valorSpnMemRAM2 = "16";
            break;
        }//End SW (valorSpnMemRAM1)
    }//GEN-LAST:event_spnCapacidadRAMStateChanged

    private void txtModeloRAMMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtModeloRAMMousePressed
        lblIntroText1.setIcon(new ImageIcon(getClass().getResource("/Img/introTxt_selected1.png")));
        txtModeloRAM.setText(" ");
    }//GEN-LAST:event_txtModeloRAMMousePressed

    private void txtPrecioRAMMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtPrecioRAMMousePressed
        lblIntroText2.setIcon(new ImageIcon(getClass().getResource("/Img/introTxt_selected1.png")));
        txtPrecioRAM.setText(" ");
    }//GEN-LAST:event_txtPrecioRAMMousePressed

    private void txtMarcaRAM1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtMarcaRAM1MousePressed
        lblIntroText3.setIcon(new ImageIcon(getClass().getResource("/Img/introTxt_selected1.png")));
        txtMarcaRAM1.setText(" ");
    }//GEN-LAST:event_txtMarcaRAM1MousePressed

    private void txtTechRAMMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtTechRAMMousePressed
        lblIntroText4.setIcon(new ImageIcon(getClass().getResource("/Img/introTxt_selected1.png")));
        txtTechRAM.setText(" ");
    }//GEN-LAST:event_txtTechRAMMousePressed

    private void btnAddRAMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddRAMActionPerformed
        boolean error = verificaErrorDato(0);
        //En caso de que exista un error en la entrada
        //de algun dato, este no se almacenara en la tabla
        if ( error == true ) {
            //No hacer nada, ya que existe un error
        } else {
            /*
            double precio = Logica.Hardware.calcularPrecioRAM(
                txtTechRAM.getText(),
                Integer.parseInt(this.valorSpnMemRAM2),
                Integer.parseInt(this.valorSpnMemRAM1),
                20
            );
            */
            Hardware H1 = new Hardware(
                txtIDRAM.getText(),
                txtDescripcionRAM.getText(),
                0.0,
                20.0,
                Integer.parseInt(this.valorSpnMemRAM1),
                Integer.parseInt(this.valorSpnMemRAM2),
                txtMarcaRAM1.getText(),
                txtTechRAM.getText(),
                txtModeloRAM.getText()
            );

            String [] datosTextField = {
                txtIDRAM.getText(),
                txtMarcaRAM1.getText(),
                txtModeloRAM.getText(),
                txtDescripcionRAM.getText(),
                this.valorSpnMemRAM1, //Corresponde a la Frecuencia
                this.valorSpnMemRAM2, //Corresponde a la Capacidad
                String.valueOf(H1.getPrecioIns()) //VERIFICAR DATO EN BDD!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
            };
            ModelHW1.addRow(datosTextField);

        }//End condicion
    }//GEN-LAST:event_btnAddRAMActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frmHome111.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmHome111.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmHome111.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmHome111.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmHome111().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel EscondePestania;
    private javax.swing.JLabel EscondePestania1;
    private javax.swing.JButton btnAddRAM;
    private javax.swing.JButton btnAyuda;
    private javax.swing.JButton btnAyuda1;
    private javax.swing.JButton btnCPU;
    private javax.swing.JButton btnDsk;
    private javax.swing.JButton btnEditRAM;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnGPU;
    private javax.swing.JButton btnGab;
    private javax.swing.JButton btnLateralArmadoPC;
    private javax.swing.JButton btnLateralHW;
    private javax.swing.JButton btnLateralInicio;
    private javax.swing.JButton btnLateralRed;
    private javax.swing.JButton btnLateralSO;
    private javax.swing.JButton btnLateralSalir;
    private javax.swing.JButton btnMb;
    private javax.swing.JButton btnMemoriaRAM;
    private javax.swing.JButton btnMinimizate;
    private javax.swing.JButton btnRmRAM;
    private javax.swing.JButton btnSupply;
    private javax.swing.JInternalFrame intFrm_CPU;
    private javax.swing.JInternalFrame intFrm_Dsk;
    private javax.swing.JInternalFrame intFrm_GPU;
    private javax.swing.JInternalFrame intFrm_Gab;
    private javax.swing.JInternalFrame intFrm_HW;
    private javax.swing.JInternalFrame intFrm_Inicio;
    private javax.swing.JInternalFrame intFrm_MB;
    private javax.swing.JInternalFrame intFrm_PC;
    private javax.swing.JInternalFrame intFrm_RAM;
    private javax.swing.JInternalFrame intFrm_Red;
    private javax.swing.JInternalFrame intFrm_SO;
    private javax.swing.JInternalFrame intFrm_Supply;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JSeparator jSeparator13;
    private javax.swing.JSeparator jSeparator14;
    private javax.swing.JSeparator jSeparator15;
    private javax.swing.JSeparator jSeparator19;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator20;
    private javax.swing.JSeparator jSeparator21;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JLabel lblIns;
    private javax.swing.JLabel lblIns1;
    private javax.swing.JLabel lblIntroText0;
    private javax.swing.JLabel lblIntroText1;
    private javax.swing.JLabel lblIntroText2;
    private javax.swing.JLabel lblIntroText3;
    private javax.swing.JLabel lblIntroText4;
    private javax.swing.JLabel lblIntroText5;
    private javax.swing.JLabel lblIntroText6;
    private javax.swing.JLabel lblIntroText7;
    private javax.swing.JLabel lblIntroText8;
    private javax.swing.JLabel lblMenu;
    private javax.swing.JLabel lblPresupuesto;
    private javax.swing.JLabel lblSubTituloPestania;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblTituloPestania;
    private javax.swing.JPanel pnlContexto;
    private javax.swing.JPanel pnlContextoInicio;
    private javax.swing.JPanel pnlContextoInsHW;
    private javax.swing.JPanel pnlEstado;
    private javax.swing.JPanel pnlHW_Titulo;
    private javax.swing.JPanel pnlLateral;
    private javax.swing.JPanel pnlRAM;
    private javax.swing.JSpinner spnCapacidadRAM;
    private javax.swing.JSpinner spnFrecRAM;
    private javax.swing.JTable tblMemRAM;
    private javax.swing.JTextField txtDescripcionRAM;
    private javax.swing.JTextField txtIDRAM;
    private javax.swing.JTextField txtMarcaRAM1;
    private javax.swing.JTextField txtModeloRAM;
    private javax.swing.JTextField txtPrecioRAM;
    private javax.swing.JTextField txtResultMass3;
    private javax.swing.JTextField txtTechRAM;
    // End of variables declaration//GEN-END:variables
}
