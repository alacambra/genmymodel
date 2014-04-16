package poolingpeople.commons.domain.facades;

import poolingpeople.java.util.Collection;
import poolingpeople.commons.domain.entities.User;


/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */
public  interface TaskFacade  extends PoolingpeopleObjectFacade
{
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public java.util.Collection getTaskOfAssignee(User assignee) ;
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public java.util.Collection getTaskOfCreator(User creator) ;
	
	
}

