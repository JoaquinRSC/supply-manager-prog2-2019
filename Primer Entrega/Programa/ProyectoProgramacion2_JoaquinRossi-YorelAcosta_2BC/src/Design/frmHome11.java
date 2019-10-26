
package Design;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

public class frmHome11 extends javax.swing.JFrame {
    
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

    public frmHome11() {
        initComponents();
        cambiarPnlHW(0,pnlHW_MemRAM);
        
        
        
        
    }// End constructor
    
        //Metodo para setear img seleccionado de los btn Ins HW
    public void cambiarPnlHW(int i, JPanel pnl){
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
               btnMemoriaRAM.setIcon(new ImageIcon(getClass().getResource("/Img/memRAM_selected0.png")));
               btnCPU.setIcon(new ImageIcon(getClass().getResource("/Img/cpu_selected1.png")));
               btnDsk.setIcon(new ImageIcon(getClass().getResource("/Img/dsk_selected0.png")));
               btnGab.setIcon(new ImageIcon(getClass().getResource("/Img/gab_selected0.png")));
               btnMb.setIcon(new ImageIcon(getClass().getResource("/Img/mb_selected0.png")));
               btnGPU.setIcon(new ImageIcon(getClass().getResource("/Img/memG_selected0.png")));
               btnSupply.setIcon(new ImageIcon(getClass().getResource("/Img/supply_selected0.png")));
               break;    
           case 2:
               btnMemoriaRAM.setIcon(new ImageIcon(getClass().getResource("/Img/memRAM_selected0.png")));
               btnCPU.setIcon(new ImageIcon(getClass().getResource("/Img/cpu_selected0.png")));
               btnDsk.setIcon(new ImageIcon(getClass().getResource("/Img/dsk_selected1.png")));
               btnGab.setIcon(new ImageIcon(getClass().getResource("/Img/gab_selected0.png")));
               btnMb.setIcon(new ImageIcon(getClass().getResource("/Img/mb_selected0.png")));
               btnGPU.setIcon(new ImageIcon(getClass().getResource("/Img/memG_selected0.png")));
               btnSupply.setIcon(new ImageIcon(getClass().getResource("/Img/supply_selected0.png")));
               break; 
           case 3:
               btnMemoriaRAM.setIcon(new ImageIcon(getClass().getResource("/Img/memRAM_selected0.png")));
               btnCPU.setIcon(new ImageIcon(getClass().getResource("/Img/cpu_selected0.png")));
               btnDsk.setIcon(new ImageIcon(getClass().getResource("/Img/dsk_selected0.png")));
               btnGab.setIcon(new ImageIcon(getClass().getResource("/Img/gab_selected1.png")));
               btnMb.setIcon(new ImageIcon(getClass().getResource("/Img/mb_selected0.png")));
               btnGPU.setIcon(new ImageIcon(getClass().getResource("/Img/memG_selected0.png")));
               btnSupply.setIcon(new ImageIcon(getClass().getResource("/Img/supply_selected0.png")));
               break;     
           case 4:
               btnMemoriaRAM.setIcon(new ImageIcon(getClass().getResource("/Img/memRAM_selected0.png")));
               btnCPU.setIcon(new ImageIcon(getClass().getResource("/Img/cpu_selected0.png")));
               btnDsk.setIcon(new ImageIcon(getClass().getResource("/Img/dsk_selected0.png")));
               btnGab.setIcon(new ImageIcon(getClass().getResource("/Img/gab_selected0.png")));
               btnMb.setIcon(new ImageIcon(getClass().getResource("/Img/mb_selected1.png")));
               btnGPU.setIcon(new ImageIcon(getClass().getResource("/Img/memG_selected0.png")));
               btnSupply.setIcon(new ImageIcon(getClass().getResource("/Img/supply_selected0.png")));
               break;    
           case 5:
               btnMemoriaRAM.setIcon(new ImageIcon(getClass().getResource("/Img/memRAM_selected0.png")));
               btnCPU.setIcon(new ImageIcon(getClass().getResource("/Img/cpu_selected0.png")));
               btnDsk.setIcon(new ImageIcon(getClass().getResource("/Img/dsk_selected0.png")));
               btnGab.setIcon(new ImageIcon(getClass().getResource("/Img/gab_selected0.png")));
               btnMb.setIcon(new ImageIcon(getClass().getResource("/Img/mb_selected0.png")));
               btnGPU.setIcon(new ImageIcon(getClass().getResource("/Img/memG_selected1.png")));
               btnSupply.setIcon(new ImageIcon(getClass().getResource("/Img/supply_selected0.png")));
               break;                 
           case 6:
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
        //Metodo para setear img seleccionado de los btn Ins SO
    public void cambiarPnlSO(int i){
       switch (i) {
           case 0:
               btnMemoriaRAM.setIcon(new ImageIcon(getClass().getResource("/Img/memRAM_selected1.png")));
               btnCPU.setIcon(new ImageIcon(getClass().getResource("/Img/cpu_selected0.png")));
               btnDsk.setIcon(new ImageIcon(getClass().getResource("/Img/dsk_selected0.png")));
               btnGab.setIcon(new ImageIcon(getClass().getResource("/Img/gab_selected0.png")));
               btnMb.setIcon(new ImageIcon(getClass().getResource("/Img/mb_selected0.png")));
               btnGPU.setIcon(new ImageIcon(getClass().getResource("/Img/memG_selected0.png")));
               btnSupply.setIcon(new ImageIcon(getClass().getResource("/Img/supply_selected0.png")));
               break;
           case 1:
               btnMemoriaRAM.setIcon(new ImageIcon(getClass().getResource("/Img/memRAM_selected0.png")));
               btnCPU.setIcon(new ImageIcon(getClass().getResource("/Img/cpu_selected1.png")));
               btnDsk.setIcon(new ImageIcon(getClass().getResource("/Img/dsk_selected0.png")));
               btnGab.setIcon(new ImageIcon(getClass().getResource("/Img/gab_selected0.png")));
               btnMb.setIcon(new ImageIcon(getClass().getResource("/Img/mb_selected0.png")));
               btnGPU.setIcon(new ImageIcon(getClass().getResource("/Img/memG_selected0.png")));
               btnSupply.setIcon(new ImageIcon(getClass().getResource("/Img/supply_selected0.png")));
               break;    
           case 2:
               btnMemoriaRAM.setIcon(new ImageIcon(getClass().getResource("/Img/memRAM_selected0.png")));
               btnCPU.setIcon(new ImageIcon(getClass().getResource("/Img/cpu_selected0.png")));
               btnDsk.setIcon(new ImageIcon(getClass().getResource("/Img/dsk_selected1.png")));
               btnGab.setIcon(new ImageIcon(getClass().getResource("/Img/gab_selected0.png")));
               btnMb.setIcon(new ImageIcon(getClass().getResource("/Img/mb_selected0.png")));
               btnGPU.setIcon(new ImageIcon(getClass().getResource("/Img/memG_selected0.png")));
               btnSupply.setIcon(new ImageIcon(getClass().getResource("/Img/supply_selected0.png")));
               break; 
           case 3:
               btnMemoriaRAM.setIcon(new ImageIcon(getClass().getResource("/Img/memRAM_selected0.png")));
               btnCPU.setIcon(new ImageIcon(getClass().getResource("/Img/cpu_selected0.png")));
               btnDsk.setIcon(new ImageIcon(getClass().getResource("/Img/dsk_selected0.png")));
               btnGab.setIcon(new ImageIcon(getClass().getResource("/Img/gab_selected1.png")));
               btnMb.setIcon(new ImageIcon(getClass().getResource("/Img/mb_selected0.png")));
               btnGPU.setIcon(new ImageIcon(getClass().getResource("/Img/memG_selected0.png")));
               btnSupply.setIcon(new ImageIcon(getClass().getResource("/Img/supply_selected0.png")));
               break;     
           case 4:
               btnMemoriaRAM.setIcon(new ImageIcon(getClass().getResource("/Img/memRAM_selected0.png")));
               btnCPU.setIcon(new ImageIcon(getClass().getResource("/Img/cpu_selected0.png")));
               btnDsk.setIcon(new ImageIcon(getClass().getResource("/Img/dsk_selected0.png")));
               btnGab.setIcon(new ImageIcon(getClass().getResource("/Img/gab_selected0.png")));
               btnMb.setIcon(new ImageIcon(getClass().getResource("/Img/mb_selected1.png")));
               btnGPU.setIcon(new ImageIcon(getClass().getResource("/Img/memG_selected0.png")));
               btnSupply.setIcon(new ImageIcon(getClass().getResource("/Img/supply_selected0.png")));
               break;    
           case 5:
               btnMemoriaRAM.setIcon(new ImageIcon(getClass().getResource("/Img/memRAM_selected0.png")));
               btnCPU.setIcon(new ImageIcon(getClass().getResource("/Img/cpu_selected0.png")));
               btnDsk.setIcon(new ImageIcon(getClass().getResource("/Img/dsk_selected0.png")));
               btnGab.setIcon(new ImageIcon(getClass().getResource("/Img/gab_selected0.png")));
               btnMb.setIcon(new ImageIcon(getClass().getResource("/Img/mb_selected0.png")));
               btnGPU.setIcon(new ImageIcon(getClass().getResource("/Img/memG_selected1.png")));
               btnSupply.setIcon(new ImageIcon(getClass().getResource("/Img/supply_selected0.png")));
               break;                 
           case 6:
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
    
    public boolean verificaErrorDato(){
        boolean error = false;
        
        String [] valoresTxtField = {
            txtIDRAM.getText(),
            txtTechRAM.getText(),
            txtDescripcionRAM.getText(),
            txtMarcaRAM1.getText(),
            txtPrecioRAM.getText(),
            txtModeloRAM.getText()
        };
        
        String [] valoresDefectoTxtField = {
            " 0000",
            " Ejemplo: DDR3",
            "Ejemplo:Mem RAM",
            " Ejemplo: MSI",
            " En US$",
            " Ejemplo: X370M",
        };
        
        for ( int i=0 ; i<valoresTxtField.length ; i++) {
            String valorTxtField = valoresTxtField[i];
                for ( int n=0 ; n<valorTxtField.length() ; n++) {
                   char valorPos = valorTxtField.charAt(n); 
                   if ( valorTxtField.charAt(n) == '.' || valorTxtField.charAt(n) == ',' || valorTxtField.charAt(n) == ' ' ) {                      
                       error = true;
                       switch (i) {
                            case 0:
                               txtIDRAM.setText(" Dato inválido");
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
                            case 4:
                                txtPrecioRAM.setText(" Dato inválido");
                                lblIntroText2.setIcon(new ImageIcon(getClass().getResource("/Img/introTxt_selected1-E.png")));
                                break;
                            case 5:
                                txtMarcaRAM1.setText(" Dato inválido");
                                lblIntroText1.setIcon(new ImageIcon(getClass().getResource("/Img/introTxt_selected1-E.png")));
                                break;
                       }//End SW (i)
                   }//End Condicional 
                   
                } //End Loop (n)
        } //End Loop (i)
        
        return error;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlGeneral = new javax.swing.JPanel();
        pnlContexto = new javax.swing.JPanel();
        btnExit = new javax.swing.JButton();
        btnMinimizate = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        lyredPane_Contexto = new javax.swing.JLayeredPane();
        pnlContextoInsHW = new javax.swing.JPanel();
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
        jSeparator11 = new javax.swing.JSeparator();
        btnAyuda1 = new javax.swing.JButton();
        lyredPane_TipoIns = new javax.swing.JLayeredPane();
        pnlHW_CPU = new javax.swing.JPanel();
        pnlHW_MemRAM = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator9 = new javax.swing.JSeparator();
        jSeparator14 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblMemRAM = new javax.swing.JTable();
        btnRmRAM = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator13 = new javax.swing.JSeparator();
        btnEditRAM = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        btnAddRAM = new javax.swing.JButton();
        jSeparator8 = new javax.swing.JSeparator();
        jSeparator10 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        lblIntroText5 = new javax.swing.JLabel();
        spnCapacidadRAM = new javax.swing.JSpinner();
        jLabel11 = new javax.swing.JLabel();
        lblIntroText1 = new javax.swing.JLabel();
        txtModeloRAM = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        lblIntroText2 = new javax.swing.JLabel();
        txtPrecioRAM = new javax.swing.JTextField();
        spnFrecRAM = new javax.swing.JSpinner();
        jLabel10 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        lblIntroText3 = new javax.swing.JLabel();
        txtTechRAM = new javax.swing.JTextField();
        lblIntroText7 = new javax.swing.JLabel();
        txtDescripcionRAM = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        lblIntroText4 = new javax.swing.JLabel();
        lblIntroText8 = new javax.swing.JLabel();
        lblIntroText0 = new javax.swing.JLabel();
        txtResultMass3 = new javax.swing.JTextField();
        txtIDRAM = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jSeparator12 = new javax.swing.JSeparator();
        lblIntroText6 = new javax.swing.JLabel();
        btnAyuda = new javax.swing.JButton();
        txtMarcaRAM1 = new javax.swing.JTextField();
        pnlHW_Dsk = new javax.swing.JPanel();
        pnlHW_Gab = new javax.swing.JPanel();
        pnlHW_MB = new javax.swing.JPanel();
        pnlHW_GPU = new javax.swing.JPanel();
        pnlHW_Supply = new javax.swing.JPanel();
        pnlContextoInicio = new javax.swing.JPanel();
        pnlEstado = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        lblVersion = new javax.swing.JLabel();
        lblDev = new javax.swing.JLabel();
        lblDev1 = new javax.swing.JLabel();
        pnlSlider = new javax.swing.JPanel();
        jSeparator5 = new javax.swing.JSeparator();
        lblPresupuesto = new javax.swing.JLabel();
        lblMenu = new javax.swing.JLabel();
        lblIns = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator19 = new javax.swing.JSeparator();
        jSeparator20 = new javax.swing.JSeparator();
        jSeparator21 = new javax.swing.JSeparator();
        lblIns1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlGeneral.setBackground(new java.awt.Color(255, 255, 255));
        pnlGeneral.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        pnlContextoInsHW.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlHW_Titulo.setBackground(new java.awt.Color(254, 254, 255));
        pnlHW_Titulo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTituloPestania.setFont(new java.awt.Font("Lucida Sans", 0, 36)); // NOI18N
        lblTituloPestania.setForeground(new java.awt.Color(51, 59, 65));
        lblTituloPestania.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblTituloPestania.setText(" Insumos: Hardware");
        lblTituloPestania.setToolTipText("");
        pnlHW_Titulo.add(lblTituloPestania, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 370, 60));

        lblSubTituloPestania.setBackground(new java.awt.Color(128, 131, 123));
        lblSubTituloPestania.setFont(new java.awt.Font("Lucida Sans", 0, 14)); // NOI18N
        lblSubTituloPestania.setForeground(new java.awt.Color(137, 137, 137));
        lblSubTituloPestania.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSubTituloPestania.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Carga a continuación los Tipos de Insumos a la Tabla.png"))); // NOI18N
        pnlHW_Titulo.add(lblSubTituloPestania, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 340, 30));

        btnMemoriaRAM.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/memRAM_selected1.png"))); // NOI18N
        btnMemoriaRAM.setBorderPainted(false);
        btnMemoriaRAM.setContentAreaFilled(false);
        btnMemoriaRAM.setFocusPainted(false);
        btnMemoriaRAM.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/memRAM_selected1.png"))); // NOI18N
        btnMemoriaRAM.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/memRAM_selected0.png"))); // NOI18N
        btnMemoriaRAM.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/memRAM_selected0.png"))); // NOI18N
        btnMemoriaRAM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMemoriaRAMActionPerformed(evt);
            }
        });
        pnlHW_Titulo.add(btnMemoriaRAM, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 90, 50));

        btnCPU.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/cpu_selected0.png"))); // NOI18N
        btnCPU.setBorderPainted(false);
        btnCPU.setContentAreaFilled(false);
        btnCPU.setFocusPainted(false);
        btnCPU.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/cpu_selected1.png"))); // NOI18N
        btnCPU.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/cpu_selected0.png"))); // NOI18N
        btnCPU.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/cpu_selected0.png"))); // NOI18N
        pnlHW_Titulo.add(btnCPU, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 80, 90, 50));

        btnDsk.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/dsk_selected0.png"))); // NOI18N
        btnDsk.setBorderPainted(false);
        btnDsk.setContentAreaFilled(false);
        btnDsk.setFocusPainted(false);
        btnDsk.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/dsk_selected1.png"))); // NOI18N
        btnDsk.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/dsk_selected0.png"))); // NOI18N
        btnDsk.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/dsk_selected0.png"))); // NOI18N
        pnlHW_Titulo.add(btnDsk, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 80, 90, 50));

        btnGab.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/gab_selected0.png"))); // NOI18N
        btnGab.setBorderPainted(false);
        btnGab.setContentAreaFilled(false);
        btnGab.setFocusPainted(false);
        btnGab.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/gab_selected1.png"))); // NOI18N
        btnGab.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/gab_selected0.png"))); // NOI18N
        btnGab.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/gab_selected0.png"))); // NOI18N
        pnlHW_Titulo.add(btnGab, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 80, 90, 50));

        btnMb.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/mb_selected0.png"))); // NOI18N
        btnMb.setBorderPainted(false);
        btnMb.setContentAreaFilled(false);
        btnMb.setFocusPainted(false);
        btnMb.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/mb_selected1.png"))); // NOI18N
        btnMb.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/memG_selected0.png"))); // NOI18N
        btnMb.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/mb_selected0.png"))); // NOI18N
        pnlHW_Titulo.add(btnMb, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 80, 90, 50));

        btnGPU.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/memG_selected0.png"))); // NOI18N
        btnGPU.setBorderPainted(false);
        btnGPU.setContentAreaFilled(false);
        btnGPU.setFocusPainted(false);
        btnGPU.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/memG_selected1.png"))); // NOI18N
        btnGPU.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/memG_selected0.png"))); // NOI18N
        btnGPU.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/memG_selected0.png"))); // NOI18N
        pnlHW_Titulo.add(btnGPU, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 80, 90, 50));

        btnSupply.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/supply_selected0.png"))); // NOI18N
        btnSupply.setBorderPainted(false);
        btnSupply.setContentAreaFilled(false);
        btnSupply.setFocusPainted(false);
        btnSupply.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/supply_selected1.png"))); // NOI18N
        btnSupply.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/supply_selected0.png"))); // NOI18N
        btnSupply.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/supply_selected0.png"))); // NOI18N
        pnlHW_Titulo.add(btnSupply, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 80, 90, 50));
        pnlHW_Titulo.add(jSeparator11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 860, 10));

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
        pnlHW_Titulo.add(btnAyuda1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 50, 20, 30));

        pnlContextoInsHW.add(pnlHW_Titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 890, 150));

        pnlHW_CPU.setBackground(new java.awt.Color(254, 254, 255));
        pnlHW_CPU.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlHW_MemRAM.setBackground(new java.awt.Color(254, 254, 255));
        pnlHW_MemRAM.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        pnlHW_MemRAM.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 860, 10));

        jLabel1.setFont(new java.awt.Font("Lucida Sans", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 59, 65));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Ingreso: Memoria R.A.M.");
        jLabel1.setToolTipText("");
        pnlHW_MemRAM.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 300, 40));

        jLabel3.setBackground(new java.awt.Color(128, 131, 123));
        jLabel3.setFont(new java.awt.Font("Lucida Sans", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(137, 137, 137));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Carga los datos para almacenar un nuevo Insumo..png"))); // NOI18N
        pnlHW_MemRAM.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 300, 30));
        pnlHW_MemRAM.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 860, 10));

        jSeparator9.setOrientation(javax.swing.SwingConstants.VERTICAL);
        pnlHW_MemRAM.add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 20, 60));

        jSeparator14.setOrientation(javax.swing.SwingConstants.VERTICAL);
        pnlHW_MemRAM.add(jSeparator14, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 10, 10, 60));

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

        pnlHW_MemRAM.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 90, 510, 390));

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
        pnlHW_MemRAM.add(btnRmRAM, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 410, 70, 40));

        jLabel17.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 12)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(51, 59, 65));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("Eliminar");
        pnlHW_MemRAM.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 450, 50, 20));
        pnlHW_MemRAM.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 480, 340, 10));

        jSeparator13.setOrientation(javax.swing.SwingConstants.VERTICAL);
        pnlHW_MemRAM.add(jSeparator13, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 90, 10, 390));

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
        pnlHW_MemRAM.add(btnEditRAM, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 410, 60, 40));

        jLabel7.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 59, 65));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Editar");
        pnlHW_MemRAM.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 450, 40, 20));

        jLabel16.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(51, 59, 65));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("Agregar");
        pnlHW_MemRAM.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 450, -1, 20));

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
        pnlHW_MemRAM.add(btnAddRAM, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 410, 60, 40));

        jSeparator8.setOrientation(javax.swing.SwingConstants.VERTICAL);
        pnlHW_MemRAM.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 10, 390));
        pnlHW_MemRAM.add(jSeparator10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 400, 340, 10));
        pnlHW_MemRAM.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 380, 340, 10));

        lblIntroText5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/introTxt_selected1.png"))); // NOI18N
        lblIntroText5.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        pnlHW_MemRAM.add(lblIntroText5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 360, 90, 10));

        spnCapacidadRAM.setModel(new javax.swing.SpinnerListModel(new String[] {"4 GB", "8 GB", "16 GB"}));
        spnCapacidadRAM.setBorder(null);
        spnCapacidadRAM.setFocusable(false);
        pnlHW_MemRAM.add(spnCapacidadRAM, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, 90, 30));

        jLabel11.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(70, 176, 74));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Capacidad:");
        pnlHW_MemRAM.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, -1, -1));

        lblIntroText1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/introTxt_selected1.png"))); // NOI18N
        lblIntroText1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        pnlHW_MemRAM.add(lblIntroText1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 360, 90, 10));

        txtModeloRAM.setBackground(new java.awt.Color(254, 254, 255));
        txtModeloRAM.setForeground(new java.awt.Color(51, 59, 65));
        txtModeloRAM.setText(" Ejemplo: X370M");
        txtModeloRAM.setBorder(null);
        txtModeloRAM.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtModeloRAMMousePressed(evt);
            }
        });
        pnlHW_MemRAM.add(txtModeloRAM, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 330, 90, 30));

        jLabel12.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(70, 176, 74));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText(" Modelo:");
        pnlHW_MemRAM.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 310, 60, 20));

        lblIntroText2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/introTxt_selected1.png"))); // NOI18N
        lblIntroText2.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        pnlHW_MemRAM.add(lblIntroText2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 290, 90, 10));

        txtPrecioRAM.setBackground(new java.awt.Color(254, 254, 255));
        txtPrecioRAM.setForeground(new java.awt.Color(51, 59, 65));
        txtPrecioRAM.setText(" En US$");
        txtPrecioRAM.setBorder(null);
        txtPrecioRAM.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtPrecioRAMMousePressed(evt);
            }
        });
        pnlHW_MemRAM.add(txtPrecioRAM, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 260, 90, 30));

        spnFrecRAM.setModel(new javax.swing.SpinnerListModel(new String[] {"1600 MHz", "1866 MHz", "2400 MHz", "2666 MHz", "3000 MHz"}));
        spnFrecRAM.setBorder(null);
        pnlHW_MemRAM.add(spnFrecRAM, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, 90, 30));

        jLabel10.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(70, 176, 74));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Frecuencia:");
        pnlHW_MemRAM.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, -1, 20));

        jLabel8.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(70, 176, 74));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Precio:");
        pnlHW_MemRAM.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 240, -1, 20));

        lblIntroText3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/introTxt_selected1.png"))); // NOI18N
        lblIntroText3.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        pnlHW_MemRAM.add(lblIntroText3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 220, 90, 10));

        txtTechRAM.setBackground(new java.awt.Color(254, 254, 255));
        txtTechRAM.setForeground(new java.awt.Color(51, 59, 65));
        txtTechRAM.setText(" Ejemplo: DDR3");
        txtTechRAM.setBorder(null);
        txtTechRAM.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtTechRAMMousePressed(evt);
            }
        });
        pnlHW_MemRAM.add(txtTechRAM, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 120, 90, 30));

        lblIntroText7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/introTxt_selected1.png"))); // NOI18N
        lblIntroText7.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        pnlHW_MemRAM.add(lblIntroText7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 90, 10));

        txtDescripcionRAM.setBackground(new java.awt.Color(254, 254, 255));
        txtDescripcionRAM.setForeground(new java.awt.Color(51, 59, 65));
        txtDescripcionRAM.setText("Ejemplo:Mem RAM");
        txtDescripcionRAM.setBorder(null);
        txtDescripcionRAM.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtDescripcionRAMMousePressed(evt);
            }
        });
        pnlHW_MemRAM.add(txtDescripcionRAM, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 90, 30));

        jLabel9.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(70, 176, 74));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Descripcion:");
        pnlHW_MemRAM.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, -1, 20));

        jLabel14.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(70, 176, 74));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("Marca:");
        pnlHW_MemRAM.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 170, 40, 20));

        lblIntroText4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/introTxt_selected1.png"))); // NOI18N
        lblIntroText4.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        pnlHW_MemRAM.add(lblIntroText4, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 150, 90, 10));

        lblIntroText8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/introTxt_selected1.png"))); // NOI18N
        lblIntroText8.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        pnlHW_MemRAM.add(lblIntroText8, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 150, 30, 10));

        lblIntroText0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/introTxt_selected1.png"))); // NOI18N
        lblIntroText0.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        pnlHW_MemRAM.add(lblIntroText0, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 50, 10));

        txtResultMass3.setEditable(false);
        txtResultMass3.setBackground(new java.awt.Color(254, 254, 255));
        txtResultMass3.setForeground(new java.awt.Color(51, 59, 65));
        txtResultMass3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtResultMass3.setText("1AAA");
        txtResultMass3.setBorder(null);
        txtResultMass3.setEnabled(false);
        pnlHW_MemRAM.add(txtResultMass3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 50, 30));

        txtIDRAM.setEditable(false);
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
        pnlHW_MemRAM.add(txtIDRAM, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 120, 30, 30));

        jLabel18.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 12)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(70, 176, 74));
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("ID Memoria:");
        pnlHW_MemRAM.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, -1, 20));

        jLabel13.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(70, 176, 74));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Tecnologia:");
        pnlHW_MemRAM.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 100, 70, 20));
        pnlHW_MemRAM.add(jSeparator12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 340, 10));

        lblIntroText6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/introTxt_selected1.png"))); // NOI18N
        lblIntroText6.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        pnlHW_MemRAM.add(lblIntroText6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, 90, 10));

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
        pnlHW_MemRAM.add(btnAyuda, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 40, 20, 30));

        txtMarcaRAM1.setBackground(new java.awt.Color(254, 254, 255));
        txtMarcaRAM1.setForeground(new java.awt.Color(51, 59, 65));
        txtMarcaRAM1.setText(" Ejemplo: MSI");
        txtMarcaRAM1.setBorder(null);
        txtMarcaRAM1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtMarcaRAM1MousePressed(evt);
            }
        });
        pnlHW_MemRAM.add(txtMarcaRAM1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 190, 90, 30));

        pnlHW_CPU.add(pnlHW_MemRAM, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 890, -1));

        lyredPane_TipoIns.add(pnlHW_CPU);
        pnlHW_CPU.setBounds(0, 10, 890, 490);

        pnlHW_Dsk.setBackground(new java.awt.Color(254, 254, 255));
        pnlHW_Dsk.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        lyredPane_TipoIns.add(pnlHW_Dsk);
        pnlHW_Dsk.setBounds(0, 10, 890, 490);

        pnlHW_Gab.setBackground(new java.awt.Color(254, 254, 255));
        pnlHW_Gab.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        lyredPane_TipoIns.add(pnlHW_Gab);
        pnlHW_Gab.setBounds(0, 10, 890, 490);

        pnlHW_MB.setBackground(new java.awt.Color(254, 254, 255));
        pnlHW_MB.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        lyredPane_TipoIns.add(pnlHW_MB);
        pnlHW_MB.setBounds(0, 10, 890, 490);

        pnlHW_GPU.setBackground(new java.awt.Color(254, 254, 255));
        pnlHW_GPU.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        lyredPane_TipoIns.add(pnlHW_GPU);
        pnlHW_GPU.setBounds(0, 10, 890, 490);

        pnlHW_Supply.setBackground(new java.awt.Color(254, 254, 255));
        pnlHW_Supply.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        lyredPane_TipoIns.add(pnlHW_Supply);
        pnlHW_Supply.setBounds(0, 10, 890, 490);

        pnlContextoInsHW.add(lyredPane_TipoIns, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 890, 500));

        lyredPane_Contexto.add(pnlContextoInsHW);
        pnlContextoInsHW.setBounds(0, 10, 890, 650);
        lyredPane_Contexto.add(pnlContextoInicio);
        pnlContextoInicio.setBounds(0, 10, 890, 640);

        pnlContexto.add(lyredPane_Contexto, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 890, 650));

        pnlGeneral.add(pnlContexto, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 0, 890, 700));

        pnlEstado.setBackground(new java.awt.Color(244, 246, 243));
        pnlEstado.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTitulo.setFont(new java.awt.Font("Malgun Gothic", 1, 20)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(105, 105, 105));
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblTitulo.setText("GESTOR DE INSUMOS");
        lblTitulo.setToolTipText("");
        pnlEstado.add(lblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 220, 30));

        lblVersion.setForeground(new java.awt.Color(16, 16, 16));
        lblVersion.setText("Version: Beta 0.0.1");
        pnlEstado.add(lblVersion, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, -1, 20));

        lblDev.setForeground(new java.awt.Color(20, 20, 20));
        lblDev.setText("Joaquín Rossi");
        pnlEstado.add(lblDev, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 30, -1, 20));

        lblDev1.setForeground(new java.awt.Color(20, 20, 20));
        lblDev1.setText("Yorel Acosta");
        pnlEstado.add(lblDev1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 30, -1, 20));

        pnlGeneral.add(pnlEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 260, 50));

        pnlSlider.setBackground(new java.awt.Color(244, 246, 243));
        pnlSlider.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jSeparator5.setBackground(new java.awt.Color(210, 210, 210));
        jSeparator5.setForeground(new java.awt.Color(210, 210, 210));
        jSeparator5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 0));
        pnlSlider.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 290, 10));

        lblPresupuesto.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 13)); // NOI18N
        lblPresupuesto.setForeground(new java.awt.Color(130, 134, 125));
        lblPresupuesto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPresupuesto.setText("PRESUPUESTO");
        pnlSlider.add(lblPresupuesto, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, -1, 30));

        lblMenu.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 13)); // NOI18N
        lblMenu.setForeground(new java.awt.Color(130, 134, 125));
        lblMenu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMenu.setText("MENU");
        pnlSlider.add(lblMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, -1, 30));

        lblIns.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 13)); // NOI18N
        lblIns.setForeground(new java.awt.Color(130, 134, 125));
        lblIns.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblIns.setText("CERRAR");
        pnlSlider.add(lblIns, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 560, -1, 30));

        jButton2.setBackground(new java.awt.Color(254, 254, 254));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/home_selected0.png"))); // NOI18N
        jButton2.setBorder(null);
        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        jButton2.setDefaultCapable(false);
        jButton2.setFocusPainted(false);
        jButton2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/home_selected1.png"))); // NOI18N
        jButton2.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/home_selected0.png"))); // NOI18N
        jButton2.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/home_selected1.png"))); // NOI18N
        pnlSlider.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, 180, 40));

        jButton3.setBackground(new java.awt.Color(254, 254, 254));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/insSW_selected0.png"))); // NOI18N
        jButton3.setBorder(null);
        jButton3.setBorderPainted(false);
        jButton3.setContentAreaFilled(false);
        jButton3.setDefaultCapable(false);
        jButton3.setFocusPainted(false);
        jButton3.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/insSW_selected1.png"))); // NOI18N
        jButton3.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/insSW_selected0.png"))); // NOI18N
        jButton3.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/insSW_selected1.png"))); // NOI18N
        pnlSlider.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, 180, 40));

        jButton4.setBackground(new java.awt.Color(254, 254, 254));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/insHW_selected0.png"))); // NOI18N
        jButton4.setBorder(null);
        jButton4.setBorderPainted(false);
        jButton4.setContentAreaFilled(false);
        jButton4.setDefaultCapable(false);
        jButton4.setFocusPainted(false);
        jButton4.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/insHW_selected1.png"))); // NOI18N
        jButton4.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/insHW_selected0.png"))); // NOI18N
        jButton4.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/insHW_selected1.png"))); // NOI18N
        pnlSlider.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 180, 40));

        jButton5.setBackground(new java.awt.Color(254, 254, 254));
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/exit_selected0.png"))); // NOI18N
        jButton5.setBorder(null);
        jButton5.setBorderPainted(false);
        jButton5.setContentAreaFilled(false);
        jButton5.setDefaultCapable(false);
        jButton5.setFocusPainted(false);
        jButton5.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/exit_selected1.png"))); // NOI18N
        jButton5.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/exit_selected0.png"))); // NOI18N
        jButton5.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/exit_selected1.png"))); // NOI18N
        pnlSlider.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 600, 180, 40));

        jButton6.setBackground(new java.awt.Color(254, 254, 254));
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/presupuestoPC_selected0.png"))); // NOI18N
        jButton6.setBorder(null);
        jButton6.setBorderPainted(false);
        jButton6.setContentAreaFilled(false);
        jButton6.setDefaultCapable(false);
        jButton6.setFocusPainted(false);
        jButton6.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/presupuestoPC_selected1.png"))); // NOI18N
        jButton6.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/presupuestoPC_selected0.png"))); // NOI18N
        jButton6.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/presupuestoPC_selected1.png"))); // NOI18N
        pnlSlider.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 350, 180, 40));

        jButton7.setBackground(new java.awt.Color(254, 254, 254));
        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/presupuestoR_selected0.png"))); // NOI18N
        jButton7.setBorder(null);
        jButton7.setBorderPainted(false);
        jButton7.setDefaultCapable(false);
        jButton7.setFocusPainted(false);
        jButton7.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/presupuestoR_selected1.png"))); // NOI18N
        jButton7.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/presupuestoR_selected0.png"))); // NOI18N
        jButton7.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/presupuestoR_selected1.png"))); // NOI18N
        pnlSlider.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 400, 180, 40));
        pnlSlider.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 590, 180, 10));
        pnlSlider.add(jSeparator19, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, 180, 10));
        pnlSlider.add(jSeparator20, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 180, 10));
        pnlSlider.add(jSeparator21, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 180, 10));

        lblIns1.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 13)); // NOI18N
        lblIns1.setForeground(new java.awt.Color(130, 134, 125));
        lblIns1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblIns1.setText("INSUMO");
        pnlSlider.add(lblIns1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, -1, 30));

        pnlGeneral.add(pnlSlider, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 260, 650));

        getContentPane().add(pnlGeneral, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1150, 700));

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
        cambiarPnlHW(0,pnlHW_MemRAM);    
    }//GEN-LAST:event_btnMemoriaRAMActionPerformed

    private void txtPrecioRAMMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtPrecioRAMMousePressed
        lblIntroText2.setIcon(new ImageIcon(getClass().getResource("/Img/introTxt_selected1.png")));
        txtPrecioRAM.setText(" ");
    }//GEN-LAST:event_txtPrecioRAMMousePressed

    private void txtDescripcionRAMMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtDescripcionRAMMousePressed
        lblIntroText7.setIcon(new ImageIcon(getClass().getResource("/Img/introTxt_selected1.png")));
        txtDescripcionRAM.setText(" ");
    }//GEN-LAST:event_txtDescripcionRAMMousePressed

    private void txtIDRAMMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtIDRAMMousePressed
        lblIntroText8.setIcon(new ImageIcon(getClass().getResource("/Img/introTxt_selected1.png")));
        txtIDRAM.setText(" ");
    }//GEN-LAST:event_txtIDRAMMousePressed
    
    private void txtModeloRAMMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtModeloRAMMousePressed
        lblIntroText1.setIcon(new ImageIcon(getClass().getResource("/Img/introTxt_selected1.png")));
        txtModeloRAM.setText(" ");
    }//GEN-LAST:event_txtModeloRAMMousePressed

    private void txtMarcaRAM1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtMarcaRAM1MousePressed
        lblIntroText3.setIcon(new ImageIcon(getClass().getResource("/Img/introTxt_selected1.png")));
        txtMarcaRAM1.setText(" ");
    }//GEN-LAST:event_txtMarcaRAM1MousePressed

    private void txtTechRAMMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtTechRAMMousePressed
        lblIntroText4.setIcon(new ImageIcon(getClass().getResource("/Img/introTxt_selected1.png")));
        txtTechRAM.setText(" ");
    }//GEN-LAST:event_txtTechRAMMousePressed

    private void btnAddRAMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddRAMActionPerformed
        boolean error = verificaErrorDato();
        //En caso de que exista un error en la entrada
        //de algun dato, este no se almacenara en la tabla
        if ( error == true ) { 
            //No hacer nada, ya que existe un error
        } else {
            
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
            java.util.logging.Logger.getLogger(frmHome11.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmHome11.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmHome11.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmHome11.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmHome11().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddRAM;
    private javax.swing.JButton btnAyuda;
    private javax.swing.JButton btnAyuda1;
    private javax.swing.JButton btnCPU;
    private javax.swing.JButton btnDsk;
    private javax.swing.JButton btnEditRAM;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnGPU;
    private javax.swing.JButton btnGab;
    private javax.swing.JButton btnMb;
    private javax.swing.JButton btnMemoriaRAM;
    private javax.swing.JButton btnMinimizate;
    private javax.swing.JButton btnRmRAM;
    private javax.swing.JButton btnSupply;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
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
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JSeparator jSeparator13;
    private javax.swing.JSeparator jSeparator14;
    private javax.swing.JSeparator jSeparator19;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator20;
    private javax.swing.JSeparator jSeparator21;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JLabel lblDev;
    private javax.swing.JLabel lblDev1;
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
    private javax.swing.JLabel lblVersion;
    private javax.swing.JLayeredPane lyredPane_Contexto;
    private javax.swing.JLayeredPane lyredPane_TipoIns;
    private javax.swing.JPanel pnlContexto;
    private javax.swing.JPanel pnlContextoInicio;
    private javax.swing.JPanel pnlContextoInsHW;
    private javax.swing.JPanel pnlEstado;
    private javax.swing.JPanel pnlGeneral;
    private javax.swing.JPanel pnlHW_CPU;
    private javax.swing.JPanel pnlHW_Dsk;
    private javax.swing.JPanel pnlHW_GPU;
    private javax.swing.JPanel pnlHW_Gab;
    private javax.swing.JPanel pnlHW_MB;
    private javax.swing.JPanel pnlHW_MemRAM;
    private javax.swing.JPanel pnlHW_Supply;
    private javax.swing.JPanel pnlHW_Titulo;
    private javax.swing.JPanel pnlSlider;
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
