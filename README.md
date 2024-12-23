<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
</head>
<body>
    <h3><strong><u>Trabajo problema complejo de Arquitectura</u></strong></h3>
    <h3>Nombre del estudiante: Daniel Acuña Aranzazu</h3>

<h3><strong><u>Contenido:</u></strong></h3>
<h4>1. Explicación de la funcionalidad del código.
    <br>
2. Implementaciòn de SOLID.
<br>
3. Beneficios y Sacrificios.</h4>

<h3>Introduccion al diseño de gestion de flotas inteligente:</h3>
<p>Desde un inicio, el trabajo a primera vista resulta complicado, y al final si lo fue; estamos frente a la implementación de un proyecto muy 
ambicioso el cual supone un verdadero reto para el arquitecto que lo desarrolla. Primeramente se nos presentan los requisitos los cuales debe cumplir
este proyecto y de aqui saltamos la funcionalidad del código y el diseño de nuestro diagrama de microservicios; yo en especifico me centre en realizar,
la cual deduje que seria el diagrama de microservicios para asi poder estructurarme en como podia realizar el proyecto y me centre en hacerlo de manera 
distribuida inlcuyendo bases de datos independientes con sus debidas copias por si llega a fallar alguna de ellas e algun momento.</p>

<h3>1. Explicación de la funcionalidad del código:</h3> 
<p><strong>1. Conductor.java</strong>
    Esta clase representa al conductor en el sistema.
    <br>
    <strong>Propiedades:</strong>
    <br>
    <strong>ID:</strong>Identificador único del conductor.
    <br>
    <strong>Nombre:</strong>Nombre del conductor.
    <br>
    <strong>Licencia:</strong>Número del conductor.
    <br>
    <strong>Consumo de combustible:</strong>Utilizado cada 100 km Cantidad de combustible.
    <br>
    <strong>Seguridad:</strong>Índice de seguridad del conductor (0~100).
    <br>
    <strong>Fecha de contratación:</strong> Fecha en la que se contrató al conductor.
    <br>
    <strong>Métodos:</strong>
    Medidas y conjuntos: métodos que le permiten obtener y establecer valores de propiedad. Esto es útil para acceder y modificar la información del controlador cuando sea necesario.
    <br>
    <br>
    <strong>2. GestionConductores.java</strong>
    Microservicio que administra la información del controlador.
    <br>
    <strong>Nota:</strong>
    <br>
    <strong>@SpringBootApplication:</strong> Indica que esta clase es una aplicación Spring Boot.
    <br>
    <strong>@RestController:</strong>Esta clase maneja solicitudes HTTP y responde en formato JSON.
    <br>
    <strong>@RequestMapping("/drivers"):</strong> ruta predeterminada para todas las solicitudes relacionadas con los controladores. Definir.
    <br>
    <strong>Propiedades:</strong>
    <br>
    <strong>Flecha:</strong> Mapa que almacena el controlador. Aquí la clave es el ID del controlador y el valor es el objeto del controlador.
    <br>
    <strong>Método:</strong>
    <br>
    <strong>getDriver (String id):</strong> Devuelve el objeto del controlador según el ID(Driver). Agregue un nuevo controlador a la tarjeta.
    <br>
    <strong>updateDriver (ID de cadena, DriverupdateDriver):</strong> Actualiza información sobre el controlador actual.
    <br>
    <strong>deleteDrivereliminar controlador (ID de cadena):</strong> elimina un controlador del mapa según su ID.
    <br>
    <br>
    <strong>3. AlertaMantenimiento.java</strong>
    Esta clase representa una alerta de mantenimiento para un vehículo.
    <br>
    <strong>Propiedades:</strong>
    <br>
    <strong>ID del vehículo:</strong> El ID del vehículo asociado con la alerta.
    <br>
    <strong>Tipo de mantenimiento:</strong> el tipo de mantenimiento requerido (por ejemplo, cambio de aceite).
    <br>
    <strong>Descripción:</strong> Una descripción detallada de la advertencia.
    <br>
    <strong>Resuelto:</strong> Indica si la advertencia se ha resuelto (booleano).
    <br>
    <strong>Métodos:</strong>
    <br>
    <strong>Getter y Setter:</strong> permiten el acceso y cambian las propiedades de la advertencia.
    <br>
    <br>
    <strong>4. MantenimientoPredictivo.java</strong>
    Este microservicio administra alertas de mantenimiento.
    <br>
    <strong>Nota:</strong>
    Similar a la clase anterior, esta clase define una aplicación Spring Boot y un controlador REST.
    <br>
    <strong>Propiedades:</strong>
    <br>
    <strong>alerts:</strong> Todo generado Una lista que contiene alertas.
    <br>
    <strong>Método:</strong>
    <br>
    <strong>createalerts (Alertas de mantenimiento):</strong> agrega nuevas alertas a la lista y puede incluir lógica para notificar al usuario Admin.
    <br>
    <strong>getAlerts ():</strong> devuelve todas las alertas generadas.
    <br>
    <strong>resolveAlert (int id, AlertMaintenanceupdatedAlert):</strong> Marca una alerta como resuelta según su índice en la lista.
    <br>
    <br>
    <strong>5. Ruta.java</strong>
    Esta clase representa una ruta optimizada entre dos puntos.
    <br>
    <strong>Propiedades:</strong>
    <br>
    <strong>Puntos:</strong> una matriz que contiene los puntos (o paradas) de la ruta.
    <br>
    <strong>Distancia total:</strong> la distancia total de la ruta (kilómetros).
    <br>
    <strong>Tiempo estimado:</strong> Tiempo estimado en minutos para completar la ruta.
    <br>
    <strong>Métodos:</strong>
    <br>
    <strong>Getter y Setter:</strong> Permite el acceso y modificación de propiedades relacionadas.
    <br>
    <br>
    <strong>6. RutaRequest.java</strong>
    Esta clase se utiliza para escuchar solicitudes de optimización de rutas.
    <br>
    <strong>Propiedades:</strong>
   <br>
    <strong>origin:</strong> punto de inicio de la ruta.
   <br>
    <strong>destino:</strong> punto final de la ruta.
   <br>
    <strong>voidPeajes y evitar autopistas:</strong> Evite carreteras o autopistas con peaje al calcular la ruta indicando si este es el camino.
   <br>
    <strong>Método:</strong>
   <br>
    <strong>Getter y Setter:</strong> Puede acceder y modificar las siguientes propiedades: Está relacionado con las solicitudes de enrutamiento.
    <br>
    <br>
    <strong>7. OptimizacionRutas.java</strong>
    Este microservicio se encarga de optimizar la ruta según la solicitud entrante.
    <br>
    <strong>Descripción:</strong>
    <br>
    Define esta clase como una aplicación Spring Boot y controlador REST.
    <br>
    <strong>Método:</strong>
    <br>
    <strong>optimizarRuta (RutaRequest request):</strong> Recibe una solicitud para optimizar la ruta. Devuelve segmentos de ruta con paradas optimizadas, distancia total y tiempo estimado. En este caso, simulamos una respuesta estática. Sin embargo, en entornos reales, se puede integrar con API externas para cálculos dinámicos.
    <br>
    <br>
    <strong>8. Vehículo.java</strong>
    Esta clase representa un vehículo en el sistema.
    <br>
    <strong>Propiedades:</strong>
    <br>
    id, posición, velocidad y estado son las propiedades básicas que identifican el vehículo y su estado actual.
    <br>
    <strong>También contiene las siguientes propiedades:</strong>
    <br>
    <strong>Nivel de combustible:</strong> porcentaje de combustible restante en el tanque.
    <br>
    <strong>TotalMileage:</strong> Kilometraje total acumulado por el vehículo.
    <br>
    <strong>Métodos:</strong>
    <br>
    <strong>Getter y Setter:</strong> Permiten el acceso y modificación de propiedades del vehículo. 
    <br>
    <br>
    <strong>9. SeguimientoVehiculos.java</strong>
    Este microservicio le permite rastrear vehículos en tiempo real.
    <br>
    <strong>Observaciones:</strong>
    Define esta clase como una aplicación Spring Boot y un controlador REST.
    Propiedades:
    Al igual que el servicio de conductor, el mapa donde almacenar la llave. es el ID del vehículo y el valor es el objeto correspondiente.
    <br>
    <strong>Método:</strong>
    getVehicle (String id): Devuelve un objeto de vehículo basado en el ID. its.
    registrarVehicle (VehiclevehicleUpdated): agrega un nuevo vehículo al mapa e imprime un mensaje en la 
    consola.updateVehicleStatus (String id, VehiclevehicleUpdated): actualiza la información actual del vehículo según su ID.
    DeleteVehicle (String id): Elimina el vehículo con el ID del mapa e imprime un mensaje en la consola indicando que el vehículo ha sido eliminado.
    </p>

