package AccesoADatos;

import Entidades.Compra;
import Entidades.Proveedor;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class CompraData {

    private Connection con = null;

    public CompraData() {
        con = Conexion.getConexion();
    }

    public void guardarCompra(Compra com) {

        String sql = "INSERT INTO compra(idProveedor, fecha, estado) VALUES (?,?, 1) ";
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

            ps.setInt(1, com.getProveedor().getIdProveedor());
            ps.setDate(2, Date.valueOf(com.getFecha()));
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                com.setIdCompra(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Compra Registrada.");
            }

            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla compra.");
        }
    }

    public void modificarCompra(Compra compra) {
        String sql = "UPDATE compra SET idProveedor = ?"
                + " WHERE idCompra = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, compra.getProveedor().getIdProveedor());
            int exito = ps.executeUpdate();

            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Proveedor modificado.");
            } else {
                JOptionPane.showMessageDialog(null, "No se encontro la compra.");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla compra.");
        }
    }

    public void eliminarCompra(Compra compra) {
        String sql = "UPDATE compra SET estado = 0"
                + " WHERE idCompra = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, compra.getIdCompra());
            int exito = ps.executeUpdate();

            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "La compra se ha borrada con exito.");
            } else {
                JOptionPane.showMessageDialog(null, "No se encontro la compra.");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla compra.");
        }
    }

    public Compra buscarCompraPorId(int idCompra) {
        String sql = "SELECT idCompra, idProveedor, fecha FROM compra WHERE idCompra = ?";
        Compra compra = null;
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idCompra);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                compra = new Compra();
                compra.setIdCompra(rs.getInt("idCompra"));
                compra.setProveedor(new Proveedor(rs.getInt("idProveedor")));
                compra.setFecha(rs.getDate("fecha").toLocalDate());
                compra.setEstado(true);
            } else {
                JOptionPane.showMessageDialog(null, "No existe la compra con esa id.");
            }

            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla compra.");
        }
        return compra;
    }

    public List<Compra> ObtenerComprasPorProveedor(Proveedor proveedor) {
        String sql = "SELECT idCompra, fecha FROM compra WHERE idProveedor = ?";
        ArrayList<Compra> compras = new ArrayList<>();
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, proveedor.getIdProveedor());
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Compra compra = new Compra();
                compra.setIdCompra(rs.getInt("idCompra"));
                compra.setProveedor(proveedor);
                compra.setFecha(rs.getDate("fecha").toLocalDate());
                compras.add(compra);
            }

            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla compra: " + ex.getMessage());
        }
        return compras;
    }

    public List<Compra> listarCompras() {
        String sql = "SELECT idCompra, idProveedor, fecha FROM compra WHERE estado = 1";
        ArrayList<Compra> compras = new ArrayList<>();
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Compra compra = new Compra();
                compra.setIdCompra(rs.getInt("idCompra"));
                Proveedor prov = new Proveedor();
                prov.setIdProveedor(rs.getInt("idProveedor"));
                compra.setProveedor(prov);
                compra.setFecha(rs.getDate("fecha").toLocalDate());
                compra.setEstado(true);

                compras.add(compra);
            }

            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla compra: " + ex.getMessage());
        }
        return compras;
    }

    public List<Compra> listarComprasPorFecha(Date f1) {
        String sql = "SELECT idCompra, idProveedor, fecha FROM compra WHERE fecha = ? AND estado = 1";
        ArrayList<Compra> compras = new ArrayList<>();
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setDate(1, f1);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Compra compra = new Compra();
                compra.setIdCompra(rs.getInt("idCompra"));
                Proveedor prov = new Proveedor();
                prov.setIdProveedor(rs.getInt("idProveedor"));
                compra.setProveedor(prov);
                compra.setFecha(rs.getDate("fecha").toLocalDate());
                compra.setEstado(true);

                compras.add(compra);
            }

            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla compra: " + ex.getMessage());
        }
        return compras;
    }

    
    public List<Compra> listarComprasEntreFechas(Date f1, Date f2) {

        String sql = "SELECT *"
                + " FROM compra"
                + " WHERE fecha >= ? AND fecha <= ? AND estado = 1"; // f1> <f2
        ArrayList<Compra> compras = new ArrayList<>();
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setDate(1, f1);
            ps.setDate(2, f2);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Compra compra = new Compra();
                compra.setIdCompra(rs.getInt("idCompra"));
                Proveedor prov = new Proveedor();
                prov.setIdProveedor(rs.getInt("idProveedor"));
                compra.setProveedor(prov);
                compra.setFecha(rs.getDate("fecha").toLocalDate());
                compra.setEstado(true);

                compras.add(compra);
            }

            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla compra: " + ex.getMessage());
        }
        return compras;
    }

}
