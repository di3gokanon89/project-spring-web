/**
 * 
 */
package com.devpredator.projectspringweb.dao.impl;

import org.springframework.stereotype.Repository;

import com.devpredator.projectspringweb.dao.EmpleadoDAO;

/**
 * @author 4PF28LA_2004
 *
 */
@Repository
public class EmpleadoDAOImpl implements EmpleadoDAO {

	@Override
	public String consultarNombreEmpleado() {
		return "Diego Paniagua Lopez";
	}

}
