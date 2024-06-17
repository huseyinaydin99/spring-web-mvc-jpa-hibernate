package tr.com.huseyinaydin.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import tr.com.huseyinaydin.Ogrenci;
import tr.com.huseyinaydin.Sehir;

@Configuration
public class SpringBeanConfig {
	
	/*	
	<bean id="sehir" class="tr.com.huseyinaydin.Sehir">
		<property name="sehirAdi" value="Niğde"></property>
		<property name="plakaNo" value="51"></property>
	</bean>
	*/
	@Bean
	public Sehir getSehir() {
		Sehir sehir = new Sehir();
		sehir.setSehirAdi("Niğde");
		sehir.setPlakaNo(51);
		return sehir;
	}
	
	/*	
	<bean id="ogrenci" class="tr.com.huseyinaydin.Ogrenci">
		<property name="adi" value="Reçel Tahin"></property>
		<property name="soyadi" value="Ersoğan"></property>
		<property name="sehir" ref="sehir"></property>
	</bean>	
	*/
	@Bean
	public Ogrenci getOgrenci() {
		Ogrenci ogrenci = new Ogrenci();
		ogrenci.setAdi("Reçel Tahin");
		ogrenci.setSoyadi("Ersoğan");
		ogrenci.setSehir(getSehir());
		return ogrenci;
	}
}