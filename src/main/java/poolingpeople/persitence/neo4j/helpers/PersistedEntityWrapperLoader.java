package poolingpeople.persitence.neo4j.helpers;

import poolingpeople.poolingpeople.persitence.neo4j.core.Node;
import poolingpeople.java.util.Collection;
import poolingpeople.java.lang.Class;


/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */
public  interface PersistedEntityWrapperLoader 
{
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public void convertNodeToObject(Node node, java.lang.Class clazz) ;
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public java.util.Collection convertNodesListToEntitiesList(java.util.Collection nodes, java.lang.Class clazz) ;
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public void convertNodesListToEntitiesList(Node nodes, java.lang.Class interfaceClazz, java.lang.Class implementationClazz) ;
	
	
}

