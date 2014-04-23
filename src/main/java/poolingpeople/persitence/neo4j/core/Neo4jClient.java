package poolingpeople.persitence.neo4j.core;

import poolingpeople.org.neo4j.graphdb.Node;
import poolingpeople.java.util.Map;
import java.util.Set;
import poolingpeople.org.neo4j.graphdb.Direction;
import java.util.HashSet;
import poolingpeople.org.neo4j.graphdb.Relationship;

/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */
public  interface Neo4jClient 
{
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public org.neo4j.graphdb.Node createNode() ;
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public org.neo4j.graphdb.Node createNode(java.util.Map properties) ;

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
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public org.neo4j.graphdb.Node getNode(long id) ;
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public org.neo4j.graphdb.Node getNode(String id) ;
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public void getRelatedNodes(org.neo4j.graphdb.Relationship realtion, org.neo4j.graphdb.Direction direction) ;

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public void operation() ;

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public CypherResult query(String query) ;
	
	
}

