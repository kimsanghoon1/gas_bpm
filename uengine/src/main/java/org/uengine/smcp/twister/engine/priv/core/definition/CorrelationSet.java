package org.uengine.smcp.twister.engine.priv.core.definition;

import java.util.Collection;

/**
 * A correlation set is a set of named properties used to add contextual
 */

public interface CorrelationSet {

	/**
	 * 
	 * @uml.property name="name"
	 */
	public String getName();

	/**
	 * 
	 * @uml.property name="properties"
	 */
	public Collection getProperties();

}