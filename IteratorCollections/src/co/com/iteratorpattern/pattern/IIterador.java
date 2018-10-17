/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.iteratorpattern.pattern;

/**
 *
 * @author JuanC
 */
public interface IIterador {
	
	public Object first();

	public Object next();

	public boolean hasMore();

	public Object current();
}