/**
 * 
 */
package com.example.demo.statics;

/**
 * @author Fenrir
 *
 */
public enum Trabajos {
BECARIO(0), JUNIOR(100), SENIOR(1000), BOSS(60000);
	
	private double sueldo;
	
	Trabajos(double sueldo) {
		this.sueldo = sueldo;
	}
	
	public double getSueldo() {
		return this.sueldo;
	}
}
