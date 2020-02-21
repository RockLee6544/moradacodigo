package br.com.moradacodigo.loja.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;


/**
 * Classe de configuração do Servlet do Spring
 * @author shun
 *
 */
public class ServletSpringMvc extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		return new  Class [] {AppWebConfiguration.class};
	}

	//Configura a partir de qual path o Spring vai me monitorar
	@Override
	protected String[] getServletMappings() {
		return new String [] {"/"};
	}

}