<h3>2. Implementaciòn de Solid:</h3>
<p>Descripción del método SOLID para la ejecución del programa
    <br>
<strong>Regla de responsabilidad única (SRP):</strong> cada clase tiene una única responsabilidad. Por ejemplo, Conductor solo maneja información del controlador y 
GestionConductores maneja operaciones relacionadas con el controlador.
<br>
<strong>Principio abierto/cerrado (OCP):</strong> la clase está diseñada para ser extensible. Sin cambiar el código existente. Por ejemplo, si desea agregar un nuevo 
tipo de mantenimiento, puede crear una nueva clase que extienda AlertaMantenimiento.
<br>
<strong>Principio de sustitución de Liskov (LSP):</strong> cuando se necesita una clase base, se puede usar una clase derivada sin cambiar el comportamiento esperado.
<br>
<strong>Principio de separación de interfaces (ISP):</strong> cada microservicio expone solo las interfaces que necesita a los consumidores, evitando la sobrecarga innecesaria 
de métodos.
<br>
<strong>Principio de inversión de dependencia (DIP):</strong> basado en abstracción en lugar de implementación específica de clase. Si necesita más flexibilidad más adelante, 
puede implementarla mediante una interfaz.</p>

<h3>3. Beneficios y Sacrificios:</h3>
<p>
<strong>1. Beneficios:</strong>
Reducción de Costos Operativos.
<br>
<strong>El combustible:</strong> Planificar mejor los viajes y controlar el consumo permite descubrir ahorros, aliviando la carga económica del combustible, 
como una brisa que disipa las nubes de gasto.
La previsión en los mantenimientos, como un conjuro contra la  desesperación mecánica, reduce gastos y alarga la vida de las máquinas.
<br>
<strong>Mayor Productividad.</strong>
Automatizando tareas administrativas y optimizando rutas, conductores y supervisores se enfocan en lo esencial,  elevando la eficiencia como un vuelo de gaviotas sobre el mar.
Por lo tanto, al no requerirse alteraciones, no hay texto específico.
<br>
<strong>Mayor Seguridad.</strong>
Vigilar las acciones del conductor y el estado de los vehículos robustece la seguridad vial,  frenando accidentes y protegiendo a conductores y mercancías en tránsito, como un escudo invisible.
Los sistemas de rastreo recuperan lo perdido con la celeridad de un relámpago, resguardando los bienes de la empresa.
<br>
<strong>Acceso a información en tiempo real:</strong> La centralización de datos en la nube permite a los administradores acceder a información crítica desde cualquier lugar, 
lo que facilita la toma de decisiones oportuna e informada y permite generar informes detallados que ayudan a identificar tendencias en las operaciones y áreas 
de mejora.
<br>
<strong>Mejora del servicio al cliente:</strong>
Proporcionar actualizaciones en tiempo real sobre el estado y la ubicación de la entrega mejora la interacción con el cliente y aumenta su satisfacción.
<br>    
<br>
<strong>2. Sacrificios:</strong>
<br>
<strong>Alto costo inicial:</strong> Instalar un nuevo sistema requiere una lluvia de dinero para equipos, programas y la paciente siembra de conocimiento en el personal.  
Esto puede ser un obstáculo para empresas con presupuestos escasos, como ríos secos en la sequía.
<br>
<strong>Resistencia al cambio:</strong> A veces, las manos curtidas por la costumbre se resisten a las nuevas herramientas del trabajo. 
Esto puede requerir un esfuerzo adicional en capacitación y gestión del cambio, como domar un viento huracanado.
<br>
<strong>Dependencia tecnológica:</strong> El sistema dependerá mucho de la tecnología; si la frágil red se rompe, el trabajo diario se paraliza. 
Se necesita apoyo técnico constante y un plan para lidiar con imprevistos tecnológicos, como las tormentas repentinas en el Caribe.
<br>
<strong>Preocupaciones de privacidad:</strong> El monitoreo constante puede despertar recelos, como sombras alargadas en la noche.  
Necesitamos políticas claras y sencillas sobre el uso de datos, un faro en la oscuridad.
<br>
<strong>Necesidad de mantenimiento continuo:</strong> Las máquinas, como seres vivos, necesitan constante afinación y reparación para funcionar bien, 
lo que significa mayores gastos a largo plazo, un río que siempre necesita ser renovado.
</p>
<br>    
<br>
<h3>Consulta de los 12 factores de programación</h3>
<p>Los 12 factores son un conjunto de principios diseñados para ayudar a los desarrolladores a construir aplicaciones que sean escalables, portables y mantenibles, 
especialmente en entornos de computación en la nube. Estos principios fueron formulados por desarrolladores de Heroku y se han convertido en una guía esencial
 para el desarrollo de aplicaciones modernas. A continuación, se describen los 12 factores:
