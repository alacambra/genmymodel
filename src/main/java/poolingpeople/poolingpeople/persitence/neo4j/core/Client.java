package poolingpeople.poolingpeople.persitence.neo4j.core;

import poolingpeople.java.util.Map;
import poolingpeople.org.neo4j.graphdb.Direction;
import poolingpeople.java.util.Collection;


/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */
public  interface Client 
{
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public void createNode(java.util.Map attributes) ;
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public void deleteNode(long id) ;
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public void deleteNode(String uuid) ;
	
	/**
	 * given a neo4j node id, return the associated node.
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public Node getNode(long id) ;
	
	/**
	 * Return the nodes with a given label.
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public java.util.Collection getNodesCollection(String label) ;
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public java.util.Collection getRelatedNodes(org.neo4j.graphdb.Direction direction, int start, int total) ;
	
	
}

