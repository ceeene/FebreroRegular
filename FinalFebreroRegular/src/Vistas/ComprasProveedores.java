/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import AccesoADatos.CompraData;
import AccesoADatos.ProductoData;
import AccesoADatos.ProveedorData;
import Entidades.Compra;
import Entidades.Producto;
import Entidades.Proveedor;
import java.awt.Graphics;
import java.awt.Image;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Usuario
 */
public class ComprasProveedores extends javax.swing.JInternalFrame {
    ImagenFondo fondo=new ImagenFondo();
    private DefaultTableModel modelo;

    private List<Proveedor> listarProv;
    private ProveedorData PData = new ProveedorData();

    
    public ComprasProveedores() {
        this.setContentPane(fondo);
        initComponents();

        listarProv = PData.listarProveedor();
        cargarProveedor();
        
        modelo = new DefaultTableModel();
        armarCabeceraTabla();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnBuscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTabla = new javax.swing.JTable();
        jcbProveedor = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();

        setMaximumSize(new java.awt.Dimension(570, 500));
        setMinimumSize(new java.awt.Dimension(570, 500));

        jLabel1.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Buscar Compras");

        jLabel2.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Proveedor");

        jLabel5.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Fecha:");

        btnBuscar.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        btnBuscar.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        jTabla.setAutoCreateColumnsFromModel(false);
        jTabla.setFont(new java.awt.Font("Dubai", 1, 12)); // NOI18N
        jTabla.setForeground(new java.awt.Color(255, 255, 255));
        jTabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "IdCompra", "RZProveedor", "Fecha"
            }
        ));
        jScrollPane1.setViewportView(jTabla);

        jLabel6.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Fecha hasta:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(192, 192, 192))
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnBuscar))
                            .addComponent(jcbProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 444, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(37, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jcbProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(btnBuscar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))))
                .addGap(7, 7, 7)
                .addComponent(jLabel6)
                .addGap(72, 72, 72)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
                .addGap(32, 32, 32))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    
    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        CompraData ad = new CompraData();
        ProveedorData pr = new ProveedorData();
        Compra prod = new Compra();
        int id = ((Proveedor) jcbProveedor.getSelectedItem()).getIdProveedor();
        System.out.println(id);
        borrarFilaTabla();
        for (Compra com : ad.ObtenerComprasPorProveedor(pr.buscarProveedorPorId(id))) {
            modelo.addRow(new Object[]{com.getIdCompra(), pr.buscarProveedorPorId(id).getRazonSocial(), com.getFecha()});
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void cargarProveedor() {
        for (Proveedor item : listarProv) {
            jcbProveedor.addItem(item);
        }
    }

    private void armarCabeceraTabla() {
        ArrayList<Object> filaCabecera = new ArrayList<>();
        filaCabecera.add("IdCompra");
        filaCabecera.add("Proveedor");
        filaCabecera.add("Fecha");
        for (Object it : filaCabecera) {
            modelo.addColumn(it);
        }
        jTabla.setModel(modelo);
    }

    private void borrarFilaTabla() {

        int indice = modelo.getRowCount() - 1;
        for (int i = indice; i >= 0; i--) {
            modelo.removeRow(i);
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTabla;
    private javax.swing.JComboBox<Proveedor> jcbProveedor;
    // End of variables declaration//GEN-END:variables

class ImagenFondo extends JPanel{
     private Image imagen;
     
     public void paint(Graphics g){
         imagen=new ImageIcon(getClass().getResource("/Imagenes/panel.jpg")).getImage();
         g.drawImage(imagen,0,0,getWidth(), getHeight(), this);
        setOpaque(false);
         super.paint(g);
         
        }
 }


}
