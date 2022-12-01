/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package es.teis.ud2.model.dao.empleado;

import es.teis.ud2.model.Empleado;
import es.teis.ud2.model.dao.IGenericDao;
import java.math.BigDecimal;
import java.util.ArrayList;

/**
 *
 * @author mfernandez
 */
public interface IEmpleadoDao extends IGenericDao<Empleado>{
    
     ArrayList<String> getEmpleadosByDeptId(int deptId);
     
    BigDecimal getMediaSalarialPorDeptId(int deptId);
    
}
