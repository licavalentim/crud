package snippet;

public class Snippet {
	
	
	# Configurações do banco de dados MySQL
	spring.datasource.url=jdbc:mysql://localhost:3306/crud
	spring.datasource.username=root
	spring.datasource.password=root
	
	# Configurações do Hibernate
	spring.jpa.hibernate.ddl-auto=update
	spring.jpa.show-sql=true
	spring.jpa.properties.hibernate.format_sql=true
}

