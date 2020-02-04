package com.codigoj.webservice.ws.impl;



import javax.jws.WebService;
import javax.xml.ws.BindingType;
import javax.xml.ws.soap.SOAPBinding;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import co.codigoj.webservice.entity.ws.types.BuscarRequest;
import co.codigoj.webservice.entity.ws.types.BuscarResponse;
import co.codigoj.webservice.entity.ws.types.CategoriaType;
import co.codigoj.webservice.entity.ws.types.ListaCategoriaType;
import co.codigoj.webservice.services.catagoriaws.ws.Catagoriaws;

@WebService(
		serviceName = "catagoriaws",
		targetNamespace = "http://webservice.codigoj.co/services/catagoriaws/ws",
		portName = "catagoriaws",
		endpointInterface = "co.codigoj.webservice.services.catagoriaws.ws.Catagoriaws",
		wsdlLocation = "META-INF/wsdl/catagoriaws.wsdl"
		)
@BindingType(SOAPBinding.SOAP11HTTP_BINDING)
public class CategoriaWSImpl implements Catagoriaws {
	
	private static final Logger LOG = LogManager.getLogger(CategoriaWSImpl.class.getName());

	public CategoriaWSImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public BuscarResponse buscarDatos(BuscarRequest request) {
		LOG.info("Servicio consumiendo");
		BuscarResponse response = new BuscarResponse();
		
		ListaCategoriaType listaType = new ListaCategoriaType();
		
		CategoriaType categoria = new CategoriaType();
		categoria.setId(1);
		categoria.setDescripcion("descripcion de categoria");
		listaType.getCategoria().add(categoria);
		response.setListaCategorias(listaType);
		
		return response;
	}

}
