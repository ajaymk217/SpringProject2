package org.ass.ums.config;

import java.util.Properties;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;


@Configuration
public class MysqlDbConfiguration {
	
	@Bean
	public LocalSessionFactoryBean getSessionFactory() {
		LocalSessionFactoryBean sessionFactory = new LocalSessionFactoryBean();
		sessionFactory.setDataSource(getDataSource());
		sessionFactory.setHibernateProperties(getMyDbProperties());
		sessionFactory.setPackagesToScan("org.ass.ums.entity");
		return sessionFactory;
	}
	@Bean
	public  DataSource getDataSource() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://localhost:3306/config_db");
		dataSource.setUsername("root");
		dataSource.setPassword("root");
		return dataSource;
	}
	
	
	public static Properties getMyDbProperties() {
		Properties properties = new Properties();
//		properties.setProperty("connection.driver_class", "com.mysql.cj.jdbc.Driver");
//		properties.setProperty("hibernate.connection.url", "jdbc:mysql://localhost:3306/config_db");
//		properties.setProperty("hibernate.connection.username", "root");
//		properties.setProperty("hibernate.connection.password", "root");
//		properties.setProperty("hibernate.dialect", "org.hibernate.dialect.MySQLDialect");
		properties.setProperty("hibernate.show_sql", "true");
		properties.setProperty("hibernate.hbm2ddl.auto", "update");
		return properties;
	}

}
