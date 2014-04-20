package poolingpeople.persitence.neo4j.helpers;

import poolingpeople.org.neo4j.graphdb.Node;
import java.util.LinkedList;
import poolingpeople.poolingpeople.persitence.neo4j.core.Node;
import java.util.List;
import java.util.Set;
import poolingpeople.persitence.neo4j.model.PersistedEntity;
import poolingpeople.java.util.Collection;
import java.util.HashSet;
import poolingpeople.java.lang.Class;
import poolingpeople.commons.domain.entities.PoolingpeopleObject;


/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */
public  interface PersistedEntityWrapperLoader 
{
	/**
	 * Return a persistedEntity of the given class. The class must be a subclass of PersistedEntity
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public PersistedEntity wrapNodeInEntity(org.neo4j.graphdb.Node node, java.lang.Class clazz) ;

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public PoolingpeopleObject wrapNodeInEntity(org.neo4j.graphdb.Node node) ;

	/**
	 * Return a collection of persistedEntities of the given class. The class must be a subclass of PersistedEntity
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public List<PersistedEntity> wrapNodesInEntities(java.util.Collection nodes, java.lang.Class clazz) ;

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public List<PoolingpeopleObject> wrapNodesInEntities(org.neo4j.graphdb.Node nodes, java.lang.Class interfaceClazz, java.lang.Class implementationClazz) ;

	/**
	 * Returns a collections of PoolingpeopleObjects
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public Set<PersistedEntity> wrapNodesInEntities(List<org.neo4j.graphdb.Node> node) ;
	
	
}

