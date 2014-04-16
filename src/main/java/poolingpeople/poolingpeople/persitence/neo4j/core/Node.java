package poolingpeople.poolingpeople.persitence.neo4j.core;

import poolingpeople.java.util.Map;
import poolingpeople.java.lang.Object;


/**
 * Adapter for a node. It can wraps a &nbsp;native node and a rest response so anyo other representation<div><br></div>
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */
public  interface Node 
{
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public long getNeo4jId() ;
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public java.lang.Object getValue(String key) ;
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public java.util.Map getValues() ;
	
	
}