<br>
<strong>1. Código Base</strong>
Cada aplicación debe tener un único código base que se almacena en un sistema de control de versiones (como Git). Este código puede ser desplegado en múltiples
entornos (desarrollo, pruebas, producción), pero no debe haber duplicación de código entre diferentes repositorios.
<br>
<strong>2. Dependencias</strong>
Las dependencias deben ser declaradas explícitamente y aisladas del entorno del sistema operativo. Esto significa que todas las bibliotecas y herramientas necesarias 
para ejecutar la aplicación deben estar incluidas en el proyecto, evitando conflictos con otras aplicaciones.
<br>
<strong>3. Configuración</strong>
La configuración que puede variar entre entornos (como credenciales de bases de datos o URLs de servicios externos) debe ser separada del código base y proporcionada 
a la aplicación a través de variables de entorno. Esto permite que el mismo código funcione en diferentes entornos sin cambios.
<br>
<strong>4. Servicios de Apoyo</strong>
Las aplicaciones deben tratar los servicios externos (como bases de datos, sistemas de mensajería, etc.) como recursos adjuntos. Esto implica que cualquier servicio 
externo debe ser accesible a través de una URL o API, lo que facilita su integración.
<br>
<strong>5. Construcción, Lanzamiento y Ejecución</strong>
El proceso de construcción (compilación del código), lanzamiento (configuración del entorno) y ejecución (ejecución del código) debe ser separado. Esto permite que 
los desarrolladores realicen cambios sin afectar la ejecución en producción.
<br>
<strong>6. Procesos</strong>
Las aplicaciones deben ejecutarse como uno o más procesos sin estado. Esto significa que cualquier información que necesite ser persistida debe ser almacenada en un 
servicio externo (como una base de datos), lo que permite escalar fácilmente al agregar más instancias.
<br>
<strong>7. Asignación de Puertos</strong>
Las aplicaciones deben ser auto-contenidas y exponer servicios a través de un puerto definido. Esto permite que las aplicaciones sean fácilmente integradas con otros 
servicios y herramientas.
<br>
<strong>8. Concurrencia</strong>
Las aplicaciones deben ser capaces de manejar la concurrencia mediante el uso de procesos o hilos. Esto permite escalar la aplicación al manejar múltiples solicitudes
simultáneamente.
<br>
<strong>9. Desechabilidad</strong>
Los procesos deben ser desechables, lo que significa que pueden iniciarse rápidamente y finalizarse sin problemas. Esto es crucial para mantener la disponibilidad y 
la resiliencia del sistema.
<br>
<strong>10. Paridad entre Desarrollo y Producción</strong>
Los entornos de desarrollo, pruebas y producción deben ser lo más similares posible para evitar problemas al desplegar el código. Esto ayuda a garantizar que el 
comportamiento sea consistente en todos los entornos.
<br>
<strong>11. Gestión de Logs</strong>
Los logs deben ser tratados como flujos de eventos y no como archivos estáticos. Esto permite una mejor gestión y análisis en tiempo real, facilitando la 
identificación de problemas.
<br>
<strong>12. Administración de Procesos</strong>
Las tareas administrativas y de gestión deben ejecutarse como procesos únicos e independientes, lo que simplifica la administración del sistema y mejora la 
eficiencia operativa.
</p>
<br>    
<br>
<div align="center">
    
<h3>Enlace al diagrama de microservicios</h3>
    <a href="https://drive.google.com/file/d/1_k0mH42-L6_hVcajqMGLrOTiOHEWMt_I/view?usp=drive_link">Diagrama de microservicios</a>

</div>
</body>
</html>
