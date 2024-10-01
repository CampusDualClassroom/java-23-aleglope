package com.campusdual.classroom;

import java.util.HashMap;
import java.util.Map;

/**
 * La clase {@code Exercise23} proporciona métodos para crear, manipular y mostrar
 * colecciones de tipo {@code Map} utilizando {@code HashMap}.
 * <p>
 * Incluye métodos para:
 * <ul>
 *     <li>Crear y poblar un mapa con entradas específicas.</li>
 *     <li>Añadir una nueva entrada al mapa.</li>
 *     <li>Recorrer y mostrar los detalles de cada valor en el mapa.</li>
 * </ul>
 * </p>
 *
 * @version 1.0
 */
public class Exercise23 {

    /**
     * Crea y retorna un mapa de tipo {@code HashMap} poblado con las entradas especificadas.
     * <p>
     * Las entradas añadidas son:
     * <ul>
     *     <li>Clave: "person", Valor: Objeto {@code Person} → John Smith</li>
     *     <li>Clave: "teacher", Valor: Objeto {@code Teacher} → María Montessori, Área: Educación</li>
     *     <li>Clave: "police", Valor: Objeto {@code PoliceOfficer} → Jake Peralta, Squad: B-99</li>
     *     <li>Clave: "doctor", Valor: Objeto {@code Doctor} → Gregory House, Especialización: Nefrología e infectología</li>
     * </ul>
     * </p>
     *
     * @return Un mapa {@code HashMap<String, Person>} poblado con las entradas especificadas.
     */
    public static Map<String, Person> createHashMap() {
        Map<String, Person> hashMap = new HashMap<>();

        // Primera entrada → clave: person; valor: objeto Person → John Smith
        Person person = new Person("John", "Smith");
        hashMap.put("person", person);

        // Segunda entrada → clave: teacher; valor: objeto Teacher → María Montessori, Educación
        Teacher teacher = new Teacher("María", "Montessori", "Educación");
        hashMap.put("teacher", teacher);

        // Tercera entrada → clave: police; valor: objeto PoliceOfficer → Jake Peralta, B-99
        PoliceOfficer policeOfficer = new PoliceOfficer("Jake", "Peralta", "B-99");
        hashMap.put("police", policeOfficer);

        // Cuarta entrada → clave: doctor; valor: objeto Doctor → Gregory House, Nefrología e infectología
        Doctor doctor = new Doctor("Gregory", "House", "Nefrología e infectología");
        hashMap.put("doctor", doctor);

        return hashMap;
    }

    /**
     * Añade una nueva entrada al mapa especificado.
     * <p>
     * Este método añade una nueva entrada al mapa con la clave y valor proporcionados y retorna el objeto
     * que se añadió como valor de la entrada.
     * </p>
     *
     * @param map   El mapa al que se desea añadir la nueva entrada.
     * @param key   La clave de la nueva entrada.
     * @param value El valor de la nueva entrada.
     * @return El objeto {@code Person} que se añadió como valor de la entrada.
     */
    public static Person addMapValue(Map<String, Person> map, String key, Person value) {
        map.put(key, value);
        return value;
    }

    /**
     * Recorre el mapa especificado y muestra por pantalla los detalles de cada valor.
     * <p>
     * Para cada entrada en el mapa, se invoca el método {@code getDetails()} del valor, que muestra la información
     * específica de cada objeto {@code Person} o sus subclases.
     * </p>
     *
     * @param map El mapa cuyos valores se desean mostrar.
     */
    public static void printMapValues(Map<String, Person> map) {
        for (Map.Entry<String, Person> entry : map.entrySet()) {
            System.out.print("Clave: " + entry.getKey() + " → ");
            entry.getValue().getDetails();
        }
    }

    /**
     * Punto de entrada del programa que demuestra la creación, manipulación y visualización
     * de un mapa de tipo {@code HashMap}.
     * <p>
     * El flujo del programa es el siguiente:
     * <ol>
     *     <li>Crear y poblar un mapa con las entradas especificadas.</li>
     *     <li>Añadir una nueva entrada al mapa.</li>
     *     <li>Recorrer y mostrar los detalles de cada valor en el mapa.</li>
     * </ol>
     * </p>
     *
     * @param args Argumentos de la línea de comandos (no utilizados).
     */
    public static void main(String[] args) {
        // Crear y poblar el HashMap
        Map<String, Person> hashMap = createHashMap();
        System.out.println("Mapa original:");
        printMapValues(hashMap);
        System.out.println("===================");

        // Añadir una nueva entrada → clave: police; valor: objeto PoliceOfficer → Charles Boyle, B-99
        PoliceOfficer newPoliceOfficer = new PoliceOfficer("Charles", "Boyle", "B-99");
        Person addedPerson = addMapValue(hashMap, "police", newPoliceOfficer);
        System.out.println("Añadiendo nueva entrada al mapa:");
        System.out.println("Clave: police → Valor: " + addedPerson.getName() + " " + addedPerson.getSurname());
        System.out.println("===================");

        // Mostrar el mapa después de añadir la nueva entrada
        System.out.println("Mapa después de añadir la nueva entrada:");
        printMapValues(hashMap);
    }
}
