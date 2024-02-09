package Vistas;

import AccesoADatos.ProductoData;
import Entidades.Producto;
import java.awt.Graphics;
import java.awt.Image;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


public class GestionProductos extends javax.swing.JInternalFrame {
    ImagenFondo fondo=new ImagenFondo();
    private List<Producto> listarP;
    private ProductoData aData = new ProductoData();
    private ProductoData productoData;

    public GestionProductos() {
         this.setContentPane(fondo);
        initComponents();

        listarP = (List<Producto>) aData.listarProductos();
        cargarProductos();
        vaciarCampos();
        productoData = new ProductoData(); 
        mostrarProductosConStockMinimo();


    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnAgregar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        jTNombre = new javax.swing.JTextField();
        jTDescripcion = new javax.swing.JTextField();
        jTPrecio = new javax.swing.JTextField();
        jTCantidad = new javax.swing.JTextField();
        jBSalir = new javax.swing.JButton();
        jcbCodProducto = new javax.swing.JComboBox<>();
        jBuscar = new javax.swing.JButton();
        btnNuevo = new javax.swing.JButton();
        jEliminar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jEstado = new javax.swing.JRadioButton();

        setClosable(true);
        setMaximizable(true);
        setResizable(true);
        setMaximumSize(new java.awt.Dimension(680, 430));
        setMinimumSize(new java.awt.Dimension(680, 430));

        jLabel1.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Registro de Productos");

        jLabel2.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Codigo producto:");

        jLabel3.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Nombre:");

        jLabel4.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Descripcion:");

        jLabel5.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Precio:");

        jLabel6.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Cantidad:");

        btnAgregar.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        btnAgregar.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnModificar.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        btnModificar.setForeground(new java.awt.Color(255, 255, 255));
        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        jBSalir.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        jBSalir.setForeground(new java.awt.Color(255, 255, 255));
        jBSalir.setText("Salir");
        jBSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSalirActionPerformed(evt);
            }
        });

        jcbCodProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbCodProductoActionPerformed(evt);
            }
        });

        jBuscar.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        jBuscar.setForeground(new java.awt.Color(255, 255, 255));
        jBuscar.setText("Buscar");
        jBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBuscarActionPerformed(evt);
            }
        });

        btnNuevo.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        btnNuevo.setForeground(new java.awt.Color(255, 255, 255));
        btnNuevo.setText("Nuevo");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        jEliminar.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        jEliminar.setForeground(new java.awt.Color(255, 255, 255));
        jEliminar.setText("Eliminar");
        jEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jEliminarActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Estado:");

        jEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jEstadoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnNuevo)
                .addGap(29, 29, 29)
                .addComponent(btnAgregar)
                .addGap(28, 28, 28)
                .addComponent(btnModificar)
                .addGap(34, 34, 34)
                .addComponent(jEliminar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jBSalir)
                .addGap(29, 29, 29))
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jEstado)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 301, Short.MAX_VALUE)
                            .addComponent(jTDescripcion, javax.swing.GroupLayout.DEFAULT_SIZE, 301, Short.MAX_VALUE)
                            .addComponent(jTPrecio, javax.swing.GroupLayout.DEFAULT_SIZE, 301, Short.MAX_VALUE)
                            .addComponent(jTCantidad, javax.swing.GroupLayout.DEFAULT_SIZE, 301, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addComponent(jLabel1))
                            .addComponent(jcbCodProducto, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                        .addComponent(jBuscar)
                        .addContainerGap(36, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jcbCodProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBuscar))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jEstado))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNuevo)
                    .addComponent(btnAgregar)
                    .addComponent(btnModificar)
                    .addComponent(jEliminar)
                    .addComponent(jBSalir))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalirActionPerformed

        dispose();
    }//GEN-LAST:event_jBSalirActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        ProductoData ad = new ProductoData();
        Producto prod = new Producto();
        try {
            prod.setDescripcion(jTDescripcion.getText());
            prod.setNombreProducto(jTNombre.getText());
            prod.setPrecioActual(Double.parseDouble(jTPrecio.getText()));
            prod.setStock(Integer.parseInt(jTCantidad.getText()));

            for (Producto produ : ad.listarProductos()) {
                if (produ.getNombreProducto().equals(prod.getNombreProducto())) {
                    JOptionPane.showMessageDialog(this, "El producto ya existe.");
                    return;
                }
            }         

            if (jTNombre.getText().isEmpty() || jTCantidad.getText().isEmpty() || jTPrecio.getText().isEmpty() || jTDescripcion.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "No pueden haber campos vacios");
                return;
            }
            
            ad.guardarProducto(prod);
            vaciarCampos();

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Debe ingresar un número");
        }

    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed

        ProductoData ad = new ProductoData();
        Producto prod = new Producto();

        prod.getIdProdcuto();
        if (jTNombre.getText().isEmpty() || jTCantidad.getText().isEmpty() || jTPrecio.getText().isEmpty() || jTDescripcion.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "No pueden haber campos vacios");
            return;
        }
        try {
            prod.setDescripcion(jTDescripcion.getText());
            prod.setNombreProducto(jTNombre.getText());
            prod.setPrecioActual(Integer.parseInt(jTPrecio.getText()));
            prod.setStock(Integer.parseInt(jTCantidad.getText()));
            prod.setIdProdcuto(((Producto) jcbCodProducto.getSelectedItem()).getIdProdcuto());

            ad.modificarProducto(prod);
            vaciarCampos();
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Debe ingresar un número");
        }

    }//GEN-LAST:event_btnModificarActionPerformed

    private void jBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBuscarActionPerformed
        ProductoData ad = new ProductoData();
        Producto prod = new Producto();
        

        if (jcbCodProducto.getSelectedItem() != null) {
            int id = ((Producto) jcbCodProducto.getSelectedItem()).getIdProdcuto();
            System.out.println(id);
            prod = ad.buscarProductoPorId(id);

            jTDescripcion.setText(prod.getDescripcion());
            jTNombre.setText(prod.getNombreProducto());
            jTPrecio.setText(String.valueOf(prod.getPrecioActual()));
            jTCantidad.setText(String.valueOf(prod.getStock()));

            if (prod.isEstado()) {
                jEstado.setSelected(true);
            } else {
                jEstado.setSelected(false);  
            }
        } else {
            JOptionPane.showMessageDialog(this, "No selecciono un producto.");
        }

    }//GEN-LAST:event_jBuscarActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        btnModificar.setEnabled(true);
        btnAgregar.setEnabled(true);
        vaciarCampos();
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void jcbCodProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbCodProductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbCodProductoActionPerformed

    private void jEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jEliminarActionPerformed
          if (jcbCodProducto.getSelectedItem() != null) {
        try {
            int id = ((Producto) jcbCodProducto.getSelectedItem()).getIdProdcuto();

            ProductoData pd = new ProductoData();
            pd.eliminarProducto(id);

            JOptionPane.showMessageDialog(this, "Producto eliminado con éxito");
            
            jTNombre.setText("");
            jTDescripcion.setText("");
            jTPrecio.setText("");
            jTCantidad.setText("");

            listarP = aData.listarProductos();
            cargarProductos();

        } catch (NumberFormatException nf) {
            JOptionPane.showMessageDialog(this, "Ingrese un ID válido para eliminar un producto");
        }
    } else {
        JOptionPane.showMessageDialog(this, "Error al eliminar el producto.");
    }
    }//GEN-LAST:event_jEliminarActionPerformed

    private void jEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jEstadoActionPerformed

    }//GEN-LAST:event_jEstadoActionPerformed

    private void cargarProductos() {
        for (Producto item : listarP) {
            jcbCodProducto.addItem(item);
        }
    }

    private void vaciarCampos() {
        jcbCodProducto.setSelectedIndex(-1);
        jTNombre.setText("");
        jTDescripcion.setText("");
        jTPrecio.setText("");
        jTCantidad.setText("");
    }

    private void mostrarProductosConStockMinimo() {
        List<Producto> todosLosProductos = obtenerTodosLosProductos();
        String mensaje = "";

        for (Producto producto : todosLosProductos) {
            if (producto.getStock() < 5) {
                mensaje += "El producto " + producto.getNombreProducto() + " tiene un stock por debajo de 5. Reponga el stock.\n";
            }
        }

        if (!mensaje.isEmpty()) {
            JOptionPane.showMessageDialog(this, mensaje);
        } else {
            JOptionPane.showMessageDialog(this, "Todos los productos tienen un stock adecuado.");
        }
    }

    private List<Producto> obtenerTodosLosProductos() {
        List<Producto> productos = productoData.listarProductos();
        return productos;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton jBSalir;
    private javax.swing.JButton jBuscar;
    private javax.swing.JButton jEliminar;
    private javax.swing.JRadioButton jEstado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField jTCantidad;
    private javax.swing.JTextField jTDescripcion;
    private javax.swing.JTextField jTNombre;
    private javax.swing.JTextField jTPrecio;
    private javax.swing.JComboBox<Producto> jcbCodProducto;
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
