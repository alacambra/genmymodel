package poolingpeople.persitence.neo4j.helpers;
import poolingpeople.org.neo4j.graphdb.Node;
import poolingpeople.poolingpeople.persitence.neo4j.core.Node;
import java.util.LinkedList;
import java.util.Set;
import poolingpeople.java.util.Map;
import java.util.List;
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

public class PersistedEntityWrapperLoaderImpl implements PersistedEntityWrapperLoader
{
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public java.util.Map objectTypesMap;
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public PersistedEntityWrapperLoaderImpl(){
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public java.lang.Class getPersistedEntityClassForNode(org.neo4j.graphdb.Node node) {
		// TODO : to implement
		return new java.lang.Class();	
	}

	/**
	 * Returns a collections of PoolingpeopleObjects
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public Set<PersistedEntity> wrapNodesInEntities(List<org.neo4j.graphdb.Node> node) {
		// TODO : to implement
		return null;	
	}
	
	/**
	 * Return a collection of persistedEntities of the given class. The class must be a subclass of PersistedEntity
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public List<PersistedEntity> wrapNodesInEntities(java.util.Collection nodes, java.lang.Class clazz) {
		// TODO : to implement
		return null;	
	}

	/**
	 * Return a persistedEntity of the given class. The class must be a subclass of PersistedEntity
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public PersistedEntity wrapNodeInEntity(org.neo4j.graphdb.Node node, java.lang.Class clazz) {
		// TODO : to implement
		return null;	
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public PoolingpeopleObject wrapNodeInEntity(org.neo4j.graphdb.Node node) {
		// TODO : to implement
		return new PoolingpeopleObject();	
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public List<PoolingpeopleObject> wrapNodesInEntities(org.neo4j.graphdb.Node nodes, java.lang.Class interfaceClazz, java.lang.Class implementationClazz) {
		// TODO : to implement
		return null;	
	}
	
}

