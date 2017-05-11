/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import entity.Categoria;
import entity.Factura;
import entity.FacturaFormaPagoId;
import entity.FacturaItems;
import entity.FormaPago;
import entity.ItemMenu;
import entity.PedidoItem;
import entity.Personal;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.filechooser.FileNameExtensionFilter;
import models.ModelMain;

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
        ComboCategoria = new javax.swing.JComboBox<String>();
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
        cbCargoCrearModUsuario = new javax.swing.JComboBox<String>();
        cbHorarioCrearModUsuario = new javax.swing.JComboBox<String>();
        bGuardarCrearModUsuario = new javax.swing.JButton();
        bCancelarCrearModUsuario = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        cbTipoId = new javax.swing.JComboBox<String>();
        panelCRUDPedido = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        panelCRUDFactura = new javax.swing.JPanel();
        CancelarGuardarFactura = new javax.swing.JButton();
        GuardarFactura = new javax.swing.JButton();
        Propina = new javax.swing.JComboBox<String>();
        id_cliente = new javax.swing.JTextField();
        descuento_factura = new javax.swing.JTextField();
        id_factura = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        totalPago = new javax.swing.JTextField();
        IdPersonalFactura = new javax.swing.JTextField();
        Impuesto = new javax.swing.JTextField();
        Impuestos = new javax.swing.JLabel();

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
        btCrearFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCrearFacturaActionPerformed(evt);
            }
        });

        btCrearPedido.setText("Pedido");

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

        ComboCategoria.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1" }));
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

        cbCargoCrearModUsuario.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "", "Gerente", "Cajero", "Mesero" }));

        cbHorarioCrearModUsuario.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "", "Mañana", "Tarde", "Noche" }));

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

        cbTipoId.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "", "Cedula Ciudadania", "Pasaporte", "Tarjeta Identidad" }));

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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                .addGroup(panelCrearConsultarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bGuardarCrearModUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bCancelarCrearModUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33))
        );

        jLabel16.setText("PANEL DE PEDIDO");

        javax.swing.GroupLayout panelCRUDPedidoLayout = new javax.swing.GroupLayout(panelCRUDPedido);
        panelCRUDPedido.setLayout(panelCRUDPedidoLayout);
        panelCRUDPedidoLayout.setHorizontalGroup(
            panelCRUDPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCRUDPedidoLayout.createSequentialGroup()
                .addGap(299, 299, 299)
                .addComponent(jLabel16)
                .addContainerGap(289, Short.MAX_VALUE))
        );
        panelCRUDPedidoLayout.setVerticalGroup(
            panelCRUDPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCRUDPedidoLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel16)
                .addContainerGap(320, Short.MAX_VALUE))
        );

        CancelarGuardarFactura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cancel.png"))); // NOI18N
        CancelarGuardarFactura.setText("Cancelar");
        CancelarGuardarFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelarGuardarFacturaActionPerformed(evt);
            }
        });

        GuardarFactura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/save.png"))); // NOI18N
        GuardarFactura.setText("Guardar");
        GuardarFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardarFacturaActionPerformed(evt);
            }
        });

        Propina.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "SI", "NO" }));

        descuento_factura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                descuento_facturaActionPerformed(evt);
            }
        });

        jLabel17.setText("Id Factura");

        jLabel22.setText("Propina");

        jLabel24.setText("Id Personal");

        jLabel25.setText("Descuento");

        jLabel26.setText("Cedula Cliente");

        jLabel27.setText("Total Pago:");

        totalPago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalPagoActionPerformed(evt);
            }
        });

        Impuestos.setText("Impuesto");

        javax.swing.GroupLayout panelCRUDFacturaLayout = new javax.swing.GroupLayout(panelCRUDFactura);
        panelCRUDFactura.setLayout(panelCRUDFacturaLayout);
        panelCRUDFacturaLayout.setHorizontalGroup(
            panelCRUDFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCRUDFacturaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelCRUDFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCRUDFacturaLayout.createSequentialGroup()
                        .addGap(165, 165, 165)
                        .addComponent(GuardarFactura, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(CancelarGuardarFactura)
                        .addGap(262, 262, 262))
                    .addGroup(panelCRUDFacturaLayout.createSequentialGroup()
                        .addComponent(Impuestos)
                        .addGap(41, 41, 41)
                        .addComponent(Impuesto)
                        .addGap(440, 440, 440))
                    .addGroup(panelCRUDFacturaLayout.createSequentialGroup()
                        .addGroup(panelCRUDFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel27)
                            .addComponent(jLabel17)
                            .addComponent(jLabel22)
                            .addComponent(jLabel24)
                            .addComponent(jLabel25)
                            .addComponent(jLabel26))
                        .addGap(17, 17, 17)
                        .addGroup(panelCRUDFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(id_cliente)
                            .addComponent(descuento_factura, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(id_factura, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Propina, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(totalPago)
                            .addComponent(IdPersonalFactura))
                        .addGap(451, 451, 451))))
        );
        panelCRUDFacturaLayout.setVerticalGroup(
            panelCRUDFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCRUDFacturaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelCRUDFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(id_factura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17))
                .addGap(18, 18, 18)
                .addGroup(panelCRUDFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(Propina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelCRUDFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24)
                    .addComponent(IdPersonalFactura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelCRUDFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(descuento_factura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel25))
                .addGap(18, 18, 18)
                .addGroup(panelCRUDFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel26)
                    .addComponent(id_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelCRUDFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel27)
                    .addComponent(totalPago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelCRUDFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Impuestos)
                    .addComponent(Impuesto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addGroup(panelCRUDFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(GuardarFactura, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CancelarGuardarFactura, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21))
        );

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelCrearConsultarUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(panelCRUDItem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(panelCRUDPedido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(panelCRUDFactura, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelCrearConsultarUsuario, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(panelCRUDItem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(panelCRUDPedido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(panelCRUDFactura, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jLayeredPane1.setLayer(panelCRUDItem, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(panelCrearConsultarUsuario, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(panelCRUDPedido, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(panelCRUDFactura, javax.swing.JLayeredPane.DEFAULT_LAYER);

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

    private void btCrearFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCrearFacturaActionPerformed
        // TODO add your handling code here:
        
        if (rbCrear.isSelected()) {
            setPanelesInvisible(3);
            FacturaCrearModificar(0);//Para hacer el cambio en los botones
            setCompPanelFactura();

        }

        if (rbConsultar.isSelected()) {
            setPanelesInvisible(3);
            FacturaCrearModificar(1);//Para hacer el cambio en los botones
            setCompPanelFactura();
        }

        if (rbModificar.isSelected()) {
            setPanelesInvisible(3);
            FacturaCrearModificar(2);
            setCompPanelFactura();
        }

        if (rbEliminar.isSelected()) {
            setPanelesInvisible(3);
            FacturaCrearModificar(3);
            setCompPanelFactura();
        }
        
    }//GEN-LAST:event_btCrearFacturaActionPerformed

    
    
    public void setCompPanelFactura(){
            id_factura.setText("");
            Propina.setSelectedItem("NO");
            IdPersonalFactura.setText("");
            descuento_factura.setText("");
            id_cliente.setText("");
            totalPago.setText("");
            Impuesto.setText("");
    }
    
    public void FacturaCrearModificar(int state){
        if(state == 0){
            GuardarFactura.setIcon(new ImageIcon(getClass().getResource("save.png")));
            GuardarFactura.setText("Guardar");
            CancelarGuardarFactura.setIcon(new ImageIcon(getClass().getResource("cancel.png")));
            CancelarGuardarFactura.setText("Cancelar");
            Propina.setEditable(true);      
            Impuesto.setEditable(true);      
            IdPersonalFactura.setEditable(true);            
            descuento_factura.setEditable(true);           
            id_cliente.setEditable(true);            
            totalPago.setEditable(true);     
            GuardarFactura.setVisible(true);
            GuardarFactura.setEnabled(true);
            CancelarGuardarFactura.setVisible(true);
            CancelarGuardarFactura.setEnabled(true);
            setCompPanelUsuario();
        }
        if(state == 1){
            GuardarFactura.setIcon(new ImageIcon(getClass().getResource("buscar.png")));
            GuardarFactura.setText("Buscar");
            CancelarGuardarFactura.setVisible(false);            
            Propina.setEditable(false);      
            Impuesto.setEditable(false);      
            IdPersonalFactura.setEditable(false);            
            descuento_factura.setEditable(false);           
            id_cliente.setEditable(false);            
            totalPago.setEditable(false);     
            setCompPanelUsuario();
        }
        if(state == 2){
            GuardarFactura.setText("Buscar");
            CancelarGuardarFactura.setText("Actualizar");
            CancelarGuardarFactura.setVisible(true);
            CancelarGuardarFactura.setVisible(true);            
            Propina.setEditable(true);            
            IdPersonalFactura.setEditable(true);            
            descuento_factura.setEditable(true);           
            id_cliente.setEditable(true);  
            Impuesto.setEditable(true);          
            totalPago.setEditable(true);   
            GuardarFactura.setIcon(new ImageIcon(getClass().getResource("buscar.png")));
            CancelarGuardarFactura.setIcon(new ImageIcon(getClass().getResource("save.png")));
            CancelarGuardarFactura.setEnabled(false);
            setCompPanelUsuario();
        }
        if(state==3){
            GuardarFactura.setText("Buscar");
            CancelarGuardarFactura.setText("Eliminar");
            CancelarGuardarFactura.setVisible(true);
            tfNombreCrearModUsuario.setEditable(true);
            Propina.setEditable(true);            
            IdPersonalFactura.setEditable(true);            
            descuento_factura.setEditable(true);  
            Impuesto.setEditable(true);
            id_cliente.setEditable(true);   
            Impuesto.setEditable(true);          
            totalPago.setEditable(true);
            GuardarFactura.setIcon(new ImageIcon(getClass().getResource("buscar.png")));
            CancelarGuardarFactura.setIcon(new ImageIcon(getClass().getResource("cancel.png")));
            CancelarGuardarFactura.setEnabled(false);
            setCompPanelUsuario();
        }
    }
    
    private void CancelarGuardarFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelarGuardarFacturaActionPerformed
        // TODO add your handling code here:
        
        ModelMain<Factura> modelo = new ModelMain();

        if (CancelarGuardarFactura.getText().equalsIgnoreCase("Actualizar") && rbModificar.isSelected()) {
            String factura_id = id_factura.getText();
            int propina = Propina.getSelectedIndex();
            String id_personal = IdPersonalFactura.getText();
            int descuento = Integer.parseInt(descuento_factura.getText());
            int impuesto = Integer.parseInt(Impuesto.getText());
            String cliente_id = id_cliente.getText();
            int total = Integer.parseInt(totalPago.getText());
            
            Personal persona = new Personal();
            persona = modelo.getByID(persona.getClass(), id_personal);
            
            java.util.Date fechaActual = new java.util.Date();
            
            Factura mi_factura = new Factura(factura_id,persona,fechaActual, propina, descuento, impuesto, cliente_id, total, null, null);
            modelo.update(mi_factura);
            JOptionPane.showMessageDialog(null, "Modificado con Exito");
            FacturaCrearModificar(2);
        }

        if (CancelarGuardarFactura.getText().equalsIgnoreCase("Eliminar") && rbEliminar.isSelected()) {
            String factura_id = id_factura.getText();
            int propina = Propina.getSelectedIndex();
            String id_personal = IdPersonalFactura.getText();
            int descuento = Integer.parseInt(descuento_factura.getText());
            int impuesto = Integer.parseInt(Impuesto.getText());
            String cliente_id = id_cliente.getText();
            int total = Integer.parseInt(totalPago.getText());
            
            
            
            Personal persona = new Personal();
            persona = modelo.getByID(persona.getClass(), id_personal);
            
            java.util.Date fechaActual = new java.util.Date();
            
            Factura mi_factura = new Factura(factura_id,persona,fechaActual, propina, descuento, impuesto, cliente_id, total, null, null);
            
            modelo.delete(mi_factura);
            JOptionPane.showMessageDialog(null, "Eliminado con Exito");
            setCompPanelFactura();
        }
        
        
    }//GEN-LAST:event_CancelarGuardarFacturaActionPerformed

    private void GuardarFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarFacturaActionPerformed
        // TODO add your handling code here:
        
        ModelMain<Factura> modelo = new ModelMain();
        if (GuardarFactura.getText().equalsIgnoreCase("Guardar")) {
            
            String factura_id = id_factura.getText();
            int propina = Propina.getSelectedIndex();
            String id_personal = IdPersonalFactura.getText();
            int descuento = Integer.parseInt(descuento_factura.getText());
            int impuesto = Integer.parseInt(Impuesto.getText());
            String cliente_id = id_cliente.getText();
            int total = Integer.parseInt(totalPago.getText());
            
            Personal persona = new Personal();
            persona = modelo.getByID(persona.getClass(), id_personal);
            
            java.util.Date fechaActual = new java.util.Date();
            
            Factura mi_factura = new Factura(factura_id,persona,fechaActual, propina, descuento, impuesto, cliente_id, total, null, null);
            modelo.insertIdString(mi_factura);
            
            JOptionPane.showMessageDialog(null, "Guardado con Exito");
        }
        
        if (GuardarFactura.getText().equalsIgnoreCase("Buscar") && rbConsultar.isSelected()) {
            String factura_id = id_factura.getText();
            Factura mi_factura = new Factura();
            mi_factura = modelo.getByID(mi_factura.getClass(), factura_id);
            if (mi_factura != null) {
                Propina.setSelectedIndex(mi_factura.getPropina());
                IdPersonalFactura.setText(mi_factura.getPersonal().getIdPersonal());
                descuento_factura.setText(Integer.toString(mi_factura.getDescuento()));
                Impuesto.setText(Integer.toString(mi_factura.getImpuesto()));
                id_cliente.setText(mi_factura.getCedulaCliente());
                totalPago.setText(Integer.toString(mi_factura.getTotalPago()));
            } else {
                JOptionPane.showMessageDialog(null, "No se encuentra la factura");
                FacturaCrearModificar(1);
            }
        }

        if ((GuardarFactura.getText().equalsIgnoreCase("Buscar") || GuardarFactura.getText().equalsIgnoreCase("Actualizar")) && rbModificar.isSelected()) {
            String factura_id = id_factura.getText();
            Factura mi_factura = new Factura();
            mi_factura = modelo.getByID(mi_factura.getClass(), factura_id);
            
            if (mi_factura != null) {
                Propina.setSelectedIndex(mi_factura.getPropina());
                IdPersonalFactura.setText(mi_factura.getPersonal().getIdPersonal());
                descuento_factura.setText(Integer.toString(mi_factura.getDescuento()));
                Impuesto.setText(Integer.toString(mi_factura.getImpuesto()));
                id_cliente.setText(mi_factura.getCedulaCliente());
                totalPago.setText(Integer.toString(mi_factura.getTotalPago()));
                CancelarGuardarFactura.setEnabled(true);
            } else {
                JOptionPane.showMessageDialog(null, "No se encuentra la factura");
                FacturaCrearModificar(1);
            }
        }

        if (GuardarFactura.getText().equalsIgnoreCase("Buscar") && rbEliminar.isSelected()) {
            String factura_id = id_factura.getText();
            Factura mi_factura = new Factura();
            mi_factura = modelo.getByID(mi_factura.getClass(), factura_id);
            if (mi_factura != null) {
                Propina.setSelectedIndex(mi_factura.getPropina());
                IdPersonalFactura.setText(mi_factura.getPersonal().getIdPersonal());
                descuento_factura.setText(Integer.toString(mi_factura.getDescuento()));
                Impuesto.setText(Integer.toString(mi_factura.getImpuesto()));
                id_cliente.setText(mi_factura.getCedulaCliente());
                totalPago.setText(Integer.toString(mi_factura.getTotalPago()));
                CancelarGuardarFactura.setEnabled(true);
            } else {
                JOptionPane.showMessageDialog(null, "No se encuentra la factura");
                FacturaCrearModificar(1);
            }
        }
        
    }//GEN-LAST:event_GuardarFacturaActionPerformed

    private void descuento_facturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_descuento_facturaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_descuento_facturaActionPerformed

    private void totalPagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalPagoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_totalPagoActionPerformed

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
    private javax.swing.JButton CancelarGuardarFactura;
    private javax.swing.JTextField CantidadText;
    private javax.swing.JComboBox<String> ComboCategoria;
    private javax.swing.JTextField DescripcionText;
    private javax.swing.JButton GuardarFactura;
    private javax.swing.JTextField IdItemText;
    private javax.swing.JTextField IdPersonalFactura;
    private javax.swing.JTextField ImagenText;
    private javax.swing.JTextField Impuesto;
    private javax.swing.JLabel Impuestos;
    private javax.swing.JTextField PrecioText;
    private javax.swing.JComboBox<String> Propina;
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
    private javax.swing.JTextField descuento_factura;
    private javax.swing.JTextField id_cliente;
    private javax.swing.JTextField id_factura;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
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
    private javax.swing.JTextField totalPago;
    // End of variables declaration//GEN-END:variables
}
