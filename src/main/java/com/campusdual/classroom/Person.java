package com.campusdual.classroom;

/**
 * La clase {@code Person} representa una persona con nombre y apellido.
 * <p>
 * Incluye métodos para obtener y establecer los atributos, así como para mostrar los detalles básicos de la persona.
 * </p>
 *
 * @version 1.0
 */
public class Person {
	protected String name;
	protected String surname;

	/**
	 * Constructor de la clase {@code Person}.
	 *
	 * @param name     El nombre de la persona.
	 * @param surname  El apellido de la persona.
	 */
	public Person(String name, String surname) {
		this.name = name;
		this.surname = surname;
	}

	/**
	 * Obtiene el nombre de la persona.
	 *
	 * @return El nombre de la persona.
	 */
	public String getName() {
		return this.name;
	}

	/**
	 * Establece el nombre de la persona.
	 *
	 * @param name El nuevo nombre de la persona.
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Obtiene el apellido de la persona.
	 *
	 * @return El apellido de la persona.
	 */
	public String getSurname() {
		return this.surname;
	}

	/**
	 * Establece el apellido de la persona.
	 *
	 * @param surname El nuevo apellido de la persona.
	 */
	public void setSurname(String surname) {
		this.surname = surname;
	}

	/**
	 * Muestra los detalles básicos de la persona.
	 * <p>
	 * Este método será heredado por las subclases y puede ser sobrescrito para proporcionar detalles
	 * adicionales específicos.
	 * </p>
	 */
	public void getDetails() {
		System.out.println("Nombre completo: " + name + " " + surname);
	}
}
