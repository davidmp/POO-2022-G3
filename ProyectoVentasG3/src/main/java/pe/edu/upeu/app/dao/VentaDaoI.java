/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pe.edu.upeu.app.dao;

import java.util.List;
import pe.edu.upeu.app.modelo.VentaDetalleTO;
import pe.edu.upeu.app.modelo.VentaTO;

/**
 *
 * @author Lab-Software
 */
public interface VentaDaoI {
    public int createVenta(VentaTO to);
    public List listVenta();
    
    public int createVentaDetalle(VentaDetalleTO to);
    public List listVentaDetalle(VentaTO to);
    
}
