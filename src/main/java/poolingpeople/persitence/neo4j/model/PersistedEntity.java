package poolingpeople.persitence.neo4j.model;

import poolingpeople.persitence.neo4j.core.Neo4jClient;


/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */

public abstract class PersistedEntity
{
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public Neo4jClient neo4jClient;

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public PersistedEntity(){
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public void getRelatedEntities(Relation relation, org.neo4j.graphdb.Direction direction) {
		// TODO : to implement	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public void getUniqueRelatedEntity(org.neo4j.graphdb.Direction relation) {
		// TODO : to implement	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public Relation createRelationWithEntity(org.neo4j.graphdb.Direction direction, PersistedEntity relatedEntity) {
		// TODO : to implement
		return new Relation() {
			
			@Override
			public void validatePair(Class startNodeType, Class endNodeType) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void getStartEntity() {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public String getName() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public void getEndEntity() {
				// TODO Auto-generated method stub
				
			}
		};	
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public void removeRelationWithEntity(org.neo4j.graphdb.Direction entity) {
		// TODO : to implement	
	}
	
}

