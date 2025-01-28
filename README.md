# Proyecto Integrador de Calidad de Software  

## Descripción del Proyecto  
Este proyecto tiene como objetivo aplicar diversas métricas de calidad de software para evaluar y mejorar el código mediante herramientas como SonarCloud, JaCoCo, SpotBugs y Checkstyle. Se ha trabajado en la detección y corrección de errores de código, optimización de la complejidad ciclomatica y análisis de cobertura de pruebas unitarias.  

## Tecnologías Utilizadas  
- **Java 21**  
- **Maven** para la gestión de dependencias y ejecución de plugins  
- **JaCoCo** para la medición de cobertura de código  
- **SpotBugs** para la detección de defectos en el código  
- **Checkstyle** para garantizar buenas prácticas de codificación  
- **SonarCloud** para el análisis de complejidad ciclomatica y otros aspectos de calidad  

## Análisis de Métricas  

### **1. Cobertura de Código (JaCoCo)**
Se utilizó **JaCoCo** para evaluar la cobertura de código a través de pruebas unitarias. La siguiente imagen muestra el reporte generado:  

![Cobertura de Código - JaCoCo](ruta/a/la/captura-jacoco.png)  

### **2. Densidad de Defectos (SpotBugs)**
SpotBugs se usó para identificar defectos en el código. El análisis final indicó que no se detectaron errores.  

![Densidad de Defectos - SpotBugs](ruta/a/la/captura-spotbugs.png)  

### **3. Problemas de Estilo (Checkstyle)**
Checkstyle ayudó a corregir problemas de formato y estilo de código, asegurando el cumplimiento de buenas prácticas de programación.  

![Errores de Estilo - Checkstyle](ruta/a/la/captura-checkstyle.png)  

### **4. Complejidad Ciclomática (SonarCloud)**
El análisis de SonarCloud permitió evaluar la complejidad ciclomatica del código, ayudando a mejorar su mantenibilidad.  

![Complejidad Ciclomática - SonarCloud](ruta/a/la/captura-sonarcloud.png)  

## Instalación y Uso  
Para ejecutar el proyecto, sigue estos pasos:  

1. Clonar el repositorio:  
   ```sh
   git clone https://github.com/usuario/ProyectoIntegradorCalidadDeSoftware.git
   cd ProyectoIntegradorCalidadDeSoftware
Construir y ejecutar los análisis:
sh
Copy
Edit
mvn clean install
mvn test
mvn checkstyle:check
mvn spotbugs:spotbugs
mvn sonar:sonar
Ver los reportes generados en la carpeta target/
Conclusión
Este proyecto permitió evaluar y mejorar la calidad del código aplicando métricas clave. A través de la implementación de buenas prácticas y herramientas de análisis estático, se logró optimizar la estructura y mantenibilidad del software.
