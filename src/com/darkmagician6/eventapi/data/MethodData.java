package com.darkmagician6.eventapi.data;

import java.lang.reflect.Method;

import com.darkmagician6.eventapi.Listener;
import com.darkmagician6.eventapi.types.Priority;

/**
 * Class used to store a method that could be used in the dispatcher.
 * Stores the listener source, the priority of the method and the method itself.
 * 
 * @author DarkMagician6
 * @since July 30, 2013
 */
public class MethodData extends Data<Listener> {
	private final byte priority;
	
	/**
	 * Set's all the data.
	 * 
	 * @param source
	 * 		The listener source of the method.
	 * @param priority
	 * 		The priority of the method.
	 * @param targetMethod
	 * 		The method to store.
	 */
	public MethodData(Listener source, Method targetMethod, byte priority) {
		super(source, targetMethod);
		this.priority = priority;
	}
	
	/**
	 * Get's the priority of the method.
	 * @see Priority
	 * 
	 * @return
	 * 		The priority for the dispatcher.
	 */
	public byte getPriority() {
		return priority;
	}

}
