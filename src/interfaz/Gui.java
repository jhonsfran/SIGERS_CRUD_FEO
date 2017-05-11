/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import entity.Categoria;
import entity.FacturaItems;
import entity.ItemMenu;
import entity.Pedido;
import entity.PedidoItem;
import entity.Personal;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.filechooser.FileNameExtensionFilter;
import models.ModelMain;
import org.hibernate.type.StandardBasicTypes;

/**
 *
 * @author Sebastian
 */
public class Gui extends javax.swing.JFrame {
    private ArrayList<JPanel> paneles;
    /**
     * Creates new form Gui
     * 
     */
    public Gui() {
        initComponents();
        paneles = new ArrayList();
        btGroup.add(rbCrear);
        btGroup.add(rbConsultar);
        btGroup.add(rbModificar);
        btGroup.add(rbEliminar);
        paneles.add(panelCrearConsultarUsuario); //INDICE 0
        paneles.add(panelCRUDItem); //INDICE 1
        paneles.add(panelCRUDPedido); //INDICE 2
        paneles.add(panelCRUDFactura); //INDICE 3
        setPanelesInvisible(-1);
    }
    
    public void setPanelesInvisible(int indicePanel) {// PONE VISIBLE EL PANEL CON EL ID QUE LE MANDEN
        for (int i = 0; i < paneles.size(); i++) {
            if (indicePanel != i) {
                paneles.get(i).setVisible(false);
            } else {
                paneles.get(i).setVisible(true);
            }
        }
    }
    
    public void setCompPanelUsuario(){
            tfIdCrearModUsuario.setText("");
            tfNombreCrearModUsuario.setText("");
            tfApellidoCrearModUsuario.setText("");
            tfDirCrearModUsuario.setText("");
            tfTelefonoCrearModUsuario.setText("");
            tfCelularCrearModUsuario.setText("");
            tfCorreoCrearModUsuario.setText("");
            tfPasswordCrearModUsuario.setText("");
            cbCargoCrearModUsuario.setSelectedItem(" ");
            cbHorarioCrearModUsuario.setSelectedItem(" ");
            cbTipoId.setSelectedItem(" ");
    }
    
    public void usuarioCrearModificar(int state){
        if(state == 0){
            bGuardarCrearModUsuario.setIcon(new ImageIcon(getClass().getResource("save.png")));
            bGuardarCrearModUsuario.setText("Guardar");
            bCancelarCrearModUsuario.setText("Cancelar");
            bCancelarCrearModUsuario.setVisible(true);
            bCancelarCrearModUsuario.setEnabled(true);
            setCompPanelUsuario();
        }
        if(state == 1){
            bGuardarCrearModUsuario.setIcon(new ImageIcon(getClass().getResource("buscar.png")));
            bGuardarCrearModUsuario.setText("Buscar");
            bCancelarCrearModUsuario.setVisible(false);            
            tfNombreCrearModUsuario.setEditable(false);            
            tfApellidoCrearModUsuario.setEditable(false);            
            tfDirCrearModUsuario.setEditable(false);           
            tfTelefonoCrearModUsuario.setEditable(false);            
            tfCelularCrearModUsuario.setEditable(false);           
            tfCorreoCrearModUsuario.setEditable(false);            
            tfPasswordCrearModUsuario.setEditable(false);
            cbCargoCrearModUsuario.setEditable(false);
            cbHorarioCrearModUsuario.setEditable(false);
            cbTipoId.setEditable(false);
            setCompPanelUsuario();
        }
        if(state == 2){
            bGuardarCrearModUsuario.setText("Buscar");
            bCancelarCrearModUsuario.setText("Guardar");
            bCancelarCrearModUsuario.setVisible(true);
            tfNombreCrearModUsuario.setEditable(true);
            tfApellidoCrearModUsuario.setEditable(true);
            tfDirCrearModUsuario.setEditable(true);
            tfTelefonoCrearModUsuario.setEditable(true);
            tfCelularCrearModUsuario.setEditable(true);
            tfCorreoCrearModUsuario.setEditable(true);
            tfPasswordCrearModUsuario.setEditable(true);
            cbCargoCrearModUsuario.setEditable(true);
            cbHorarioCrearModUsuario.setEditable(true);
            cbTipoId.setEditable(true);
            bGuardarCrearModUsuario.setIcon(new ImageIcon(getClass().getResource("buscar.png")));
            bCancelarCrearModUsuario.setIcon(new ImageIcon(getClass().getResource("save.png")));
            bCancelarCrearModUsuario.setEnabled(false);
            setCompPanelUsuario();
        }
        if(state==3){
            bGuardarCrearModUsuario.setText("Buscar");
            bCancelarCrearModUsuario.setText("Eliminar");
            bCancelarCrearModUsuario.setVisible(true);
            tfNombreCrearModUsuario.setEditable(true);
            tfApellidoCrearModUsuario.setEditable(true);
            tfDirCrearModUsuario.setEditable(true);
            tfTelefonoCrearModUsuario.setEditable(true);
            tfCelularCrearModUsuario.setEditable(true);
            tfCorreoCrearModUsuario.setEditable(true);
            tfPasswordCrearModUsuario.setEditable(true);
            cbCargoCrearModUsuario.setEditable(true);
            cbHorarioCrearModUsuario.setEditable(true);
            cbTipoId.setEditable(true);
            bGuardarCrearModUsuario.setIcon(new ImageIcon(getClass().getResource("buscar.png")));
            bCancelarCrearModUsuario.setIcon(new ImageIcon(getClass().getResource("cancel.png")));
            bCancelarCrearModUsuario.setEnabled(false);
            setCompPanelUsuario();
        }
    }
   
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btGroup = new javax.swing.ButtonGroup();
        panelPrincipal = new javax.swing.JPanel();
        lLogo = new javax.swing.JLabel();
        panelAvisoPrueba = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        panelCrear = new javax.swing.JPanel();
        btCrearUsuario = new javax.swing.JButton();
        btCrearFactura = new javax.swing.JButton();
        btCrearPedido = new javax.swing.JButton();
        btCrearItem = new javax.swing.JButton();
        panelOpciones = new javax.swing.JPanel();
        rbCrear = new javax.swing.JRadioButton();
        rbConsultar = new javax.swing.JRadioButton();
        rbModificar = new javax.swing.JRadioButton();
        rbEliminar = new javax.swing.JRadioButton();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        panelCRUDItem = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        ComboCategoria = new javax.swing.JComboBox<>();
        IdItemText = new javax.swing.JTextField();
        PrecioText = new javax.swing.JTextField();
        ImagenText = new javax.swing.JTextField();
        DescripcionText = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        CantidadText = new javax.swing.JTextField();
        Boton2 = new javax.swing.JButton();
        Boton1 = new javax.swing.JButton();
        panelCrearConsultarUsuario = new javax.swing.JPanel();
        tfIdCrearModUsuario = new javax.swing.JTextField();
        tfApellidoCrearModUsuario = new javax.swing.JTextField();
        tfNombreCrearModUsuario = new javax.swing.JTextField();
        tfDirCrearModUsuario = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        tfTelefonoCrearModUsuario = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        tfCelularCrearModUsuario = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        tfCorreoCrearModUsuario = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        tfPasswordCrearModUsuario = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        cbCargoCrearModUsuario = new javax.swing.JComboBox<>();
        cbHorarioCrearModUsuario = new javax.swing.JComboBox<>();
        bGuardarCrearModUsuario = new javax.swing.JButton();
        bCancelarCrearModUsuario = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        cbTipoId = new javax.swing.JComboBox<>();
        panelCRUDPedido = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        idPedidoText = new javax.swing.JTextField();
        idMesaText = new javax.swing.JTextField();
        idMeseroText = new javax.swing.JTextField();
        idTipoText = new javax.swing.JTextField();
        horaInicioText = new javax.swing.JTextField();
        horaEntregaText = new javax.swing.JTextField();
        BotonGuardarPedido = new javax.swing.JButton();
        BotonConsultaPedido = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        panelCRUDFactura = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelPrincipal.setBackground(new java.awt.Color(255, 255, 255));

        lLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logo.PNG"))); // NOI18N

        panelAvisoPrueba.setBackground(new java.awt.Color(255, 255, 255));
        panelAvisoPrueba.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("VERSION");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("DE PRUEBA");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("ORM");

        javax.swing.GroupLayout panelAvisoPruebaLayout = new javax.swing.GroupLayout(panelAvisoPrueba);
        panelAvisoPrueba.setLayout(panelAvisoPruebaLayout);
        panelAvisoPruebaLayout.setHorizontalGroup(
            panelAvisoPruebaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelAvisoPruebaLayout.createSequentialGroup()
                .addContainerGap(57, Short.MAX_VALUE)
                .addGroup(panelAvisoPruebaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(panelAvisoPruebaLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel4))
                    .addGroup(panelAvisoPruebaLayout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jLabel3)))
                .addGap(28, 28, 28))
        );
        panelAvisoPruebaLayout.setVerticalGroup(
            panelAvisoPruebaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAvisoPruebaLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelCrear.setBackground(new java.awt.Color(255, 255, 255));
        panelCrear.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Elementos: ", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 3, 11))); // NOI18N

        btCrearUsuario.setText("Usuario");
        btCrearUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCrearUsuarioActionPerformed(evt);
            }
        });

        btCrearFactura.setText("Factura");

        btCrearPedido.setText("Pedido");
        btCrearPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCrearPedidoActionPerformed(evt);
            }
        });

        btCrearItem.setText("Item");
        btCrearItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCrearItemActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelCrearLayout = new javax.swing.GroupLayout(panelCrear);
        panelCrear.setLayout(panelCrearLayout);
        panelCrearLayout.setHorizontalGroup(
            panelCrearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCrearLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(btCrearUsuario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btCrearFactura)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btCrearPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btCrearItem, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelCrearLayout.setVerticalGroup(
            panelCrearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCrearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(btCrearUsuario)
                .addComponent(btCrearFactura)
                .addComponent(btCrearPedido)
                .addComponent(btCrearItem))
        );

        panelOpciones.setBackground(new java.awt.Color(255, 255, 255));
        panelOpciones.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Opciones: ", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 3, 11))); // NOI18N

        rbCrear.setBackground(new java.awt.Color(255, 255, 255));
        rbCrear.setText("Crear");

        rbConsultar.setBackground(new java.awt.Color(255, 255, 255));
        rbConsultar.setText("Consultar");

        rbModificar.setBackground(new java.awt.Color(255, 255, 255));
        rbModificar.setText("Modificar");

        rbEliminar.setBackground(new java.awt.Color(255, 255, 255));
        rbEliminar.setText("Eliminar");

        javax.swing.GroupLayout panelOpcionesLayout = new javax.swing.GroupLayout(panelOpciones);
        panelOpciones.setLayout(panelOpcionesLayout);
        panelOpcionesLayout.setHorizontalGroup(
            panelOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelOpcionesLayout.createSequentialGroup()
                .addComponent(rbCrear)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbConsultar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbModificar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbEliminar))
        );
        panelOpcionesLayout.setVerticalGroup(
            panelOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelOpcionesLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(panelOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbCrear)
                    .addComponent(rbConsultar)
                    .addComponent(rbModificar)
                    .addComponent(rbEliminar)))
        );

        jLayeredPane1.setBackground(new java.awt.Color(204, 204, 204));
        jLayeredPane1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel18.setText("Id Item:");

        jLabel19.setText("Precio Actual:");

        jLabel20.setText("Descripcion:");

        jLabel21.setText("Cantidad :");

        ComboCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1" }));
        ComboCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboCategoriaActionPerformed(evt);
            }
        });

        IdItemText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IdItemTextActionPerformed(evt);
            }
        });

        ImagenText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ImagenTextActionPerformed(evt);
            }
        });

        jLabel23.setText("Categoria:");

        jButton1.setText("Imagen");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        CantidadText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CantidadTextActionPerformed(evt);
            }
        });

        Boton2.setText("Cancelar");
        Boton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton2ActionPerformed(evt);
            }
        });

        Boton1.setText("Guardar");
        Boton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelCRUDItemLayout = new javax.swing.GroupLayout(panelCRUDItem);
        panelCRUDItem.setLayout(panelCRUDItemLayout);
        panelCRUDItemLayout.setHorizontalGroup(
            panelCRUDItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCRUDItemLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(panelCRUDItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel19)
                    .addComponent(jLabel18)
                    .addComponent(jLabel20)
                    .addComponent(jLabel21)
                    .addComponent(jLabel23))
                .addGap(70, 70, 70)
                .addGroup(panelCRUDItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CantidadText)
                    .addComponent(IdItemText)
                    .addComponent(PrecioText)
                    .addComponent(DescripcionText)
                    .addComponent(ComboCategoria, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(71, 71, 71)
                .addGroup(panelCRUDItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ImagenText, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(76, 76, 76))
            .addGroup(panelCRUDItemLayout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addComponent(Boton1, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(83, 83, 83)
                .addComponent(Boton2, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(143, Short.MAX_VALUE))
        );
        panelCRUDItemLayout.setVerticalGroup(
            panelCRUDItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCRUDItemLayout.createSequentialGroup()
                .addGroup(panelCRUDItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCRUDItemLayout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(panelCRUDItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(IdItemText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel18))
                        .addGap(18, 18, 18)
                        .addGroup(panelCRUDItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel19)
                            .addComponent(PrecioText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(panelCRUDItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel20)
                            .addComponent(DescripcionText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(panelCRUDItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel21)
                            .addComponent(CantidadText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panelCRUDItemLayout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(panelCRUDItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel23)
                    .addGroup(panelCRUDItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(ComboCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(ImagenText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                .addGroup(panelCRUDItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Boton2, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Boton1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21))
        );

        panelCrearConsultarUsuario.setBackground(new java.awt.Color(204, 204, 204));

        jLabel2.setText("Identificacion: ");

        jLabel5.setText("Nombre: ");

        jLabel6.setText("Apellidos: ");

        jLabel7.setText("Dirreccion: ");

        jLabel8.setText("Telefono: ");

        jLabel9.setText("Celular: ");

        jLabel10.setText("Correo: ");

        jLabel11.setText("Contraseña: ");

        jLabel12.setText("Cargo: ");

        jLabel13.setText("Horario: ");

        cbCargoCrearModUsuario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "Gerente", "Cajero", "Mesero" }));

        cbHorarioCrearModUsuario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "Mañana", "Tarde", "Noche" }));

        bGuardarCrearModUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/save.png"))); // NOI18N
        bGuardarCrearModUsuario.setText("Guardar");
        bGuardarCrearModUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bGuardarCrearModUsuarioActionPerformed(evt);
            }
        });

        bCancelarCrearModUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cancel.png"))); // NOI18N
        bCancelarCrearModUsuario.setText("Cancelar");
        bCancelarCrearModUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCancelarCrearModUsuarioActionPerformed(evt);
            }
        });

        jLabel14.setText("TipoId:");

        cbTipoId.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "Cedula Ciudadania", "Pasaporte", "Tarjeta Identidad" }));

        javax.swing.GroupLayout panelCrearConsultarUsuarioLayout = new javax.swing.GroupLayout(panelCrearConsultarUsuario);
        panelCrearConsultarUsuario.setLayout(panelCrearConsultarUsuarioLayout);
        panelCrearConsultarUsuarioLayout.setHorizontalGroup(
            panelCrearConsultarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCrearConsultarUsuarioLayout.createSequentialGroup()
                .addGroup(panelCrearConsultarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCrearConsultarUsuarioLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panelCrearConsultarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(panelCrearConsultarUsuarioLayout.createSequentialGroup()
                                .addGroup(panelCrearConsultarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel9))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(panelCrearConsultarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfCelularCrearModUsuario)
                                    .addComponent(tfTelefonoCrearModUsuario)
                                    .addComponent(tfNombreCrearModUsuario)
                                    .addComponent(tfIdCrearModUsuario)))
                            .addGroup(panelCrearConsultarUsuarioLayout.createSequentialGroup()
                                .addGroup(panelCrearConsultarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(panelCrearConsultarUsuarioLayout.createSequentialGroup()
                                        .addComponent(jLabel13)
                                        .addGap(21, 21, 21)))
                                .addGap(18, 18, 18)
                                .addGroup(panelCrearConsultarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfPasswordCrearModUsuario)
                                    .addComponent(cbHorarioCrearModUsuario, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(67, 67, 67))
                    .addGroup(panelCrearConsultarUsuarioLayout.createSequentialGroup()
                        .addGap(175, 175, 175)
                        .addComponent(bGuardarCrearModUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(panelCrearConsultarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bCancelarCrearModUsuario)
                    .addGroup(panelCrearConsultarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(panelCrearConsultarUsuarioLayout.createSequentialGroup()
                            .addComponent(jLabel12)
                            .addGap(36, 36, 36)
                            .addComponent(cbCargoCrearModUsuario, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(panelCrearConsultarUsuarioLayout.createSequentialGroup()
                            .addGroup(panelCrearConsultarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(panelCrearConsultarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addComponent(jLabel14))
                            .addGap(18, 18, 18)
                            .addGroup(panelCrearConsultarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(tfApellidoCrearModUsuario)
                                .addComponent(tfDirCrearModUsuario)
                                .addComponent(cbTipoId, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(tfCorreoCrearModUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(26, 26, 26))
        );
        panelCrearConsultarUsuarioLayout.setVerticalGroup(
            panelCrearConsultarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCrearConsultarUsuarioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelCrearConsultarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCrearConsultarUsuarioLayout.createSequentialGroup()
                        .addGroup(panelCrearConsultarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(cbTipoId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23)
                        .addGroup(panelCrearConsultarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfApellidoCrearModUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addGroup(panelCrearConsultarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfDirCrearModUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)))
                    .addGroup(panelCrearConsultarUsuarioLayout.createSequentialGroup()
                        .addGroup(panelCrearConsultarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfIdCrearModUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(panelCrearConsultarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfNombreCrearModUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(panelCrearConsultarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfTelefonoCrearModUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addGap(18, 18, 18)
                        .addGroup(panelCrearConsultarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfCelularCrearModUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9)
                            .addComponent(tfCorreoCrearModUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addGap(18, 18, 18)
                        .addGroup(panelCrearConsultarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelCrearConsultarUsuarioLayout.createSequentialGroup()
                                .addGroup(panelCrearConsultarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel11)
                                    .addComponent(tfPasswordCrearModUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(panelCrearConsultarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel13)
                                    .addComponent(cbHorarioCrearModUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(panelCrearConsultarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel12)
                                .addComponent(cbCargoCrearModUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addGroup(panelCrearConsultarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bGuardarCrearModUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bCancelarCrearModUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33))
        );

        jLabel16.setText("PANEL DE PEDIDO");

        jLabel17.setText("Id Pedido");

        jLabel22.setText("Id Mesa");

        jLabel24.setText("Id Mesero");

        jLabel25.setText("id Tipo");

        jLabel26.setText("Hora Inicio");

        jLabel27.setText("Hora Entrega");

        BotonGuardarPedido.setText("Guardar");
        BotonGuardarPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonGuardarPedidoActionPerformed(evt);
            }
        });

        BotonConsultaPedido.setText("Consultar");
        BotonConsultaPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonConsultaPedidoActionPerformed(evt);
            }
        });

        jButton2.setText("Eliminar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelCRUDPedidoLayout = new javax.swing.GroupLayout(panelCRUDPedido);
        panelCRUDPedido.setLayout(panelCRUDPedidoLayout);
        panelCRUDPedidoLayout.setHorizontalGroup(
            panelCRUDPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCRUDPedidoLayout.createSequentialGroup()
                .addGroup(panelCRUDPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCRUDPedidoLayout.createSequentialGroup()
                        .addGap(299, 299, 299)
                        .addComponent(jLabel16))
                    .addGroup(panelCRUDPedidoLayout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(panelCRUDPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(panelCRUDPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel22)
                                .addComponent(jLabel24)
                                .addComponent(jLabel26)
                                .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelCRUDPedidoLayout.createSequentialGroup()
                                .addComponent(jLabel27)
                                .addGap(49, 49, 49)))
                        .addGap(37, 37, 37)
                        .addGroup(panelCRUDPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(idPedidoText)
                            .addComponent(idMesaText)
                            .addComponent(idMeseroText)
                            .addComponent(idTipoText)
                            .addComponent(horaInicioText, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)
                            .addComponent(horaEntregaText))
                        .addGap(98, 98, 98)
                        .addGroup(panelCRUDPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BotonGuardarPedido)
                            .addComponent(BotonConsultaPedido)
                            .addComponent(jButton2))))
                .addContainerGap(172, Short.MAX_VALUE))
        );
        panelCRUDPedidoLayout.setVerticalGroup(
            panelCRUDPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCRUDPedidoLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel16)
                .addGroup(panelCRUDPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCRUDPedidoLayout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCRUDPedidoLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelCRUDPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(idPedidoText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BotonGuardarPedido))))
                .addGroup(panelCRUDPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCRUDPedidoLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(panelCRUDPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(idMesaText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel22))
                        .addGap(18, 18, 18)
                        .addGroup(panelCRUDPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel24)
                            .addComponent(idMeseroText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panelCRUDPedidoLayout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(BotonConsultaPedido)))
                .addGap(18, 18, 18)
                .addGroup(panelCRUDPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idTipoText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelCRUDPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(horaInicioText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel26))
                .addGap(23, 23, 23)
                .addGroup(panelCRUDPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel27)
                    .addComponent(horaEntregaText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        jLabel15.setText("PANEL DE FACTURA");

        javax.swing.GroupLayout panelCRUDFacturaLayout = new javax.swing.GroupLayout(panelCRUDFactura);
        panelCRUDFactura.setLayout(panelCRUDFacturaLayout);
        panelCRUDFacturaLayout.setHorizontalGroup(
            panelCRUDFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCRUDFacturaLayout.createSequentialGroup()
                .addGap(301, 301, 301)
                .addComponent(jLabel15)
                .addContainerGap(278, Short.MAX_VALUE))
        );
        panelCRUDFacturaLayout.setVerticalGroup(
            panelCRUDFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCRUDFacturaLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel15)
                .addContainerGap(313, Short.MAX_VALUE))
        );

        jLayeredPane1.setLayer(panelCRUDItem, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(panelCrearConsultarUsuario, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(panelCRUDPedido, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(panelCRUDFactura, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addComponent(panelCrearConsultarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(panelCRUDItem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(panelCRUDPedido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(panelCRUDFactura, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addComponent(panelCrearConsultarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 27, Short.MAX_VALUE))
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(panelCRUDItem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(panelCRUDPedido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(panelCRUDFactura, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelPrincipalLayout = new javax.swing.GroupLayout(panelPrincipal);
        panelPrincipal.setLayout(panelPrincipalLayout);
        panelPrincipalLayout.setHorizontalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addComponent(panelOpciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelCrear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jLayeredPane1)
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addComponent(lLogo)
                .addGap(18, 18, 18)
                .addComponent(panelAvisoPrueba, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelPrincipalLayout.setVerticalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lLogo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelAvisoPrueba, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelOpciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelCrear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLayeredPane1)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btCrearUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCrearUsuarioActionPerformed
        // TODO add your handling code here:
        if(rbCrear.isSelected()){
            setPanelesInvisible(0);
            usuarioCrearModificar(0);//Para hacer el cambio en los botones
            setCompPanelUsuario();
            
        }
        
        if(rbConsultar.isSelected()){
            setPanelesInvisible(0);
            usuarioCrearModificar(1);//Para hacer el cambio en los botones
            setCompPanelUsuario();
        }
        
        if(rbModificar.isSelected()){
            setPanelesInvisible(0);
            usuarioCrearModificar(2);
            setCompPanelUsuario();
        }
        
        if(rbEliminar.isSelected()){
            setPanelesInvisible(0);
            usuarioCrearModificar(3);
            setCompPanelUsuario();
        }

    }//GEN-LAST:event_btCrearUsuarioActionPerformed

    private void bGuardarCrearModUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bGuardarCrearModUsuarioActionPerformed
        // TODO add your handling code here:
        ModelMain<Personal> modelo = new ModelMain();
        if(bGuardarCrearModUsuario.getText().equalsIgnoreCase("Guardar")){
            String id = tfIdCrearModUsuario.getText();
            String tipoId = (String)cbTipoId.getSelectedItem();
            String nombre = tfNombreCrearModUsuario.getText();
            String apellido = tfApellidoCrearModUsuario.getText();
            String telefono = tfTelefonoCrearModUsuario.getText();
            String direccion = tfDirCrearModUsuario.getText();
            String celular = tfCelularCrearModUsuario.getText();
            String correo = tfCorreoCrearModUsuario.getText();
            String contrasena = tfPasswordCrearModUsuario.getText();
            String cargo = (String)cbCargoCrearModUsuario.getSelectedItem();
            String horario = (String)cbHorarioCrearModUsuario.getSelectedItem();
            Personal persona = new Personal(id, nombre, apellido, tipoId, cargo, horario, id, direccion, 
                                            telefono, celular, correo, contrasena, null, null);
            modelo.insertIdString(persona);
        }
        if(bGuardarCrearModUsuario.getText().equalsIgnoreCase("Buscar")&& rbConsultar.isSelected()){
            String id = tfIdCrearModUsuario.getText();
            Personal persona = new Personal();
            persona = modelo.getByID(persona.getClass(), id);
            if(persona != null){
                tfNombreCrearModUsuario.setText(persona.getNombre());
                tfApellidoCrearModUsuario.setText(persona.getApellido());
                tfDirCrearModUsuario.setText(persona.getDireccion());
                tfTelefonoCrearModUsuario.setText(persona.getTelefonoFijo());
                tfCelularCrearModUsuario.setText(persona.getTelefonoCelular());
                tfCorreoCrearModUsuario.setText(persona.getCorreo());
                tfPasswordCrearModUsuario.setText(persona.getContrasena());
                cbCargoCrearModUsuario.setSelectedItem(persona.getCargo());
                cbHorarioCrearModUsuario.setSelectedItem(persona.getHorarioTurno());
                cbTipoId.setSelectedItem(persona.getTipoIdentificacion());
            }else{
                JOptionPane.showMessageDialog(null, "No se encuentra el usuario");
                usuarioCrearModificar(1);
            }   
        }
        
        if(bGuardarCrearModUsuario.getText().equalsIgnoreCase("Buscar")&& rbModificar.isSelected()){
            String id = tfIdCrearModUsuario.getText();
            Personal persona = new Personal();
            persona = modelo.getByID(persona.getClass(), id);
            if(persona != null){
                tfNombreCrearModUsuario.setText(persona.getNombre());
                tfApellidoCrearModUsuario.setText(persona.getApellido());
                tfDirCrearModUsuario.setText(persona.getDireccion());
                tfTelefonoCrearModUsuario.setText(persona.getTelefonoFijo());
                tfCelularCrearModUsuario.setText(persona.getTelefonoCelular());
                tfCorreoCrearModUsuario.setText(persona.getCorreo());
                tfPasswordCrearModUsuario.setText(persona.getContrasena());
                cbCargoCrearModUsuario.setSelectedItem(persona.getCargo());
                cbHorarioCrearModUsuario.setSelectedItem(persona.getHorarioTurno());
                cbTipoId.setSelectedItem(persona.getTipoIdentificacion());
                bCancelarCrearModUsuario.setEnabled(true);
            }else{
                JOptionPane.showMessageDialog(null, "No se encuentra el usuario");
                usuarioCrearModificar(1);
            }   
        }
        
        if(bGuardarCrearModUsuario.getText().equalsIgnoreCase("Buscar")&& rbEliminar.isSelected()){
            String id = tfIdCrearModUsuario.getText();
            Personal persona = new Personal();
            persona = modelo.getByID(persona.getClass(), id);
            if(persona != null){
                tfNombreCrearModUsuario.setText(persona.getNombre());
                tfApellidoCrearModUsuario.setText(persona.getApellido());
                tfDirCrearModUsuario.setText(persona.getDireccion());
                tfTelefonoCrearModUsuario.setText(persona.getTelefonoFijo());
                tfCelularCrearModUsuario.setText(persona.getTelefonoCelular());
                tfCorreoCrearModUsuario.setText(persona.getCorreo());
                tfPasswordCrearModUsuario.setText(persona.getContrasena());
                cbCargoCrearModUsuario.setSelectedItem(persona.getCargo());
                cbHorarioCrearModUsuario.setSelectedItem(persona.getHorarioTurno());
                cbTipoId.setSelectedItem(persona.getTipoIdentificacion());
                bCancelarCrearModUsuario.setEnabled(true);
            }else{
                JOptionPane.showMessageDialog(null, "No se encuentra el usuario");
                usuarioCrearModificar(1);
            }
        }
        
    }//GEN-LAST:event_bGuardarCrearModUsuarioActionPerformed

    private void bCancelarCrearModUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCancelarCrearModUsuarioActionPerformed
        // TODO add your handling code here:
        
        ModelMain<Personal> modelo = new ModelMain();
        
        if(bCancelarCrearModUsuario.getText().equalsIgnoreCase("Guardar")&& rbModificar.isSelected()){
            String id = tfIdCrearModUsuario.getText();
            String tipoId = (String)cbTipoId.getSelectedItem();
            String nombre = tfNombreCrearModUsuario.getText();
            String apellido = tfApellidoCrearModUsuario.getText();
            String telefono = tfTelefonoCrearModUsuario.getText();
            String direccion = tfDirCrearModUsuario.getText();
            String celular = tfCelularCrearModUsuario.getText();
            String correo = tfCorreoCrearModUsuario.getText();
            String contrasena = tfPasswordCrearModUsuario.getText();
            String cargo = (String)cbCargoCrearModUsuario.getSelectedItem();
            String horario = (String)cbHorarioCrearModUsuario.getSelectedItem();
            Personal persona = new Personal(id, nombre, apellido, tipoId, cargo, horario, id, direccion, 
                                            telefono, celular, correo, contrasena, null, null);
            modelo.update(persona);
            JOptionPane.showMessageDialog(null, "Modificado con Exito");
            usuarioCrearModificar(2);
        }
        
        if(bCancelarCrearModUsuario.getText().equalsIgnoreCase("Eliminar")&& rbEliminar.isSelected()){
            String id = tfIdCrearModUsuario.getText();
            String tipoId = (String)cbTipoId.getSelectedItem();
            String nombre = tfNombreCrearModUsuario.getText();
            String apellido = tfApellidoCrearModUsuario.getText();
            String telefono = tfTelefonoCrearModUsuario.getText();
            String direccion = tfDirCrearModUsuario.getText();
            String celular = tfCelularCrearModUsuario.getText();
            String correo = tfCorreoCrearModUsuario.getText();
            String contrasena = tfPasswordCrearModUsuario.getText();
            String cargo = (String)cbCargoCrearModUsuario.getSelectedItem();
            String horario = (String)cbHorarioCrearModUsuario.getSelectedItem();
            Personal persona = new Personal(id, nombre, apellido, tipoId, cargo, horario, id, direccion, 
                                            telefono, celular, correo, contrasena, null, null);
            modelo.delete(persona);
            JOptionPane.showMessageDialog(null, "Eliminado con Exito");
            setCompPanelUsuario();
        }
    }//GEN-LAST:event_bCancelarCrearModUsuarioActionPerformed

    private void ComboCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboCategoriaActionPerformed
        
    }//GEN-LAST:event_ComboCategoriaActionPerformed
    public void setCompPanelItem(){
            IdItemText.setText("");
            PrecioText.setText("");
            DescripcionText.setText("");
            CantidadText.setText("");
            ImagenText.setText("");
            ComboCategoria.setSelectedItem(" ");

    }
    public void itemCrearModificar(int state){
        if(state == 0){
            Boton1.setIcon(new ImageIcon(getClass().getResource("save.png")));
            Boton1.setText("Guardar");
            Boton2.setText("Cancelar");
            Boton2.setIcon(new ImageIcon(getClass().getResource("cancel.png")));
            Boton2.setVisible(true);
            Boton2.setEnabled(true);
            setCompPanelItem();
        }
        if(state == 1){
            Boton1.setIcon(new ImageIcon(getClass().getResource("buscar.png")));
            Boton1.setText("Buscar");
            Boton2.setVisible(false);            
            PrecioText.setEditable(false);            
            DescripcionText.setEditable(false);            
            CantidadText.setEditable(false);           
            ImagenText.setEditable(false);            
            ComboCategoria.setEnabled(false);
            setCompPanelItem();
        }
        if(state == 2){
            Boton1.setText("Buscar");
            Boton2.setText("Guardar");
            Boton2.setVisible(true);
            PrecioText.setEditable(true);            
            DescripcionText.setEditable(true);            
            CantidadText.setEditable(true);           
            ImagenText.setEditable(true);            
            ComboCategoria.setEnabled(true);
            Boton1.setIcon(new ImageIcon(getClass().getResource("buscar.png")));
            Boton2.setIcon(new ImageIcon(getClass().getResource("save.png")));
            Boton2.setEnabled(false);
            setCompPanelItem();
        }
        if(state==3){
            Boton1.setText("Buscar");
            Boton2.setText("Eliminar");
            Boton2.setVisible(true);
            PrecioText.setEditable(true);            
            DescripcionText.setEditable(true);            
            CantidadText.setEditable(true);           
            ImagenText.setEditable(true);            
            ComboCategoria.setEnabled(true);
            Boton1.setIcon(new ImageIcon(getClass().getResource("buscar.png")));
            Boton2.setIcon(new ImageIcon(getClass().getResource("cancel.png")));
            Boton2.setEnabled(false);
            setCompPanelItem();
        }
    }
    private void btCrearItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCrearItemActionPerformed
        if(rbCrear.isSelected()){
            setPanelesInvisible(1);
            itemCrearModificar(0);//Para hacer el cambio en los botones
            setCompPanelUsuario();
            
        }
        
        if(rbConsultar.isSelected()){
            setPanelesInvisible(1);
            itemCrearModificar(1);//Para hacer el cambio en los botones
            setCompPanelUsuario();
        }
        
        if(rbModificar.isSelected()){
            setPanelesInvisible(1);
            itemCrearModificar(2);
            setCompPanelUsuario();
        }
        
        if(rbEliminar.isSelected()){
            setPanelesInvisible(1);
            itemCrearModificar(3);
            setCompPanelUsuario();
        }
    }//GEN-LAST:event_btCrearItemActionPerformed

    private void IdItemTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IdItemTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IdItemTextActionPerformed

    private void ImagenTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ImagenTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ImagenTextActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        JFileChooser fc=new JFileChooser();
        fc.setCurrentDirectory(new File("/imagenes"));
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("*.png", "png");
 
//Le indicamos el filtro
        fc.setFileFilter(filtro);
//Abrimos la ventana, guardamos la opcion seleccionada por el usuario
        int seleccion=fc.showOpenDialog(this);
 
//Si el usuario, pincha en aceptar
        if(seleccion==JFileChooser.APPROVE_OPTION){
        

    //Seleccionamos el fichero
        File fichero=fc.getSelectedFile();
        //Creamos el filtro

    //Ecribe la ruta del fichero seleccionado en el campo de texto
        ImagenText.setText(fichero.getAbsolutePath());
}
    }//GEN-LAST:event_jButton1ActionPerformed

    private void CantidadTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CantidadTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CantidadTextActionPerformed

    private void Boton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton2ActionPerformed
        ModelMain<Personal> modelo = new ModelMain();
        
        if(Boton2.getText().equalsIgnoreCase("Guardar")&& rbModificar.isSelected()){
            String id = IdItemText.getText();
            String foto = ImagenText.getText();
            int precio = Integer.parseInt(PrecioText.getText());
            String descripcion = DescripcionText.getText();
            String cat = (String)ComboCategoria.getSelectedItem();
            int cantidad =Integer.parseInt(CantidadText.getText());
            
            Categoria categoria = new Categoria();
            categoria = modelo.getByID(categoria.getClass(), cat);
            
            ItemMenu item = new ItemMenu(id, categoria, foto, precio, descripcion, cantidad, null, null );
            modelo.update(item);
            JOptionPane.showMessageDialog(null, "Modificado con Exito");
            itemCrearModificar(2);
        }
        
        if(Boton2.getText().equalsIgnoreCase("Eliminar")&& rbEliminar.isSelected()){
            String id = IdItemText.getText(); 
            String foto = ImagenText.getText();
            int precio = Integer.parseInt(PrecioText.getText());
            String descripcion = DescripcionText.getText();
            String cat = (String)ComboCategoria.getSelectedItem();
            int cantidad =Integer.parseInt(CantidadText.getText());
            Categoria categoria = new Categoria();
            categoria = modelo.getByID(categoria.getClass(), cat);
            
            ItemMenu item = new ItemMenu(id, categoria, foto, precio, descripcion, cantidad, null, null );
            modelo.delete(item);
            JOptionPane.showMessageDialog(null, "Eliminado con Exito");
            setCompPanelItem();
        }
        
        
    }//GEN-LAST:event_Boton2ActionPerformed

    private void Boton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton1ActionPerformed
        
        ModelMain<ItemMenu> modelo = new ModelMain();
        ModelMain<Categoria> modelocategoria = new ModelMain();
        
        if(Boton1.getText().equalsIgnoreCase("Guardar")){
            String id = IdItemText.getText();
            String foto = ImagenText.getText();
            int precio = Integer.parseInt(PrecioText.getText());
            String descripcion = DescripcionText.getText();
            String cat = (String)ComboCategoria.getSelectedItem();
            int cantidad =Integer.parseInt(CantidadText.getText());
                      
            Categoria categoria = new Categoria();
            categoria = modelo.getByID(categoria.getClass(), cat);
            
            ItemMenu item = new ItemMenu(id, categoria, foto, precio, descripcion, cantidad, null, null );
            modelo.insertIdString(item);
        }
        if(Boton1.getText().equalsIgnoreCase("Buscar")&& rbConsultar.isSelected()){
            String id = IdItemText.getText();
            ItemMenu item = new ItemMenu();
            item = modelo.getByID(item.getClass(), id);
            if(item != null){
                ImagenText.setText(item.getFotografia());
                DescripcionText.setText(item.getDescripcion());
                PrecioText.setText(String.valueOf(item.getPrecioActual()));
                CantidadText.setText(String.valueOf(item.getCantidadDisponible()));
                ComboCategoria.setSelectedItem(item.getCategoria());
                
            }else{
                JOptionPane.showMessageDialog(null, "No se encuentra el Item en el Menu");
                usuarioCrearModificar(1);
            }   
        }
        
        if(Boton1.getText().equalsIgnoreCase("Buscar")&& rbModificar.isSelected()){
            String id = IdItemText.getText();
            ItemMenu item = new ItemMenu();
            item = modelo.getByID(item.getClass(), id);
            if(item != null){
                ImagenText.setText(item.getFotografia());
                DescripcionText.setText(item.getDescripcion());
                PrecioText.setText(String.valueOf(item.getPrecioActual()));
                CantidadText.setText(String.valueOf(item.getCantidadDisponible()));
                ComboCategoria.setSelectedItem(item.getCategoria());
                Boton2.setEnabled(true);
            }else{
                JOptionPane.showMessageDialog(null, "No se encuentra el Item en El menu");
                usuarioCrearModificar(1);
            }   
        }
        
        if(Boton1.getText().equalsIgnoreCase("Buscar")&& rbEliminar.isSelected()){
            String id = IdItemText.getText();
            ItemMenu item = new ItemMenu();
            item = modelo.getByID(item.getClass(), id);
            if(item != null){
                ImagenText.setText(item.getFotografia());
                DescripcionText.setText(item.getDescripcion());
                PrecioText.setText(String.valueOf(item.getPrecioActual()));
                CantidadText.setText(String.valueOf(item.getCantidadDisponible()));
                ComboCategoria.setSelectedItem(item.getCategoria());
                Boton2.setEnabled(true);
            }else{
                JOptionPane.showMessageDialog(null, "No se encuentra el Item");
                itemCrearModificar(1);
            }
        }
        
        
    }//GEN-LAST:event_Boton1ActionPerformed

    private void btCrearPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCrearPedidoActionPerformed
        // TODO add your handling code here:
        if(rbCrear.isSelected()){
            setPanelesInvisible(2);
            setCompPanelUsuario();
        }
    }//GEN-LAST:event_btCrearPedidoActionPerformed

    private void BotonGuardarPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonGuardarPedidoActionPerformed
        // TODO add your handling code here:
        String idPedido=idPedidoText.getText();
        String idMesa=idMesaText.getText();
        String idMesero=idMeseroText.getText();
        String idTipo=idTipoText.getText();
        String horaInicio=horaInicioText.getText();
        String horaEntrega=horaEntregaText.getText();
        
        ModelMain<Personal> personal = new ModelMain();
        Personal mesero = new Personal();
        mesero = personal.getByID(mesero.getClass(),idMesero);
            
        ModelMain<ItemMenu> modelo = new ModelMain();
        ModelMain<Pedido> modeloPedido = new ModelMain();
        Categoria categoria = new Categoria();
       
        Date hInicio=null;
        Date hEntrega=null;
        
        
        try{
            SimpleDateFormat hi=new SimpleDateFormat("yyyy/mm/d",Locale.ENGLISH);
            hInicio=hi.parse(horaInicio);
            hEntrega=hi.parse(horaEntrega);
        }catch(Exception e){}
        
        
        Pedido objPedido = new Pedido(idPedido, mesero, idMesa, idTipo, hInicio, hEntrega,null);
        modeloPedido.insertIdString(objPedido);   
                
        
    }//GEN-LAST:event_BotonGuardarPedidoActionPerformed

    private void BotonConsultaPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonConsultaPedidoActionPerformed
        // TODO add your handling code here:
        String idPedido=idPedidoText.getText();
        Pedido objPedido=new Pedido();
        
        ModelMain<Pedido> modeloPedido = new ModelMain();
        
        objPedido = modeloPedido.getByID(objPedido.getClass(), idPedido);
            if(objPedido != null){
                idMesaText.setText(objPedido.getIdMesa());
                idMeseroText.setText(objPedido.getPersonal().getIdPersonal());
                idTipoText.setText(objPedido.getIdTipo());
                horaInicioText.setText(objPedido.getHoraInicio().toString());
                horaEntregaText.setText(objPedido.getHoraEntrega().toString());
                
            }else{
                JOptionPane.showMessageDialog(null, "No se encuentra el pedido ");
            }
        
        
        
    }//GEN-LAST:event_BotonConsultaPedidoActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        String idPedido=idPedidoText.getText();
        
        ModelMain<Pedido> modeloPedido = new ModelMain();
        Pedido objPedido=new Pedido();
        objPedido = modeloPedido.getByID(objPedido.getClass(), idPedido);
         modeloPedido.delete(objPedido);
        
        
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Gui().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Boton1;
    private javax.swing.JButton Boton2;
    private javax.swing.JButton BotonConsultaPedido;
    private javax.swing.JButton BotonGuardarPedido;
    private javax.swing.JTextField CantidadText;
    private javax.swing.JComboBox<String> ComboCategoria;
    private javax.swing.JTextField DescripcionText;
    private javax.swing.JTextField IdItemText;
    private javax.swing.JTextField ImagenText;
    private javax.swing.JTextField PrecioText;
    private javax.swing.JButton bCancelarCrearModUsuario;
    private javax.swing.JButton bGuardarCrearModUsuario;
    private javax.swing.JButton btCrearFactura;
    private javax.swing.JButton btCrearItem;
    private javax.swing.JButton btCrearPedido;
    private javax.swing.JButton btCrearUsuario;
    private javax.swing.ButtonGroup btGroup;
    private javax.swing.JComboBox<String> cbCargoCrearModUsuario;
    private javax.swing.JComboBox<String> cbHorarioCrearModUsuario;
    private javax.swing.JComboBox<String> cbTipoId;
    private javax.swing.JTextField horaEntregaText;
    private javax.swing.JTextField horaInicioText;
    private javax.swing.JTextField idMesaText;
    private javax.swing.JTextField idMeseroText;
    private javax.swing.JTextField idPedidoText;
    private javax.swing.JTextField idTipoText;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JLabel lLogo;
    private javax.swing.JPanel panelAvisoPrueba;
    private javax.swing.JPanel panelCRUDFactura;
    private javax.swing.JPanel panelCRUDItem;
    private javax.swing.JPanel panelCRUDPedido;
    private javax.swing.JPanel panelCrear;
    private javax.swing.JPanel panelCrearConsultarUsuario;
    private javax.swing.JPanel panelOpciones;
    private javax.swing.JPanel panelPrincipal;
    private javax.swing.JRadioButton rbConsultar;
    private javax.swing.JRadioButton rbCrear;
    private javax.swing.JRadioButton rbEliminar;
    private javax.swing.JRadioButton rbModificar;
    private javax.swing.JTextField tfApellidoCrearModUsuario;
    private javax.swing.JTextField tfCelularCrearModUsuario;
    private javax.swing.JTextField tfCorreoCrearModUsuario;
    private javax.swing.JTextField tfDirCrearModUsuario;
    private javax.swing.JTextField tfIdCrearModUsuario;
    private javax.swing.JTextField tfNombreCrearModUsuario;
    private javax.swing.JTextField tfPasswordCrearModUsuario;
    private javax.swing.JTextField tfTelefonoCrearModUsuario;
    // End of variables declaration//GEN-END:variables
}
